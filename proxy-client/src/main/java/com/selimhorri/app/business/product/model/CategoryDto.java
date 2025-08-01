package com.selimhorri.app.business.product.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class CategoryDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer categoryId;
  private String categoryTitle;
  private String imageUrl;

  @JsonInclude(Include.NON_NULL)
  private Set<CategoryDto> subCategoriesDtos;

  @JsonProperty("parentCategory")
  @JsonInclude(Include.NON_NULL)
  private CategoryDto parentCategoryDto;

  @JsonInclude(Include.NON_NULL)
  private Set<ProductDto> productDtos;
}
