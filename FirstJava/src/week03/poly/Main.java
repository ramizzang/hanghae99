package week03.poly;

public class Main {
    public static void main(String[] args) {
        // 매개변수 다형성 확인!
        // public Car(Tire tire){} -> car 생성자 -> Tire 타입의 객체를 매개변수로 받는다
        // KiaTire,HankookTire : Tire를 상속받은 Tire의 자식 class -> 자동 타입 변환
        Car car1 = new Car(new KiaTire("KIA"));
        Car car2 = new Car(new HankookTire("HANKOOK"));

        //위에 CAR1,2 를 풀어서 쓰면 아래와 같다
        Tire kiaSampleTire = new KiaTire("KIA");
        Tire hankookSampleTire = new HankookTire(("HANKOOK"));

        Car car3 = new Car(kiaSampleTire);
        Car car4 = new Car(hankookSampleTire);

        // 반환타입 다형성 확인!
        Tire hankookTire = car1.getHankookTire();
        KiaTire kiaTire = (KiaTire) car2.getKiaTire();

        // 오버라이딩된 메서드 호출 -> 자식 클래스에서 부모 클래스의 메서드를 오버라이딩(재정의)한 경우,
        // 자식 객체가 부모 타입의 참조 변수에 할당되더라도 오버라이딩된 메서드가 호출
        car1.tire.rideComfort(); // KIA 타이어 승차감은 60
        car2.tire.rideComfort(); // HANKOOK 타이어 승차감은 100
    }
}