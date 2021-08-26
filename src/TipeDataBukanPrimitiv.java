public class TipeDataBukanPrimitiv {
    //tipe data primitif adalah tipe bawaan,memiliki default value
    //String termasuk tipe data object,sehingga saat awal di inisialisasi adalah null
    //di java semua data primitif memiliki repsrentasi dari tipe data bukan primitifnya

    //byte : Byte
    //short : Short
    //int : Integer
    //long : Long
    //float : Float
    //double : Double

    //char : Character
    //boolean : Boolean

    //default value tipe data bukan primitif null
    public static void main(String[] args) {
        Byte iniByte = null;
        Integer iniInteger = 100;
        System.out.println(iniInteger);

        //Konfersi primitif ke Bukan Primitif

        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        System.out.println(iniInteger2);

        //konfersi ke primitif beda tipe data,tipe data primitif memeiliki methoad atau function
        short shortAge = iniInteger2.shortValue();
        byte byteAA = iniInteger2.byteValue();
    }
}
