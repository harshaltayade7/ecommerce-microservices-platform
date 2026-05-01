package product_service.practice.Programs;


public class Fibonnacci {
    public void displayfibonnacci(Integer max) {
        int a = 0;
        int b = 1;
        int c = 0;

        while (c <= max) {
            System.out.println(c);
            c = a+b;
            a=b;
            b=c;
        }
    }

}
