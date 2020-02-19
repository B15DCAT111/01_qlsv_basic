package com.java.qlsv;

import com.java.qlsv.common.Share;
import com.java.qlsv.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(Long.parseLong("1"), "B15DCAT111", "Dao Truong Long", "Ha Noi", "longlkjr977@gmail.com", 9.5));
        list.add(new Student(Long.parseLong("1"), "B15DCAT111", "Dao Truong Long", "Ha Noi", "longlkjr977@gmail.com", 9.5));
        list.add(new Student(Long.parseLong("1"), "B15DCAT111", "Dao Truong Long", "Ha Noi", "longlkjr977@gmail.com", 9.5));
        list.add(new Student(Long.parseLong("1"), "B15DCAT111", "Dao Truong Long", "Ha Noi", "longlkjr977@gmail.com", 9.5));
        list.add(new Student(Long.parseLong("1"), "B15DCAT111", "Dao Truong Long", "Ha Noi", "longlkjr977@gmail.com", 9.5));
        list.add(new Student(Long.parseLong("1"), "B15DCAT111", "Dao Truong Long", "Ha Noi", "longlkjr977@gmail.com", 9.5));
        list.add(new Student(Long.parseLong("1"), "B15DCAT111", "Dao Truong Long", "Ha Noi", "longlkjr977@gmail.com", 9.5));
        list.add(new Student(Long.parseLong("1"), "B15DCAT111", "Dao Truong Long", "Ha Noi", "longlkjr977@gmail.com", 9.5));
        System.out.println(Share.menu());
//        Share.inputInfoStudent();
        Share.displayListStudent(list);
    }
}
