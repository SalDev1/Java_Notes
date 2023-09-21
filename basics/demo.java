package basics;

public class demo {
    public static void main(String[] args) {
        int num = 8; // 4 Bytes --> 32 bits.
        System.out.print(num);

        System.out.print("\n");
        double f_num = 5.5;
        System.out.print(f_num);

        System.out.print("\n");
        short s1 = 45;
        System.out.print(s1);

        System.out.print("\n");
        byte b = 45;
        System.out.print(b);

        System.out.print("\n");
        long ll = 123;
        System.out.print(ll);

        System.out.print("\n");
        char ch = 'a';
        ch = 'b';
        System.out.print(ch);

        double d1 = 5; // implict conversion
        int k = (int) 5.5; // type casting a certain value to specific type , explicit type cast version.
        System.out.println(k);
    }
}
