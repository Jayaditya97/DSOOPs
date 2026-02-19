package Exception_Handling;

public class FinallyKeyword {

//    public static void main(String[] args) {
//
//        try {
//            int x = 10 / 0;   // Causes ArithmeticException
//        }
//        catch (ArithmeticException e) {
//            System.out.println("caught");
//        }
//        finally {
//            System.out.println("finally block");
//        }
//    }
//}

    public static void main(String[] args) {

            try {
                int x = 10 / 0;   // Causes ArithmeticException
            }
            catch (ArithmeticException e) {
                System.out.println("caught");
            }
            finally {
                System.out.println("finally block");

            }
        }
    }

