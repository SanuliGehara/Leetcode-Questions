public class Main {
    public static void reverseString(char[] s) {
        /**
         *  h e l l o  -> o l l e h
         *  how many times should we iterate?  *half of the array length
         *  If we put the same length ? Again Same as the original (hello)
         *  in Place -> NO extra memory
         */

        for (int i =0; i<s.length/2; i++) {
            char character = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = character;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        reverseString(new char[]{'H', 'E', 'L', 'L','O'});
    }
}