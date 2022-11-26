package JavaSE.StudentManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @title: test
 * @Author Xu
 * @Date: 13/11/2022 下午 8:06
 * @Version 1.0
 */
public class test {
    public static double SumGrade(List<Grade> gradeList, String studentName) {
        double sumGrade = 0;
        for (Grade e : gradeList) {
            if (e.getStudentName() == studentName) {
                sumGrade += e.getGrade();
            }
        }
        return sumGrade;
    }

    public static double AvgGrade(List<Grade> gradeList, String studentName) {
        double sumGrade = 0;
        int i = 0;
        for (Grade e : gradeList) {
            if (e.getStudentName() == studentName) {
                sumGrade += e.getGrade();
                i++;
            }
        }
        return sumGrade / i;
    }

    public static double SumCredit(List<Course> courseList, List<Grade> gradeList, String studentName) {
        double sumCredit = 0;
        for(Grade e : gradeList){
            if(e.getStudentName().equals(studentName)){
                for(Course course : courseList){
                    if(course.getName().equals(e.getCourseName())){
                        sumCredit += course.getCredit();
                    }
                }
            }
        }
        return sumCredit;
    }
    public static double AvgClassGrade(List<Student> studentList,List<Grade> gradeList,String className){
        double avgClassGrade = 0;
        int i = 0;
        for(Student student : studentList){
            if(student.getClassName().equals(className)){
                for(Grade grade : gradeList){
                    if(student.getName().equals(grade.getStudentName())){
                        avgClassGrade +=grade.getGrade();
                        i++;
                    }
                }
            }
        }
        return avgClassGrade/i;
    }
    public static double AvgCourseGrade(List<Grade> gradeList,String courseName){
        double avgCourseGrade = 0;
        int i = 0;
        for(Grade grade : gradeList){
            if(grade.getCourseName().equals(courseName)){
                avgCourseGrade += grade.getGrade();
            }
        }
        return avgCourseGrade;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("111","1","男","1班"));
        studentList.add(new Student("222","2","男","2班"));
        studentList.add(new Student("333","3","男","2班"));
        studentList.add(new Student("444","4","男","3班"));
        studentList.add(new Student("555","5","男","3班"));
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course("1","java",3));
        courseList.add(new Course("2","c",4));
        courseList.add(new Course("3","c++",5));
        List<Grade> gradeList = new ArrayList<>();
        gradeList.add(new Grade("111","java",89));
        gradeList.add(new Grade("222","java",90));
        gradeList.add(new Grade("333","java",91));
        gradeList.add(new Grade("444","java",92));
        gradeList.add(new Grade("555","java",93));
        gradeList.add(new Grade("111","c",90));
        gradeList.add(new Grade("222","c",91));
        gradeList.add(new Grade("333","c",92));
        gradeList.add(new Grade("444","c",93));
        gradeList.add(new Grade("555","c",94));
        gradeList.add(new Grade("111","c++",91));
        gradeList.add(new Grade("222","c++",92));
        gradeList.add(new Grade("333","c++",93));
        gradeList.add(new Grade("444","c++",94));
        gradeList.add(new Grade("555","c++",95));
        gradeList.sort((Comparator<Grade>) (o1, o2) -> {
            double num = AvgGrade(gradeList,o2.getStudentName())  - AvgGrade(gradeList,o1.getStudentName());
            if (num > 0) {
                return 1;
            } else if (num < 0) {
                return -1;
            }
            return 0;
        });
        for(Grade grade : gradeList){
            System.out.println(grade);
        }
        System.out.println("111学生的总成绩为:"+SumGrade(gradeList,"111"));
        System.out.println("111学生的平均成绩为:"+AvgGrade(gradeList,"222"));
        System.out.println("111学生的总学分为:"+SumCredit(courseList,gradeList,"111"));
        System.out.println("2班的平均成绩为:" + AvgClassGrade(studentList,gradeList,"2班"));
        System.out.println("java的平均成绩为:"+AvgCourseGrade(gradeList,"java"));
    }
}