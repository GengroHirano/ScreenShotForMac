package edu.self;

import java.awt.AWTException;
import java.awt.Container;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame implements ActionListener{

	private JFrame mFrame ;
	private JButton mNomalShot ;
	private JButton mRangeShot ;
	private JButton mWindowShot ;
	
	public MainFrame() {
		mFrame = new JFrame("ScreenShot!!") ;
		mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		mFrame.setSize(300, 60) ;
		
		Container container = mFrame.getContentPane() ;
		JPanel buttonPanel = new JPanel() ;
		
		mNomalShot = new JButton("ふつう") ;
		mNomalShot.addActionListener(this) ;
		
		mRangeShot = new JButton("はんい") ;
		mRangeShot.addActionListener(this) ;
		
		mWindowShot = new JButton("窓ごと") ;
		mWindowShot.addActionListener(this) ;
		
		buttonPanel.add(mNomalShot) ;
		buttonPanel.add(mRangeShot) ;
		buttonPanel.add(mWindowShot) ;
		
		container.add(buttonPanel) ;
		mFrame.setVisible(true) ;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mNomalShot) {
			screenShotKeyEvent(1) ;
		} else if (e.getSource() == mRangeShot) {
			screenShotKeyEvent(2) ;
		} else if (e.getSource() == mWindowShot ) {
			screenShotKeyEvent(3) ;
		}
	}
	
	private void screenShotKeyEvent(int i){
		try{
			Robot robot = new Robot() ;
			robot.delay(300) ;
			switch (i) {
			case 1:
			System.out.println("全画面のスクショを取るぜぇ") ;
			robot.keyPress(KeyEvent.VK_SHIFT) ;
			robot.keyPress(KeyEvent.VK_META) ;
			robot.keyPress(KeyEvent.VK_3) ;

			robot.keyRelease(KeyEvent.VK_SHIFT) ;
			robot.keyRelease(KeyEvent.VK_META) ;
			robot.keyRelease(KeyEvent.VK_3) ;
				break ;
			case 2:
			robot.keyPress(KeyEvent.VK_SHIFT) ;
			robot.keyPress(KeyEvent.VK_META) ;
			robot.keyPress(KeyEvent.VK_4) ;

			robot.keyRelease(KeyEvent.VK_SHIFT) ;
			robot.keyRelease(KeyEvent.VK_META) ;
			robot.keyRelease(KeyEvent.VK_4) ;
				break ;
			case 3:
			robot.keyPress(KeyEvent.VK_SHIFT) ;
			robot.keyPress(KeyEvent.VK_META) ;
			robot.keyPress(KeyEvent.VK_4) ;
			robot.delay(500) ;
			robot.keyPress(KeyEvent.VK_SPACE) ;

			robot.keyRelease(KeyEvent.VK_SHIFT) ;
			robot.keyRelease(KeyEvent.VK_META) ;
			robot.keyRelease(KeyEvent.VK_4) ;
			robot.keyRelease(KeyEvent.VK_SPACE) ;
				break ;
			}
		} catch (AWTException e){
			System.out.println("ごめん！失敗したわぁ〜") ;
		}
	}


}
