package arrays;

import java.util.HashMap;

public class checkSubarraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum =0;
        for(int i = 0 ; i<nums.length ; i++) {
            sum += nums[i];
            int r = k==0?sum : sum%k;
            if (map.containsKey(r)) {
                if(i-map.get(sum%k)>1)
                return true;
            } else {
                map.put(r,i);
            }
        }
        return false;
    }

    static void main() {
        int [] p = {5,0,0,0};
        int l =3;
        System.out.println(checkSubarraySum(p,l));
    }
}
