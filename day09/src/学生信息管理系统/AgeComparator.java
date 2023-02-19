package 学生信息管理系统;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        int age = o1.getAge();
        int age1 = o2.getAge();
        return age - age1;
    }
}
