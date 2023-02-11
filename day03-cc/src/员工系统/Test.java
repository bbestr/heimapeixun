package 员工系统;

public class Test {
    public static void main(String[] args) {
        Dept d1 = new Dept("D001","人事部");
        Dept d2 = new Dept("D002","市场部");

        job j1 = new job("P001","经理");
        job j2 = new job("P002","助理");
        job j3 = new job("P003","职员");



        Employee em1 = new Employee("亚索","S001","男",13,d1,j1);
        Employee em2 = new Employee("瑞文","S002","女",13,d2,j2);
        Employee em3 = new Employee("盲僧","S003","男",13,d2,j3);
        Employee em4 = new Employee("凯瑟琳","S004","女",13,d1,j2);
        Employee em5 = new Employee("盖伦","S005","男",13,d2,j1);
        Employee em6 = new Employee("卡特琳娜","S006","女",13,d1,j3);



        System.out.println(em1.toString());
        System.out.println("=========================");
        System.out.println(em2.toString());
        System.out.println("=========================");
        System.out.println(em3.toString());
        System.out.println("=========================");
        System.out.println(em4.toString());
        System.out.println("=========================");
        System.out.println(em5.toString());
        System.out.println("=========================");
        System.out.println(em6.toString());
        d1.addEmployee(em1);
        d1.addEmployee(em4);
        d1.addEmployee(em6);
        d2.addEmployee(em2);
        d2.addEmployee(em3);
        d2.addEmployee(em5);

        System.out.println(d1.getDname()+"总人数为"+d1.getSum());
        System.out.println(d2.getDname()+"总人数为"+d2.getSum());

    }
}
