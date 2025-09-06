import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int z = Integer.toString(x).length();
        int original = x; 
        int reverse = 0;
       
        for (int i = 1; i<=z;i++){
            int pop = x % 10;
            reverse = reverse*10+pop;
             x =(int) Math.floor(x/10);
        }
        System.out.println(reverse);

      if(original==reverse){
            System.out.print("palindrome");
        
      }else{
        System.out.print("Not Palindrome");
      }

    }
}
