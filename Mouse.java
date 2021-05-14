import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code=Mouse width=600 height=500>
</applet>*/
public class Mouse extends Applet implements MouseListener,MouseMotionListener
{
	int X=30,Y=30;
	String msg="MOUSE EVENTS";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.black);
		setBackground(Color.white);
	}
	public void mouseEntered(MouseEvent me){
		msg="MOUSE ENTERED";
		setBackground(Color.white);
		showStatus("Mouse Entered");
		repaint();
	}
	public void mouseExited(MouseEvent me){
		msg="MOUSE EXITED";
		setBackground(Color.red);
		showStatus("Mouse Exited");
		repaint();
	}
	public void mousePressed(MouseEvent me){
		msg="MOUSE PRESSED";
		setBackground(Color.yellow);
		showStatus("Mouse Pressed");
		repaint();
	}
	public void mouseReleased(MouseEvent me){
		msg="MOUSE RELEASED";
		setBackground(Color.orange);
		showStatus("Mouse Released");
		repaint();
	}
	public void mouseMoved(MouseEvent me){
		msg="MOUSE MOVED";
		X=me.getX();
		Y=me.getX();
		setBackground(Color.blue);
		showStatus("Mouse Moved");
		repaint();
	}
	public void mouseDragged(MouseEvent me){
		msg="MOUSE DRAGGED";
		setBackground(Color.pink);
		showStatus("Mouse Dragged at("+me.getX()+","+me.getY()+")");
		repaint();
	}
	public void mouseClicked(MouseEvent me){
		msg="MOUSE CLICKED";
		setBackground(Color.green);
		showStatus("Mouse Clicked");
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg,X,Y);
	}
}