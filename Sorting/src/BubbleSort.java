import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[] {10,2,30,4,50,6,7,8,9,10};
        sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
    public static void sort(int[] arr){

        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){
            if(arr[i]>=arr[j]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }

            }
        }
    }
}
