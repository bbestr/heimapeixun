package 员工系统;

import java.util.Arrays;

public class Dept {
    private String did;

    private String dname;

    private Employee emp[] = new Employee[200];

    private int sum=0;

    public Dept() {

    }

    public Dept(String did, String dname) {
        this.did = did;
        this.dname = dname;

    }

    public String getDid() {
        return did;
    }

    public String getDname() {
        return dname;
    }

    public Employee[] getEmp() {
        return emp;
    }

    public int getSum() {

        return sum;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setEmp(Employee[] emp) {
        this.emp = emp;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "部门{" +
                "部门id='" + did + '\'' +
                ", 部门名称='" + dname + '\'' +
                ", 员工数组=" + Arrays.toString(emp) +
                ", 部门人数=" + sum +
                '}';
    }
    public void addEmployee(Employee em) {
        for (int i = 0; i < this.emp.length; i++) {
            if (this.emp[i] == null) {
                this.emp[i] = em;

            }
        }
        this.sum += 1;
    }
}
