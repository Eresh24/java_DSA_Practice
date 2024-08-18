import java.util.*;
public class Main{
    public static void main(String[] args){
       int number [] = {1,3,6,9,19};
        System.out.println(ArraysCC(number));
    }
    public static int ArraysCC(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<number.length;i++){
            if(largest<number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
}