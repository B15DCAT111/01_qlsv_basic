package com.java.qlsv.bussiness;

import com.java.qlsv.mock.DataStudent;
import com.java.qlsv.model.Student;

import java.util.List;

public class StudentBussiness {
    /**
     * Hien thi danh sach Student
     *
     * @return
     */
    public List<Student> getListStudent() {
        return DataStudent.studentCollection;
    }

    /**
     * Them moi 1 sinh vien
     */
    public void insertStudent(Student std) {
        DataStudent.studentCollection.add(std);
    }

    /**
     * Xoa 1 sinh vien
     */
    public void removeStudent(Student std) {
        DataStudent.studentCollection.remove(std);
    }
}
