import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
       int [] list1 = {1,2,4};
       int [] list2 = {1,3,4};
       List<Integer> list3 = new ArrayList<>();
       for(int i = 0; i<list1.length;i++){
           list3.add(list1[i]);
       }
       for(int i = 0; i<list2.length;i++){
           list3.add(list2[i]);
       }
        Collections.sort(list3);
        System.out.println(list3);
    }
}
