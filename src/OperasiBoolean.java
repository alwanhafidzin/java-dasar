public class OperasiBoolean {
    public static void main(String[] args) {
        //operasi untuk tipe data bolean
        // && : dan, || : atau , ! : kebalikan

        //&&,akan true kalau dua2 nya true
        // true + true : true
        //true + false : false
        //false + true : false
        //false + false : false

        //||,satu true, hasil true
        // true + true : true
        //true + false : true
        //false + true : true
        //false + false : false

        //!
        // true = false
        // false = true

        var absen = 70;
        var nilaiAkhir = 80;
        boolean lulusAbsen = absen >= 70;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
