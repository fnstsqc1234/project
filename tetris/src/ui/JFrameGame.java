package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import config.ConfigFactory;
import config.GameConfig;

public class JFrameGame extends JFrame {
	public JFrameGame(JPanelGame panelGame){
		//获得游戏配置
				GameConfig cfg=ConfigFactory.getGameConfig();
		//设置标题
		this.setTitle(cfg.getTitle());
		//设置默认关闭属性（程序结束）
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//设置大小
		this.setSize(cfg.getWidth(),cfg.getHeight());
		//不允许用户改变窗口大小
		this.setResizable(false);
		//设置居中
		//this.setLocationRelativeTo(null);
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		Dimension screen=toolkit.getScreenSize();
		int x=(screen.width-this.getWidth()>>1);
		int y=(screen.height-this.getHeight()>>1)-cfg.getWindowUp();
		this.setLocation(x,y);
		//设置默认Panel
		this.setContentPane(panelGame);
		this.setVisible(true);
	}
}


