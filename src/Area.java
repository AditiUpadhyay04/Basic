public class Area {
    public static void main(String[] args){
          int radius = 7;
          double Area = 22.0/7 * radius * radius;
        System.out.println(Area );

          double Area1 = 22/7.0 * radius * radius;
        System.out.println(Area1);

          double Area2 = (double)22/7 * radius * radius;
        System.out.println(Area2);

          double Area3 = Math.PI * radius * radius;
        System.out.println(Area3);
    }
}
