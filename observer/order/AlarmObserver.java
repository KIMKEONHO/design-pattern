package observer.order;

import observer.DisplayElements;
import observer.Observer;

public class AlarmObserver implements DisplayElements, Observer {

    private Status status;
    private OrderStatus orderStatus;

    public AlarmObserver(OrderStatus orderStatus){
        this.orderStatus = orderStatus;
        orderStatus.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 주문하신 물품이 " + status.getDescription() + "되었습니다.");
    }

    @Override
    public void update() {
        status = orderStatus.getStatus();
        display();
    }
}
