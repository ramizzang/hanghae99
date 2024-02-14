package week03;

public class Car { //1.클래스 선언

    //고유데이터
    // 2.객체의 속성 정의(field 정의)
    String company; // 자동차 회사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색
    double price; // 자동차 가격

    //상태 데이터 정의
    double speed; // 자동차 속도, km/h
    char gear; // 기어 상태(p,r,n,d)
    boolean lights = true; // 자동차 조명 on,off 상태

    //객체 데이터 정의
    Tire tire = new Tire();
    Door door;
    Handle handle;

    // 3.생성자 생성 - constructor :
    // 처음 객체가 생성될 때(instance화될 때) 어떤 로직을 수행해야 하며, 어떤 값이  필수로 들어와야 하는지 정의
    public Car() { // 기본생성자 : 생략가능
        System.out.println("생성자 호출 생성생성");
    }

    // 4.메서드 정의
    //gasPedal
    //input : km/h
    //output : speed
    double gasPedal(double kmh, char type){
        changeGear(type); //가속도 페달을 누르면 자동을 기어가 변경된다.
        speed = kmh;
        return speed;
    }

    //brakePedal
    //input : x
    //output : speed
    double brakePedal(){
        speed = 0;
        return speed;
    }

    //changeGear
    //input : gear(char)
    //output : gear(char)
    char changeGear(char type){
        gear = type;
        return gear;
    }

    //onOffLight
    //input : x (왜냐면 메서드 호출하면 true,false 변경해주면 되기때문)
    //output : lights(boolean)
    boolean onOffLight(){
        lights = !lights;
        return lights;
    }

    //horn(경적)
    //input x
    //output x
    void horn(){
        System.out.println("빵빵!!");
    }

    // 자동차의 속도 ...가변길이 메서드 적용
    void carSpeeds(double ... speeds){ // 들어오는 매개변수가 speeds 에 배열로 저장 된다.
        for(double v : speeds){
            System.out.println("v = "+ v);
        }
    }
}
