public class TernaryOperator {
    public static void main(String[] args) {
        //Ternary operator adalah operator sederhana dari if statement
        //Ternary operator terdiri dari kondisi yang dievaluasi,jika menghasilkan true maka nilai pertama diambil,jika false maka nilai kedua diambil

        //dengan if else
        var nilai = 75;
        String ucapan;

        if (nilai > 75) {
            ucapan = "Selamat Anda Lulus";
        }else {
            ucapan = "Silahkan Coba lagi";
        }
        System.out.println(ucapan);

        //Dengan Ternary Operator
        String ucapan2 = nilai > 75 ? "Selamat Anda Lulus" : nilai > 70 ? "Nilai Anda lumayan" : "Silahkan Coba Lagi";

        System.out.println(ucapan2);
    }
}
