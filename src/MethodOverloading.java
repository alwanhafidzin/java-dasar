public class MethodOverloading {
    public static void main(String[] args) {
        //Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali
        //Namun ada ketentuannya,yaitu data parameter di method tersebut harus berbeda-beda,entah jumlah atau tipe data parameternya
        //Jika ada yang sama maka program java kita akan error

        //tanpa parameter
        sayHello();
        //satu parameter
        sayHello("Alwan");
        //dua parameter
        sayHello("Alwan", "Hafidzin");

    }
    //jumlah dan tipe parameter harus berbeda
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
