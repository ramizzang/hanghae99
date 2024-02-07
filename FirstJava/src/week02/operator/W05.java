package week02.operator;

public class W05 {
    public static void main(String[] args) {
        // 대입연산자 : 변수를 바로 연산해서 그 자리에 저장하는(대입하는) 연산자
        // =(기본연산자), +=, -=, *= ....(복합대입연산자)
        // ++ : += 1 (증가연산자)
        // -- : -= 1 (감소연산자)

        int number = 10;

        //대입연산자 = : 오른쪽 피연산자의 값을 왼쪽 피연산자(저장공간)에 저장 후 저장된 값을 반환
        number = number + 2; // 10 +2 -> 12
        System.out.println(number); // 12

        number = number - 2; // 12 - 2 -> 10
        System.out.println(number); // 10

        number = number * 2; // 10 * 2 -> 20
        System.out.println(number); // 20

        number = number / 2; // 20 / 2 -> 10
        System.out.println(number); // 10

        number = number % 2; // 20 % 2 -> 몫 : 10, 나머지 : 0
        System.out.println(number); // 0

        System.out.println("===========================");

        //복합 대입 연산자 : 대입연산자와 다른 연산자를 하나로 축약
        number = 10;

        number += 2; // number = number + 2 -> 10 +2 -> 12
        System.out.println(number); // 12

        number -= 2; // number = number - 2 -> 12 - 2 -> 10
        System.out.println(number); // 10

        number *= 2; // number = number * 2 -> 10 * 2 -> 20
        System.out.println(number); // 20

        number /= 2; // number = number / 2 -> 20 / 2 -> 10
        System.out.println(number); // 10

        number %= 2; // number = number % 2 -> 10 % 2 -> 몫 : 5, 나머지 : 0
        System.out.println(number); // 0

        System.out.println("===========================");

        //++, --
//        number = number +1;
//        number += 1;
        number++; //1
        System.out.println(number);//1

        number--;
        System.out.println(number);//0



    }
}
