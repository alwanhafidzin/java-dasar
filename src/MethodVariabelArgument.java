public class MethodVariabelArgument {
    public static void main(String[] args) {
        //Kadang kita butuh mengirim data ke method sejumlah data yang pasti
        //Biasanya,agar bisa seperti ini,kita akan menggunakan Array sebagai parameter di method tersebut
        //Namun di java,kita bisa menggunakan variabel argument,untuk mengirim data yang berisi jumlah tak tentu,bisa nol atau lebih
        //Parameter dengan tipe variabel argument,hanya bisa ditempatkan di posisi akhir parameter

        //jika menggunakan variabel argument,parameter akan ditetepkan sebagai Array

        //Tanpa variabel argument dengan array
        int[] values = {80, 50, 50, 50, 80};
        sayCongrats("Alwan", values);

        //dengan variabel argument kita bisa menggunakan array sebagai values atau menyebutkan secara langsung di varibel
        sayCongrats2("Alwan", 80,70,60,50,40);
    }
    static void sayCongrats(String name, int [] values){
        var total = 0;
        for (var value: values) {
            total += value;
        }
        var finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else{
            System.out.println("Maaf " + name + ", Anda Belum Lulus");
        }
    }
    //diganti dengan titik2 tak terbatas
    static void sayCongrats2(String name, int... values){
        var total = 0;
        for (var value: values) {
            total += value;
        }
        var finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        }else{
            System.out.println("Maaf " + name + ", Anda Belum Lulus");
        }
    }
}
