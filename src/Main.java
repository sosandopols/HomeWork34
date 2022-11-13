public class Main {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int k = n;
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(k - j + " ");
            }
            System.out.println();
        }
    }
}