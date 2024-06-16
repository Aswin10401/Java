import java.util.*;

public class ListIntersection {
    public List<Integer> Intersection(ArrayList<Integer> lst1 ,  ArrayList<Integer> lst2) {
        List<Integer> res = new ArrayList<>();

        for(int i : lst1) {
            if(lst2.contains(i)) {
                res.add(i);
            }
        }

        return res;
    }

public static void main(String [] args) {
    ListIntersection l = new ListIntersection();
    ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1,2,2,1));
    ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(2,2));

    System.out.println(l.Intersection(lst1, lst2));
}

}
