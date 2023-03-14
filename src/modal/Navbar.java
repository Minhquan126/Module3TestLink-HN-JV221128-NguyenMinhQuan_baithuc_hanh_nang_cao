package modal;

import student.Student;

import java.util.Scanner;

public class Navbar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        int side = 0;
        Student[] students = new Student[30];
        System.out.println("=====STUDENT MANAGE=====");
        while (choice != 0) {
            System.out.println("1. Show List Student.\n" +
                    "2. Create Student \n" +
                    "3. Update Student \n" +
                    "4. Delete Student \n" +
                    "5. Sort Student By Age ASC (Tăng Dần).\n" +
                    "6. Exit");
            System.out.println("Chọn Menu :");
            String choi = scanner.nextLine();
            choice = Integer.parseInt(choi);
            switch (choice) {
                case 1:
                    for (int i = 0; i < students.length; i++) {
                        System.out.println(students[i]);
                    }
                    break;
                case 2:
                    System.out.println("Nhập studentName :");
                    String name = scanner.nextLine();
                    System.out.println("Nhập age :");
                    String age = scanner.nextLine();
                    int studentAge = Integer.parseInt(age);
                    Student student = new Student(side + 1, name, studentAge);
                    students[side] = student;
                    System.out.println(students[side]);
                    side++;
                    break;
                case 3:
                    Student[] studentUpdate = new Student[30];
                    System.out.println("Nhap id sinh vien can sua :");
                    String idU = scanner.nextLine();
                    int idUpdate = Integer.parseInt(idU);
                    for (int i = 0; i < 30; i++) {
                        if (students[i].getStudentId() == idUpdate) {
                            System.out.println("ten sinh vien : " + students[i].getStudentName());
                            System.out.println("ten sinh vien : " + students[i].getAge());
                            System.out.println("Nhap lai ten sinh vien :");
                            String newName = scanner.nextLine();
                            System.out.println("Nhap lai tuoi sinh vien :");
                            String newAge = scanner.nextLine();
                            int newAgeStudent = Integer.parseInt(newAge);
                            Student updateStudent = new Student(idUpdate, newName, newAgeStudent);
                            students[i] = updateStudent;
                        }
                    }
                    studentUpdate = students;
                    break;
                case 4:
                    System.out.println("Nhap id can xoa");
                    String idD = scanner.nextLine();
                    int idDel = Integer.parseInt(idD);
                    Student[] newStudent = new Student[30];
                    for (int i = 0; i < 30; i++) {
                        if (students[i].getStudentId() == idDel) {
                            continue;
                        }
                        newStudent[i] = students[i];
                    }
                    students = newStudent;
                    break;
                case 5:

                case 6:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }


    }
}
