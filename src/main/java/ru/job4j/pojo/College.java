package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Vasiliy Ivanovich Pupkin");
        student.setGroup(7);
        student.setReceiptDate(new Date(1999, 5, 23, 10, 00));
        System.out.println(student.getFullName() + "," + " учится в группе № " + student.getGroup() + "," + " дата поступления " + student.getReceiptDate());
    }
}
