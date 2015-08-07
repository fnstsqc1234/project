package entity;

import java.awt.Point;

public class GameAct {
 private Point[] actPoints;
 private static int MIN_X=0;
 private static int MAX_X=9;
 private static int MIN_Y=0;
 private static int MAX_Y=17;
 public GameAct(){
	 actPoints=new Point[]{
			 new Point(4,0),
			 new Point(3,0),
			 new Point(5,0),
			 new Point(5,1)
	 };
 }
 public Point[] getActPoint(){
	 return actPoints;
 }

// public void move(int moveX,int moveY){
//	 //边界判定
//	 
//	 //移动处理
//	 for(int i=0;i<actPoints.length;i++){
//		 actPoints[i].x+=moveX;
//		 actPoints[i].y+=moveY;
//	 }
// }
 /**
  * 方块移动
  * @param moveX X轴偏移量
  * @param moveY Y轴偏移量
  * @return
  */
 public void move(int moveX,int moveY){
	//移动处理
		for(int i=0;i<actPoints.length;i++){
			int newX=actPoints[i].x+moveX;
			int newY=actPoints[i].y+moveY;
			if(this.isOverMap(newX, newY))
			{
				return;
			}
		}
		for(int i=0;i<actPoints.length;i++){
			actPoints[i].x+=moveX;
			actPoints[i].y+=moveY;
		}
		return;
	 
	}
 
 /**
  * 方块旋转
  * 顺时针
  * 
  */
 public void round(){
	for(int i=0;i<actPoints.length;i++){
		  int	newX=actPoints[0].y+actPoints[0].x-actPoints[i].y;
		int newY=actPoints[0].y-actPoints[0].x+actPoints[i].x;
		if(this.isOverMap(newX, newY)){
			return;
		}
	}
	for(int i=1;i<actPoints.length;i++){
		int temp =actPoints[i].x;
		actPoints[i].x=actPoints[0].y+actPoints[0].x-actPoints[i].y;
		actPoints[i].y=actPoints[0].y-actPoints[0].x+temp;
	
	}
	return;
 }
 private boolean isOverMap(int x,int y){
		return x<0||x>9||y<0||y>17;
	}
}
