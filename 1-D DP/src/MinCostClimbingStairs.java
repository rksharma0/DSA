public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int arr[]={1,100,1,1,1,100,1,1,100,1};
        int a=minCostClimbingStairsUsingRecursion(arr,0);
        int b=minCostClimbingStairsUsingRecursion(arr,1);
        System.out.println(Math.min(a,b));

    }

    private static int minCostClimbingStairsUsingRecursion(int[] cost,int i) {
        if (i >= cost.length) return 0;
        return cost[i] + Math.min(minCostClimbingStairsUsingRecursion(cost, i + 1), minCostClimbingStairsUsingRecursion(cost, i + 2));
    }
}
