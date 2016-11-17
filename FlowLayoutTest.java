import java.awt.*;

public class FlowLayoutTest
{
	public static void main(String[] arg)
	{
		Frame f = new Frame("Flow 測試");
		// 往左靠滿了就跳下一行，水平間距２０ 垂直間距５
		f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
		for (int i=0; i<10; i++)
		{
			f.add(new Button("按鈕" + i));
		}
		// 設置視窗為最家大小
		f.pack();
		f.setVisible(true);
	}
}