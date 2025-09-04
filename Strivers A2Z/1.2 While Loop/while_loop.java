import java.util.Scanner;
public class sayan {
    public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();


       int n = 10;
       while (n >= 1) {
           System.out.println(n * i);
           n--;
       }
    }
}