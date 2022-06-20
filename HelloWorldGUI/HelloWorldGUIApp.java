import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
public class HelloWorldGUIApp{
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
//	GUI윈도 상단바의 이름
				JFrame frame = new JFrame("HelloWorld GUI");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// setPreferredSize GUI윈도우 사이즈
				frame.setPreferredSize(new Dimension(1000, 300));
// Hello world를 출력하며 SwingConstants로 보여지는 윈도우내 포지셔닝
				JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER);
				frame.getContentPane().add(label);
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
// setLocation은 실행되었을때 GUI윈도우가 표시되는 좌표
				frame.setLocation(dim.width/2-400/2, dim.height/2-300/2 );
				
				frame.pack();
//	true로 해야지만 보여
				frame.setVisible(true);
				
			}
			
		});
	}
}