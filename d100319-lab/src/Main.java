public class Main {

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.setName("John Smith");

        School school = new School();
        school.setName("Walter Damrosch");
        school.setPrincipal(principal);
        school.setLocation("Bronx");
        school.setType("High School");
        school.schoolInformation();
        Classroom classroom = new Classroom();
        ClassroomTeacher classroomTeacher = new ClassroomTeacher();
        classroomTeacher.setName("Mr. Hodges");
        classroom.setTeacher(classroomTeacher);
        classroom.setGrade(9);
        Student student = new Student();

        student.Register("Joseph",9, 2019);
        classroom.AddStudents(student);


    }
}
