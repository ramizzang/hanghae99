package week02.operator;

public class W02 {
    public static void main(String[] args) {
//        사칙연산 : +, - , * , /, %
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2 int / int = int 의 결과를 반환한다. 따라서, 몫 부분만 반환해 준다.
        System.out.println(5 / 2.0); // 2.5 int / double = double 의 결과 반환
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0 : % -> 나머지 연산자는 나누고 난 후 몫이 아닌 나머지 값을 반환 해준다.
        System.out.println(5 % 2); // 1
        System.out.println("---------------------------"); // 1

//        우선순위 연산 (연산의 우선순위 : () > *,/,%  >  +,- )
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

//        변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        //덧셈
        c = a + b;
        System.out.println(c); // 30

        //뺄셈
        c = a-b;
        System.out.println(c); // 10

    }
}
