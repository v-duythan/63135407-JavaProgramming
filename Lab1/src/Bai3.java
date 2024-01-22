import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        // Sử dụng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập cạnh của khối lập phương từ bàn phím
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();

        // Tính thể tích của khối lập phương
        double theTich = Math.pow(canh, 3);

        // Xuất ra màn hình
        System.out.printf("Thể tích của khối lập phương là %.2f%n", theTich);

        // Đóng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
    }
}
