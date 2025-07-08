package com.selimhorri.app.service;

import com.selimhorri.app.dto.PaymentDto;
import java.util.List;

public interface PaymentService {

  List<PaymentDto> findAll();

  PaymentDto findById(final Integer paymentId);

  PaymentDto save(final PaymentDto paymentDto);

  PaymentDto update(final PaymentDto paymentDto);

  void deleteById(final Integer paymentId);
}
