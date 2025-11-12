import java.util.Scanner;
   public class Time_Conversion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter total minutes: ");
            int mins = sc.nextInt();
            sc.close();

            int hours = mins / 60;
            int remaining = mins % 60;

            System.out.println(hours + " hours and " + remaining + " minutes");
        }
    }


