import java.util.Scanner;

public class StudentDetails {
  
  static String[][] studentData = new String[100][5];
  static String[] studentNames = new String[100];
  static int count = 0;
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int choice;
    
    do {
      System.out.println("Enter your choice:");
      System.out.println("1. Add student details");
      System.out.println("2. Display student details");
      System.out.println("3. Search student details");
      System.out.println("4. Exit");
      
      choice = sc.nextInt();
      switch(choice) {
        case 1:
          addStudentDetails();
          break;
        case 2:
          displayStudentDetails();
          break;
        case 3:
          searchStudentDetails();
          break;
        case 4:
          System.out.println("Exiting the program...");
          break;
        default:
          System.out.println("Invalid choice. Please enter a valid option.");
      }
    } while(choice != 4);
    
    sc.close();
  }
  
  public static void addStudentDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter student name:");
    String name = sc.nextLine();
    
    int index = searchByName(name);
    if(index != -1) {
      System.out.println("Student details already exist. Please enter another name.");
      return;
    }
    
    studentNames[count] = name;
    studentData[count][0] = name;
    
    System.out.println("Enter student register number:");
    studentData[count][1] = sc.nextLine();
    
    System.out.println("Enter student email:");
    studentData[count][2] = sc.nextLine();
    
    System.out.println("Enter student class:");
    studentData[count][3] = sc.nextLine();
    
    System.out.println("Enter student department:");
    studentData[count][4] = sc.nextLine();
    
    count++;
    System.out.println("Student details added successfully.");
    sc.close();
  }
  
  public static void displayStudentDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter student name:");
    String name = sc.nextLine();
    
    int index = searchByName(name);
    if(index == -1) {
      System.out.println("Student details not found.");
      return;
    }
    
    System.out.println("Name: " + studentData[index][0]);
    System.out.println("Register Number: " + studentData[index][1]);
    System.out.println("Email: " + studentData[index][2]);
    System.out.println("Class: " + studentData[index][3]);
    System.out.println("Department: " + studentData[index][4]);
    }
}
