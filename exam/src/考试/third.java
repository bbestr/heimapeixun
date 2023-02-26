package 考试;

import java.util.ArrayList;

public class third {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User u1 = new User("亚索",22,"男");
        User u2 = new User("瑞文",23,"女");
        User u3 = new User("潘森",19,"男");
        User u4 = new User("拉克丝",16,"女");
        User u5 = new User("盲僧",26,"男");
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        ArrayList<User> ans = getUser(users);

        for (User tem :
             ans) {
            System.out.println(tem.toString());
        }



    }


    public static ArrayList<User> getUser(ArrayList<User> users){
        ArrayList<User> ans = new ArrayList<>();

        for(User tem : users){
            if (tem.getAge() >= 18 && tem.getSex().equals("男")){
                ans.add(tem);
            }
        }

        return  ans;
    }
}
