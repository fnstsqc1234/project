package ui;
import java.awt.*;
import javax.swing.ImageIcon;
public class LayerDateBase extends Layer{
	private static Image IMG_DB=new ImageIcon("graphics/string/db.png").getImage();
public LayerDateBase(int x,int y,int w,int h){
	super(x,y,w,h);
	
}
public void paint(Graphics g){
	this.creatWindow(g);
	g.drawImage(IMG_DB,this.x+PANDDING,this.y+PANDDING,null);
}
}


















