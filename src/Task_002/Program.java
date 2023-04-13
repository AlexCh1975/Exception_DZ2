package Task_002;

/**
 * Необходимо, исправьте данный код
 * try {
 *             int d = 0;
 *             double catchedRes1 = intArray[8] / d;
 *             System.out.println("catchedRes1 = " + catchedRes1);
 *         } catch (ArithmeticException e) {
 *             System.out.println("Catching exception: " + e);
 *         }
 */
public class Program {
    public static void main(String[] args){
        int d = 2;
        int d1 = 0;
        code(d);
        code(d1);
    }
    public static void code(int d){
        try {
            int[] intArray = {1,2,3,4,5,6,7,8,9};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (Exception e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
}
