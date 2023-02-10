package 封装综合案例;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class msTest {
    public static void main(String[] args) {
        major mj = new major("计算机",1,4);
        mj.showmajor();
        System.out.println("-------------------------");

        Student stu1 = new Student("best","s01",23,'男',mj);
        stu1.showstu();
        mj.addStudent(stu1);

        System.out.println("-------------------------");
        Student stu2 = new Student("瑞文","s02",13,'女',mj);
        stu1.showstu();
        mj.addStudent(stu1);
        System.out.println("-------------------------");
        Student stu3 = new Student("亚索","s03",45,'男',mj);
        stu1.showstu();
        mj.addStudent(stu1);
        System.out.println("-------------------------");

    }
}
