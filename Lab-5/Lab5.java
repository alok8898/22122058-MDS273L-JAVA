import java.util.Scanner;

public class Lab5 {
    
    String Plain = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter the message:");
            String message = scan.nextLine();
            System.out.println("Choose an option:");
            System.out.println("1. Encrypt");
            System.out.println("2. Decrypt");
            int option = scan.nextInt();
            scan.nextLine();
            String result = "";

            switch(option) {
                case(1):
                    result = encrpty(message);
                    break;
    
                case(2):
                    result = decrypt(message);
                    break;
    
                default:
                System.out.println("Invalid option");
                System.exit(0);
    
            }
            System.out.println("Result: " + result);
        }
        
    }

    public static String encrpty(String message) {
        System.out.println("encrpty");
        return "";
    }

    public static String decrypt(String message) {
        System.out.println("decrypt");
        return "";
    }
}