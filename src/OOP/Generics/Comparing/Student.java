package OOP.Generics.Comparing;

public class Student implements Comparable<Student> {
    int rno;
    float marks;

    public Student(int rno, float marks){
        this.rno = rno;
        this.marks = marks;
    }

    

    // @Override
    // public String toString() {
    //     return "Student [rno=" + rno + ", marks=" + marks + "]";
    // }



    @Override
    public String toString() {
        return marks +""; //"Student{" + "rno=" + rno + ", marks=" + marks + '}';
    }



    @Override
    public int compareTo(Student o) {

        int diff = (int)(this.marks - o.marks);
        
        return diff;
    }
}
