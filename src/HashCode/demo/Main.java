package HashCode.demo;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap H1 = new HashMap();

        H1.put("1" , "CLASS");
        H1.put("2","CODING");

        System.out.println(H1.get("1"));
        System.out.println(H1.get("2"));
        H1.remove("2");
        System.out.println(H1.get("2"));


    }
}
