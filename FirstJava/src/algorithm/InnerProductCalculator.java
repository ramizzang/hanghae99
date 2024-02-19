package algorithm;

public class InnerProductCalculator {

    public static int solution(int[] a, int[] b) {
        int answer = 0;
        //길이가 같ㅌ은 배열
        for(int i =0; i < a.length; i++){
            answer += a[i]*b[i];
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int[] arr2 = {-3,-1,0,2};
        System.out.println(solution(arr,arr2));
    }
}
