package algorithm.hh_test;

public class CheckInPage {
    // 한주동안 공부 기록을 남길 알고리즘
    // 체크인 체크아웃은 정시에 진행
    // 체크아웃은 익일시간 24+a로 계산 새벽 2시 -> 24+a (26)
    // 체크아웃이 새벽 5시 정각 or 새벽 5시 넘어가면 체크아웃 깜빡
    // 5시 넘어가면  자동으로 ㅊ ㅔ크아웃 오후9시(21tl)
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        //24+5
        for(int i=0; i<arr1.length; i++){
            if(arr2[i]>=29){
                arr2[i] = 21;
            }
            answer += arr2[i]-arr1[i];
        }


        return answer;
    }

    public static void main(String[] args) {
        CheckInPage method = new CheckInPage();
        int[] arr1 = {9, 9, 8, 8, 7, 8, 9};
        int[] arr2 = {21, 25, 30, 29, 22, 23, 30};

        System.out.println(method.solution(arr1, arr2));
    }
}
