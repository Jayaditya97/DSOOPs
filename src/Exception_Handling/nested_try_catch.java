package Exception_Handling;

public class nested_try_catch {
    public static void main(String[] args) {
        try{
            try{
                int x = 10/0;
            } catch(ArithmeticException e){
                System.out.println("Inner catch");
            }
        }catch(Exception e){
            System.out.println("Outer catch");
        }
    }
}