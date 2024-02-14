package algorithnm;

public class 최대공약수최소공배수 {
    public static void main(String[] args) {
        int answer[] = new int[2];
        int a = 3;
        int b = 12;
        //최대 공약수 두수의 최대 공약수
        //최소공배수 = 두자연수의 곱 / 최대공약수
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        while (min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        //최대 공약수
        answer[0]=max;

        //최소공배수
        answer[1] = a*b/ max;

    }
}
