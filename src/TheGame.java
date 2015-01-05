import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class TheGame {
	static JTextField text = new JTextField(10);
	
	private static int randomNumber(int start, int end) {
		int num = (int)(start + Math.random() * (end - start + 1));
		return num;
	}
	
	public static class MouseButtonHandler implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			if (((Component) e.getSource()).getName().equals("MORE")) {
				text.setText("" + randomNumber(Integer.parseInt(""+ text), 10000));
			}
			if (((Component) e.getSource()).getName().equals("LESS")) {
			
			}
			if (((Component) e.getSource()).getName().equals("TRUE")) {
				JOptionPane.showMessageDialog(null,"You are right!");
				System.exit(0);
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
	
	public static void main(String[] args) {
		MouseButtonHandler morelistener = new MouseButtonHandler();
		MouseButtonHandler lesslistener = new MouseButtonHandler();
		MouseButtonHandler truthlistener = new MouseButtonHandler();
		
		JPanel panel = new JPanel();
		
		JButton more = new JButton("MORE");
		JButton truth = new JButton("TRUE");
		JButton less = new JButton("LESS");
		
		more.addMouseListener(morelistener);
		truth.addMouseListener(truthlistener);
		less.addMouseListener(lesslistener);
		
		JLabel textField = new JLabel("Is your number: \n");
		panel.add(textField);
		
		text.setText("" + randomNumber(1, 10000));
		panel.add(text);
		
		
		panel.add(more);
		panel.add(truth);
		panel.add(less);
		
		JFrame window = new JFrame("Guess!!!");
		window.setContentPane(panel);
		window.setSize(500, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
	}
	
	
}
