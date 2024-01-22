package lab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Sử dụng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số của phương trình ax + b = 0 từ bàn phím
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        // Kiểm tra giá trị của a và b để giải phương trình
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            // Tính và xuất nghiệm x = -b/a
            double x = -b / a;
            System.out.printf("Nghiệm của phương trình là: %.2f%n", x);
        }

        // Đóng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
    }
}
