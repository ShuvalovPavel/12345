package lu.uni.lassy.excalibur.examples.icrash.dev.view.gui.admin;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class AdminCaptchaGUI extends JFrame
{
	private static final long serialVersionUID = 1L;
	private final Random ran = new Random();
	private int step = 0;
	private String captchaCode = "";
	
	
	
	public AdminCaptchaGUI()
	{
		 this.setLayout(null);
		 this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setVisible(false);
		 
	     setBounds(0, 0, 300, 300);
	     repaint();
	}

	public void paint(Graphics g)
	{
		super.paintComponents(g);
		
		Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 5; i++) {
        	
        	int fontSize = (ran.nextInt(30) + 10);
            Font f = new Font("Comic Sans MS", Font.BOLD, fontSize);
            g2.setFont(f);
            g2.drawString(genCaptchaLetter(), 130 + step, 130);
            step += 30;
        }
        step = 0;
	}
	
	public String getCaptchaString() {
		return captchaCode;
	}
	
	private String genCaptchaLetter() {
		
		String captcha = "";
		captcha += (char) (ran.nextInt(26) + 'a');
		captchaCode += captcha;
		return captcha;
	}
	
}