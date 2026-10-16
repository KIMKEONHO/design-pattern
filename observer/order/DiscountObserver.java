package observer.order;

import observer.DisplayElements;
import observer.Observer;

public class DiscountObserver implements DisplayElements, Observer {

    private Status status;
    private OrderStatus orderStatus;

    public DiscountObserver(OrderStatus orderStatus){
        this.orderStatus = orderStatus;
        orderStatus.registerObserver(this);
    }

    @Override
    public void display() {
        if(status.equals(Status.CONFIRMED)){
            System.out.println("재고를 줄입니다.");
            orderStatus.setStatus(Status.PREPARING);
        }
    }

    @Override
    public void update() {
        status = orderStatus.getStatus();
        display();
    }
}
