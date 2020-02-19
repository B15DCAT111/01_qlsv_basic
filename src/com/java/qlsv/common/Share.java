package com.java.qlsv.common;

import com.java.qlsv.mock.DataStudent;
import com.java.qlsv.model.Student;

import java.util.List;
import java.util.Scanner;

public class Share {
    public static String menu() {

        return "           ,-----.    ,--.     ,---.   ,--.   ,--.  \n" +
                "          '  .-.  '   |  |    '   .-'   \\  `.'  /   \n" +
                "          |  | |  |   |  |    `.  `-.    \\     /   \n" +
                "          '  '-'  '-. |  '--. .-'    |    \\   /    \n" +
                "           `-----'--' `-----' `-----'      `-'     \n" +
                "@author : T.B.L - facebook: https://www.facebook.com/Talonjr.7 \n" +
                "=========================== MENU =========================== \n" +
                "| 1. Hiển thị danh sách sinh viên                          | \n" +
                "| 2. Thêm sinh viên                                        | \n" +
                "| 3. Sủa sinh viên theo mã sinh viên                       | \n" +
                "| 4. Xóa sinh viên theo mã sinh viên                       | \n" +
                "| 5. Tìm kiếm sinh viên theo lựa chọn                      | \n" +
                "| \t5.1 : mã sinh viên                                     | \n" +
                "| \t5.2 : tên sinh viên                                    | \n" +
                "| \t5.3 : điểm sinh viên                                   | \n" +
                "| 6. Sắp xếp sinh viên theo điểm                           | \n" +
                "| \t6.1 : tăng dần                                         | \n" +
                "| \t6.2 : giảm dần                                         | \n" +
                "============================================================ \n";
    }

    /**
     * Tu dong tang id nen 1
     *
     * @return
     */
    public static Long autoIncreaseId() {
        return (long) (DataStudent.studentCollection.size() + 1);
    }

    public static Student inputInfoStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mã sinh vien : ");
        String code = scanner.nextLine();
        System.out.println("Nhap tên sinh vien : ");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên :");
        String address = scanner.nextLine();
        System.out.println("Nhập Email Sinh viên : ");
        String email = scanner.nextLine();
        System.out.println("Nhap điểm sinh viên : ");
        Double mark = Double.parseDouble(scanner.nextLine());
        return new Student(autoIncreaseId(), code, name, address, email, mark);
    }

    public static Student inputInfoStudentForUpdate(Long id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mã sinh vien : ");
        String code = scanner.nextLine();
        System.out.println("Nhap tên sinh vien : ");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên :");
        String address = scanner.nextLine();
        System.out.println("Nhập Email Sinh viên : ");
        String email = scanner.nextLine();
        System.out.println("Nhap điểm sinh viên : ");
        Double mark = Double.parseDouble(scanner.nextLine());
        return new Student(id, code, name, address, email, mark);
    }

    /**
     * Hien thi danh sach sinh vien
     *
     * @param listStd
     */
    public static void displayListStudent(List<Student> listStd) {
        if (null != listStd && listStd.size() > 0) {
            listStd.forEach((Student std) -> {
                System.out.println(std.get_id() + "." + std.getCode() + " - " + std.getName() + " - " + std.getAddress() + " - " + std.getEmail() + " - " + std.getMark());
            });
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("Danh sach sinh viên trống !");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

    }

    /**
     * Hien thi 1 sinh vien
     *
     * @param std
     */
    public static void displayStudent(Student std) {
        System.out.println("--- Ket qua tim kiem ---");
        if (null != std && null != std.get_id()) {
            System.out.println(std.get_id() + "." + std.getCode() + " - " + std.getName() + " - " + std.getAddress() + " - " + std.getEmail() + " - " + std.getMark());
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        } else {
            System.out.println("Không có sinh viên nào thỏa mãn điều kiện tìm kiếm !");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

    }

    public static String inputCode() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Double inputMark() {
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.nextLine());
    }
}
