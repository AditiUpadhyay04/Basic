import java.sql.SQLOutput;
 //import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      /*  int[] arr = {2,3,4,5,6};
        int[] arr1 = new int[] {34,56,34,789};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        String[] str = new String[6];
        str[0] = "ABCD";
        str[1] = "EFGH";
        str[2] = "IJKL";
        str[3] = "MNOP";
        str[4] = "QRST";
        str[5] = "UVWXYZ";
        System.out.println(Arrays.toString(str));

        String[] str1 = {"DHRUV AYUSH  PAGAL HAIII" };
        System.out.println(Arrays.toString(str1));

       */
        int n = sc.nextInt();
        sc.nextLine();
        String[] str2 = new String[n];
        // for input
        for (int i = 0; i < str2.length; i++) {
            str2[i] = sc.next();


        }
        System.out.println(Arrays.toString(str2));
        // for output
        for (int i = 0; i < str2.length; i++) {
            System.out.print(str2[i] + " ");
                }

        // for each loop
            for(String s : str2){
                System.out.print(s + " ");
            }

        }
    }
