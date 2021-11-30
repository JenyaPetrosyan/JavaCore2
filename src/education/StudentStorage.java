package education;

import homework.Author.Author;

public class StudentStorage {

    private Student[] students = new Student[16];
    private int size;


    public void edd(Student student) {
        if (students.length == size) {
            extend();

        }
        students[size++] = student;

    }

    public void extend() {
        Student[] st = new Student[students.length + 10];
        System.arraycopy(students, 0, st, 0, students.length);
        students = st;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);

        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }

    public void printStudentsByLesson(String lesson) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(lesson)) ;
            System.out.println(students[i]);


        }
    }

    public void delete(int index) {
        for (int i = index + 1; i < size; i++) {
            students[i - 1] = students[i];

        }
        size--;
    }


    public void deleteStudentByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {

                delete(i);
            }
        }

    }
}