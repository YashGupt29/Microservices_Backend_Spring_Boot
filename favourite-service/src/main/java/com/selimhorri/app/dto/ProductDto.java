package com.selimhorri.app.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductDto implements Serializable {

  private static final long serialVersionUID = 1L;
  private Integer productId;
  private String productTitle;
  private String imageUrl;
  private String sku;
  private Double priceUnit;
  private Integer quantity;

  @JsonInclude(Include.NON_NULL)
  private Set<FavouriteDto> favouriteDtos;
}
