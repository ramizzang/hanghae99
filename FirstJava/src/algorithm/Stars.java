package algorithm;

public class Stars {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        //가로 - a , 세로 = b 인 별
        for(int i = 0; i<b; i++){
            for(int j=0; j<a; j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        System.out.println(a + b);
    }

}
