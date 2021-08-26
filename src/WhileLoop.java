public class WhileLoop {
    public static void main(String[] args){
        //while loop adalah perulangan yang lebih sederhana dari for loop,tidak ada init stattement atau post statement
        var counter = 1;
        while(counter <= 10){
            System.out.println("Perulangan " + counter);
            counter++;
        }
    }
}
