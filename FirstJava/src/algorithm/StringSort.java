package algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(n);
                char c2  = o2.charAt(n);

                if(c1 == c2){
                    return o1.compareTo(o2);
                } else{
                    return c1 - c2;
                }
            }
        });

        return strings;
    }
    public static void main(String[] args) {
        String[] str = {"sun", "bed", "car"};
        System.out.println(Arrays.toString(solution(str,1)));
    }


}
