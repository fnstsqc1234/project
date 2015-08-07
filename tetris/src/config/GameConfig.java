package config;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class GameConfig {
	/**
	 * 窗口宽度
	 */
private int width;
/**
 * 窗口高度
 */
private int height;
/**
 * 边框内边距
 */
private int padding;
/**
 * 
 */
private int windowSize;
/**
 * 标题
 */
private String title;

/**
 * 窗口拔高
 */
private int windowUp;
private List<LayerConfig> layersConfig=new ArrayList<LayerConfig>();
/**
 * 构造函数
 * 读取XML文件，获取全部游戏设置
 * @throws Exception
 */
public GameConfig() throws Exception{
	//创建XML读取器
	SAXReader reader=new SAXReader();
	//读取XML文件
	Document doc=reader.read("config/cfg.xml");
	//获得根节点
	Element game=doc.getRootElement();
	Element frame=game.element("frame");
	//配置窗口参数
	this.setUiConfig(game.element("frame"));
	//配置系统参数
	this.setSystemConfig(game.element("frame"));
	//配置数据参数
	this.setDataConfig(game.element("frame"));
	
}
/**
 * 配置窗口参数
 * @param frame
 */
private void setUiConfig(Element frame){
	//获取窗口宽度
	this.width=Integer.parseInt(frame.attributeValue("width"));
	//获取窗口高度
	this.height=Integer.parseInt(frame.attributeValue("height"));
	//获取边框内边距
	this.padding=Integer.parseInt(frame.attributeValue("padding"));
	//获取边框粗细
	this.windowSize=Integer.parseInt(frame.attributeValue("windowSize"));
	//获取标题
	this.title=frame.attributeValue("title");
	//获取窗口拔高
	this.windowUp=Integer.parseInt(frame.attributeValue("windowUp"));
	List<Element> layers=frame.elements("layer");
	for(Element layer:layers){
		LayerConfig lc=new LayerConfig(
				layer.attributeValue("className"),
				Integer.parseInt(layer.attributeValue("x")),
				Integer.parseInt(layer.attributeValue("y")),
				Integer.parseInt(layer.attributeValue("w")),
				Integer.parseInt(layer.attributeValue("h"))
				);
	    layersConfig.add(lc);
	}
}
/**
 * 配置系统参数
 * @param frame
 */
private void setSystemConfig(Element frame){
	
}
/**
 * 配置数据参数
 * @param frame
 */
private void setDataConfig(Element frame){
	
}
public int getWidth() {
	return width;
}
public int getHeight() {
	return height;
}
public int getPadding() {
	return padding;
}
public int getWindowSize() {
	return windowSize;
}
public String getTitle() {
	return title;
}
public int getWindowUp() {
	return windowUp;
}
public List<LayerConfig> getLayersConfig() {
	return layersConfig;
}


}
