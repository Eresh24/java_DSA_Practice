import java.util.*;
public class Main{
    public static void main(String[] args){
        TwoSum solution = new TwoSum();
        int[] nums ={2,7,11,15};
        int target = 9;
        int[] result =solution.twoSum(nums,target);
        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }

    }
}