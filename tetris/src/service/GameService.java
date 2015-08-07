package service;

import java.awt.Point;

import dto.GameDto;
import entity.GameAct;

public class GameService {
private GameDto dto;
public GameService(GameDto dto){
	this.dto=dto;
	GameAct act=new GameAct();
	dto.setGameAct(act);
}
//public void gameTest() {
//	int temp=dto.getNowPoint();
//	dto.setNowPoint(temp+1);
//}
public void keyUp() {
this.dto.getGameAct().round();
}
public void keyDown() {
	this.dto.getGameAct().move(0, 1);
}
public void keyLeft() {
this.dto.getGameAct().move(-1, 0);	
}
public void keyRight() {
this.dto.getGameAct().move(1, 0);
}
}
