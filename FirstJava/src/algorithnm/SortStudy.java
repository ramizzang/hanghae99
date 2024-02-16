package algorithnm;

import java.util.Arrays;
import java.util.Comparator;

public class SortStudy {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "Lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, new MyComparator());
        System.out.println(Arrays.toString(strArr));


    }
}
class MyComparator implements Comparator{
    public int compare(Object o1, Object o2) {
        return 0;
    }
}


