package education;

import java.util.Scanner;

public class Test {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStrage lessonStrage = new LessonStrage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENTS = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSON = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";


    private static void printCommends() {
        System.out.println("please input" + EXIT + " for EXIT");
        System.out.println("please input" + ADD_LESSON + "for add lesson  ");
        System.out.println("please input" + ADD_STUDENTS + "for add student ");
        System.out.println("please input" + PRINT_STUDENTS + "for print student  ");
        System.out.println("please input" + PRINT_STUDENTS_BY_LESSON + "for print student by lesson  ");
        System.out.println("please input" + PRINT_LESSON + "for print lesson  ");
        System.out.println("please input" + DELETE_LESSON_BY_NAME + "for delete lesson by name  ");
        System.out.println("please input" + DELETE_STUDENT_BY_EMAIL + "for delete student by email  ");

    }

    public static void main(String[] args) {
        studentStorage.edd(new Student("Eliza", "MIkayelyan",
                "eliza@mail.com", "jjvv9687", "Java", 16));
        studentStorage.edd(new Student("Spartak", "MIkayelyan",
                "spartak@mail.com", "jjvv9687", "JS", 15));

        boolean isRen = true;
        while (isRen) {
            printCommends();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRen = false;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENTS:
                    addStudents();
                    break;
                case PRINT_STUDENTS:
                  printStudents();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                  printStudentsByLesson();
                    break;
                case PRINT_LESSON:
                    printsLesson();
                    break;
                case DELETE_LESSON_BY_NAME: 
                   deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("Invalid command!");
            }


        }

    }

    private static void deleteStudentByEmail() {
        System.out.println("pleas input name");
        String email= scanner.nextLine();
        studentStorage.deleteLessonByEmail(email);

    }

    private static void deleteLessonByName() {
        System.out.println("pleas input name");
        String name=scanner.nextLine();
        studentStorage.deleteLessonByName(name);

    }

    private static void printStudentsByLesson() {
        System.out.println("please input lesson");
        String lesson =scanner.nextLine();
        studentStorage.printStudentsByLesson(lesson);

    }

    private static void printsLesson() {
        lessonStrage.print();
    }

    private static void printStudents() {
        studentStorage.print();
    }


    private static void addLesson() {
        System.out.println("print input lerssens name,duration,lecturer's name,price");
        String lessenDataStr = scanner.nextLine();
        String[] lessenData = lessenDataStr.split(";");
        if (lessenData.length == 3) {
            int prince = Integer.parseInt((lessenData[3]));
            Lesson lesson = new Lesson(lessenData[0], lessenData[1], lessenData[2], prince);
            if (lessonStrage.getByEmail(lesson.getNzme()) != null) {
                System.out.println("Invalid email. Students with this email already exists");
            } else {
                lessonStrage.edd(lesson);
                System.out.println("Thank you, author was added");


            }

            }else{
            System.out.println("invalid data");
        }
        }

    private static void addStudents() {
        System.out.println("print input stdents name,surname,email,pone, lesson,age");
        String studentDataStr = scanner.nextLine();
        String[] studentData = studentDataStr.split(",");
        if (studentData.length == 6) {
            int age = Integer.parseInt(studentData[5]);
            Student student = new Student(studentData[0], studentData[1], studentData[2], studentData[3],
                    studentData[4], age);
            if (studentStorage.getByEmail(student.getEmail()) != null) {
                System.out.println("Invalid email. Students with this email already exists");

            } else {
                studentStorage.edd(student);
                System.out.println("Thank you, author was added");
            }

        } else {
            System.out.println("invalid data");
        }


    }
}