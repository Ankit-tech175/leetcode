

                   // LeetCode Problem: Next Greater Element II - 503 no. problem


package Next_greater_element_2;
import java.util.Arrays;
import java.util.Stack;
public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res= new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<2*n;i++){
            int num=nums[i%n];
            while(!st.isEmpty() && nums[st.peek()]<num){
                res[st.pop()]=num;
            }
            if(i<n){
                st.push(i);
            }
        }
        return res;
    }
}
