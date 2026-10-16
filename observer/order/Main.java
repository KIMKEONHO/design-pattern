package observer.order;


public class Main {

    public static void main(String[] args){

        OrderStatus orderStatus = new OrderStatus();

        AlarmObserver alarmObserver = new AlarmObserver(orderStatus);
        DiscountObserver discountObserver = new DiscountObserver(orderStatus);
        DeliveryObserver deliveryObserver = new DeliveryObserver(orderStatus);

        // 처음 주문 접수 (사용자가 주문을 함)
        orderStatus.setStatus(Status.PENDING);

        // 그 주문을 관리자가 확인을 하는데 걸리는 시간
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        // 관리자가 확인 후 주문 상태를 변경함
        orderStatus.setStatus(Status.CONFIRMED);

        // 배송시 걸리는 시간
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        // 배송 완료를 배달 기사가 누름
        orderStatus.setStatus(Status.COMPLETED);

    }

}