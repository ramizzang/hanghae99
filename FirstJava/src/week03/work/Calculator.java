package week03.work;

public class Calculator {
    AbstractOperation operation;


    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    //더하기, 빼기, 나누기, 곱하기 연산을 수행
    // method calculate(String operator, firstNumber, secondNumber) return type : double
    //연산 수행을 위한 메서드
    public double calculate(int firstNumber, int secondNumber) {
        if (operation != null) {
            return operation.operate(firstNumber, secondNumber);
        } else {
            return firstNumber % secondNumber;
        }

    }


}
