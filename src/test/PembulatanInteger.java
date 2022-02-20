package test;

public class PembulatanInteger {
    public static void main(String[] args) {
        int result = 120;
        int totalPage;
        if(result % 10== 0){
            totalPage = result/10;
        }else {
            totalPage = (result/10)+1;
        }
        System.out.println(totalPage);
    }
}
