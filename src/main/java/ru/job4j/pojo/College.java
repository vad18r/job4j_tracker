package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иванов Иван Иванович");
        student.setGroup("416-Б");
        student.setDateAdmission(new Date());
        System.out.println("ФИО: " + student.getFio());
        System.out.println("Группа: " + student.getGroup());
        System.out.println("Дата поступления: " + student.getDateAdmission());
    }
}
