import java.lang.System ;
import java.util.Scanner ;
import java.awt.Robot ;
import java.awt.event.KeyEvent ;
import java.awt.AWTException ;

public class ScreenShotForMac{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in) ;
		while(true){
			System.out.printf("何かキーを入れてね！\n1で普通のスクショ\n2で範囲を選んでスクショ\n3でウィンドウでスクショ \nendで終了\n") ;
			String str = sc.next() ;
			if (str.equals("end")) {
				sc.close() ;
				break ;
			} else {
				try{
					int i = Integer.parseInt(str) ;
					screenShotKeyEvent(i) ;
				} catch(NumberFormatException e) {
					System.out.println("だらしないプログラムで済まない・・・") ;
				}
			}
		}
	}

	static public void screenShotKeyEvent(int i){
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
			default:
				System.out.println("チッ・・・ハァ〜") ;
				break ;
			}
		} catch (AWTException e){
			System.out.println("ごめん！失敗したわぁ〜") ;
		}
	}

}