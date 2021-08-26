public class Number {
    public static void main(String[] args) {
        //1 byte
        byte iniByte = 127;
        //2 byte
        short iniShort = 1000;
        //4 byte
        int iniInt = 1000000000;
        //8 byte
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        //float 4 bytes,size lebih kecil
        float iniFloat = 1.23F;
        //Double 8 bytes,size lebih besar
        double iniDouble = 1.66723467478243;

        //Literal number
        int decimalInt = 25;
        int hexInt = 0xffff;
        int binaryDecimal = 0b1010111100;

        //Underscore sejak java versi 7/8
        //agar tidak bingung baca angka
        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

        //konfersi tipe data number

        //widening casting(otomatis): byte->short->int->long->float->double
        //aturan dari kiri bisa ke kanan,tapi sebaliknya maka size nya lebih kecil sehingga tidak bisa dihandle,sehingga harus dikonfersi narrow short
        byte iniByte2 = 10;
        short iniShort2 = iniByte2;
        int iniInt2 = iniShort2;
        long iniLong3 = iniInt2;
        float iniFloat3 = iniLong3;

        //Narrowing casting(Manual) : double->float->long->int->char->short->byte
        int iniInt4 = 1000;
        //di bawah ini mengalami number overflow,karena lebih besar dari size byte
        byte iniByte4 = (byte) iniInt4;
    }
}
