public class Yield {
    public static void main(String[] args) {
        //di java 14 ada kata kunci baru yaitu yield,dimana kita menggunakan yield untuk mengembalikan nilai pada switch statement
        //ini sangat mempermudahkan kita ketika butuh membuat data berdasarkan kondisi switch statement
//        var nilai = "A";
//        String ucapan;
//
//        //tanpa yield
//        switch (nilai) {
//            case "A" -> ucapan = ("bagus");
//            case "B" -> ucapan = ("Lumayan");
//            case "C" ,"D" -> ucapan =("Cukup");
//            default -> {
//                ucapan =("Nilai yang diinputkan salah");
//            }
//        }
//        System.out.println(ucapan);
//
//        //dengan yield
//        ucapan = switch (nilai) {
//            case "A" : yield ("bagus");
//            case "B" : yield ("Lumayan");
//            case "C" ,"D" : yield ("Cukup");
//            default : yield ("Nilai yang diinputkan salah");
//        };
//        System.out.println(ucapan);
    }
}
