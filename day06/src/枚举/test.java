package 枚举;


// 创建格式  无需分号结束
enum week{MODEAY,Tuesday,Tress,FAA,DADW}
public class test {
    public static void main(String[] args) {
        week ff = week.MODEAY;

        // 枚举 比较用 ==
        if(ff == week.MODEAY){
            System.out.println("hahahah");
        }
    }
}
