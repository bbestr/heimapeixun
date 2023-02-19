package 学生信息管理系统;

import sort.NameCompator;

import java.util.*;

public class StudentMain {
    public static void menu(List<Student> studentslist){

        Scanner sc = new Scanner(System.in);
        int c;
        while(true){
            System.out.println("-----------欢迎来到学生信息管理系统-------------");
            System.out.println("--------------1,添加学生---------------------");
            System.out.println("--------------2,删除学生---------------------");
            System.out.println("--------------3,显示学生信息------------------");
            System.out.println("--------------4,修改学生信息------------------");
            System.out.println("--------------5,排序并查看学生信息--------------");
            System.out.println("--------------6,查找指定学生信息(名字-----------");
            System.out.println("--------------0,退出系统---------------------");
            System.out.print("-----------请输入你的选择:");
            try{
                c = sc.nextInt();
                switch (c){

                    case 1:
                        StudentMain.addStudent(studentslist);
                        break;
                    case 2:
                        StudentMain.deleteStudent(studentslist);
                        break;
                    case 3:
                        StudentMain.showStudent(studentslist);
                        break;
                    case 4:
                        StudentMain.updateStudent(studentslist);
                        break;
                    case 5:
                        StudentMain.sort(studentslist);
                        break;
                    case 6:
                        StudentMain.searchByName(studentslist);
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("输入有误重新输入!");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("输入不合法!!");
                break;
            }

        }
    }
    private static void addStudent(List<Student> studentList) {

        //存放现有学生id  添加时查重
        Iterator it = studentList.iterator();
        Scanner sc = new Scanner(System.in);

        String id = "";

        int flag = -1;

        lo:
        while(true){

            System.out.println("请输入学生学号:");
            id = sc.next();
            Student stu = new Student();


            while (it.hasNext()) {
                stu = (Student) it.next();
                if(id.equals(stu.getId())){
                    System.out.println("学号已经存在了  重新输入");
                    continue lo;
                }
            }
            break;
        }
        System.out.println("输入学生姓名:");
        String name = sc.next();

        System.out.println("输入学生性别:");
        String sex = sc.next();

        System.out.println("输入学生年龄:");
        int age = sc.nextInt();

        System.out.println("输入学生生日:");
        String birthday = sc.next();

        Student student = new Student(id,name,sex,age,birthday);
        studentList.add(student);
        System.out.println("添加成功!");

    }

    public static void main(String[] args) {
        List<Student> studentslist = new ArrayList<>();
        Student stu1 = new Student("heima001","亚索","男",18,"1999-5-24");
        Student stu2 = new Student("heima002","瑞文","女",23,"1997-6-13");
        Student stu3 = new Student("heima003","盲仔","男",13,"2003-7-27");

        studentslist.add(stu1);
        studentslist.add(stu2);
        studentslist.add(stu3);

        StudentMain.menu(studentslist);

    }

    public  static  void showStudent(List<Student> studentList){
        Iterator it = studentList.iterator();
        if(studentList.size() == 0){
            System.out.println("无学生信息!");
        }
        else{
            Student stu = new Student();
            System.out.println("学号     姓名   性别   年龄     出生年月");
            while(it.hasNext()){
                stu = (Student) it.next();

                System.out.println(stu.toString());
            }
        }
    }
    public static void deleteStudent(List<Student> studentList){

        Scanner sc1 = new Scanner(System.in);
        System.out.println("输入要删除的学生id:");

        String deleteid = sc1.next();

        int index = getIndex(studentList,deleteid);

        if (index == -1){
            System.out.println("不存在此id 删除失败");
        }else{
            studentList.remove(index);
            System.out.println("删除成功!!");
        }


    }
    public  static  int getIndex(List<Student> studentList,String deleteid){
        for (int i = 0; i < studentList.size(); i++) {

            if(deleteid.equals(studentList.get(i).getId())){
                return i;
            }
        }
        return -1;

    }
    public static void updateStudent(List<Student> studentList) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入修改信息的学生学号:");
        String updateid = sc.next();

        int index = getIndex(studentList,updateid);
        if (index == -1){
            System.out.println("查无此人!");
        }
        else{
            System.out.println("输入修改的学生姓名:");
            String name = sc.next();
            System.out.println("输入修改的性别:");
            String sex = sc.next();
            System.out.println("输入修改的年龄:");
            int age = sc.nextInt();
            System.out.println("输入修改的出生年月:");
            String birthday = sc.next();

            Student stu = new Student(updateid,name,sex,age,birthday);

            studentList.set(index,stu);
            System.out.println("修改成功!");
        }
    }

    public static void searchByName(List<Student> studentList){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入想查询的学生姓名:");
        String name = sc.next();

        Iterator it = studentList.iterator();
        Student student = new Student();

        while(it.hasNext()){
            student = (Student) it.next();
            if (student.getName().equals(name)){
                System.out.println("找到了!");
                System.out.println("学号     姓名   性别   年龄     出生年月");
                System.out.println(student.toString());
                return;
            }
        }
        System.out.println("没找到!");
    }

    public static void sort(List<Student> studentList){


        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要的排序(1,按名称 2,按年龄 3 按性别 4按学号):");
        int ans = sc.nextInt();
        switch (ans){

            case 1:
                Collections.sort(studentList,new NameComparator());
                break;
            case 2:
                Collections.sort(studentList,new AgeComparator());
                break;
            case 3:
                Collections.sort(studentList,new SexComparator());
                break;
            case 4:
                Collections.sort(studentList,new IdComparator());
                break;
            default:
                System.out.println("输入有误!");
                break;
        }


        System.out.println("学号     姓名   性别   年龄     出生年月");
        Student student;
        for (int i = 0; i < studentList.size(); i++) {
            student = studentList.get(i);
            System.out.println(student.toString());
        }
    }
    }
