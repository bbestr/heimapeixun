public class 封7过 {
    public static void main(String[] args) {
        for (int i = 1; i <100 ; i++) {

            if(i % 7 == 0 || i % 10 == 7 || i/10 == 7 ){
                System.out.println(i+"过");
            }
        }
    }
}
