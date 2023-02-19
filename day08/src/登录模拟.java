import java.util.Scanner;

public class 登录模拟 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("输入用户名和密码:");
        String name = sc.next();
        String password = sc.next();

        if (name == "admin" && password.equals("123456")){
            System.out.println("login success");
        }else{
            System.out.println("login failed");

        }
    }
}
