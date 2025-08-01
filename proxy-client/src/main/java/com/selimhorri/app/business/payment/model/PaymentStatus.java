package com.selimhorri.app.business.payment.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum PaymentStatus {
  NOT_STARTED("not_started"),
  IN_PROGRESS("in_progress"),
  COMPLETED("completed");

  private final String status;
}
