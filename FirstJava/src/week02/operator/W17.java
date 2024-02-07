package week02.operator;

import java.util.Scanner;

public class W17 {
    public static void main(String[] args) {
        //입력받는 단을 제외하고 출력
//        Scanner sc = new Scanner(System.in);
//        int passNum = sc.nextInt();

        // 입력받는 단만 출력
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        //구구단
//        for (int i = 2; i <= 9; i++) {//구구단 앞자리
//            if (i == passNum) {// 입력받는 단 제외
//                continue;
//            }
//            for (int j = 1; j <= 9; j++) {//구구단 뒷자리
//                System.out.println(i + " x " + j + " = " + (i * j));
//            }
//        }

        for (int i = 2; i <= 9; i++) {//구구단 앞자리
            if (i == inputNum) {// 입력받는 단만 출력
                for (int j = 1; j <= 9; j++) {//구구단 뒷자리
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
            }
        }
    }
}
