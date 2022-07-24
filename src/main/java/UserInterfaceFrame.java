import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

/**
 * this class basically is just the literal user interface and it also contains the starting point for the converter
 * when the app is being run in gui mode which is the button actionlisteners
 */
public class UserInterfaceFrame extends JFrame {

    public static final int WIDTH_FRAME = 400;
    public static final int HEIGHT_FRAME = 400;
    public static final int LATEST_MC_VERSION = 17;
    public static final int LOWEST_SUPPORTED_MC_VERSION = 7;

    private final JPanel panel = new JPanel();
    private final BorderLayout borderLayout = new BorderLayout();
    private final JPanel leftPanel = new JPanel();
    private final GridBagLayout leftGbl = new GridBagLayout();
    private final JPanel rightPanel = new JPanel();
    private final GridBagLayout rightGbl = new GridBagLayout();
    private final GridBagConstraints gbc = new GridBagConstraints();
    
    private final Converter converter = new Converter();

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

        JComboBox<String> sourceVersionComboBox = new JComboBox<>();
        sourceVersionComboBox.addActionListener(e -> {
            converter.setSourceVersion(LATEST_MC_VERSION - sourceVersionComboBox.getSelectedIndex());
        });
        JComboBox<String> destinationVersionComboBox = new JComboBox<>();
        destinationVersionComboBox.addActionListener(e -> {
            converter.setDestinationVersion(LATEST_MC_VERSION - destinationVersionComboBox.getSelectedIndex());
        });
        String[] versions = new String[LATEST_MC_VERSION + 1];

        for(int i = LATEST_MC_VERSION; i >= LOWEST_SUPPORTED_MC_VERSION; i--) {
            versions[i] = "1." + i;
            sourceVersionComboBox.addItem(versions[i]);
            destinationVersionComboBox.addItem(versions[i]);
        }
        sourceVersionComboBox.setSelectedIndex(1);  //default the source version to previous version
                                        //destination defaults to current version automatically
        gbc.gridy = 1;
        leftPanel.add(sourceVersionComboBox, gbc);
        rightPanel.add(destinationVersionComboBox, gbc);

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        JButton button1 = new JButton("Choose Folder");
        button1.addActionListener(e -> {
            if (e.getSource() == button1) {
                int returnValue = fileChooser.showOpenDialog(button1);
                if(returnValue == JFileChooser.APPROVE_OPTION) {
                    converter.setSourceFile(fileChooser.getSelectedFile());
                }
            }
        });
        gbc.gridy = 2;
        leftPanel.add(button1, gbc);

        JButton convertButton = new JButton("Convert!");
        this.add(convertButton, BorderLayout.SOUTH);
        convertButton.addActionListener(e -> {
            Version.setupVersions();
            converter.convert();
        });

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH_FRAME, HEIGHT_FRAME);
        this.setMinimumSize(new Dimension(330, 160));
        //this.setResizable(false);
        this.setTitle("Minecraft Resource Pack Converter");
        this.setType(Type.NORMAL);
        this.setLocation(120, 80);
        this.setVisible(true);
    }
}