public class IfStatement {
    public static void main(String[] args) {
        //if digunakan untuk percabangan
        //percabangan artinya mengeksekusi program ketika suatu kondisi terpenuhi
        //else ekspression dijalankan jika tidak ada percabanagan yang true

        var nilai = 75;
        var absen = 90;

        if(nilai >= 75 && absen >= 75){
            System.out.println("Anda Lulus");
        }else if(nilai > 70 && absen >= 70){
            System.out.println("Anda Lulus Bersarat");
        }{
            System.out.println("Anda Tidak Lulus");
        }
    }
}
