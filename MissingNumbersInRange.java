import java.util.*;

public class MissingNumbersInRange {
   public List<Integer> findDisappearredNumbers(int[] nums) {
    ArrayList<Integer> sol = new ArrayList<>();
    int [] appeared = new int[nums.length + 1];

    for(int i : nums) {
        appeared[i]++;
    }

    for(int i = 1; i< nums.length + 1; i++) {
        if(appeared[i] == 0) {
            sol.add(i);
        }
    }

    return sol;
   }

   public static void main(String [] args) {
    MissingNumbersInRange m = new MissingNumbersInRange();
    int[] nums = {4,3,2,7,8,2,3,1};
    System.out.println(m.findDisappearredNumbers(nums));
   }

}