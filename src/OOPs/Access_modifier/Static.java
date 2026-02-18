package OOPs.Access_modifier;

public class Static {
    int a = 10;
    static int b = 20;

    void fun(){
        a = 20;
        b = 30;
    }
    //static can access a non-static
    //non static cannot access a static variable
    public static void main(String[] args) {
//        System.out.println(a); does not run as it is a static method
        System.out.println(b);
        Static st = new Static();
        System.out.println(st.a); //it will run now as object is created

        st.fun();
//        System.out.println(a);
        System.out.println(b);
        Static st1  = new Static();
        System.out.println(st1.a);
        System.out.println(b);
    }
}
