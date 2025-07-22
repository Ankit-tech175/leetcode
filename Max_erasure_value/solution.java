import java.util.HashSet;
public class solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int max=0;
        int l=0,sum=0;
        HashSet<Integer> h=new HashSet<>();
        for(int r=0;r<n;r++){
            while(h.contains(nums[r])){
                h.remove(nums[l]);
                sum-=nums[l];
                l++;
            }
            h.add(nums[r]);
            sum+=nums[r];
        max=Math.max(max,sum);
        }
        return max;
    }
}

