package 员工系统;

public class Employee {
    private String name;

    private String id;

    private String sex;

    private int age;

    private Dept dept;
    private job jb;

    public Employee() {

    }

    public Employee(String name, String id, String sex, int age, Dept dept, job jb) {
        this.name = name;
        this.id = id;
        this.sex = sex;
        this.age = age;
        this.setDept(dept);
        this.setJb(jb);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Dept getDept() {
        return dept;
    }

    public job getJb() {
        return jb;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept(Dept dept) {
        if (this.dept == null) {
            this.dept = new Dept();
            this.dept = dept;
        } else {
            this.dept = dept;
        }

    }

    public void setJb(job jb) {
        if (this.jb == null) {
            this.jb = new job();
            this.jb = jb;
        } else {
            this.jb = jb;
        }
    }

    @Override
    public String toString() {
        return "员工:" +
                "姓名:" + name  +
                ", 员工号:" + id +
                ", 性别:" + sex +
                ", 年龄:" + age +
                ","+ dept.getDname() +""+ jb.getJname() +
                '.';
    }
}
