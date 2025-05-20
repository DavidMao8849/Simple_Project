import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GameFrame() {
        this.setTitle("Brick Breaker");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(new GamePanel());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
