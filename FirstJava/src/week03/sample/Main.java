package week03.sample;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        // 지역 변수 확인
        System.out.println(main.getNumber()); // 2
        System.out.println(main.getNumber()); // 2

        //

    }
    // 메서드 생성
    public int getNumber() {
        // 지역변수 <-> 전역변수
        // 해당 메서드가 실행될 때 마다 독립적인 값을 저장하고 관리
        // 지역변수는 메서드 내부에서 정의될 때 생성, 메서드가 종뢰될 때 소멸된다.
        int number = 1;
        number += 1; // number = number + 1
        return number;
    }
}
