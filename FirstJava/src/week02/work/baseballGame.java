package week02.work;

import java.util.Random;

public class baseballGame {
    //필드 : 랜덤숫자, 사용자 숫자, strike, ball, 시도 횟수
    String computerNum=""; //랜덤 정답 숫자
    String inputNum="";    //사용자 입력 숫자
    int tryCnt=1;

    //메서드 : 숫자를 받음, 랜덤 숫자 생성, 비교
    public baseballGame(){
        Random random = new Random();
        //1. 랜덤 수를 생성
        while(computerNum.length() < 3){
            String num = Integer.toString(random.nextInt(10)); // 스트링으로 변환
            if(!computerNum.contains(num)){
                computerNum += num;
            }
        }
        //System.out.println(computerNum);
        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");
    }
    //2 메인 사용자 입력을 받아 3-> 비교를 한다
    //2.사용자 입력
    public boolean getUserInput(String input){
        this.inputNum = input;
        if(input.charAt(0)==input.charAt(1) || input.charAt(1)==input.charAt(2) || input.charAt(2)==input.charAt(0) ){
            System.out.println("각 자릿수가 모두 달라야합니다.");
            return false;
        }
        return true;
    }

    //3. 비교
    public boolean playGame(){
        int strike=0;
        int ball=0;
        for (int i = 0; i < 3; i++) {
            //유저의 input에 정답 숫자가 들어가 있을때
            if(computerNum.contains(String.valueOf(inputNum.charAt(i)))){
                if(computerNum.charAt(i)==inputNum.charAt(i)){  //자리도 같은 경우
                    strike++;
                }else{  //자리는 다른 경우
                    ball++;
                }
            }
        }

        if(strike==3){
            System.out.println(tryCnt+"번만에 맞히셨습니다.");
            System.out.println("게임을 종료합니다");
            return true;
        }
        System.out.println(tryCnt+"번째 시도 : "+inputNum);
        System.out.println(ball+"B"+strike+"S");
        tryCnt++;
        return false;
    }

}
