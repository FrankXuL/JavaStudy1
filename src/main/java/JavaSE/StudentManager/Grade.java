package JavaSE.StudentManager;

/**
 * @title: Grade
 * @Author Xu
 * @Date: 13/11/2022 下午 8:04
 * @Version 1.0
 */
public class Grade {
    private String studentName;
    private String courseName;
    private double grade;

    public Grade(String studentName, String courseName, double grade) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "studentName='" + studentName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}