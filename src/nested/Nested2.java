package nested;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Nested2 {
    public static void main(String[] args) {
        ArrayList<Stack<String>> bigBox= new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<3;i++){
            Stack<String> smallBox=new Stack<>();
            for(int j=0;j<5;j++) smallBox.add(scanner.nextLine());
            bigBox.add(smallBox);
        }
        for(Stack<String> smallBox:bigBox) {
            for (String s : smallBox)
                System.out.print(s+" ");
            System.out.println();
        }
        bigBox.get(1).set(2,"add");
        Stack<String> box=new Stack<>();
        for(int i=0;i<3;i++)
            box.add("add");
        bigBox.add(2,box);

        for(Stack<String> smallBox:bigBox) {
            for (String s : smallBox)
                System.out.print(s+" ");
            System.out.println();
        }
    }

}