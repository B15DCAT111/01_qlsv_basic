package com.java.qlsv.common;

import com.java.qlsv.model.Student;

import java.util.Comparator;

/**
 * Dinh nghia ra sap xep tang dan theo diem
 */
public class MarkComparatorOrderByASC implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getMark() == s2.getMark())
            return 0;
        else if (s1.getMark() > s2.getMark())
            return 1;
        else
            return -1;
    }
}
