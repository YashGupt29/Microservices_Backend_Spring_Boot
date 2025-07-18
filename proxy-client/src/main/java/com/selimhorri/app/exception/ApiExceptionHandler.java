package com.selimhorri.app.exception;

import com.selimhorri.app.exception.payload.ExceptionMsg;
import com.selimhorri.app.exception.wrapper.CredentialNotFoundException;
import com.selimhorri.app.exception.wrapper.FavouriteNotFoundException;
import com.selimhorri.app.exception.wrapper.UserObjectNotFoundException;
import com.selimhorri.app.exception.wrapper.VerificationTokenNotFoundException;
import feign.FeignException;
import feign.FeignException.FeignClientException;
import feign.FeignException.FeignServerException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
@RequiredArgsConstructor
public class ApiExceptionHandler {

  @ExceptionHandler(
      value = {FeignClientException.class, FeignServerException.class, FeignException.class})
  public <T extends FeignException> ResponseEntity<ExceptionMsg> handleProxyException(final T e) {

    log.info("**ApiExceptionHandler controller, handle feign proxy exception*\n");
    final var badRequest = HttpStatus.BAD_REQUEST;

    return new ResponseEntity<>(
        ExceptionMsg.builder()
            .msg(e.contentUTF8())
            .httpStatus(badRequest)
            .timestamp(ZonedDateTime.now(ZoneId.systemDefault()))
            .build(),
        badRequest);
  }

  @ExceptionHandler(
      value = {MethodArgumentNotValidException.class, HttpMessageNotReadableException.class})
  public <T extends BindException> ResponseEntity<ExceptionMsg> handleValidationException(
      final T e) {

    log.info("**ApiExceptionHandler controller, handle validation exception*\n");
    final var badRequest = HttpStatus.BAD_REQUEST;

    return new ResponseEntity<>(
        ExceptionMsg.builder()
            .msg(e.getBindingResult().getFieldError().getDefaultMessage())
            .httpStatus(badRequest)
            .timestamp(ZonedDateTime.now(ZoneId.systemDefault()))
            .build(),
        badRequest);
  }

  @ExceptionHandler(
      value = {
        UserObjectNotFoundException.class,
        CredentialNotFoundException.class,
        VerificationTokenNotFoundException.class,
        FavouriteNotFoundException.class,
        IllegalStateException.class,
      })
  public <T extends RuntimeException> ResponseEntity<ExceptionMsg> handleApiRequestException(
      final T e) {

    log.info("**ApiExceptionHandler controller, handle API request*\n");
    final var badRequest = HttpStatus.BAD_REQUEST;

    return new ResponseEntity<>(
        ExceptionMsg.builder()
            .msg(e.getMessage())
            .httpStatus(badRequest)
            .timestamp(ZonedDateTime.now(ZoneId.systemDefault()))
            .build(),
        badRequest);
  }
}
