import java.util.ArrayList;

public class ArrayList_practice {
    public static void main(String[] args) {
        ArrayList arr1= new ArrayList();  //contains multi type values
        arr1.add(10);
        arr1.add("Hello");
        arr1.add(100);
        arr1.add(true);
        System.out.println(arr1);

        arr1.set(1,"Hello Sanu"); //replace the value in index 1
        System.out.println(arr1);

        /*ArrayList only containing int collections
        * Initialize Size to 5 -> but can add more than 5 when needed */
        ArrayList<Integer> arr2 = new ArrayList<>(5);
        arr2.add(100);
        arr2.add(90);
        arr2.add(50);

        System.out.println(arr2);
        System.out.println("After adding two more elements into specific indeces");

        arr2.add(2,60);  //add 60 to index 2 as a new element {100,90,60,50}
        arr2.addLast(10);
        System.out.println(arr2);

        //6th element
        arr2.add(800);
        System.out.println(arr2);
    }
}
