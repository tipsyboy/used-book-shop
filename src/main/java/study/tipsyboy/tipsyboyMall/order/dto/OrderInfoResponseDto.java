package study.tipsyboy.tipsyboyMall.order.dto;

import lombok.Getter;
import study.tipsyboy.tipsyboyMall.order.domain.Order;
import study.tipsyboy.tipsyboyMall.order.domain.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class OrderInfoResponseDto {

    private final Long id;

    private final OrderStatus orderStatus;

    private final LocalDateTime orderedDate;

    private final List<OrderItemResponseDto> orderItemList;

    // 총 금액
    // 배송정보

    public OrderInfoResponseDto(Order entity) {
        this.id = entity.getId();
        this.orderStatus = entity.getOrderStatus();
        this.orderedDate = entity.getCreateDate();
        this.orderItemList = entity.getOrderItems().stream()
                .map(orderItem -> OrderItemResponseDto.of(orderItem))
                .collect(Collectors.toList());
    }
}