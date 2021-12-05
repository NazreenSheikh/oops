package Oops;

public class
Student {
        String name;
        int rno;
        static int totalStudent;

        Student(){
//            this.name= "noName";
//            this.rno= 0;
            this("noName",0);

        }
        Student(String naam, int roll){
            this.name = naam;
            this.rno= roll;
            Student.totalStudent ++;
//

        }
        void greeting(String name){
            System.out.println("Hello " +this.name + " and " +name);
            fun();
        }
        static void fun(){
            System.out.println("hii I'm static fun");
//            Greeting("naaz");  gives an error as we cannot call non-static function in static one
        }
}
