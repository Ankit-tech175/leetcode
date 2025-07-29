
      // * LeetCode Problem: Reverse Words in a String- 151 no. problem

public class solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] ar= s.trim().split("\\s+");// trim()- use to avoid multiple space in starting,ending and inbetween of words
        for(int i=ar.length -1;i>=0;i--){
            sb.append(ar[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    } 
}
