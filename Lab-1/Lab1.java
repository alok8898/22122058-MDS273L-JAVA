import java.util.Scanner;

/*Write a Java Program that will collect an employee's basic details that fall into different data types and displays them.
After the details have been displayed, with the help of conditional statements, check if the gender of the employee is 'm' or 'f'. 
It should print "MALE" for 'm' and "FEMALE" for 'f'.
Assume that you can divide the states among India into different regions (North, South, Central, East, and West). 
If the employee is from the southern part of India, with the help of a switch statement, it should display 
"The Employee is from the southern states of India; Preferable work location is in <state>", along with the basic details.
Identify if the employee belongs to the top MNC Companies (Facebook, Google, Microsoft, Samsung, IBM, Apple); 
if so, print a message "The employee is working in Top MNC Companies".

Note: Your program should be neatly organized, with appropriate comments, variable names, proper input output formatting, 
and necessary validations.
*/

public class Lab1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Employee Name: ");
        String name = scan.nextLine();

        System.out.print("Enter the Employee Age: ");
        int age = scan.nextInt();

        System.out.print("Enter the Employee Gender (m/f): ");
        char gender = scan.next().charAt(0);

        System.out.print("Enter the Employee Salary: ");
        double salary = scan.nextDouble();

        System.out.print("Enter the Employee's state: ");
        String state = scan.nextLine();
        scan.nextLine();

        System.out.print("Enter the Employee's company: ");
        String company = scan.nextLine();

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);

        if (gender == 'm') {
            System.out.println("Employee Gender: MALE");
        }else {
            System.out.println("Employee Gender: FEMALE");
        }

        switch (state) {
            case "Himachal Pradesh", "Punjab", "Uttarakhand", "Uttar Pradesh", "Haryana":

                System.out.println("The Employee is from the northern states of India; Preferable work location is in " + state);

                break;

            case "Bihar", "Orissa", "Jharkhand", "West Bengal","Assam", "Sikkim", "Nagaland", "Meghalaya", "Manipur", "Mizoram", "Tripura","Arunachal Pradesh":

                System.out.println("The Employee is from the eastern states of India; Preferable work location is in " + state);

                break;

            case "Rajasthan", "Gujarat", "Goa", "Maharashtra":

                System.out.println("The Employee is from the western states of India; Preferable work location is in " + state);

                break;

            case "Andhra Pradesh", "Karnataka", "Kerala", "Tamil Nadu":

                System.out.println("The Employee is from the southern states of India; Preferable work location is in " + state);

                break;

            case "Madhya Pradesh", "Chhattisgarh":

                System.out.println("The Employee is from the central states of India; Preferable work location is in " + state);

                break;

    }
        switch (company) {

            case "Facebook", "Google", "Microsoft", "Samsung", "IBM", "Apple":

                System.out.println("The employee is working in Top MNC Companies");

                break;

            default:
                
                System.out.println("The employee is not working in Top MNC Companies");
                
                break;

            
        }

    }    
    
}
