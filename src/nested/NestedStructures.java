package nested;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class NestedStructures {
    public static void main(String[] args) {
        //ArrayList of LinkedList
        // System.out.println(generateString(3,6));
        //Упакрва
        ArrayList<LinkedList<String>> bigBox=new ArrayList<>();
        for(int i=0;i<5;i++){
            LinkedList<String> smallBox=new LinkedList<>();
            for(int j=0;j<5;j++) smallBox.add(generateString(3,6));
            bigBox.add(smallBox);
        }
        //изменение
        bigBox.get(2).set(3,"element");
        LinkedList<String> box=new LinkedList<>();
        for(int i=0;i<5;i++)
            box.add("s");
        bigBox.set(2,box);

//распаковка
        for(LinkedList<String> smallBox: bigBox){
            for (String s: smallBox)
                System.out.print(s+" ");
            System.out.println();
        }



    }
    //Сгенерировать случайную строку
    public static String generateString(int minCount, int maxCount){
        Random random = new Random();
        int count = random.nextInt(maxCount-minCount)+minCount;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<count; i++){
            char c = (char)(random.nextInt((int)'z'-(int)'a')+'a');
            sb.append(c);
        }
        int x = random.nextInt(10);
        sb.append(x);

        return sb.toString();
    }

}
//regular virazhenie