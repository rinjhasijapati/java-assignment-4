import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans = array.build(nums);
        System.out.println("The input array is: ");
        System.out.print("[");
        for(int i=0; i<nums.length; i++){
            System.out.print( nums[i] + "," );
        }
        System.out.println("]");
        System.out.println("The output array is: ");
        System.out.println(Arrays.toString(ans));
    }
}
