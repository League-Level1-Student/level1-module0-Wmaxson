/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Button;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class tributtons implements ActionListener {
	
	public static void main(String[] args) {
		new tributtons().createUI();
	}
	
	JButton lB = new JButton();
	JButton rB = new JButton();
	JButton mB = new JButton();
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	
	JFrame C3P0 = new JFrame();
	JPanel R2D2 = new JPanel();

	private void createUI() {
		boolean yep = true; 
		// 1. Add the panel to the frame
		C3P0.add(R2D2);
		// 2. Make the frame visible
		C3P0.setVisible(yep);
		// 3. Set the text of the leftButton to "Click me!"
		lB.setText("Click me");
		// 4. Set the text of the rightButton to "Click me!"
		rB.setText("Click me");
		mB.setText("Click me");
		// 5. Add an action listener to the leftButton
		lB.addActionListener(this);
		// 6. Add an action listener to the rightButton
		rB.addActionListener(this);
		mB.addActionListener(this);
		// 7. Add the leftButton to the panel
		R2D2.add(lB);
		// 8. Add the rightButton to the panel
		R2D2.add(rB);
		R2D2.add(mB);
		// 9. Pack the frame
		C3P0.pack();
		// 10. Set the title of the frame to "Demanding Buttons"

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		
		/* If the buttonPressed was the leftButton....*/
			// Set the text of the rightButton to "No, click Me!"
			// Set The PREFERRED size of the rightButton to BIG
			// Set The text of the leftButton to "Click Me!"
			// Set the PREFERRED size of the leftButton to SMALL
		if (buttonPressed == lB) {
			Random randy = new Random();
			int randomNumb = randy.nextInt((1001)+25);
			JOptionPane.showMessageDialog(null, randomNumb);
			
		}
		if (buttonPressed == rB) {
			String oofgang = JOptionPane.showInputDialog("gimmi some numbers");
			String oof = JOptionPane.showInputDialog("gimmi some numbers");
			int oofergang = Integer.parseInt(oofgang);
			int oofer = Integer.parseInt(oof);
			JOptionPane.showMessageDialog(null,	oofer + oofergang);
		}
		if (buttonPressed == mB) {
			String name = JOptionPane.showInputDialog("gimmi ur naame ");
			JOptionPane.showMessageDialog(null, "hi ,  " + name + " xd lol OMFlippinG l hyd today. ");
		}
		/* If the buttonPressed was the rightButton, do the opposite. */
		

		C3P0.pack();
	}
}


