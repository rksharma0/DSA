import java.util.Scanner;

public class ClimbStairs {

    public static void main(String[] args) {
        int n=2;
        int dp[]=new int[n+1];
        System.out.println(climbStairsRecursive(n));
        System.out.println((climbStairsMemo(n,dp)));
        System.out.println((Tabulation(n)));

    }

    private static  int Tabulation(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    private static int climbStairsMemo(int n,int[] dp) {
        if(n==1||n==0) return 1;
        if(dp[n]!=0) return dp[n];
        dp[n]=climbStairsMemo(n-1,dp)+climbStairsMemo(n-2,dp);
        return dp[n];
    }

    private static int climbStairsRecursive(int n) {
        if(n<0){
            return 0;
        }
        if(n<0)return 0;
        if(n==0){
            return 1;
        }

        return climbStairsRecursive(n-1)+ climbStairsRecursive(n-2);
    }
}
