package ca.dainternetdude;

import ca.dainternetdude.mappings.*;

import javax.swing.*;
import java.awt.*;

/**
 * this class basically is just the literal user interface and it also contains the starting point for the converter
 * when the app is being run in gui mode which is the button actionlisteners
 */
public class UserInterfaceFrame extends JFrame {

    public static final int WIDTH_FRAME = 400;
    public static final int HEIGHT_FRAME = 400;
    
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

        JLabel sourceVersionLabel = new JLabel("Source Version");
        gbc.gridx = 0;
        gbc.gridy = 0;
        leftPanel.add(sourceVersionLabel, gbc);

        JLabel destinationVersionLabel = new JLabel("Destination Version");
        rightPanel.add(destinationVersionLabel, gbc);

        JComboBox<String> sourceVersionComboBox = new JComboBox<>();
        sourceVersionComboBox.addActionListener(e -> {
            converter.setSourceVersion(Globals.LATEST_MC_VERSION - sourceVersionComboBox.getSelectedIndex());
        });
        JComboBox<String> destinationVersionComboBox = new JComboBox<>();
        destinationVersionComboBox.addActionListener(e -> {
            converter.setDestinationVersion(Globals.LATEST_MC_VERSION - destinationVersionComboBox.getSelectedIndex());
        });
        String[] versions = new String[Globals.LATEST_MC_VERSION + 1];
        for(int i = Globals.LATEST_MC_VERSION; i >= Globals.LOWEST_SUPPORTED_MC_VERSION; i--) {
            versions[i] = "1." + i;
            sourceVersionComboBox.addItem(versions[i]);
            destinationVersionComboBox.addItem(versions[i]);
        }
        sourceVersionComboBox.setSelectedIndex(1);  //default the source version to previous version
                                                    //destination defaults to current version automatically
        gbc.gridy = 1;
        leftPanel.add(sourceVersionComboBox, gbc);
        rightPanel.add(destinationVersionComboBox, gbc);

        JFileChooser sourceFileChooser = new JFileChooser();
        sourceFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        JButton chooseSourceFolderButton = new JButton("Choose Folder");
        chooseSourceFolderButton.addActionListener(e -> {
            if (e.getSource() == chooseSourceFolderButton) {
                int returnValue = sourceFileChooser.showOpenDialog(chooseSourceFolderButton);
                if(returnValue == JFileChooser.APPROVE_OPTION) {
                    converter.setSourceFile(sourceFileChooser.getSelectedFile());
                }
            }
        });
        gbc.gridy = 2;
        leftPanel.add(chooseSourceFolderButton, gbc);

        JButton convertButton = new JButton("Convert!");
        this.add(convertButton, BorderLayout.SOUTH);
        convertButton.addActionListener(e -> {
            Bindings.setupVersions();
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