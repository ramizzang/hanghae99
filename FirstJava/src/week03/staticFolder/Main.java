package week03.staticFolder;

public class Main {
    public static void main(String[] args) {

        // 클래스 필드 company 확인
        // company : static 으로 선언되어 class 멤버이기 때문에 '클래스명.변수명' 과 같이 접근이 가능하다.
        System.out.println(Car.company + "\n");

        // 클래스 필드 변경 및 확인
        Car.company = "Audi";
        System.out.println(Car.company + "\n");

        // 클래스 메서드 호출
        // static 메서드 이기 때문에 클래스의 인스턴스화 없이 '클래스명.메서드()'와 같이 접근 가능하다
        String companyName = Car.setCompany("Benz");
        System.out.println("companyName = " + companyName);

        System.out.println();
        // 참조형 변수 사용
        Car car = new Car(); // 객체 생성

        car.company = "Ferrari";
        System.out.println(car.company + "\n");

        String companyName2 = car.setCompany("Lamborghini");
        System.out.println("companyName2 = " + companyName2);
    }
}