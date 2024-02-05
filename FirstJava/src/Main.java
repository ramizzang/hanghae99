
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Main {

    public static void main(String[] args) {
        //scanner -> 사용자 입력값 scan
        Scanner sc = new Scanner(System.in);
//
//        //요리제목 입력 받기
        String title = sc.nextLine();
        
        // 별점 입력 받기
        int starRating = (int)sc.nextDouble();
        sc.nextLine(); //엔터 소비
        
        // 레시피 입력 받기
        String[] recipe = new String[10];
        for(int i = 0; i < recipe.length; i++) {
            recipe[i] = sc.nextLine();
        }

        System.out.println("["+title+"]");
        System.out.println("별점 : "+ starRating+ " ("+starRating/5f*100+"%)" );
        for (int i = 0; i < recipe.length; i++) {
            System.out.println(i+1+". " + recipe[i]);
        }

    }

}