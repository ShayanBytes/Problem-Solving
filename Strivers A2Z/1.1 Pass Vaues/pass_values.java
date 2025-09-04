import java.util.Scanner;
import java.util.Arrays;

 class valueChange{
    int a ;
    valueChange(int a ){
        this.a = a;
    }
 }
public class pass_values {
 
    public static int passedByReference(valueChange value){
        value.a= value.a+2 ;
        return value.a;
    }

     static int passedByvalue(int a){
        int c = a +1;
        return c;
     }
    //    static int[] passedBy(int a, int b) {
    //     // code here
    //     int[] arr ={ c , d};
    // }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of a:");
    int a = sc.nextInt();
    System.out.println("enter the value of b:");
    int b= sc.nextInt();
    valueChange sayan = new valueChange( b);
    int c =  passedByvalue(a);
    System.out.println("before value of a:"+ a);
    System.out.println("after value of a:"+c);
  
    System.out.println("before value of b:"+sayan.a);
    int d = passedByReference(sayan);
    System.out.println("after value of b:"+ d);

    int[] values= { c , d};
    System.out.println(" Final Values:" + Arrays.toString(values));

 
}}
