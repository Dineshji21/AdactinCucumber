package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class demorobot {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		Runtime.getRuntime().exec("Notepad");
		Robot r=new Robot();
        Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_Y);
		r.keyPress(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		

	}

}
