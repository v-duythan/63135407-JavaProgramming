package lab2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        // Sử dụng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập số điện sử dụng của tháng từ bàn phím
        System.out.print("Nhập số điện sử dụng của tháng: ");
        int soDien = scanner.nextInt();

        // Tính tiền điện theo phương pháp lũy tiến
        int giaDuoi50 = 1000;
        int giaTren50 = 1200;

        int tien;
        if (soDien <= 50) {
            // Nếu số điện sử dụng <= 50, giá là 1000 đồng/số điện
            tien = soDien * giaDuoi50;
        } else {
            // Nếu số điện sử dụng > 50, tính giá lũy tiến
            tien = 50 * giaDuoi50 + (soDien - 50) * giaTren50;
        }

        // Xuất ra màn hình
        System.out.printf("Tiền điện là: %d đồng%n", tien);

        // Đóng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
    }
}
