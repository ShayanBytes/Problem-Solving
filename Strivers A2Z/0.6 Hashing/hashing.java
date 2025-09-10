
import java.util.Scanner;
public class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x]; //5 
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt(); // (5,4,1,2,2) 
                                    //(0,1,2,3,4)
        };

        int[] hash = new int[13];
        for(int i=0;i<x;i++){  //(1,2,0,1,1,)
                                //(0,1,2,3,4,5,6)
            hash[arr[i]-1] += 1;
        }       //(1,1,0,0,1,1)

        for(int i=0;i<5;i++){
            
                System.out.println((i+1) + " " + hash[i]);
            
        }
    }
}