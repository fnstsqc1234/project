package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class LayerBackground extends Layer {
	private static Image IMG_BG=new ImageIcon("graphics/background/Sea.jpg").getImage();
	public LayerBackground(int x,int y,int w,int h){
		super(x,y,w,h);
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
g.drawImage(IMG_BG, 0, 0, 1162,654,null);
	}

}
