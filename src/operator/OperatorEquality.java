package operator;

public class OperatorEquality {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;

        System.out.println(i==5);  // bujur
        System.out.println(i==6);  // salah
        System.out.println(i==j);  // salah
        System.out.println(i>j);   // salah
        System.out.println(i<j);   // bujur
        System.out.println(5>6);   // salah
        System.out.println(5<6);   // bujur
        System.out.println(i!=5);  // salah
        System.out.println(j!=5);  // bujur
    }
}