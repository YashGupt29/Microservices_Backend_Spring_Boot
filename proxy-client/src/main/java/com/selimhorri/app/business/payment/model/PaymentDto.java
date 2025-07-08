package com.selimhorri.app.business.payment.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PaymentDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer paymentId;
  private Boolean isPayed;
  private PaymentStatus paymentStatus;

  @JsonProperty("order")
  @JsonInclude(Include.NON_NULL)
  private OrderDto orderDto;
}
