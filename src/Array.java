public class Array {
    public static void main(String[] args) {
        //Array adalah kumpulan data dengan tipe data sama
        //jumlah Array tidak bisa dirubah pada saat pertama diinisialisasi
        //Array diawali dari indeks 0
        String[]  arrayString;
        arrayString = new String[3];
        arrayString[0] = "Alwan";
        arrayString[1] = "Hafidzin";
        arrayString[2] = "Firdaus";

        String[] array2 = new String[2];
        //ambil data Array
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        //ubah data
        arrayString[0] = "Tes";

        System.out.println(arrayString[0]);

        //Array Initializer

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8
        };
        String[] namaNama = {
                "Alwan", "Hafidzin", "Firdaus"
        };

        long[] arrayLong = {
                10L,20L,30L
        };

        //mengambil data array. array[index]
        //array[index]= value : mengubah data di array, kosong dengan null
        //array.length : mengetahui panjang array

        System.out.println(arrayLong.length);

        //di java tidak ada penghapusan data,kecuali di set kosong
        //yang hanya bisa dilakukan hanya isi data kosong
        arrayLong[0] = 0;
        namaNama[0] = null;

        //Array di dalam Array

        String[][] members = {
                {"Alwan", "Hafidzin", "Firdaus", "Tesla"},
                {"Tes", "2"},
                {"Oi"}
        };

        System.out.println(members[0][3]);
        System.out.println(members[1][0]);
    }
}
