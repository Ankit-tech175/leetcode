


              // water bottles II -  3100 no. Leetcode problem

public class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emp=numBottles;
        int drink=numBottles;
        numBottles=0;
        while(emp>=numExchange){
            emp-=numExchange;
            numExchange++;
            numBottles++;
            if(emp<numExchange){
                emp+=numBottles;
                drink+=numBottles;
                numBottles=0;
            }
        }
        return (drink+numBottles);
    }
}
