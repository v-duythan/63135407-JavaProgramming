import java.util.Scanner;

public class Bai4 {
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

        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Kiểm tra nếu delta âm thì căn delta không thực hiện được
        if (delta < 0) {
            System.out.println("Phương trình không có nghiệm thực.");
        } else {
            // Tính căn delta và xuất ra màn hình
            double canDelta = Math.sqrt(delta);
            System.out.printf("Căn delta của phương trình là %.2f%n", canDelta);
        }

        // Đóng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
    }
}
