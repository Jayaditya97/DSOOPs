package OOPs.Access_modifier;
//public class ConstructorDemo {
//    int x;   //default value is 0
//
//    ConstructorDemo(){
//        System.out.println(x);
//    }
//    public static void main(String[] args) {
//        ConstructorDemo cd = new ConstructorDemo();
//    }
//}




public class ConstructorDemo {
    int x;   //default value is 0
//this keyword needs a parameter
//constructors with same name and different parameters are called Constructor Overloading

    ConstructorDemo(){
        this(10, 20); //constructor chaining calling a constructor with another constructor by using "this" keyword
        int x = 20;
        this.x = x;
        int y = 10;
        System.out.println(x);
        System.out.println(y);
    }

    ConstructorDemo(int x, int y){
        this.fun(); //this keyword can access methods
        System.out.println("in parameterised constructor");
    }

    void fun(){
        System.out.println("this is in fun method");
    }


    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo();
    }
}
