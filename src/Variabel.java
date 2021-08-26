public class Variabel {
    public static void main(String[] args) {
        //variabel adalah tempat menyimpan data
        //java itu static type,sehingga sebuah variabel hanya bisa digunakan untuk menyimpan tipe data yang sama
        //Pembuatan variabel di java dengan tipe data dan deklarasi variabel
        //java tidak boleh ada whitespace
        //boleh menggunakan angka di variabel asalkan jangan seluruhnya angka

        //Tidak langsung,akan diisi default value,mis angka 0,String null
        String name;
        name = "Alwan Hafidzin Firdaus";

        //inisialisasi langsung
        int age = 21;

        String adress = "Mojokerto";
        //mengganti value,yang terakhir di compile yang terakhir
        name = "Alwan 2";

        System.out.println(name);
        System.out.println(age);
        System.out.println(adress);
    }
}
