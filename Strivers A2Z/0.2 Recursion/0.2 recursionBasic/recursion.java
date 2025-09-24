class Solution {

    public static void printGfg(int N) {
        // code here
        if (N == 1) {
            System.out.println("Sayan");
        } else {
            printGfg(N - 1);
            System.out.println("Sayan");
        }
    }
    public static void main(String[] args) {
        printGfg(10);
    }
}