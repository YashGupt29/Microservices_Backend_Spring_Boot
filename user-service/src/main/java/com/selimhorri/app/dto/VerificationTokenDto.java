package com.selimhorri.app.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.selimhorri.app.constant.AppConstant;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class VerificationTokenDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer verificationTokenId;

  private String token;

  @JsonFormat(pattern = AppConstant.LOCAL_DATE_FORMAT, shape = Shape.STRING)
  @DateTimeFormat(pattern = AppConstant.LOCAL_DATE_FORMAT)
  private LocalDate expireDate;

  @JsonProperty("credential")
  @JsonInclude(value = Include.NON_NULL)
  private CredentialDto credentialDto;
}
