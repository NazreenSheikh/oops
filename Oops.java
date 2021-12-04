public class Oops {
    public static void main(String[] args) {
        Student s1 = new Student("naaz", 8);
        Student s2 = new Student();
//        s1.name = "naaz";
//        s1.rno = 8;
        s2.name = "garv";
        s2.rno = 9;
        System.out.println(s1.name + " " +s2.name);
        s1.Greeting("shaan");


    }
}
class Student{
    String name;
    int rno;

    Student(){
        this.name= "noName";
        this.rno= 0;
    }
    Student(String naam, int roll){
        this.name = naam;
        this.rno= roll;

    }
    void Greeting(String name){
        System.out.println("Hello " +this.name + " and " +name);
    }
}
