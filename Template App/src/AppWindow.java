import javax.swing.*;

public class AppWindow extends JFrame {
    AppWindow(String title, int width, int height, int numBuffers) {
        super(title);
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        createBufferStrategy(numBuffers);
    }
}
