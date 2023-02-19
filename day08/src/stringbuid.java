public class stringbuid {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("yasruo").append("ruiwen").append("garilun");


        String[] rs = sb.toString().split("r");
        System.out.println(sb.reverse());

        for (int i = 0; i < rs.length; i++) {
            System.out.println(rs[i]);
        }
    }
}
