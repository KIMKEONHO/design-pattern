package decorator;

import lombok.Getter;

@Getter
public abstract class Beverage {

    String description = "제목 없음";

    public abstract double cost();
}
