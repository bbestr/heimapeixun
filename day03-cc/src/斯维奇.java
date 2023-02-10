import java.util.Scanner;

public class 斯维奇 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sds = sc.next();

//        switch (sds){
//            case "a":
//                System.out.println("aaaa");
//                break;
//            case "b":
//                System.out.println("bbbbbb");
//                break;
//            default:
//                System.out.println("错误");
//                break;

        switch (sds) {

            case "1":
            case "2":
            case "3":
            case "4":
                System.out.println("1234");
                break;
            default:
                System.out.println("qita");
                break;
        }


    }
}

