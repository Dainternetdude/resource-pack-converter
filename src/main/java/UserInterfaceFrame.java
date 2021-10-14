import javax.swing.*;
import java.awt.*;

public class UserInterfaceFrame extends JFrame {

    public static final int WIDTH_FRAME = 800;
    public static final int HEIGHT_FRAME = 600;
    private BorderLayout borderLayout = new BorderLayout();

    public UserInterfaceFrame() {

        JLabel label1 = new JLabel("Source Version");
        label1.setVisible(true);
        borderLayout.addLayoutComponent(label1, BorderLayout.NORTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(borderLayout);
        this.setSize(WIDTH_FRAME, HEIGHT_FRAME);
        this.setResizable(false);
        this.setTitle("Minecraft Resource Pack converter");
        this.setType(Type.NORMAL);
        this.setLocation(120, 80);
        this.setVisible(true);
    }
}