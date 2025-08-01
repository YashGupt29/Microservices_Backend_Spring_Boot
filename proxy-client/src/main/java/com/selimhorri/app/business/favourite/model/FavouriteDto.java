package com.selimhorri.app.business.favourite.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.selimhorri.app.constant.AppConstant;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FavouriteDto implements Serializable {

  private static final long serialVersionUID = 1L;

  @NotNull(message = "Field must not be NULL")
  private Integer userId;

  @NotNull(message = "Field must not be NULL")
  private Integer productId;

  @NotNull(message = "Field must not be NULL")
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  @JsonFormat(pattern = AppConstant.LOCAL_DATE_TIME_FORMAT, shape = Shape.STRING)
  @DateTimeFormat(pattern = AppConstant.LOCAL_DATE_TIME_FORMAT)
  private LocalDateTime likeDate;

  @JsonProperty("user")
  @JsonInclude(Include.NON_NULL)
  private UserDto userDto;

  @JsonProperty("product")
  @JsonInclude(Include.NON_NULL)
  private ProductDto productDto;
}
