package week02.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String col = sc.nextLine();
        String title = sc.nextLine();

        ArrayList<String> strList = new ArrayList<>();

        while(true){
            String text = sc.nextLine();
            strList.add(text);
            if(text.equals("끝")){
                break;
            }
        } //while end, 요리법 추가 끝

        System.out.println("[ "+col+"으로 저장된 "+title+" ]");
        for(int i=0; i<strList.size(); i++){
            System.out.println((i+1)+". "+strList.get(i));
        }

    }
}
