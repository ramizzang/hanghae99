package week03.work;

public class DivideOperation extends AbstractOperation{//나누기 구현

    @Override
    double operate(int firstNumber, int secondNumber){

        return (double) firstNumber / secondNumber;
    }
}
