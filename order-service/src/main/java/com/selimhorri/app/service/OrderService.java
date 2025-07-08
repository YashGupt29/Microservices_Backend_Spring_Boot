package com.selimhorri.app.service;

import com.selimhorri.app.dto.OrderDto;
import java.util.List;

public interface OrderService {

  List<OrderDto> findAll();

  OrderDto findById(final Integer orderId);

  OrderDto save(final OrderDto orderDto);

  OrderDto update(final OrderDto orderDto);

  OrderDto update(final Integer orderId, final OrderDto orderDto);

  void deleteById(final Integer orderId);
}
