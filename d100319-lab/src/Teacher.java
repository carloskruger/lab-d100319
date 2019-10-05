public abstract class Teacher extends Principal {
    private boolean isLicensed;
    private int schoolGrade;

    public boolean isLicensed() {
        return isLicensed;
    }

    public void setLicensed(boolean licensed) {
        isLicensed = licensed;
    }

    public int getSchoolGrade() {
        return schoolGrade;
    }

    public void setSchoolGrade(int SchoolGrade) {
        this.schoolGrade = schoolGrade;
    }

    public abstract char evaluateStudent(Student student, char grade);

}
