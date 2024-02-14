package week03.work;

public class Main {
    public static void main(String[] args) {
        //calculator 객체 생성
        Calculator calculator = new Calculator();

//        덧셈 연산 설정 -> 자동 타입변환
        calculator.setOperation(new AddOperation());
        System.out.println(calculator.calculate(5,8));

//      뺄셈 연산
        calculator.setOperation(new SubstractOperation());
        System.out.println(calculator.calculate(5,8));

//        곱셈
        calculator.setOperation(new MultiplyOperation());
        System.out.println(calculator.calculate(5,8));

//        나눗셈
        calculator.setOperation(new DivideOperation());
        System.out.println(calculator.calculate(4,2));



    }
}
