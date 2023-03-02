
import java.io.*;
import java.util.*;

public class Collections1 {
    public static void main(String[] args) {
        int count = 'z' - 'a' + 1;
        //System.out.println(count);
        //List<String> vocab = new ArrayList<>();
        List<String> vocab = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/com/company/data/vocab"))) {
            String s;
            do {
                s = br.readLine();
                if (s != null) vocab.add(s);
            }
            while (s != null);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(vocab.size());

        vocab.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        /*Первые 10 слов
        ListIterator<String> it = vocab.listIterator(0);
        int i = 0;
        while (it.hasNext() && i < 10) {
            System.out.println(it.next());
            i++;
        }
         */

        /*Последние 10 слов
        it = vocab.listIterator(vocab.size());
        i = 0;
        while (it.hasPrevious() && i < 10) {
            System.out.println(it.previous());
            i++;
        }
        */

        /*Сколько слов 1-буквенных, 2,3 и тд

        int max = 0;
        for (int i = 0; i < vocab.size(); i++)
            if (vocab.get(i).length() > max) {
                max = vocab.get(i).length();
            }
        System.out.println(max);
        int[] hist = new int[max];
        for (int i = 0; i < vocab.size(); i++)
            hist[vocab.get(i).length() - 1]++;
        for (int i = 0; i < max; i++)
            System.out.printf("Букв: %d, слов: %d%n", i + 1, hist[i]);

         */
/* палиндром
        for (String s1 : vocab) {
            StringBuilder sb = new StringBuilder(s1);
            String s2 = sb.reverse().toString();
            if (s2.equals(s1)) System.out.print(s1+" ");
        }
 */
        /*слова - анаграммы??
            Multimap<String, String> anagrams= ArrayListMultimap.create();
        for (String s1 : vocab){
            char[] arr= s1.toCharArray();
            Arrays.sort(arr);
            String s2= new String(arr);
            anagrams.put(s2,s1);
        }
      String key1="",key2="";
        Map.Entry<String,String> entry2=null;
        for( Map.Entry<String,String> entry1:anagrams.entries()){
            key1= entry1.getKey();
            if(key1.equals(key2)) System.out.println(entry2.getValue()+" - "+entry1.getValue());
            key2=key1;
            entry2=entry1;
        }
         */

        /*Найти слова с тремя одинаковыми буквами
        for (String s1 :vocab) {
            char[] arr = s1.toCharArray();
            Arrays.sort(arr);
            char c0 = ' '; int count0 = 1;
            for (char c:arr){
                if (c==c0) count0++;
                else count0 = 1;
                if (count0==3) {
                    System.out.println(s1);
                    break;
                }
                c0=c;
            }
        }
        */
        /*найти 3 буквы которые следует по алфавиту abc cde
        for (String s1 :vocab) {
            char[] arr = s1.toCharArray();

            char c0 = ' '; int count0 = 1;
            for (char c:arr){
                if (c-c0==1) count0++;
                else count0 = 1;
                if (count0==3) {
                    System.out.println(s1);
                    break;
                }
                c0=c;
            }
        }
         */

        /*Частота встречаемости букв в словах - HOMEWORK 1
        String s1;
        count = 0;
        char c = ' ';
        char[] alf = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < alf.length; i++) {
            c = alf[i];
            System.out.print(alf[i] + " ");
            for (int k = 0; k < vocab.size(); k++) {
                s1 = vocab.get(k);
                for (int j = 0; j < s1.length(); j++){
                    if (alf[i] == s1.charAt(j)) count++;
                    }
            }
            System.out.println(count);
            count = 0;
        }
         */
       /*Количество слов, начинающихся на определенную букву (от 'a' до 'z')
        String s1;
        count = 0;
        char c = ' ';
        char[] alf = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < alf.length; i++) {
            c = alf[i];
            System.out.print(alf[i] + " ");
            for (int k = 0; k < vocab.size(); k++) {
                s1 = vocab.get(k);
                for (int j = 0; j < 1; j++){
                    if (alf[i] == s1.charAt(0)) count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
        */

    }
}