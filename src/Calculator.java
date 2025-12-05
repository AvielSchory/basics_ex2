import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int x, int y ){
        return x-y;

    public static int multiply(int a, int b){
        return a * b;
    }
    public static int pow(int a, int b){
        int res=a;
        for(int i=0; i<b; i++){
            multiply(res, a);
        }
        return res;
    }
  
    public static void main(String[] args) {
        final int EXIT = 0;
        final int ADD = 1;
        final int MULTIPLY = 2;
        final int SUB =3; 
        final int POW =5; 
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Calculator Menu ===");
            System.out.println(EXIT + ". Exit");
            System.out.println(ADD + ". Add");
            System.out.println(MULTIPLY + ".Multiply");
            System.out.println(SUB + ". sub");
            System.out.println(POW + ".POW");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case ADD:
                    System.out.print("Enter two numbers: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Result = " + add(a, b));
                    break;
                case SUB:
                    System.out.print("Enter two numbers: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Result = " + sub(a, b));
                    break;
                case EXIT:
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                case MULTIPLY:
                    System.out.print("Enter two numbers: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Result = " + multiply(a, b));
                    break;
                case POW:
                    System.out.print("Enter two numbers: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Result = " + pow(a, b));
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != EXIT);
    }
}
