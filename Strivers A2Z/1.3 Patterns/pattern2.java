public class pattern2 {

    public static void printLine(int max) {
        for (int m = max; m >= 2; m -= 2) {
            int spaces = max - m;
            int starsl = (max - spaces) / 2;

            for (int i = 1; i <= starsl; i++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= starsl; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int m =2; m<=max; m += 2) {
            int spaces = max - m;
            int starsl = (max - spaces) / 2;

            for (int i = 1; i <= starsl; i++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= starsl; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printLine(10);
    }
}
