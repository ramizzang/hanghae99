package week03.abs;

public abstract class Car {
    String company; // 자동차 회사
    String color; // 자동차 색상
    double speed;  // 자동차 속도 , km/h

    public double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    //추상메서드로 구현 -> 메서드 이름은 같고 구현 부분만 다르기 때문에 해당 메서드만 추상 메서드화 시킴
    public abstract void horn();
}