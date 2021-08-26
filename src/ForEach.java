public class ForEach {
    public static void main(String[] args) {
        //kadangkala kita biasa mengakses data array menggunakan perulangan
        //mengakses data array menggunakan perulangan itu bertele tele,kita harus membuat counter,lalu mengakses array menggunkan counter yang kita buat
        //beruntungnya ada foreach di java,yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis

        //Tanpa Foreach
        String[] array = {
             "Alwan", "Hafidzin", "Firdaus"
        };
        //kurang dari karena array.length= 3
        for(int i= 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        String[] array2 = {
                "Alwan", "Hafidzin", "Firdaus"
        };
        //semenjak java 5/6 ada foreach
        for (var value:array2) {
            System.out.println(value);
        }
    }
}
