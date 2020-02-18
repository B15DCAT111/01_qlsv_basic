package com.java.qlsv.common;

import com.java.qlsv.mock.DataStudent;
import com.java.qlsv.model.Student;

import java.util.Scanner;

public class Share {
    public static String menu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("           ,-----.    ,--.     ,---.   ,--.   ,--.  \n");
        stringBuilder.append("          '  .-.  '   |  |    '   .-'   \\  `.'  /   \n");
        stringBuilder.append("          |  | |  |   |  |    `.  `-.    \\     /   \n");
        stringBuilder.append("          '  '-'  '-. |  '--. .-'    |    \\   /    \n");
        stringBuilder.append("           `-----'--' `-----' `-----'      `-'     \n");

        stringBuilder.append("=========================== MENU =========================== \n");
        stringBuilder.append("| 1. Hiển thị danh sách sinh viên                          | \n");
        stringBuilder.append("| 2. Thêm sinh viên                                        | \n");
        stringBuilder.append("| 3. Sủa sinh viên theo mã sinh viên                       | \n");
        stringBuilder.append("| 4. Xóa sinh viên theo mã sinh viên                       | \n");
        stringBuilder.append("| 5. Tìm kiếm sinh viên theo lựa chọn                      | \n");
        stringBuilder.append("| \t5.1 : mã sinh viên                                     | \n");
        stringBuilder.append("| \t5.2 : tên sinh viên                                    | \n");
        stringBuilder.append("| \t5.3 : điểm sinh viên                                   | \n");
        stringBuilder.append("| 6. Sắp xếp sinh viên theo điểm                           | \n");
        stringBuilder.append("| \t6.1 : tăng dần                                         | \n");
        stringBuilder.append("| \t6.2 : giảm dần                                         | \n");
        stringBuilder.append("============================================================ \n");
        return stringBuilder.toString();
    }

    /**
     * Tu dong tang id nen 1
     *
     * @return
     */
    public static Long autoIncreaseId() {
        return Long.valueOf(DataStudent.studentCollection.size() + 1);
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
        Student std = new Student(autoIncreaseId(),code,name,address,email,mark);
        return std;
    }
}
