package com.selimhorri.app.service;

import com.selimhorri.app.domain.id.FavouriteId;
import com.selimhorri.app.dto.FavouriteDto;
import java.util.List;

public interface FavouriteService {

  List<FavouriteDto> findAll();

  FavouriteDto findById(final FavouriteId favouriteId);

  FavouriteDto save(final FavouriteDto favouriteDto);

  FavouriteDto update(final FavouriteDto favouriteDto);

  void deleteById(final FavouriteId favouriteId);
}
