import java.util.Scanner;

public class ClimbStairs {

    public static void main(String[] args) {
        int n=2;
        System.out.println(climbStairsRecursive(n));


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
