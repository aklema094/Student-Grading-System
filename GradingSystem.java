import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradingSystem{

    static class Student {
        int id;
        String name;
        HashMap<String,Integer > marks = new HashMap<>();

        Student(int id, String name){
            this.id = id;
            this.name = name;
            this.marks = new HashMap<>();
        }

        public int getId() {
           return id;
        }

       public String getName() {
          return name;
       }

       public Map<String, Integer> getMarks() {
          return marks;
       }
       public void setName( String name){
        this.name = name;
        return;
       }

    }
 static HashMap<Integer, Student> studentRecords = new HashMap<>();
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
              System.out.print("Enter Id : ");
              id = scanner.nextInt();
              scanner.nextLine();
              System.out.print("Enter new name : ");
              name = scanner.nextLine();
              updateStudent(id, name);
                break;
            case 3:
             System.out.print("Enter Id : ");
             id = scanner.nextInt();
             deleteStudent(id);
                break;
            case 4:
            System.out.print("Enter Id : ");
            id = scanner.nextInt();
            Searchtudent(id);
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
    /**
     * @param id
     * @param name
     */
    public static void addStudent(int id, String name){
        if(studentRecords.containsKey(id)){
            System.out.println("Student with this ID already exist");
            return;
        } 
        studentRecords.put(id, new Student(id, name));
        System.out.println("Student added successfully");
    }
    // update student
    private static void updateStudent(int id, String  name){
        if (studentRecords.containsKey(id)) {
        Student student = studentRecords.get(id);
        student.setName(name); 
        System.out.println("Student updated successfully");
         return;          
        }
        System.out.println("Student not found");
    }
    // delete student
    public static void deleteStudent(int id) {
        if (studentRecords.remove(id) != null) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // search student
    public static void Searchtudent(int id){
        if(studentRecords.containsKey(id)){
            Student student = studentRecords.get(id);
            System.out.println(student);
            return;
        }
        System.out.println("Student not found");
    }
}