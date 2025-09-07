import java.util.Scanner;
public class recursion {

    public static void reverse(char[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverse(array, start + 1, end - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of your array:");
        int x = sc.nextInt();
        char[] array = new char[x];
        for (int i = 0; i < x; i++) {
        
            array[i] = sc.next().charAt(0);
        }
        reverse(array, 0, x - 1);

        System.out.print("[");
        for (int i = 0; i < x; i++) {
            System.out.print("\"" + array[i] + "\"");
            if (i != x - 1) System.out.print(",");
        }
        System.out.println("]");
       
    }
}