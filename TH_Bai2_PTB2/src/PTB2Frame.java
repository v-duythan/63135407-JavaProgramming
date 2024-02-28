import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PTB2Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;

	public PTB2Frame() {
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1065, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ax2 + bx + c = 0");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(119, 34, 174, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập a: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(35, 73, 75, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nhập b: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(35, 116, 75, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nhập c: ");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(35, 159, 75, 32);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("KẾT QUẢ: ");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_2.setBounds(35, 259, 97, 32);
		contentPane.add(lblNewLabel_1_1_2);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(119, 73, 125, 32);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(119, 116, 125, 32);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(119, 159, 125, 32);
		contentPane.add(txtC);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setColumns(10);
		txtKQ.setBounds(119, 259, 726, 56);
		contentPane.add(txtKQ);
		
		JButton btnTinh = new JButton("TÍNH");
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLy();
			}
		});
		btnTinh.setBounds(119, 202, 125, 46);
		contentPane.add(btnTinh);
	}
	void HamXuLy() {
	    try {
	        String str_soA = txtA.getText();
	        String str_soB = txtB.getText();
	        String str_soC = txtC.getText();

	        double soA = Double.parseDouble(str_soA);
	        double soB = Double.parseDouble(str_soB);
	        double soC = Double.parseDouble(str_soC);

	        double delta = soB * soB - 4 * soA * soC;

	        if (delta < 0) {
	            txtKQ.setText("Phương trình không có nghiệm thực.");
	        } else if (delta == 0) {
	            double x = -soB / (2 * soA);
	            txtKQ.setText("Phương trình có nghiệm kép x = " + x);
	        } else {
	            double x1 = (-soB + Math.sqrt(delta)) / (2 * soA);
	            double x2 = (-soB - Math.sqrt(delta)) / (2 * soA);
	            txtKQ.setText("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
	        }
	    } catch (NumberFormatException ex) {
	    	JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Lỗi. ");
	    }
	}

}
