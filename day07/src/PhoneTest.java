public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("小米","白色",3999);
        Phone phone2 = new Phone("华为","黑色",6999);

        phone1.call("亚索");
        phone1.sendMessage();
        phone2.call("瑞文");
        phone2.sendMessage();



    }
}
