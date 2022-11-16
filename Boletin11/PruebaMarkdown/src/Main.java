public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i *2 -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}