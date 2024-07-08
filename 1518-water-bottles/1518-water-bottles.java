class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int currBottles = numBottles;
        int empty = numBottles;
        int count = numBottles;
        while(empty / numExchange > 0){
                count += empty/numExchange;
                empty = empty / numExchange + empty % numExchange; 
        }
        return count;
    }
}