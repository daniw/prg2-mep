package easygui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
	
	private Switch gui;
	
	public ButtonListener(Switch gui) {
		this.gui = gui;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == gui.on) {
			gui.state.setText("ON");
		}
		if(e.getSource() == gui.off) {
			gui.state.setText("OFF");
		}
	}

}
