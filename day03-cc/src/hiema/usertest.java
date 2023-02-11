package hiema;

public class usertest {
    public String confirm(user user1){
        String ret = " ";
        if (user1.getUsername().equals("best") && user1.getPassword().equals("123456")){

            ret = user1.getUsername()+"用户信息一致!";
        }
        else {
            ret =  user1.getUsername()+"用户信息不一致!! 错误";
        }

        return ret;

    }
    public static void main(String[] args) {
        user user1 = new user("best","123456");
        user user2 = new user("ruiwen","123321");

        usertest te = new usertest();
        System.out.println(te.confirm(user1));
        System.out.println(te.confirm(user2));
    }
}
