package 学生信息管理系统;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        int i = o1.getId().compareTo(o2.getId());
        return i;
    }
}
