package com.selimhorri.app.business.favourite.model.response;

import com.selimhorri.app.business.favourite.model.FavouriteDto;
import java.io.Serializable;
import java.util.Collection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FavouriteFavouriteServiceCollectionDtoResponse implements Serializable {

  private static final long serialVersionUID = 1L;
  private Collection<FavouriteDto> collection;
}
