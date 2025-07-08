package com.selimhorri.app.service;

import com.selimhorri.app.dto.UserDto;
import java.util.List;

public interface UserService {

  List<UserDto> findAll();

  UserDto findById(final Integer userId);

  UserDto save(final UserDto userDto);

  UserDto update(final UserDto userDto);

  UserDto update(final Integer userId, final UserDto userDto);

  void deleteById(final Integer userId);

  UserDto findByUsername(final String username);
}
