package tw.org.iii.classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private BufferedImage ball0;
	private int  ballW, ballH;

	private HashSet<BallTask> balls;
	private Timer timer;
	private int viewW , viewH;

	public MyPanel() {
		setBackground(Color.YELLOW);

		balls = new HashSet<>();
		timer = new Timer();

		try {
			ball0 = ImageIO.read(new File("dir1/ball0.png"));
			ballW = ball0.getWidth();
			ballH = ball0.getHeight();
		} catch (IOException e) {
			e.printStackTrace();
		}
		addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { // 改變球的位子 按會產生球
				createBall(e.getX(), e.getY());

			}
		});

		timer.schedule(new refreshTask(), 0, 16); // 60 fps
	}

	private void createBall(int x, int y) {    //x,y是點球的位子
		BallTask ball = new BallTask(x, y);
		balls.add(ball);
		timer.schedule(ball, 300, 60);    
	}

	private class BallTask extends TimerTask {
		int x, y,dx,dy;

		public BallTask(int x, int y) {
			this.x = (int) (x - (ballW * 0.5));
			this.y = (int) (y - (ballH * 0.5));
			dx = (int)(Math.random()*9-4);   //移動往不同方向  原本是0-8之間，-4的話就會移動以-4~4方向移動
			dy = (int)(Math.random()*9-4);
		}

		@Override
		public void run() {
			if(x<=0 || x + ballW >=viewW) {
				dx *=-1;
			}
			if(y<=0 || y +ballH >=viewH) {
				dy *=-1;
			}
			x += dx;
			y += dy;
		}

	}

	private class refreshTask extends TimerTask {
		@Override
		public void run() {
			repaint();

		}
	}

	@Override
	protected void paintComponent(Graphics g) { // 使用者看到的任意元件，都是這段表現出來的
		super.paintComponent(g);
		viewW = getWidth();viewH = getHeight();
		for(BallTask ball : balls) {
			g.drawImage(ball0, ball.x, ball.y, null);
		}

		

	}
}
