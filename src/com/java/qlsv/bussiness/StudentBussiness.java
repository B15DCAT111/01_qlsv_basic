package com.java.qlsv.bussiness;

import com.java.qlsv.common.MarkComparatorOrderByASC;
import com.java.qlsv.common.MarkComparatorOrderByDESC;
import com.java.qlsv.mock.DataStudent;
import com.java.qlsv.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Cac ham su ly thao tac truc tiep voi data raw
 */
public class StudentBussiness {
    /**
     * {@todo} Hien thi danh sach Student
     */
    public List<Student> getListStudent() {
        return DataStudent.studentCollection;
    }

    /**
     * {@todo} Them moi 1 sinh vien
     */
    public void insertStudent(Student std) {
        DataStudent.studentCollection.add(std);
    }

    /**
     * {@todo} Xoa 1 sinh vien
     */
    public void removeStudent(Student std) {
        DataStudent.studentCollection.remove(std);
    }

    /**
     * {@todo} Tim kiem sinh vien theo ma sinh vien
     */
    public Student findStudentByCode(String code) {
        Student listResult = new Student();
        for (Student std : DataStudent.studentCollection) {
            if (code.equals(std.getCode())) {
                listResult = std;
            }
        }
        return listResult;
    }

    /**
     * {@todo} Tim kiem sinh vien theo ten sinh vien
     */
    public List<Student> findStudentByName(String name) {
        List<Student> listResult = new ArrayList<>();
        for (Student std : DataStudent.studentCollection) {
            if (name.equals(std.getCode())) {
                listResult.add(std);
            }
        }
        return listResult;
    }

    /**
     * {@todo} Tim kiem sinh vien theo diem sinh vien
     */
    public List<Student> findStudentByMark(double mark) {
        List<Student> listResult = new ArrayList<>();
        for (Student std : DataStudent.studentCollection) {
            if (mark == std.getMark()) {
                listResult.add(std);
            }
        }
        return listResult;
    }

    public List<Student> sortByMark(String orderBy) {
        List<Student> listResult = new ArrayList<>();
        switch (orderBy) {
            case "ASC":
                DataStudent.studentCollection.sort(new MarkComparatorOrderByASC());
                listResult = DataStudent.studentCollection;
                break;
            case "DESC":
                DataStudent.studentCollection.sort(new MarkComparatorOrderByDESC());
                listResult = DataStudent.studentCollection;
                break;
            default:
                listResult = null;
                break;
        }
        return listResult;
    }

}
