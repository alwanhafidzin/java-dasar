public class OperasiMatematika {
    public static void main(String[] args) {
        // + - / * %
        int a = 100;
        int b = 10;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //augmented Assignment :operasi ke dirinya sendiri
        // a += 10,a-=10,a*=10, a/=10, a%=10

        int c = 100;
        System.out.println(c);
        c*=10;
        System.out.println(c);
        c%=10;
        System.out.println(c);

        //Unary Operator : operator yang ditempatkan di depan variabel
        // ++,--.- : negative. + : positive,! : boolean kebalikan

        c++;
        System.out.println(c);
        c--;
        System.out.println(c);
        System.out.println(!true);

    }
}
