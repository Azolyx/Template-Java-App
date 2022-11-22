import java.awt.*;

public class AppManager {
    public WindowManager windowManager = new WindowManager();
    public Thread thread;
    public boolean running = false;

    public void init() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        windowManager.init("Template App", screenSize.width, screenSize.height, 3);
        running = true;
        thread = new Thread(this::ready);
        thread.start();
    }

    public void ready() {
        start();

        int fps = 60;
        long frameLength = 1000 / fps;
        long lastFrame = System.currentTimeMillis();
        while (running) {
            long deltaTime = System.currentTimeMillis() - lastFrame;
            long waitTime = frameLength - deltaTime;
            if (waitTime < 0) { waitTime = 0; }
            try { Thread.sleep(waitTime); }
            catch (InterruptedException e) { e.printStackTrace(); }

            tick();

            lastFrame = System.currentTimeMillis();
        }
    }

    public void start() {

    }

    public void tick() {
        engine.tick();
    }

    public void stop() {
        running = false;
        thread.interrupt();
        windowManager.appWindow.dispose();
    }
}
