import java.util.ArrayList;

public class Classroom {
    private int grade;
    private ClassroomTeacher classroomTeacher;
    private int maxNumofStudents;
    private ArrayList<Student> students = new ArrayList<>();
    private int numberOfStudents;

    public Classroom(){
        this.maxNumofStudents = 8;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public  ClassroomTeacher getTeacher() {
        return this.classroomTeacher;
    }

    public void setTeacher(ClassroomTeacher classroomTeacher) {
        this.classroomTeacher = classroomTeacher;
    }

    public int getMaxNumofStudents() {
        return maxNumofStudents;
    }

    public void setMaxNumofStudents(int maxNumofStudents) {
        this.maxNumofStudents = maxNumofStudents;
    }

    public void AddStudents(Student student){
        if (numberOfStudents < maxNumofStudents)
        {
                this.students.add(student);
                numberOfStudents++;
        }
        else System.out.println("The class is full. We can not add more students!!!");
    }



}
