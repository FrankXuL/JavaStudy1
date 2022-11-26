package JavaSE.StudentManager;

/**
 * @title: Student
 * @Author Xu
 * @Date: 13/11/2022 下午 8:02
 * @Version 1.0
 */
public class Student {
    private String name;
    private String id;
    private String sex;
    private String className;

    public Student(String name, String id, String sex, String className) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", sex='" + sex + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}