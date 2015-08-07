package control;

import service.GameService;
import ui.JPanelGame;

/**
 * 接受玩家按键事件
 * 控制页面
 * 控制游戏逻辑
 * @author PC
 *
 */
public class GameControl {
/**
 * 游戏界面层
 */
	private JPanelGame panelGame;
	
	/**
	 * 游戏逻辑层
	 */
	private GameService gameService;
	public GameControl(JPanelGame panelGame,GameService gameService){
		this.panelGame=panelGame;
		this.gameService=gameService;
	}
	public void test(){
		//this.gameService.gameTest();
		this.panelGame.repaint();
	}
	public void keyUp() {
		this.gameService.keyUp();
		this.panelGame.repaint();
	}
	public void keyDown() {
		this.gameService.keyDown();
		this.panelGame.repaint();
	}
	public void keyLeft() {
		this.gameService.keyLeft();
		this.panelGame.repaint();
	}
	public void keyRight() {
		this.gameService.keyRight();
		this.panelGame.repaint();
	}
}
