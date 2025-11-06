public class Student {

    int id;

    void login(){
        System.out.println(hashCode() + "logged in successfully");
    }
    void logout(){
        System.out.println(hashCode() + "logged out successfully");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        s1.id = 1008;
        s2.id = 1001;

        s1.login();
        s2.login();

        s1.logout();
        s2.logout();
    }

}
