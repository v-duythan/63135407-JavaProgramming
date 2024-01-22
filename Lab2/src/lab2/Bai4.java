package lab2;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Chọn chức năng: ");

			/*
			 * try { choice = scanner.nextInt(); scanner.nextLine(); // Consume the newline
			 * character } catch (java.util.InputMismatchException e) {
			 * System.out.println("Nhập không hợp lệ. Vui lòng nhập lại.");
			 * scanner.nextLine(); // Consume the invalid input choice = 0; // Reset choice
			 * to an invalid value } catch (java.util.NoSuchElementException e) {
			 * System.out.println("Không có lựa chọn nào được nhập. Vui lòng nhập lại.");
			 * scanner.nextLine(); // Consume the invalid input choice = 0; // Reset choice
			 * to an invalid value }
			 */
            try {
                String input = scanner.nextLine();
                choice = Integer.parseInt(input);

                switch (choice) {
                case 1:
                    Bai1.main(args);
                    break;
                case 2:
                    Bai2.main(args);
                    break;
                case 3:
                    Bai3.main(args);
                    break;
                case 4:
                    System.out.println("Ứng dụng đã kết thúc.");
                    break;
                default:
                    System.out.println("Chọn chức năng không hợp lệ. Vui lòng chọn lại.");
            }
            } catch (NumberFormatException e) {
                System.out.println("Nhập không hợp lệ. Vui lòng nhập lại.");
                choice = 0; // Reset choice to an invalid value
            }
			/*
			 * switch (choice) { case 1: Bai1.main(args); break; case 2: Bai2.main(args);
			 * break; case 3: Bai3.main(args); break; case 4:
			 * System.out.println("Ứng dụng đã kết thúc."); break; default:
			 * System.out.println("Chọn chức năng không hợp lệ. Vui lòng chọn lại."); }
			 */
        } while (choice != 4);

        scanner.close();
    }

}
