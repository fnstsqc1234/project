package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import config.ConfigFactory;
import config.GameConfig;
import dto.GameDto;

/**
 * ���ƴ���
 * @author PC
 *
 */

public abstract  class Layer {
	protected static final int PANDDING;
	private static final int SIZE;
	static{
		//�����Ϸ����
				GameConfig cfg=ConfigFactory.getGameConfig();
				PANDDING=cfg.getPadding();
				SIZE=cfg.getWindowSize();
	}
	
	//�����Ϸ����
			GameConfig cfg=ConfigFactory.getGameConfig();
	private static  Image WINDOW_IMG=new ImageIcon("graphics/window/Window.png").getImage();//����image����
	private static final int WINDOW_W=WINDOW_IMG.getWidth(null);
	private static final int WINDOW_H=WINDOW_IMG.getHeight(null);
	/**
	 * �������Ͻ�x����
	 */
	protected int x;
/**
 * �������Ͻ�y����
 */
	protected int y;
/**
 * ���ڿ��
 */
	protected int w;
/**
 * ���ڸ߶�
 */
	protected int h;
	/**
	 * ��Ϸ����
	 */
	protected GameDto dto;
	protected Layer(int x,int y,int w,int h){
	this.x=x;
	this.y=y;
	this.w=w;
	this.h=h;
}
protected void creatWindow(Graphics g){
	//����
			g.drawImage(WINDOW_IMG, x, y,x+SIZE, y+SIZE, 0, 0, SIZE, SIZE, null);
			//����
			g.drawImage(WINDOW_IMG,x+SIZE, y, x+w-SIZE, y+SIZE,  SIZE, 0,WINDOW_W-SIZE, SIZE, null);
			//����
			g.drawImage(WINDOW_IMG, x+w-SIZE, y,x+w,y+SIZE , WINDOW_W-SIZE, 0, WINDOW_W, SIZE, null);
			//����
			g.drawImage(WINDOW_IMG, x, y+SIZE, x+SIZE,y+h-SIZE , 0, SIZE, SIZE, WINDOW_H-SIZE,null);
			//��
			g.drawImage(WINDOW_IMG, x+SIZE, y+SIZE, x+w-SIZE, y+h-SIZE, SIZE, SIZE, WINDOW_W-SIZE, WINDOW_H-SIZE, null);
			//����
			g.drawImage(WINDOW_IMG, x+w-SIZE, y+SIZE, x+w, y+h-SIZE, WINDOW_W-SIZE, SIZE, WINDOW_W, WINDOW_H-SIZE, null);
			//����
			g.drawImage(WINDOW_IMG, x, y+h-SIZE, x+SIZE, y+h, 0, WINDOW_H-SIZE, SIZE, WINDOW_H, null);
			//����
			g.drawImage(WINDOW_IMG, x+SIZE, y+h-SIZE, x+w-SIZE, y+h, SIZE, WINDOW_H-SIZE, WINDOW_W-SIZE, WINDOW_H, null);
			//����
			g.drawImage(WINDOW_IMG, x+w-SIZE, y+h-SIZE, x+w, y+h, WINDOW_W-SIZE, WINDOW_H-SIZE, WINDOW_W, WINDOW_H, null);
}
 public  abstract void paint(Graphics g);
public void setDto(GameDto dto) {
	this.dto = dto;
}
 
}

