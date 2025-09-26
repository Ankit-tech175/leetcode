

         // leetcode 260  - Single Number III 

public class Solution {
    public int[] singleNumber(int[] nums) {
        int [] ar=new int[2];
        int a=0,b=0,x=0,y;
        for(int num :nums){
            x=x^num;
        }
        y=x&(-x);
        for(int num :nums){
            if((num&y)!=0){
                a=a^num;
            }
            else{
                b=b^num;
            }
        }
        ar[0]=a;
        ar[1]=b;
        return ar;
    }
}
