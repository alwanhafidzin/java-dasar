public class RecursiveMethod {
    public static void main(String[] args) {
        //Recursive method adalah kemampuan method memanggil method dirinya sendiri
        //Kadang memang ada banyak problem,yang lebih mudah diselesaikan menggunakan recursive method,seperti contohnya kasus factorial
        //kenapa 20 hasilnya -2102132736,karena melebihi batas dari int
        System.out.println(factorial(20));
        System.out.println(factorialRecursive(5));

        //Problem dengan Recursive
        //Walaupun recursive methoad itu sangat menarik,namun kita perlu berhati-hati
        //Jika recursive terlalu dalam,maka akan ada kemungkinan terjadinya error StackOverflow,yaitu error dimana stack methoad terlalu banyak di java
        //Kenapa problem ini bisa terjadi?.Karena ketika kita memanggil methoad.java akan menyimpannya dalam stack,jika method tersebut memanggil method lain,
        //maka stack akan menumpuk terus dan jika terlalu dalam,maka stack akan terlalu besar,dan bisa menyebabkan error StackOverflow
        //Stackoverflow terjadi mengikuti berapa banyak memori di komputer

        //No problem
        loop(1000);

        //Stackoverflow
        loop(100000);
    }
    static int factorial(int value) {
        var result = 1;
        for (int i = 1; i <= value; i++){
            result *=i;
        }
        return result;
    }
    static  int factorialRecursive(int value) {
        if(value==1){
            return 1;
        } else {
            return value *factorialRecursive(value-1);
        }
    }
    //error recursive
    static void loop(int value) {
        if(value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop-" + value);
            loop(value -1);
        }
    }
}
