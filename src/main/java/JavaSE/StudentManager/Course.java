package JavaSE.StudentManager;

/**
 * @title: Course
 * @Author Xu
 * @Date: 13/11/2022 下午 8:03
 * @Version 1.0
 */
public class Course {
    private String id;
    private String name;
    private double credit;

    public Course(String id, String name, double credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", credit='" + credit + '\'' +
                '}';
    }
}