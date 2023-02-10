import java.util.Scanner;

public class day02practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学生成绩:");

        int score = sc.nextInt();

        if(score>=0 && score <= 100){
            if(score >90){
                System.out.println("very good");
            } else if (score>80) {
                System.out.println("good");
            } else if (score>70) {
                System.out.println("great");
            }else{
                System.out.println("just so so");
            }

        }
        else{
            System.out.println("error！ 输入有误");
        }
    }
}
