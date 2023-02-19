public class 反转字符串 {
    public static void main(String[] args) {
        StringBuffer ret = new StringBuffer();
        String s = "adada abs";
        int n = s.length();
        int i = 0;
        while(i < n){
            int start = i;
            while(i < n && s.charAt(i)!= ' '){
                i++;
            }
            for (int j = i-1; j <= start; j++) {
                ret.append(s.charAt(i));
            }
            while(i < n && s.charAt(i) == ' '){
                ret.append(" ");
                i++;
            }
        }
    }
}
