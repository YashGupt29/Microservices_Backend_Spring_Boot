package com.selimhorri.app.exception.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.ZonedDateTimeSerializer;
import com.selimhorri.app.constant.AppConstant;
import java.io.Serializable;
import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
@Builder
public final class ExceptionMsg implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonSerialize(using = ZonedDateTimeSerializer.class)
  @JsonFormat(shape = Shape.STRING, pattern = AppConstant.ZONED_DATE_TIME_FORMAT)
  private final ZonedDateTime timestamp;

  @JsonInclude(value = Include.NON_NULL)
  private Throwable throwable;

  private final HttpStatus httpStatus;

  private final String msg;
}
