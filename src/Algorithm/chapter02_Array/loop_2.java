package Algorithm.chapter02_Array;

import java.util.Arrays;

public class loop_2 {
    public static void main(String[] args) {
        int [] students = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("변경전: "+ Arrays.toString(students));


        int [] students2 = new int[students.length];
        for (int i = 0; i<students2.length; i++){
            students2[(students2.length-1)-i] = students[i];
        }
        System.out.println("students2.length : "+students2.length);
        System.out.println("students2.length-1) : "+(students2.length-1));
        System.out.println("변경후: " + Arrays.toString(students2));

    }
}
