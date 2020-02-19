package com.java.qlsv.mock;

import com.java.qlsv.model.Student;

import java.util.ArrayList;

public class DataStudent {
    /**
     * Khởi tạo ra 1 list sinh viên rỗng
     */
    public static ArrayList<Student> studentCollection = new ArrayList<>();

    /**
     * Thêm các sinh viên vào dữ liệu gốc để mock data
     */
    public static void mock() {
        studentCollection.add(new Student(Long.parseLong("1"), "B15DCAT111", "Dao Truong Long", "Phu Xuyen", "longlkjr977@gmail.com", 9.5));
        studentCollection.add(new Student(Long.parseLong("2"), "B15DCAT019", "Ngo Ngoc Bach", "Thuong Tin", "Bach977@gmail.com", 4.5));
        studentCollection.add(new Student(Long.parseLong("3"), "B15DCAT155", "Do Van Trinh", "Hai Hau", "longlkjr977@gmail.com", 6.0));
        studentCollection.add(new Student(Long.parseLong("4"), "B15DCAT145", "Nguyen Tien Thanh", "Ung Hoa", "Thanhnt977@gmail.com", 4.0));
    }
}
