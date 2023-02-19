public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("B001","<<无人生还>>",39.2);
        Book book1 = new Book("B002","<<三国演义>>",129);
        Book book2 = new Book("B003","<<富婆通讯录>>",999);

        System.out.println("第一本书");book.show();
        System.out.println("第二本书");book1.show();
        System.out.println("第三本书");book2.show();



    }
}
