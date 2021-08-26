public class BreakContinou {
    public static void main(String[] args) {
        //break digunakan untuk menghentikan perulangan
        //continou digunakan menghentikan perulangan saat ini,lalu melanjutkan ke perulangan selanjutnya


        //kombinasi break continou yang benar
        for(int i = 0; i <10; i++){
            if (i == 8){
                break;
            }
            if (i % 2 == 0){
                continue;
            }
            System.out.println("Angka Ke-" + i);
        }

        //Kombinasi salah
        for(int i = 0; i <10; i++){
            if (i == 8){
                //Break menghentikan semua perulangan
                break;
            }else if (i % 2 == 0) {
                //continou hentikan perulanagan,lanjutkan ke perulangan selanjutnya
                continue;
            }
            System.out.println("Angka Ke-" + i);
        }
    }
}
