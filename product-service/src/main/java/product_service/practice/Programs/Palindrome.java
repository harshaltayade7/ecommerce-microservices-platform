package product_service.practice.Programs;

public class Palindrome {
    String inputStr;
    public Palindrome(String str) {
        this.inputStr = str;
    }

    public String isPalindrome() {
        String reversed = "";
        for(int i = inputStr.length()-1; i >= 0; i--) {
            reversed +=(String.valueOf(inputStr.charAt(i)));
        }
        if(inputStr.equals(reversed)) {
           return "given string is palindrome";
        }
        return  "not palindrome";
    }

}

