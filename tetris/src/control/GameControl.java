package control;

import service.GameService;
import ui.JPanelGame;

/**
 * ������Ұ����¼�
 * ����ҳ��
 * ������Ϸ�߼�
 * @author PC
 *
 */
public class GameControl {
/**
 * ��Ϸ�����
 */
	private JPanelGame panelGame;
	
	/**
	 * ��Ϸ�߼���
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
