public class MethodParameter {
    public static void main(String[] args) {
        //kita bisa megirim informasi di method yang kita buat
        //Untuk hal itu kita perlu menambahkan parameter atau argument di method yang sudah kita buat
        //parameter ditempatkan di kurung () di deklarasi method
        //Cara membuat parameter sama seperti membuat variabel
        //jika parameter lebih dari satu,bisa dipisahkan dengan tanda koma

        sayHello("Alwan", "Hafidzin");
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Hallo " +firstName + " " + lastName);
    }
}
