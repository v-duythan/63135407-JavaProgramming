package vdthan.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JPasswordField txtPW;

	public Login() {
		setTitle("ĐĂNG NHẬP HỆ THỐNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 507, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(40, 30, 124, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu: ");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(40, 81, 124, 29);
		contentPane.add(lblMtKhu);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtName.setBounds(206, 30, 204, 31);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPW = new JPasswordField();
		txtPW.setBounds(206, 81, 204, 31);
		contentPane.add(txtPW);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLY();
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(129, 138, 178, 46);
		contentPane.add(btnDangNhap);
	}
	void HamXuLY() {
		String name = txtName.getText();
		String PW = txtPW.getText();
		
		if (name.equals("63CNTT") && (PW.equals("123"))){
			MainFrame home = new MainFrame();
			home.setVisible(true);
			this.setVisible(false);
		} else {
			txtName.setText("");
			txtPW.setText("");
			
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại. ");
		}
	}
}
