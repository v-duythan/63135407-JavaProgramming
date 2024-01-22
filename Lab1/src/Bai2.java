import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        // Sử dụng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng của hình chữ nhật từ bàn phím
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        // Tính chu vi, diện tích và cạnh nhỏ của hình chữ nhật
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);

        // Xuất ra màn hình
        System.out.printf("Chu vi: %.2f%n", chuVi);
        System.out.printf("Diện tích: %.2f%n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.2f%n", canhNhoNhat);

        // Đóng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
    }
}
