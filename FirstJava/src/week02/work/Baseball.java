package week02.work;

import java.util.*;

public class Baseball {
    public static void main(String[] args) {
        //과제 조건
        //컴퓨터 -> 0~9 사이의 서로 다른 수 3개 무작위로 뽑는다
        //사용자 컴퓨터가 뽑은 숫자 맞추기 위해 시도
        // 컴퓨터 : 사용자가 입력한 세자리 숫자에 대해 스트라이크(S), 볼(b) 알려준다
//        - 숫자의 값과 위치가 모두 일치하면 S
//                - 숫자의 값은 일치하지만 위치가 틀렸으면 B
//                - 기회는 무제한이며, 몇번의 시도 후에 맞췄는지 기록됩니다.
//        - 숫자 3개를 모두 맞춘 경우, 게임을 종료합니다.

        int num = 0;
        // {} 안의 내용을 20번 반복한다.

        for (int i = 1; i <= 20; i++) {
            // 1~10 사이의 난수를 20개 출력하시요.
//			System.out.println(Math.random()); //0.0<=x<1.0 난수의 범위
//			System.out.println(Math.random()*10); //0.0<=x<10.0 각변에 *10 해줌
//			System.out.println((int)(Math.random()*10)); //0<=(int)x<10 형변환 해줌
//            System.out.print((int) (Math.random() * 10) + 1); //1<=x<11 각변에 +1

        }

        //랜덤 0~9 사이의 정수 3개 출력, 중복 x
        int randomNum;
        for (int i = 1; i <= 3; i++) { // 랜덤 수를 뽑고 싶은 수만큼 반복
            //0~9 사이의 난수 3개 출력
//            System.out.println(Math.random()); // 0.0 <= x < 1.0 난수의 범위
//            System.out.println(Math.random()*10); // 0.0 * 10 <= x * 10 < 1.0 * 10 각 변에 *10
            // 0~9 사이의 정수 랜덤 출력
            System.out.println((int) (Math.random() * 10)); // (int)(0.0 * 10) <= (int)(x * 10) < (int)(1.0 * 10) (int)로 형변환 해준다 -> 0 <= (int)(x * 10) < 10
        }

        //set 에 담기 -> 왜냐면 set은 중복을 허용하지 않기 때문에e
        //LinkedHaskSet : 요소 순서를 보장한다
        Set<String> comNum = new LinkedHashSet<>();
        for (int i = 0; comNum.size() < 3; i++) {
            //0~9 사이의 랜덤 정수 저장 -> String.valueOf() : 인자로 전달된 값을 문자열로 변환해 준다.
            comNum.add(String.valueOf((int) (Math.random() * 10)));
        }
        System.out.println(comNum);

        //set -> toArray() 사용하여 String array 로 변환
        String[] stringComNum = comNum.toArray(new String[0]);
        System.out.println(Arrays.toString(stringComNum));

        char[] userNum = new char[3]; // user가 입력한 값
        int tryCnt = 0; //유저 도전 횟수

        Scanner sc = new Scanner(System.in);
        String userInput;

        while (true) {
            //사용자에게 수 입력받아서 문자열로 저장
            userInput = sc.nextLine();

            //문자열 char 배열로 저장
            for (int i = 0; i < userNum.length; i++) {
                userNum[i] = userInput.charAt(i);
            }

            //볼, 스트라이크 판정
            int strikes = 0;
            int balls = 0;

            // 유저 숫자가 컴퓨터 숫자에 포함되었는지 확인
            for (int i = 0; i < userNum.length; i++) {
                if (Arrays.asList(stringComNum).contains(String.valueOf(userNum[i]))) {
                    if (stringComNum[i].equals(String.valueOf(userNum[i]))) {
                        strikes++;
                    } else {
                        balls++;
                    }
                }
            }
            tryCnt++;
            System.out.println(tryCnt + "번째 시도 : "+ userInput);
            System.out.println(strikes + "S"  + balls+  "B");

            if (strikes == 3) {
                System.out.println(tryCnt + "번만에 맞히셨습니다.");
                System.out.println("게임을 종료합니다.");
                break;

            }
        }
    }
}
