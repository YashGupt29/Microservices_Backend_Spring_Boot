package com.selimhorri.app.service;

import com.selimhorri.app.dto.CartDto;
import java.util.List;

public interface CartService {

  List<CartDto> findAll();

  CartDto findById(final Integer cartId);

  CartDto save(final CartDto cartDto);

  CartDto update(final CartDto cartDto);

  CartDto update(final Integer cartId, final CartDto cartDto);

  void deleteById(final Integer cartId);
}
