package week03.packageExample.main;

import week03.packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 다른 패키지에 있는 클래스 파일을 사용 하려면 import 하여 사용 하거나 아래와 같이 패키지 경로를 명시해 주어야 한다.
        week03.packageExample.pk2.Car car2 = new week03.packageExample.pk2.Car();
        car.horn();


    }
}
