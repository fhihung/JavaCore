package EX41;

import java.util.Arrays;
import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] ten = {};
        int[] tuoi = {};
        float[] diem = {};

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            String info = sc.nextLine();
            String[] thongTin = info.split(" ");
            students[i] = new Student(thongTin[0], Integer.valueOf(thongTin[1]), Float.valueOf(thongTin[2]));
        }

        Arrays.sort(diem);
        for (int i = 0; i < tuoi.length; i++) {
            System.out.println(students[i].tuoi);
        }
        System.out.println("Danh sách sinh viên theo điểm tăng dần:");
        for (Student st : students) {
            System.out.println("Tên: " + st.getTen() + " Tuổi: " + st.getTuoi() + " Điểm: " + st.getDiem());
        }
    }
}
