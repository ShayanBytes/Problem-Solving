import java.util.Scanner;
class countNumbers {
    static void  evenlyDivides(int n) {
        // code here
       
     if (n == 0){
         System.out.print("Invalid");
     }else{
         for(int i= 1;i<=n;i++){
         if(n % i == 0){
            System.out.println(i);
             
         }
         }
     }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
       evenlyDivides(a);


    }
}