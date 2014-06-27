package easygui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;

public class Switch extends Frame {
	
	Label state = new Label("OFF");
	Button on = new Button("on");
	Button off = new Button("off");
	
	public Switch() {
		
		add(on, BorderLayout.NORTH);
		add(state, BorderLayout.CENTER);
		add(off, BorderLayout.SOUTH);
		
		ButtonListener b1 = new ButtonListener(this);
		on.addActionListener(b1);
		off.addActionListener(b1);
		
		setVisible(true);
	}
}
