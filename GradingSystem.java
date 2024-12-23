import java.util.HashMap;
import java.util.Scanner;

public class GradingSystem{
    private static HashMap<Integer, String> studentRecords = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

       while (true) {
        mainMenu();
        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
              System.out.print("Enter Id : ");
              int id = scanner.nextInt();
              scanner.nextLine();
              System.out.print("Enter name : ");
              String name = scanner.nextLine();
              addStudent(id,name);
                break;
            case 2:
                //updateStudent();
                break;
            case 3:
                //deleteStudent();
                break;
            case 4:
                //Searchtudent();
                break;
            case 5:
                //updateMark();
                break;
            case 6:
                //displayGrade();
                break;
            case 7:
                System.out.println("Thank you");
                return;
        
            default:
             System.out.println("Invalid choice!, Please try again");
                break;
        }
        
       }
    }
    public static void mainMenu(){
        System.out.println("1. Add Student \n2. Update Student \n3. Delete Student \n4. Search Student");
        System.out.println("5. Update Mark \n6. Display Grade Distribution \n7. Exit");
    }

    // add new student 
    public static void addStudent(int id, String name){

        if(studentRecords.containsKey(id)){
            System.out.println("Student with this ID already exist");
            return;
        }
        
       studentRecords.put(id, name);
       System.out.println("Student added successfully");


    }
}