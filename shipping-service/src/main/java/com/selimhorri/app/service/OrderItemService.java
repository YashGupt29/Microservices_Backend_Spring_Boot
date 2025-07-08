package com.selimhorri.app.service;

import com.selimhorri.app.domain.id.OrderItemId;
import com.selimhorri.app.dto.OrderItemDto;
import java.util.List;

public interface OrderItemService {

  List<OrderItemDto> findAll();

  OrderItemDto findById(final OrderItemId orderItemId);

  OrderItemDto save(final OrderItemDto orderItemDto);

  OrderItemDto update(final OrderItemDto orderItemDto);

  void deleteById(final OrderItemId orderItemId);
}
