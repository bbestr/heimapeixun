public class function重载 {
    public static void main(String[] args) {

        int a= 1;
        float b = 3.3f;
        double c = 25.3;
//
//        prt(a);
//        prt(b);
//        prt(c);

        String ss = "";

        ss+=1;
        ss += "anv";

        System.out.println(ss);
    }
    public static void prt(int a){
        System.out.println(a);

    }
    public static void prt(float a){
        System.out.println(a);
    }
    public static void prt(double a){
        System.out.println(a);
    }
}
