public class SwitchStatement {
    public static void main(String[] args) {
        //switch adalah statement percabangan lebih sederhana dari if
        //kondisi di switch statement hanya ==

        var nilai = "A";

        switch (nilai){
            case "A" :
                System.out.println("Bagus");
                break;
            case "B" :
                System.out.println("Baik");
                break;
            default:
                System.out.println("Nilai Tidak dikenali");
        }
    }
}
