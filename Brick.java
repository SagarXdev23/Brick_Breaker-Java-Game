package brickBreacker;

//weak man blames his future
import javax.swing.JFrame;
public class Brick {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        obj.pack();
        brickBreacker.Gameplay gameplay = new Gameplay();
        obj.setBounds(10,10,800,600);
        obj.setTitle("Breakout Ball");
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setVisible(true);
        obj.add(gameplay);

        //maximize the window

        //obj.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }
}
