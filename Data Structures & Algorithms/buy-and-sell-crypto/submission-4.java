class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int profit = 0;

        for(int index=0;index<prices.length;index++){
            if(prices[index]<min){
                min=prices[index];
            }

            profit = Math.max(profit,prices[index]-min);
        }

        return profit;


        // int size=prices.length;
        // if(size==0||size==1){
        //     return 0;
        // }

        // int buy = prices[0];
        // int sell = 0;
        // int currProfit = 0;
        // int maxProfit = 0;

        // for(int index=1;index<size;index++){
        //     if(prices[index]>=buy && prices[index]>=sell){
        //         sell = prices[index];
        //         currProfit = sell-buy;
        //     }
        //     if(prices[index]<buy){
        //         buy = prices[index];
        //         sell = prices[index];
        //     }
        //     maxProfit = Math.max(currProfit,maxProfit);

        // }
        // return maxProfit;
    }
}
