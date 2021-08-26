public class ForLoop {
    public static void main(String[] args) {
        //For adalah kata kunci untuk perulangan
        //Block kode di dalam for akan terus diulangi selama kondisi for terpenuhi

        //for(init stattement; kondisi; post statement){
        // block perulangan
        //}

        //init statemengt akan dieksekusi sekali di awal sebelum perulangan
        //Kondisi akan dilakukan pengecekan dalam setiap perulangan,jika true perulangan akan dilakukan,jika false perulangan akan berhenti
        //Post statement akan dieksekusi setiap kali diakhir perulangan
        //init statement,Kondisi dan Post Statement tidak wajib diisi,jika kondisi tidak diisi,berarti kondisi selalu bernilai true

        int i;
        for (i=0; i< 5; i++ ){
            System.out.println("Hallo World!");
        }

        for (i=0; i<10; i++){
            if(i % 2 ==0 && i > 2){
               System.out.print(i + ",");
            }
        }

        //Perulanhgan tidak berhenti,Sehingga Deadlock(stack di kode di dalamnya)
//        for(;;){
//            System.out.println("Tidak Bisa Berhenti");
//        }

        var citer = 1;
        for (; citer <=10;){
            System.out.println("Counter" + citer);
            citer++;
        }

        //Perulangan dengan init statement
        for (var counter = 1; counter <= 10;){
            System.out.println("Counter" + counter);
            counter++;
        }

        //Perulangan dengan post statement
        for (var counter2 = 1; counter2 <= 10;  counter2++){
            System.out.println("Counter" + counter2);
        }
    }
}
