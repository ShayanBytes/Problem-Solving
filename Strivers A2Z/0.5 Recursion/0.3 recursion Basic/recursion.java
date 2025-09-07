class Main {

    public static void printNum(int n){
        if(n==1){
            System.out.println(n); // last number followed by newline
            return;
        }
        System.out.print(n + " ");
        printNum(n-1);
    }
    public static void main(String[] args) {
        printNum(5);
    }
}