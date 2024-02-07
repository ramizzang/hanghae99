package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        //최대값 구하기
        int[] arr = {3, 2, 1, 5, 0};

        // 최대값 초기화 세팅
        int max = arr[0];
        int min = arr[0];

        // 최대값 구하기 로직
        for(int num: arr){
            if(num>max){
                max = num;
            }else if(num < min){
                min = num;
            }
        }
        System.out.println("최대값 : " + max+ " / 최소값 : "+ min); //최대값 : 5 / 최소값 : 0

    }
}
