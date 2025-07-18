package com.selimhorri.app.service.impl;

import com.selimhorri.app.dto.UserDto;
import com.selimhorri.app.exception.wrapper.UserObjectNotFoundException;
import com.selimhorri.app.helper.UserMappingHelper;
import com.selimhorri.app.repository.UserRepository;
import com.selimhorri.app.service.UserService;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override
  public List<UserDto> findAll() {
    log.info("*** UserDto List, service; fetch all users *");
    return this.userRepository.findAll().stream()
        .map(UserMappingHelper::map)
        .distinct()
        .collect(Collectors.toUnmodifiableList());
  }

  @Override
  public UserDto findById(final Integer userId) {
    log.info("*** UserDto, service; fetch user by id *");
    return this.userRepository
        .findById(userId)
        .map(UserMappingHelper::map)
        .orElseThrow(
            () ->
                new UserObjectNotFoundException(
                    String.format("User with id: %d not found", userId)));
  }

  @Override
  public UserDto save(final UserDto userDto) {
    log.info("*** UserDto, service; save user *");
    return UserMappingHelper.map(this.userRepository.save(UserMappingHelper.map(userDto)));
  }

  @Override
  public UserDto update(final UserDto userDto) {
    log.info("*** UserDto, service; update user *");
    return UserMappingHelper.map(this.userRepository.save(UserMappingHelper.map(userDto)));
  }

  @Override
  public UserDto update(final Integer userId, final UserDto userDto) {
    log.info("*** UserDto, service; update user with userId *");
    return UserMappingHelper.map(
        this.userRepository.save(UserMappingHelper.map(this.findById(userId))));
  }

  @Override
  public void deleteById(final Integer userId) {
    log.info("*** Void, service; delete user by id *");
    this.userRepository.deleteById(userId);
  }

  @Override
  public UserDto findByUsername(final String username) {
    log.info("*** UserDto, service; fetch user with username *");
    return UserMappingHelper.map(
        this.userRepository
            .findByCredentialUsername(username)
            .orElseThrow(
                () ->
                    new UserObjectNotFoundException(
                        String.format("User with username: %s not found", username))));
  }
}
