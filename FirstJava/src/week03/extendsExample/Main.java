package week03.extendsExample;

public class Main {
    public static void main(String[] args) {
        // 부모 클래스 객체에서 자식 클래스 멤버 사용
        Car car = new Car();
        // car.engine = "Orion"; // 오류 -> 자식의 field 이기 때문에 오류
        // car.booster(); // 오류 -> 자식의 메서드 이기 때문에 오류

        // 자식 클래스 객체 생성
        SportsCar sportsCar = new SportsCar();
        sportsCar.engine = "Orion";
        sportsCar.booster();

        // 자식 클래스 객체에서 부모 클래스 멤버 사용
        // 부모 클래스의 모든것을 상속 받았기 때문에 본인의 필드와 메서드처럼 사용할 수 있다.
        sportsCar.company = "GENESIS";
        sportsCar.setModel("GV80");
        System.out.println("sportsCar.company = " + sportsCar.company);
        System.out.println("sportsCar.getModel() = " + sportsCar.getModel());
        System.out.println();

        sportsCar.horn();
        System.out.println(sportsCar.changeGear('D'));
    }
}