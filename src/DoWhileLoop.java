public class DoWhileLoop {
    public static void main(String[] args) {
        //do while loop mirip dengan while
        //do while loop pengecekan kondisi di akhir
        //while loop pengecekan kondisi di awal

        var counter = 100;
        //jika salah akan diulang sekali
        //hasil jika while(counter <= 10)perulangan 100
        do{
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter <= 120);
    }
}
