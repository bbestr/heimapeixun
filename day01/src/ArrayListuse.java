import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListuse {
    public static void main(String[] args) {
        ArrayList<Studentc> st = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("请输入第"+i+"个学生信息");

            addmethod(st);
        }
        System.out.println(st);
    }
    public static void addmethod(ArrayList<Studentc> st){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = sc.next();

        System.out.println("输入年龄");
        int age = sc.nextInt();

        Studentc stu = new Studentc(name,age);

        st.add(stu);

    }

}
