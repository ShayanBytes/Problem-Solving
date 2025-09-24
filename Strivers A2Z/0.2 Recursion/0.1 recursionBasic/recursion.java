import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class recursion {

    public static int[] returnNumbers(int number){
        if(number ==1){
            return new int[]{1};
        }else{
         int[] result = returnNumbers(number-1);
         int[] newResult = new int[result.length + 1];
         System.arraycopy(result, 0, newResult, 0, result.length);
         newResult[newResult.length - 1] = number;
         return newResult;}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int x = sc.nextInt();
        System.out.println(Arrays.toString(returnNumbers(x)));
    }
}