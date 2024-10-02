import java.util.*;
import java.util.logging.Logger;

// Main class that handles the virtual classroom management
public class VirtualClassroomManager {
    private static final Logger logger = Logger.getLogger(VirtualClassroomManager.class.getName());
    private Map<String, Classroom> classrooms;

    public VirtualClassroomManager() {
        this.classrooms = new HashMap<>();
    }

    // Add classroom
    public void addClassroom(String className) {
        if (!classrooms.containsKey(className)) {
            classrooms.put(className, new Classroom(className));
            System.out.println("Classroom " + className + " has been created.");
        } else {
            System.out.println("Classroom " + className + " already exists.");
        }
    }

    // Add student to a classroom
    public void addStudent(String studentId, String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addStudent(new Student(studentId));
            System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    // Schedule assignment for a classroom
    public void scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addAssignment(new Assignment(assignmentDetails));
            System.out.println("Assignment for " + className + " has been scheduled.");
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    // Submit assignment by a student in a classroom
    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            Student student = classroom.getStudent(studentId);
            if (student != null) {
                student.submitAssignment(new Assignment(assignmentDetails));
                System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
            } else {
                System.out.println("Student " + studentId + " is not enrolled in " + className + ".");
            }
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }

    // List all classrooms
    public void listClassrooms() {
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
        } else {
            System.out.println("Available Classrooms: ");
            classrooms.keySet().forEach(System.out::println);
        }
    }
    
    // List students in a classroom
    public void listStudentsInClassroom(String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.listStudents();
        } else {
            System.out.println("Classroom " + className + " does not exist.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VirtualClassroomManager manager = new VirtualClassroomManager();
        while (true) {
            System.out.println("Enter a command: ");
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            
            try {
                switch (tokens[0]) {
                    case "add_classroom":
                        manager.addClassroom(tokens[1]);
                        break;
                    case "add_student":
                        manager.addStudent(tokens[1], tokens[2]);
                        break;
                    case "schedule_assignment":
                        manager.scheduleAssignment(tokens[1], String.join(" ", Arrays.copyOfRange(tokens, 2, tokens.length)));
                        break;
                    case "submit_assignment":
                        manager.submitAssignment(tokens[1], tokens[2], String.join(" ", Arrays.copyOfRange(tokens, 3, tokens.length)));
                        break;
                    case "list_classrooms":
                        manager.listClassrooms();
                        break;
                    case "list_students":
                        manager.listStudentsInClassroom(tokens[1]);
                        break;
                    case "exit":
                        System.exit(0);
                    default:
                        System.out.println("Unknown command.");
                }
            } catch (Exception e) {
                logger.severe("An error occurred: " + e.getMessage());
                System.out.println("Error processing command.");
            }
        }
    }
}

class Classroom {
    private String name;
    private Map<String, Student> students;
    private List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new HashMap<>();
        this.assignments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.containsKey(student.getId())) {
            students.put(student.getId(), student);
        }
    }

    public Student getStudent(String studentId) {
        return students.get(studentId);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in this classroom.");
        } else {
            System.out.println("Students in " + name + ": ");
            students.keySet().forEach(System.out::println);
        }
    }
}

class Student {
    private String id;
    private List<Assignment> submittedAssignments;

    public Student(String id) {
        this.id = id;
        this.submittedAssignments = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void submitAssignment(Assignment assignment) {
        submittedAssignments.add(assignment);
    }
}

class Assignment {
    private String details;

    public Assignment(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
}
