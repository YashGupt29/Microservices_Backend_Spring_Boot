package com.selimhorri.app.business.orderItem.model.response;

import com.selimhorri.app.business.orderItem.model.OrderItemDto;
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
public class OrderItemOrderItemServiceDtoCollectionResponse implements Serializable {

  private static final long serialVersionUID = 1L;
  private Collection<OrderItemDto> collection;
}
