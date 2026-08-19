package OOP.Generics.Comparing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(13, 89.56f);
        Student rahul = new Student(5, 97.52f);
        Student arpit = new Student(76, 99.52f);
        Student karan = new Student(57, 93.52f);
        Student sachin = new Student(34, 90.52f);

        Student[] list = {kunal, rahul, arpit, karan, sachin};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        
        if(kunal.compareTo(rahul) < 0){
            System.out.println(kunal.compareTo(rahul));
            System.out.println("Rahul has more marks");
        }
    }
}
