package nested;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Nested1 {
    public static void main(String[] args) {
        HashSet<ArrayList<String>> bigBox= new HashSet<>();
        for(int i=0;i<5;i++){
            ArrayList<String> smallBox=new ArrayList<>();
            for (int j=0;j<5;j++) smallBox.add(generateString(3,7));
            bigBox.add(smallBox);


        }

    }
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