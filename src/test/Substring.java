package test;

public class Substring {
    public static void main(String[] args) {
        String result = "<200,202807917941,[Content-Type:\\\"text/plain;charset=UTF-8\\\", Content-Length:\\\"12\\\", Date:\\\"Mon, 17 Jan 2022 05:19:14 GMT\\\", Keep-Alive:\\\"timeout=60\\\", Connection:\\\"keep-alive\\\"]>";
        result = result.substring(0, result.indexOf(",["));
        result = result.replaceAll("<200,","");
        System.out.println(result);

        String s = "the text=toiiii";
        String s1 = s.substring(s.indexOf("=")+1);
        s1.trim();
        System.out.println(s1);

        java.lang.String str="Stack Overflow-A place to ask stuff";

        java.lang.String newStr = str.substring(0, str.indexOf("-"));
        System.out.println(newStr);


        String myName = "domanokz";
        String newName = myName.substring(0,4)+'x'+myName.substring(5);
        System.out.println(newName);

        String text = "193000";
        String newText = text.substring(0,4);
        System.out.println(newText);

    }
}
