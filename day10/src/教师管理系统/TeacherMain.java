package 教师管理系统;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TeacherMain {

    static ArrayList<Teacher> teacherArrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Teacher stu1 = new Teacher("heima001", "亚索", 18, "1999-5-24");
        Teacher stu2 = new Teacher("heima002", "瑞文", 23, "1997-6-13");
        Teacher stu3 = new Teacher("heima003", "盲仔", 13, "2003-7-27");

        teacherArrayList.add(stu1);
        teacherArrayList.add(stu2);
        teacherArrayList.add(stu3);

        TeacherMain.menu();

    }

    private static void menu() {
        TeacherMain studentMain = new TeacherMain();
        int c;
        while (true) {
            System.out.println("-----------欢迎来到教师信息管理系统-------------");
            System.out.println("--------------1,添加教师---------------------");
            System.out.println("--------------2,删除教师---------------------");
            System.out.println("--------------3,显示教师信息------------------");
            System.out.println("--------------4,修改教师信息------------------");
            System.out.println("--------------5,查找指定教师信息-----------");
            System.out.println("--------------0,退出系统---------------------");
            System.out.print("-----------请输入你的选择:");
            try {
                c = sc.nextInt();
                switch (c) {

                    case 1:
                        studentMain.addTeacher();
                        break;
                    case 2:
                        studentMain.deleteTeacher();
                        break;
                    case 3:
                        studentMain.showTeacher();
                        break;
                    case 4:
                        studentMain.updateTeacher();
                        break;
                    case 5:
                        studentMain.searchByid();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("输入有误重新输入!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("输入不合法!!");
                break;
            }


        }
    }

    private void searchByid() {
        System.out.println("输入查询的教师id:");

        String sid = sc.next();

        int index = getIndex(sid);

        if (index == -1){
            System.out.println("查无此人!");
            return;

        }
        System.out.println("查询陈功!");
        System.out.println("教师id       教师姓名        教师年龄        教师生日");
        System.out.println(teacherArrayList.get(index).toString());

    }

    private void updateTeacher() {

        String uid;

        System.out.println("请输入要修改的教师id:");

        uid = sc.next();

        int index = getIndex(uid);
        if (index == -1){
            System.out.println("无此id的教师  修改失败!");
            return;

        }
        System.out.println("输入新的教师姓名:");
        String name = sc.next();
        System.out.println("输入新的教师年龄:");
        int age = sc.nextInt();
        System.out.println("输入新的教师生日:");
        String birth = sc.next();

        Teacher tem = new Teacher(uid,name,age,birth);

        teacherArrayList.set(index,tem);
        System.out.println("修改成功!");

    }

    private void showTeacher() {

        System.out.println("教师id        教师姓名       教师年龄        教师生日");
        for (Teacher tem:teacherArrayList
             ) {
            System.out.println(tem.toString());
        }
    }

    private void deleteTeacher() {

        String sid;

        System.out.println("请输入你要删除的教师id");
        sid = sc.next();
        int index = getIndex(sid);
        if (index == -1){
            System.out.println("不存在此id的教师 !  删除失败");
            return;
        }
        teacherArrayList.remove(index);
        System.out.println("删除成功!");


    }

    private int getIndex(String sid){
        int index = -1;

        for (int i = 0; i < teacherArrayList.size(); i++) {
            if (sid.equals(teacherArrayList.get(i).getSid())){
                index = i;
            }
        }

        return index;

    }
    private void addTeacher() {
        String id;
        lo:
        while(true){
            System.out.println("输入添加教师的id");

            id = sc.next();

            for (Teacher temp: teacherArrayList) {
                if (id.equals(temp.getSid())){
                    System.out.println("教师id 已经存在  请重新输入!");
                    continue lo;
                }
            }
            break;
        }
        System.out.println("请输入教师姓名:");
        String sname = sc.next();

        System.out.println("请输入教师年龄:");
        int age = sc.nextInt();

        System.out.println("请输入教师生日:");
        String birth = sc.next();

        Teacher tec = new Teacher(id,sname,age,birth);

        teacherArrayList.add(tec);
        System.out.println("添加成功!");
    }


}

