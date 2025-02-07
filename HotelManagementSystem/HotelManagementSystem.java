package HotelManagementSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HotelManagementSystem extends JFrame implements ActionListener {

	HotelManagementSystem() {
		setBounds(300, 130, 900, 600);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("HotelManagementSystem/icons/first.jpg"));
		JLabel l1 = new JLabel(i1);
		l1.setBounds(0, 0, 900, 600);
		add(l1);

		JLabel l2 = new JLabel("Hotel Management System");
		l2.setBounds(10, 20, 1000, 70);
		l2.setFont(new Font("serif", Font.PLAIN, 60));
		l2.setForeground(Color.red);
		l1.add(l2);

		JButton b1 = new JButton("Enter");
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		b1.setBounds(360, 250, 180, 50);
		b1.addActionListener(this);
		l1.add(b1);

		setLayout(null);
		setVisible(true);

		// Use a Swing Timer for the blinking effect
		Timer timer = new Timer(500, e -> {
			l2.setVisible(!l2.isVisible());
		});
		timer.start();
	}

	public void actionPerformed(ActionEvent ae) {
		SwingUtilities.invokeLater(() -> new Login().setVisible(true));
		this.setVisible(false);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new HotelManagementSystem());
	}
}