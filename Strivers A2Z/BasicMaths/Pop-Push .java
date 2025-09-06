import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:")
        int x =sc.nextInt();
        int rev = 0;
        for(int i =1;i<=Integer.toString(x).length();i++){
            int pop = x % 10;
            if (rev<21478364 || rev >-21478364){
                rev = rev * 10 + pop;
            }else if (rev>21478364){
                if(rev==214783647){
                    System.out.println( "0" );

                }else{
                    System.out.println("0");
                }
           
            }
            x =(int) Math.floor(x/10);

    }
    System.out.print(rev);
}
}