import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
        //Expression adalah core component statement
        //Expression adalah konstruksi dari variabel,operator dan pemanggilan methoad yang mengevaluasi menjadi sebuah single value

        //Single value : Expression

        //Expression
        //dibawah ini Expression dan statement
        int value;
        value = 10;
        //di bawah ini statement; value = 100 adalah ekspression
        System.out.println(value = 100);

        //Statement : kalimat lengkap dalam bahasa
        //statement berupa kalimat lengkap diakhiri titik koma

        //assignment statement : statement yang mengubah value
        double aValue = 8933.23;
        // incremental statement
        aValue++;
        //methoad invocation statement :memanggil function atau methoad
        System.out.println("Hello World!");
        //Object creation statement : pembuatan object baru
        Date date = new Date();

        //Block adalah kumpulan statement
        //Block diawali dengan kurung kurawal buka kurung kurawal tutup {}

        //Block digunakan untuk menggroup code

        System.out.println("Hello World1!");
        //Block di dalam block
        {
            System.out.println("Hello World1!");
        }

    }
}
