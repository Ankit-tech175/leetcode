
                       // Perform opertions given in a string as a basic calculator
                       // The string can contain digits, '+', '-', '(', and ')' 


package Basic_calculator;
import java.util.Stack;

public class solution {
    public int calculate(String s) {
        int res=0,sig=1,num=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='+'){
                res+=sig*num;
                num=0;
                sig=1;
            }
            else if(ch=='-'){
                res+=sig*num;
                num=0;
                sig=-1;
            }
            else if (ch == '(') {
                st.push(res);
                st.push(sig);
                res = 0;
                sig = 1;
            } 
            else if (ch == ')') {
                res += sig * num;
                num = 0;
                res *= st.pop(); // sign
                res += st.pop(); // result
            }
        }
        res += sig * num;
        return res;
     }
}
