public class MethodReturnValue {
    public static void main(String[] args) {
        //secara default method itu tidak menghasilkan value apapun,namu jika kita ingin,kita bisa membuat method mengembalikan nilai
        //agar method bisa mengembalikan value,kita harus mengubah kata kunci void dengan tipe data yang dihasilkan
        //Dan di dalam block method,untuk menghasilkan nilai tersebut,kita harus menggunakan kata kunci return,lalu diikuti dengan tipe data yang sudah kita deklarasikan di method
        //Di java,kita hanya bisa menhasilkan 1 data di sebuah method,tidak bisa lebih dari satu,seperti di golang
        totalJumlah(4,5);

        var a = 100;
        var b = 200;
        var result1 = intSum(a,b);
        System.out.println(result1);
        System.out.println(intSum(a,b));

        //plusnya tipe data String
        System.out.println(hitung(100,"+",100));
    }
    static int totalJumlah(int x, int y){
        int z;
        z = x+y;
        return z;
    }
    static int intSum(int value1 , int value2) {
        var total = value1+value2;
        return  total;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi){
            case "+" :
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }

}
