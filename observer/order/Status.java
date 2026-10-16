package observer.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Status {

    PENDING("주문 접수 "),
    CONFIRMED("주문 확정 "),
    PREPARING("상품 준비 중이 "),
    SHIPPING("배송 중이 "),
    COMPLETED("배송 완료 "),
    CANCELLED("주문 취소 ");

    private final String description;

}
