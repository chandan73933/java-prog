import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code=Key width=600 height=500>
</applet>*/
public class Key extends Applet implements KeyListener
{
	int X=40,Y=40;
	String msg="KEY EVENTS";
	public void init()
	{
		setBackground(Color.black);
		setBackground(Color.white);
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke){
		msg="KEY PRESSED";
		setBackground(Color.white);
		showStatus("KeyPressed");
		repaint();
	}
	public void keyRelesed(KeyEvent ke){
		msg="KEY RELESED";
		setBackground(Color.white);
		showStatus("KeyRelesed");
		repaint();
	}
	public void keyTyped(KeyEvent ke){
		msg="KEY TYPED";
		msg+=ke.getKeyChar();
		setBackground(Color.white);
		showStatus("KeyTyped");
		repaint();
	}
	public void paint(Graphics gr){
		gr.drawString(msg,X,Y);
	}
} 















