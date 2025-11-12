import java.util.Scanner;

    public class Billing {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter price per item: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            double total = price * qty;

            System.out.println("Total bill for " + name + " = ₹" + total);
            sc.close();
        }
    }


