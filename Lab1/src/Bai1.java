import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Sử dụng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên từ bàn phím
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();

        // Nhập điểm trung bình từ bàn phím
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();

        // Xuất ra màn hình với định dạng: <<họ và tên>> <<điểm>> điểm
        System.out.printf("%s %.2f điểm.%n", hoTen, diemTB);

        // Đóng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
    }
}
