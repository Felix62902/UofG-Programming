public class Student extends People {
    double gpa;

    public Student(String name){
        this.name = name;
        this.gpa = 0.0;
    }

    @Override
    public String toString(){
        return "this student's GPA is "+ this.gpa;
    }
}
