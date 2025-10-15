public class assignmentOperator {
    public static void main(String[] args) {
        // short hand syntax
        int a = 28;
        a += 10;
        System.out.println(a);
        // normal
        int b = 23;
        b = b + 20;
        System.out.println(b);

        // typecasting
        byte c = 34;
        byte d = 31;
       byte e = (byte) (c + d);
        // or by shorthand
         c += d;
        System.out.println(c);

        // fourth
        int f = 3524;
        char char1 = 'A';
        int  g = f + char1;
        System.out.println(g);

        // fifth
        byte num = 45;
        num += 28;
        System.out.println(num);
    }

}
