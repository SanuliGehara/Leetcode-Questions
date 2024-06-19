import java.util.ArrayList;
import java.util.List;

public class CharContainer {
    public static void main(String[] args) {
        List<Integer> array = findWordsContaining(new String[]{"Hello","Honey","Bella"}, 'H');
        System.out.println(array);
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l1 = new ArrayList<>();
        for (int i=0; i<words.length; i++) {
            if (words[i].contains(String.valueOf(x))){
                l1.add(i);
            }
        }
        return l1;
    }
}
