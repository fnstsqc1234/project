package ui;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
public class LayerGame extends Layer{
	private final int ACT_SIZE=32;
	private static  Image ACT=new ImageIcon("graphics/game/rect.png").getImage();//创建image对象
public LayerGame(int x,int y,int w,int h){
	super(x,y,w,h);
}
public void paint(Graphics g){
	this.creatWindow(g);
	Point[] points=this.dto.getGameAct().getActPoint();
	for(int i=0;i<points.length;i++){
		g.drawImage(ACT, 
				this.x+points[i].x*ACT_SIZE+7,
				this.y+points[i].y*ACT_SIZE+7,
				this.x+points[i].x*ACT_SIZE+ACT_SIZE+7,
				this.y+points[i].y*ACT_SIZE+ACT_SIZE+7,
				32, 0, 64, 32, null);
	}
	
	/*g.setFont(new Font("黑体",Font.BOLD,64));
	String temp = Integer.toString(this.dto.getNowPoint());
	g.drawString(temp,this.x+PANDDING, this.y+PANDDING+64);
	*/
}
}
