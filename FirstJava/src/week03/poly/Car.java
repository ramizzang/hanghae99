package week03.poly;

public class Car {
    Tire tire;

    public Car(Tire tire) {//생성자 매개변수 - Tire
        this.tire = tire;
    }

    Tire getHankookTire() {
        return new HankookTire("HANKOOK");
    }

    Tire getKiaTire() {
        return new KiaTire("KIA");
    }
}