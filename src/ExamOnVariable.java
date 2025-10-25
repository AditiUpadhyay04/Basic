class test{
    int num = 20;


  static  void m1(){
       ExamOnVariable.t1.num++;
        System.out.println("value is: " +ExamOnVariable.t1.num);
    }
}

 class ExamOnVariable {
    static test t1 = null;
     public static void main(String[] args) {
         test t2 = new test();
        ExamOnVariable.t1 = new test();
         t1.num = 200;

         t1.m1();
         t2.m1();
         t1.m1();
     }
}
