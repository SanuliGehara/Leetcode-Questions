import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        Stack <Character>stack1 = new Stack<Character>();
        Stack <Character>stack2 = new Stack<Character>();

        if (!(s.length()%2 == 0)) {  //odd length -> false
            System.out.println("num of brackets equal..true");
            //return false;
        }
        else {
            //insert brackets in to two stacks
            for (char letter : s.toCharArray()) {
                if (letter == '(' || letter == '[' || letter == '{') {
                    stack1.push(letter);
                    System.out.println("st1 "+letter);
                } else {
                    stack2.push(letter);
                    System.out.println("st2 "+letter);
                }
            }

            if (stack1.size()==stack2.size()) {
                for (int i = 0; i < stack1.size(); i++) {
//                    char top = (char) stack2.peek();
//                    boolean st1 = stack1.empty();
//                    boolean st2 = stack2.empty();

                    System.out.println(stack1.peek().toString() + stack2.peek().toString());
                    if (stack1.peek() == stack2.peek()) { //waradi
                        stack1.pop();
                        stack2.pop();
                        System.out.println("Poped 2 elements cause that was a pair");
                    } else{
                        System.out.println("peek not equal...false");
                        //return false;
                        break;
                    }
                }
                System.out.println("ALl rounds done..true");  //rounds okkoma hriyata giyoth
                //return true;
            } else {
                System.out.println("num of brackets !...false");
                //return false;
            }
        }

    }
}
