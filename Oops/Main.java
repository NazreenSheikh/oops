package Oops;

public class Main {
    public static void main(String[] args) {
        //Why we use Static word to main function
        //static is independent of instance (object). it means that you can call it without making object of that class
        // you can call static function under static function but cannot call non-static function without making its object
        //you can call static function under non-static function
        Student s3 = new Student();
        Student s4 = new Student();
        Student s1 = new Student("naaz", 8);
        Student s2 = new Student();
        System.out.println(Student.totalStudent);
//        s1.name = "naaz";
//        s1.rno = 8;
        s2.name = "garv";
        s2.rno = 9;
        System.out.println(s1.name + " " +s2.name);
        s1.greeting("shaan");


    }



}
