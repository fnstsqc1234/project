package ui;
import java.awt.*;

import javax.swing.ImageIcon;
public class LayerLevel extends Layer{
	private static Image IMG_LV=new ImageIcon("graphics/string/level.png").getImage();
public LayerLevel(int x,int y,int w,int h){
	super(x,y,w,h);
}
public void paint(Graphics g){
	this.creatWindow(g);
	g.drawImage(IMG_LV,this.x+4*PANDDING,this.y+PANDDING,null);
}
}