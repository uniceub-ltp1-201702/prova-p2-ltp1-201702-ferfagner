package View;

import javax.swing.JOptionPane;

public class ViewDifencaEUA {
	
	public ViewDifencaEUA (String diferenca){
		if (diferenca != "") {
			JOptionPane.showMessageDialog(null, diferenca);
		} else {
			JOptionPane.showMessageDialog(null, "País não encontrado");
		}
		
	}
}
