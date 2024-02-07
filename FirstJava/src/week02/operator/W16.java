package week02.operator;

public class W16 {
    public static void main(String[] args) {
//        int number = 0;
//
//        // while : ~ 하는 동안
//        while (number < 3) { // number < 3 인 동안~
//            number++;
//            System.out.println(number + "출력");
//        }

        // do ~ while : do 수행 후 while 한다, while의 조건은 만족하지 않아도 do는 무조건 한번은 수행되어야 한다.
//        int number = 4;
//        do {
//            System.out.println(number + "출력");
//        } while (number < 3);

        // break 문
        // 가장 가까운 블록의 for문 또는 while, switch 문을 중단
//        int number = 0;
//        while(number<3){
//            number++;
//            if(number ==2){
//                break;
//            }
//            System.out.println(number+"출력");
//        }

//        for(int i=0; i<10; i++){
//            System.out.println("i: "+ i);
//            if(i == 2){
//                break;
//            }
//            for(int j=0; j<10; j++){
//                System.out.println("j: "+ j);
//                if(j ==2){
//                    break;
//                }
//            }
//        }

        //continue : 건너뛰고 다음 반복을 수행
        int number = 0;
        while(number<3){
            number++;
            if(number==2){
                continue;
            }
            System.out.println(number + "출력");
        }
    }
}
