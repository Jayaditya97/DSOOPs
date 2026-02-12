package Exception_Handling;

public class multiple_catch {
    public static void main(String[] args) {
        try{
            int arr[] = new int[5];
            arr[10] = 50;
        } catch(ArithmeticException e){
            System.out.println("Arithmetic error!");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index Error!");
        }
    }
}