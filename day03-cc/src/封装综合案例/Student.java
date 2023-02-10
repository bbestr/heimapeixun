package 封装综合案例;

public class Student {
    private String name;

    private String xuehao;
    private int age;

    private char sex;

    public major getMj1() {
        return mj1;
    }

    public void setMj1(major mj1) {
        this.mj1 = mj1;
    }

    private major mj1;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", xuehao='" + xuehao + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public Student(){

    }
    public Student(String name,String xuehao,int age,char sex,major mj1){
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.xuehao = xuehao;
        this.mj1 = mj1;
    }
    public  void  showstu(){
        System.out.println("姓名:"+this.name);
        System.out.println("学号:"+this.xuehao);
        System.out.println("性别:"+this.sex);
        System.out.println("年龄:"+this.age);
        System.out.println("专业名称:"+mj1.getMname());
        System.out.println("专业年限:"+mj1.getNianxian());
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setMj(major mj) {
        this.mj1 = mj;
    }

    public String getName() {
        return name;
    }

    public String getXuehao() {
        return xuehao;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public major getMj() {
        return mj1;
    }
}
