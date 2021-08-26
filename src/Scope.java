public class Scope {
    public static void main(String[] args) {
        //di java sebuah variabel hanya bisa diakses di dalam area dimana mereka dibuat
        //Hal ini disebut scope
        //Contoh,jika sebuah variabel dibuat di methoad,maka hanya bisa diakses di methoad tersebut,atau jika dibuat didalam block,maka hanya bisa diakses di dalam block tersebut


    }
    //hello hanya bisa dikases di method ini
    static void sayHello(String name) {
        String hello = "Hello" + name;
        if (!name.isBlank()) {
            //scope hanya disini,sehingga hanya bisa dikases di dalam block ini,tidak bisa dikases di luar block
            String hi = "Hi";
            System.out.println(hello);
        }
        //luar block,sehingga error
//        System.out.println(hi);
    }
}
