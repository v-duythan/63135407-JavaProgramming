package lab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        // Sử dụng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số của phương trình ax^2 + bx + c = 0 từ bàn phím
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Kiểm tra giá trị của a để giải phương trình
        if (a == 0) {
            // Nếu a = 0, giải phương trình bậc nhất
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                // Tính và xuất nghiệm x = -c/b
                double x = -c / b;
                System.out.printf("Nghiệm của phương trình là: %.2f%n", x);
            }
        } else {
            // Tính delta
            double delta = b * b - 4 * a * c;

            // Biện luận theo delta
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                // Tính và xuất nghiệm kép x = -b/(2*a)
                double x = -b / (2 * a);
                System.out.printf("Nghiệm kép của phương trình là: %.2f%n", x);
            } else {
                // Tính và xuất 2 nghiệm phân biệt
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Nghiệm thứ nhất của phương trình là: %.2f%n", x1);
                System.out.printf("Nghiệm thứ hai của phương trình là: %.2f%n", x2);
            }
        }

        // Đóng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
    }
}
