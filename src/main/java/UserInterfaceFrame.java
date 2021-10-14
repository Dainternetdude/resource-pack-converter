import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class UserInterfaceFrame extends JFrame {

    public static final int WIDTH_FRAME = 400;
    public static final int HEIGHT_FRAME = 400;
    private static final int LATEST_MC_VERSION = 17;
    private static final int LOWEST_SUPPORTED_MC_VERSION = 7;

    private JPanel panel = new JPanel();
    private BorderLayout borderLayout = new BorderLayout();
    private JPanel leftPanel = new JPanel();
    private GridBagLayout leftGbl = new GridBagLayout();
    private JPanel rightPanel = new JPanel();
    private GridBagLayout rightGbl = new GridBagLayout();
    private GridBagConstraints gbc = new GridBagConstraints();

    private String sourceVersion = "";
    private String destinationVersion = "";
    private File sourceFile;
    private File destinationFile;

    public UserInterfaceFrame() {

        panel.setLayout(borderLayout);
        panel.add(leftPanel, BorderLayout.WEST);
        panel.add(rightPanel, BorderLayout.EAST);
        leftPanel.setLayout(leftGbl);
        rightPanel.setLayout(rightGbl);
        gbc.insets = new Insets(5, 20, 5, 20);

        JLabel label1 = new JLabel("Source Version");
        gbc.gridx = 0;
        gbc.gridy = 0;
        leftPanel.add(label1, gbc);

        JLabel label2 = new JLabel("Destination Version");
        rightPanel.add(label2, gbc);

        JComboBox comboBox1 = new JComboBox();
        JComboBox comboBox2 = new JComboBox();
        String[] versions = new String[LATEST_MC_VERSION + 1];

        for(int i = LATEST_MC_VERSION; i >= LOWEST_SUPPORTED_MC_VERSION; i--) {
            versions[i] = "1." + i;
            comboBox1.addItem(versions[i]);
            comboBox2.addItem(versions[i]);
        }
        comboBox1.setSelectedIndex(1);  //default the source version to previous version
                                        //destination defaults to current version automatically
        gbc.gridy = 1;
        leftPanel.add(comboBox1, gbc);
        rightPanel.add(comboBox2, gbc);

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        JButton button1 = new JButton("Choose Folder");
        JButton button2 = new JButton("Choose Folder");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1) {
                    int returnValue = fileChooser.showOpenDialog(button1);
                    if(returnValue == JFileChooser.APPROVE_OPTION) {
                        sourceFile = fileChooser.getSelectedFile();
                    }
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button2) {
                    int returnValue = fileChooser.showOpenDialog(button2);
                    if(returnValue == JFileChooser.APPROVE_OPTION) {
                        destinationFile = fileChooser.getSelectedFile();
                    }
                }
            }
        });
        gbc.gridy = 2;
        leftPanel.add(button1, gbc);
        rightPanel.add(button2, gbc);

        JButton convertButton = new JButton("Convert!");
        this.add(convertButton, BorderLayout.SOUTH);


        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH_FRAME, HEIGHT_FRAME);
        this.setMinimumSize(new Dimension(330, 160));
        //this.setResizable(false);
        this.setTitle("Minecraft Resource Pack converter");
        this.setType(Type.NORMAL);
        this.setLocation(120, 80);
        this.setVisible(true);
    }
}