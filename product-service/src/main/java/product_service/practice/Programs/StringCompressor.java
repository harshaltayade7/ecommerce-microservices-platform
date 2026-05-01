package product_service.practice.Programs;

public class StringCompressor {

    public static String compress(String str) {
        if(str == null || str.isEmpty()) return  str;
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for(int i=1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)) {
                count++;
            } else {
                sb.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }

        return  sb.toString();
    }

    public static void main() {
        System.out.println(compress("pppccaabcccccaaapp"));
    }
}