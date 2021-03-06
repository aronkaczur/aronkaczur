import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        int x = 0;
        int y = 0;
        Random random = new Random();

        for (int i = 0; i < 7800; i++) {
            int r = random.nextInt(255);
            int g= random.nextInt(255);
            int b = random.nextInt(255);
            graphics.setColor(new Color(r,g,b));
            goToCenter (x,y, graphics);
            x= x+1;

        }



    }
    public static void goToCenter (int x, int y, Graphics g){
        g.drawLine(x,y,160,160);
    }
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}