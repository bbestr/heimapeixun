public class ConstantTest {
    public static void main(String[] args) {
        String name = "best";
        String name1 = "best";
        String name2 = new String("best");
        int age = 23;
        char sex = '男';
        boolean hunyin = false;

        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(hunyin);
    }
}
