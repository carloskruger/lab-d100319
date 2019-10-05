public class Student implements Registration {
    String name;
    int schoolGrade;
    int year;
    String teacherName;
    boolean isRegistered;
    char grade;



    Student(){

    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchoolGrade() {
        return schoolGrade;
    }

    public void setSchoolGrade(int schoolGrade) {
        this.schoolGrade = schoolGrade;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public void Register(String name, int schoolGrade, int year) {
        this.name = name;
        this.schoolGrade = schoolGrade;
        this.year = year;
        this.isRegistered = true;

    }
}
