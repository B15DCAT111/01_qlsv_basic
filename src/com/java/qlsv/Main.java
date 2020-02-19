package com.java.qlsv;

import com.java.qlsv.bussiness.StudentBussiness;
import com.java.qlsv.common.Share;
import com.java.qlsv.mock.DataStudent;
import com.java.qlsv.model.Student;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final StudentBussiness studentBussiness = new StudentBussiness();
    public static Scanner scanner = new Scanner(System.in);

    public static void run() {
        String choose;
        boolean exit = false;
        // show menu
        System.out.println(Share.menu());
        while (true) {
            System.out.println("--- Chon chức năng bạn muốn ---");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("1. Hiển thị danh sách sinh viên");
                    Share.displayListStudent(studentBussiness.getListStudent());
                    break;
                case "2":
                    System.out.println("2. Thêm sinh viên");
                    Student student = Share.inputInfoStudent();
                    try {
                        studentBussiness.insertStudent(student);
                        System.out.println("Them moi thanh cong !!");
                        Share.displayListStudent(studentBussiness.getListStudent());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Them moi khong thanh cong !!");
                    }
                    break;
                case "3":
                    System.out.println("3. Sủa sinh viên theo mã sinh viên");
                    try {
                        System.out.println("Nhap ma sinh vien ban muon sua");
                        String code = Share.inputCode();
                        Student std = studentBussiness.findStudentByCode(code);
                        Share.displayStudent(std);
                        System.out.println("Nhập thông tin cần sửa: ");
                        Student stde = Share.inputInfoStudentForUpdate(std.get_id());
                        studentBussiness.updateStudentByCode(code, stde);
                        System.out.println("Sua thanh cong !!");
                        Share.displayListStudent(studentBussiness.getListStudent());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Tim kiem theo ma khong thanh cong !!");
                    }
                    break;
                case "4":
                    System.out.println("4. Xóa sinh viên theo mã sinh viên");
                    try {
                        System.out.println("Nhap ma sinh vien ban muon xoa");
                        String code = Share.inputCode();
                        Student std = studentBussiness.findStudentByCode(code);
                        System.out.println("Bạn có chắc chắn muốn xóa sinh viên có mã là " + std.getCode() + " (y/n)");
                        String select = scanner.nextLine();
                        switch (select) {
                            case "y":
                                studentBussiness.removeStudent(std);
                                System.out.println("Xoa thanh cong !!");
                                Share.displayListStudent(studentBussiness.getListStudent());
                                break;
                            case "n":
                                exit = true;
                                break;
                            case "0":
                                System.out.println("exited!");
                                exit = true;
                                break;
                            default:
                                System.out.println("invalid! please choose action in below menu:");
                                break;
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        System.out.println("Xóa khong thanh cong !!");
                    }
                    break;
                case "5":
                    System.out.println("5. Tìm kiếm sinh viên theo lựa chọn");
                    System.out.println("-- Chọn kiểu tìm kiếm --");
                    System.out.println("5.1 : mã sinh viên");
                    System.out.println("5.2 : tên sinh viên");
                    System.out.println("5.3 : điểm sinh viên ");
                    String select1 = scanner.nextLine();
                    switch (select1) {
                        case "5.1":
                            System.out.println("5.1 : mã sinh viên");
                            try {
                                System.out.println("Nhap ma sinh vien ban muon tim kiem");
                                String code = Share.inputCode();
                                Student std = studentBussiness.findStudentByCode(code);
                                Share.displayStudent(std);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                System.out.println("Tim kiem theo ma khong thanh cong !!");
                            }
                            break;
                        case "5.2":
                            System.out.println("5.2 : tên sinh viên");
                            try {
                                System.out.println("Nhap ten sinh vien ban muon tim kiem");
                                String name = Share.inputName();
                                List<Student> listStd = studentBussiness.findStudentByName(name);
                                Share.displayListStudent(listStd);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                System.out.println("Tim kiem theo ten khong thanh cong !!");
                            }
                            break;
                        case "5.3":
                            System.out.println("5.3 : điểm sinh viên ");
                            try {
                                System.out.println("Nhap diem sinh vien ban muon tim kiem");
                                double mark = Share.inputMark();
                                List<Student> listStd = studentBussiness.findStudentByMark(mark);
                                Share.displayListStudent(listStd);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                                System.out.println("Tim kiem theo diem khong thanh cong !!");
                            }
                            break;
                        case "0":
                            System.out.println("exited!");
                            exit = true;
                            break;
                        default:
                            System.out.println("invalid! please choose action in below menu:");
                            break;
                    }
                    break;
                case "6":
                    System.out.println("6. Sắp xếp sinh viên theo điểm");
                    System.out.println("-- Chọn kiểu Sap xep --");
                    System.out.println("6.1 : Tang dan / ASC");
                    System.out.println("6.2 : Giam dan / DESC");
                    String select2 = scanner.nextLine();
                    switch (select2) {
                        case "6.1":
                            System.out.println("6.1 : Tang dan / ASC");
                            Share.displayListStudent(studentBussiness.sortByMark("ASC"));
                            break;
                        case "6.2":
                            System.out.println("6.2 : Giam dan / DESC");
                            Share.displayListStudent(studentBussiness.sortByMark("DESC"));
                            break;
                        case "0":
                            System.out.println("exited!");
                            exit = true;
                            break;
                        default:
                            System.out.println("invalid! please choose action in below menu:");
                            break;
                    }
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            try {
                //assuming it takes 20 secs to complete the task
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // show menu
            System.out.println(Share.menu());
        }
    }

    public static void main(String[] args) {
        System.out.println("LOADING DATA ...");
        DataStudent.mock();
        try {
            //assuming it takes 20 secs to complete the task
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--- LOADING DATA SUCCESSFUL ---");
        System.out.println("Let's start project ...");
        try {
            //assuming it takes 20 secs to complete the task
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        run();
    }
}
