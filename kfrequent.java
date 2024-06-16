import java.util.*;

public class kfrequent {
    public int[] topKFrequent(int[] nums,int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare(int[] a,int[] b) {
                return Integer.compare(a[1],b[1]);
            }
        });

        for(int i:map.keySet()) {
            int [] arr = new int[] {i,map.get(i)};

            if(pq.size() < k) {
                pq.add(arr);
            } else {
                if(pq.peek()[1] < arr[1]) {
                    pq.poll();
                    pq.add(arr);
                }
            }
        }
        int ans[] = new int[k];
        int i = 0;
        while(!pq.isEmpty()) {
            ans[i++] = pq.poll()[0];
        }
        return ans;
    }

    public static void main(String [] args) {
        kfrequent k = new kfrequent();
        int[] nums = {1,1,1,2,2,3};
        System.out.println(k.topKFrequent(nums, 2));
    }
}
