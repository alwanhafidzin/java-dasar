public class Komentar {
    public static void main(String[] args) {
        //Kadang dalam membuat program kita sering menempatkan komentar di kode program tersebut
        //Komentar adalah kode program yang dihiraukan saat proses kompilasi,sehingga di binary code java,tidak akan ada komnetar tersebut
        //Biasanya komentar digunakan untuk dokumntasi

        //multiline
        /**
         * *ajjad
         * dajkdjak
         * ahjdjhd
         * @param
         * @return
         */

        //komentar hanya ada di source,ketika di build di out tidak akan dicompile
        System.out.println(tesJumlah(tesJumlah(4)));
        //single line
    }
    static int tesJumlah(int angka){
        return angka;
    }
}
