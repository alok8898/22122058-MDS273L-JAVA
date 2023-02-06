import java.util.Scanner;

// The names collected must be stored in an array with a max length of 1024.
// The names in the array should be UNIQUE; no duplicate entries are expected!
// Provide necessary validations that the user enters only valid names that are not going to be repeated.
// Removing a name should not create empty space inside the array!
// Format your results properly!!

public class Lab2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String name[] = new String[1024];
        int i = 0

        System.out.println("Enter 1 to enter a name");
        System.out.println("Enter 2 to search for a name");
        System.out.println("Enter 3 to remove a name");
        int ch = Integer.parseInt(scan.nextLine());
        
        import java.util.Scanner;


        do {

            flag = true;
            System.out.println("########### MENU ###########");
            System.out.println("## 1. Enter the name:    ###");
            System.out.println("## 2. Search for a name: ###");
            System.out.println("## 3. Remove a name:    ####");
            System.out.println("## 4. Print the name list ##");
            System.out.println("## 5. Quit              ####");
            System.out.println("############################");
            System.out.println("Enter your choice: ");
            int inp = Integer.parseInt(sc.nextLine());

            switch (inp) {
                case 1: {

                    System.out.print("Enter your name: ");
                    names[ii] = sc.nextLine();
                    ii++;
                    break;

                }
                case 2: {
                    int j;
                    System.out.println("Which name your are searching?.");
                    String sch = sc.nextLine();
                    for (j = 0; j < names.length; j++) {
                        if (sch.equals(names[j])) {
                            System.out.println("Name is found at position " + (j + 1));
                            break;

                        }

                    }
                    break;
                }
                case 3: {
                    int j;
                    System.out.println("Which name you want to delete. :");
                    String ntemp = sc.nextLine();
                    for (j = 0; j < names.length; j++) {
                        if (ntemp.equals(names[j])) {
                            for (; j < names.length - 1; j++) {
                                names[j] = names[j + 1];

                            }

                        }

                    }
                    break;

                }
                case 4: {
                    System.out.println("Your list are: ");
                    for (String a : names) {
                        if (a != null) {
                            System.out.print(a + ",");
                        }

                    }
                    System.out.println();
                    break;olean flag = false;
    }
}