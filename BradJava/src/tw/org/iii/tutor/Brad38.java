package tw.org.iii.tutor;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Brad38 extends JFrame implements MouseListener{
	private JTextField mesg, mesg2;
	
	public Brad38() {
		
		setLayout(new BorderLayout());
		mesg = new JTextField();
		add(mesg,BorderLayout.NORTH);
		
		mesg2 = new JTextField();
		add(mesg2,BorderLayout.SOUTH);
		
		addMouseListener(new MyMouseListener(this));
		addMouseListener(this);
		addMouseListener(new MyMouseListenerV3());
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			
			}
		});
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void setMesgText(String mesgText) {
		mesg.setText(mesgText);
	}
	public static void main(String[] args) {
		new Brad38();

	}

	class MyMouseListenerV3 extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			mesg.setText("");
			
		}
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Pressed2");
		mesg2.setText(e.getX() + "," + e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
class MyMouseListener implements MouseListener{
	private Brad38 brad38;
	
	public MyMouseListener(Brad38 b38) {
		brad38 = b38;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	//	System.out.println("Clicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	System.out.println("Pressed1");
		brad38.setMesgText(e.getX() + "," + e.getY());
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	//	System.out.println("Released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
	
		
	}
	
}

class MyListeners extends MouseAdapter{
	
	public void mousePressed(MouseEvent e) {
		
	}
}