import java.util.Arrays;

public class Test {
    /*Revise twoSum question andReverse String question*/

    public String reverseString(char[] word) {
        //in place -> no extra memory
        System.out.println(Arrays.toString(word));

        for (int i = 0; i<word.length/2; i++) {
           char letter = word[word.length - 1 - i];
           word[word.length - 1 - i] = word[i];
           word[i] = letter;
        }
        return Arrays.toString(word);
    }

//    public int[] twoSum() {
//
//    }

    public static void main(String[] args) {
        Test reverse = new Test();
        String reversWord = reverse.reverseString(new char[] {'S','A','N','U','L','I'});
        System.out.println(reversWord);

        System.out.println();
        Test sum = new Test();
    }
}
