package converter;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;


	public class FC implements ActionListener {
		
		public static void main(String[] args) {
			new FC().createUI();
		}
		
		JButton rB = new JButton();
		JTextField text = new JTextField(4);
		Dimension BIG = new Dimension(400,400);
		Dimension SMALL = new Dimension(200,200);
		
		JFrame C3P0 = new JFrame();
		JPanel R2D2 = new JPanel();
		JLabel Bowl = new JLabel();
		private void createUI() {
			boolean yep = true; 
			// 1. Add the panel to the frame
			C3P0.add(R2D2);
			// 2. Make the frame visible
			C3P0.setVisible(yep);
			// 4. Set the text of the rightButton to "Click me!"
			rB.setText("Convert");
			// 6. Add an action listener to the rightButton
			rB.addActionListener(this);
			Bowl.setText("degrees fahrenheit = " + 0);
			// 8. Add the rightButton to the panel
			R2D2.add(text);
			R2D2.add(rB);
			R2D2.add(Bowl);
			
			// 9. Pack the frame
			C3P0.pack();
			

	}

		@Override
		public void actionPerformed(ActionEvent e) {
			String textt = text.getText();
			int texttt = Integer.parseInt(textt);
			int xport = (5/9) * texttt - 32; 
			Bowl.setText("degrees fahrenheit = " + xport);
			C3P0.pack();
			
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	



