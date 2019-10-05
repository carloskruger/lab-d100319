public class ClassroomTeacher extends Teacher {

    @Override
    public char evaluateStudent(Student student, char grade) {
        student.setGrade(grade);
        return grade;
    }


}
