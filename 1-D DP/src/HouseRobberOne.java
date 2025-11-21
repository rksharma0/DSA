import java.util.Arrays;

public class HouseRobberOne {

    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        System.out.println(HouseRobberOneRecursive(nums,0));
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.println(HouseRobberOneMemo(nums,0,dp));

    }

    private static int HouseRobberOneRecursive(int[] nums,int index) {
        if(index>=nums.length){
            return 0;
        }
        int steal=nums[index]+HouseRobberOneRecursive(nums,index+2);
        int skip=HouseRobberOneRecursive(nums,index+1);
        return Math.max(steal,skip);
    }
    private static int HouseRobberOneMemo(int[] nums,int index,int[] dp) {
        if(index>=nums.length){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int steal=nums[index]+HouseRobberOneMemo(nums,index+2,dp);
        int skip=HouseRobberOneMemo(nums,index+1,dp);
        dp[index]= Math.max(steal,skip);
        return dp[index];
    }
}
