package com.epam.task.module4.theSimplestClassesAndObjects.task3;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Student[] students = new Student[n];
        students[0] = new Student("Sidorov D.V.", 1);
        students[1] = new Student("Dmitiev S.A.", 1);
        students[2] = new Student("Petrovich D.V.", 2);
        students[3] = new Student("Vasilevich A.O.", 2);
        students[4] = new Student("Selezen Z.V.", 2);
        students[5] = new Student("Nehin O.D.", 3);
        students[6] = new Student("Dvornik A.V.", 3);
        students[7] = new Student("Sokol P.S.", 4);
        students[8] = new Student("Den A.V.", 4);
        students[9] = new Student("Shurin A.V.", 4);

        for (Student student : students) {
            student.addGrade();
        }

        System.out.println("All students:");
        for (Student student : students) {
            student.print();
        }

        System.out.println("\nGood students:");
        for (Student student : students) {
            if (student.isGoodStudent())
                student.print();
        }
    }
}