package week02.work;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        baseballGame game = new baseballGame();

        boolean isEnd=false;
        boolean validInput=true;
        while(!isEnd){
            validInput=game.getUserInput(sc.nextLine());
            if(!validInput){continue;}
            isEnd=game.playGame();
        }
    }
}
