public class studentTest {
    public static void main(String[] args) {
        Studentc st = new Studentc();

        st.setAge(15);
        st.setName("baga");

        System.out.println(st.getAge()+"---"+st.getName());


        Studentc st1 = new Studentc("best",56);

        System.out.println(st1.getAge()+"---"+st1.getName());
    }
}
