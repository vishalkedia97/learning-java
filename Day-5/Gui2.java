import java.awt.JOptionLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui2 extends JFrame{
	private JLabel item1;
	public Gui2{
		super ("The Title Bar");
		setLayout(new flowLayout());
		item1 =new JLabel("This is a sentence");
		item.setToolTipText("this is gonna show up an hover");
		add(item1);


	}
	



}