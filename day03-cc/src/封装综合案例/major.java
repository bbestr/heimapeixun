package 封装综合案例;

public class major {
    private String mname;
    private int id;

    public void setMystu(Student[] mystu) {
        this.mystu = mystu;
    }

    public Student[] getMystu() {
        return mystu;
    }

    private int nianxian;

    private int sum = 0;
    private Student mystu[] = new Student[20];

    @Override
    public String toString() {
        return "major{" +
                "mname='" + mname + '\'' +
                ", id=" + id +
                ", nianxian=" + nianxian +
                '}';
    }

    private String[] ss = new String[4];

    public String getMname() {
        return mname;
    }

    public int getId() {
        return id;
    }

    public int getNianxian() {
        return nianxian;
    }

    public major() {

    }

    public major(String mname, int id, int nianxian) {
        this.id = id;
        this.mname = mname;
        this.nianxian = nianxian;
//        this.mystu = mystu;
    }

    public int getSum() {
        return sum;
    }

    public String[] getSs() {
        return ss;
    }

    /*
            构造代码块介绍专业信息
            */
    public void showmajor() {
        System.out.println("专业名字:" + this.mname);
        System.out.println("专业编号:" + this.id);
        System.out.println("专业年限:" + this.nianxian);
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNianxian(int nianxian) {
        this.nianxian = nianxian;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setSs(String[] ss) {
        this.ss = ss;
    }

    public void addStudent(Student stu) {
        System.out.println("新增学生信息");
//        Student s1 = new Student("瑞文","S02",14,'女');

        for (int i = 0; i < this.mystu.length; i++) {
            if (mystu[i] == null) {
                mystu[i] = stu;
                break;
            }
        }

        this.sum += 1;
        System.out.println("添加成功! 总人数为:" + this.sum);

    }
}
