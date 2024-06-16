import java.util.*;

public class collections1 {

public static void main (String[] args) {
    int lst[] = {1,1,2,3,3,4};

    int k = removeDuplicates(lst);

    for(int i = 0;i <k;i++) {
        System.out.println(lst[i]);
    }

}

public static int removeDuplicates(int[] lst) {
    int i = 0;
    for(int j=1;j<lst.length;j++) {
        if(lst[i] != lst[j]) {
            i++;
            lst[i] = lst[j];    
        }
    }

    return i + 1;
}

}