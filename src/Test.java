public class Test {
    public static void main(String[] args) {
        int n = 4;
        String[] strings = new String[n * 2 - 1];
        for (int j = 0; j < n * 2 - 1; j++){
            strings[j] = " ";
            if (j == n - 1)
                strings[n - 1] = "*";
            System.out.print(strings [j]);
        }
        System.out.println();
        for(int j = 0; j < n * 2 - 1; j++){
            strings[j] = " ";
            if (j == n - 2)
                strings[n - 2] = "*";
            if (j == n)
                strings[n] = "*";
            System.out.print(strings[j]);
        }
        System.out.println();
        for (int i = 2; i < n - 1; i++){
            for (int j = 0; j < n * 2 - 1; j++){
                if (strings[j] == "*") {
                    strings[j - 1] = "*";
                    strings[j] = " ";
                }
                if (strings[j] == "*") {
                    strings[j + 1] = "*";
                    strings[j] = " ";
                }
            }
            for(int j = 0; j < n * 2 - 1; j++){
                System.out.print(strings[j]);
            }
            System.out.println();
        }
        for(int j = 0; j < n * 2 - 1; j++){
            strings[j] = "*";
            System.out.print(strings[j]);
        }
    }
}
