package observer.order;

import observer.DisplayElements;
import observer.Observer;

public class DeliveryObserver implements Observer, DisplayElements {

    private OrderStatus orderStatus;
    private Status status;

    public DeliveryObserver(OrderStatus orderStatus){
        this.orderStatus = orderStatus;
        orderStatus.registerObserver(this);
    }

    @Override
    public void display() {
        if(status.equals(Status.PREPARING)){
            System.out.println("상품을 준비중입니다.");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            System.out.println("상품 준비가 완료됐습니다.");
            orderStatus.setStatus(Status.SHIPPING);
        }
    }

    @Override
    public void update() {
        status = orderStatus.getStatus();
        display();
    }
}
