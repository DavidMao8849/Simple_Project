import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements KeyListener, ActionListener {

    private final int WIDTH = 600;
    private final int HEIGHT = 500;

    private Timer timer;
    private int delay = 8;

    private int paddleX = 250;
    private final int paddleWidth = 100;
    private final int paddleHeight = 10;

    private int ballX = 290;
    private int ballY = 350;
    private int ballDirX = -2;
    private int ballDirY = -3;
    private final int ballSize = 20;

    // 벽돌 관련
    private boolean[][] bricks;
    private final int brickRows = 5;
    private final int brickCols = 10;
    private final int brickWidth = 50;
    private final int brickHeight = 20;

    public GamePanel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(this);
        timer = new Timer(delay, this);
        timer.start();

        // 벽돌 초기화
        bricks = new boolean[brickRows][brickCols];
        for (int i = 0; i < brickRows; i++) {
            for (int j = 0; j < brickCols; j++) {
                bricks[i][j] = true;
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        // 배경
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // 벽돌 그리기
        for (int i = 0; i < brickRows; i++) {
            for (int j = 0; j < brickCols; j++) {
                if (bricks[i][j]) {
                    int brickX = j * (brickWidth + 10) + 35;
                    int brickY = i * (brickHeight + 10) + 30;
                    g.setColor(Color.orange);
                    g.fillRect(brickX, brickY, brickWidth, brickHeight);
                    g.setColor(Color.black);
                    g.drawRect(brickX, brickY, brickWidth, brickHeight);
                }
            }
        }

        // Paddle
        g.setColor(Color.green);
        g.fillRect(paddleX, HEIGHT - 50, paddleWidth, paddleHeight);

        // Ball
        g.setColor(Color.red);
        g.fillOval(ballX, ballY, ballSize, ballSize);
    }

    public void actionPerformed(ActionEvent e) {
        // Ball movement
        ballX += ballDirX;
        ballY += ballDirY;

        // Bounce off walls
        if (ballX < 0 || ballX > WIDTH - ballSize) ballDirX = -ballDirX;
        if (ballY < 0) ballDirY = -ballDirY;

        // Bounce off paddle
        if (new Rectangle(ballX, ballY, ballSize, ballSize).intersects(
                new Rectangle(paddleX, HEIGHT - 50, paddleWidth, paddleHeight))) {
            ballDirY = -ballDirY;
        }

        // Ball out of bounds
        if (ballY > HEIGHT) {
            // Reset ball position
            ballX = 290;
            ballY = 350;
            ballDirX = -2;
            ballDirY = -3;
        }

        // 벽돌 충돌 체크
        for (int i = 0; i < brickRows; i++) {
            for (int j = 0; j < brickCols; j++) {
                if (bricks[i][j]) {
                    int brickX = j * (brickWidth + 10) + 35;
                    int brickY = i * (brickHeight + 10) + 30;
                    Rectangle brickRect = new Rectangle(brickX, brickY, brickWidth, brickHeight);
                    Rectangle ballRect = new Rectangle(ballX, ballY, ballSize, ballSize);

                    if (ballRect.intersects(brickRect)) {
                        bricks[i][j] = false;
                        ballDirY = -ballDirY;
                        break;
                    }
                }
            }
        }

        repaint();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT && paddleX > 0) {
            paddleX -= 20;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT && paddleX < WIDTH - paddleWidth) {
            paddleX += 20;
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}
