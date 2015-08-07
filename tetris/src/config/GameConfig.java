package config;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class GameConfig {
	/**
	 * ���ڿ��
	 */
private int width;
/**
 * ���ڸ߶�
 */
private int height;
/**
 * �߿��ڱ߾�
 */
private int padding;
/**
 * 
 */
private int windowSize;
/**
 * ����
 */
private String title;

/**
 * ���ڰθ�
 */
private int windowUp;
private List<LayerConfig> layersConfig=new ArrayList<LayerConfig>();
/**
 * ���캯��
 * ��ȡXML�ļ�����ȡȫ����Ϸ����
 * @throws Exception
 */
public GameConfig() throws Exception{
	//����XML��ȡ��
	SAXReader reader=new SAXReader();
	//��ȡXML�ļ�
	Document doc=reader.read("config/cfg.xml");
	//��ø��ڵ�
	Element game=doc.getRootElement();
	Element frame=game.element("frame");
	//���ô��ڲ���
	this.setUiConfig(game.element("frame"));
	//����ϵͳ����
	this.setSystemConfig(game.element("frame"));
	//�������ݲ���
	this.setDataConfig(game.element("frame"));
	
}
/**
 * ���ô��ڲ���
 * @param frame
 */
private void setUiConfig(Element frame){
	//��ȡ���ڿ��
	this.width=Integer.parseInt(frame.attributeValue("width"));
	//��ȡ���ڸ߶�
	this.height=Integer.parseInt(frame.attributeValue("height"));
	//��ȡ�߿��ڱ߾�
	this.padding=Integer.parseInt(frame.attributeValue("padding"));
	//��ȡ�߿��ϸ
	this.windowSize=Integer.parseInt(frame.attributeValue("windowSize"));
	//��ȡ����
	this.title=frame.attributeValue("title");
	//��ȡ���ڰθ�
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
 * ����ϵͳ����
 * @param frame
 */
private void setSystemConfig(Element frame){
	
}
/**
 * �������ݲ���
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
