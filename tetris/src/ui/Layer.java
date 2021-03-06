package ui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

import config.ConfigFactory;
import config.GameConfig;
import dto.GameDto;

/**
 * 绘制窗口
 * @author PC
 *
 */

public abstract  class Layer {
	protected static final int PANDDING;
	private static final int SIZE;
	static{
		//获得游戏配置
				GameConfig cfg=ConfigFactory.getGameConfig();
				PANDDING=cfg.getPadding();
				SIZE=cfg.getWindowSize();
	}
	
	//获得游戏配置
			GameConfig cfg=ConfigFactory.getGameConfig();
	private static  Image WINDOW_IMG=new ImageIcon("graphics/window/Window.png").getImage();//创建image对象
	private static final int WINDOW_W=WINDOW_IMG.getWidth(null);
	private static final int WINDOW_H=WINDOW_IMG.getHeight(null);
	/**
	 * 窗口左上角x坐标
	 */
	protected int x;
/**
 * 窗口左上角y坐标
 */
	protected int y;
/**
 * 窗口宽度
 */
	protected int w;
/**
 * 窗口高度
 */
	protected int h;
	/**
	 * 游戏数据
	 */
	protected GameDto dto;
	protected Layer(int x,int y,int w,int h){
	this.x=x;
	this.y=y;
	this.w=w;
	this.h=h;
}
protected void creatWindow(Graphics g){
	//左上
			g.drawImage(WINDOW_IMG, x, y,x+SIZE, y+SIZE, 0, 0, SIZE, SIZE, null);
			//中上
			g.drawImage(WINDOW_IMG,x+SIZE, y, x+w-SIZE, y+SIZE,  SIZE, 0,WINDOW_W-SIZE, SIZE, null);
			//右上
			g.drawImage(WINDOW_IMG, x+w-SIZE, y,x+w,y+SIZE , WINDOW_W-SIZE, 0, WINDOW_W, SIZE, null);
			//左中
			g.drawImage(WINDOW_IMG, x, y+SIZE, x+SIZE,y+h-SIZE , 0, SIZE, SIZE, WINDOW_H-SIZE,null);
			//中
			g.drawImage(WINDOW_IMG, x+SIZE, y+SIZE, x+w-SIZE, y+h-SIZE, SIZE, SIZE, WINDOW_W-SIZE, WINDOW_H-SIZE, null);
			//右中
			g.drawImage(WINDOW_IMG, x+w-SIZE, y+SIZE, x+w, y+h-SIZE, WINDOW_W-SIZE, SIZE, WINDOW_W, WINDOW_H-SIZE, null);
			//左下
			g.drawImage(WINDOW_IMG, x, y+h-SIZE, x+SIZE, y+h, 0, WINDOW_H-SIZE, SIZE, WINDOW_H, null);
			//中下
			g.drawImage(WINDOW_IMG, x+SIZE, y+h-SIZE, x+w-SIZE, y+h, SIZE, WINDOW_H-SIZE, WINDOW_W-SIZE, WINDOW_H, null);
			//右下
			g.drawImage(WINDOW_IMG, x+w-SIZE, y+h-SIZE, x+w, y+h, WINDOW_W-SIZE, WINDOW_H-SIZE, WINDOW_W, WINDOW_H, null);
}
 public  abstract void paint(Graphics g);
public void setDto(GameDto dto) {
	this.dto = dto;
}
 
}

