import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import forge.error.ErrorViewer;


public class GuiDisplay extends JFrame {
    private static final long serialVersionUID    = -7044669689870299753L;
    
    private JScrollPane       jScrollPane1        = new JScrollPane();
    private JTextArea         messageArea         = new JTextArea();
    private JPanel            buttonPanel         = new JPanel();
    private FlowLayout        flowLayout1         = new FlowLayout();
    private JPanel            jPanel2             = new JPanel();
    private JLabel            oppLifeLabel        = new JLabel();
    private BorderLayout      borderLayout1       = new BorderLayout();
    private JPanel            jPanel3             = new JPanel();
    private BorderLayout      borderLayout2       = new BorderLayout();
    private JScrollPane       jScrollPane3        = new JScrollPane();
    private JPanel            jPanel4             = new JPanel();
    private BorderLayout      borderLayout3       = new BorderLayout();
    private JLabel            playerLifeLabel     = new JLabel();
    @SuppressWarnings("unused")
    // border1
    private Border            border1;
    private JPanel            jPanel5             = new JPanel();
    private JScrollPane       jScrollPane4        = new JScrollPane();
    private JPanel            jPanel6             = new JPanel();
    private GridLayout        gridLayout1         = new GridLayout();
    private JPanel            oppLandPanel        = new JPanel();
    private JPanel            oppCreaturePanel    = new JPanel();
    private JPanel            playerCreaturePanel = new JPanel();
    private JPanel            playerLandPanel     = new JPanel();
    private JPanel            playerHandPanel     = new JPanel();
    private JLabel            jLabel3             = new JLabel();
    private JPanel            jPanel12            = new JPanel();
    private GridLayout        gridLayout2         = new GridLayout();
    private JPanel            jPanel13            = new JPanel();
    private JPanel            jPanel14            = new JPanel();
    private JPanel            jPanel15            = new JPanel();
    private JPanel            jPanel16            = new JPanel();
    private JPanel            jPanel17            = new JPanel();
    private JLabel            jLabel4             = new JLabel();
    private JLabel            jLabel5             = new JLabel();
    private JLabel            jLabel6             = new JLabel();
    private JLabel            jLabel7             = new JLabel();
    private JLabel            jLabel8             = new JLabel();
    private JPanel            jPanel18            = new JPanel();
    private JLabel            jLabel9             = new JLabel();
    private JPanel            jPanel19            = new JPanel();
    private Border            border2;
    private TitledBorder      titledBorder1;
    private BorderLayout      borderLayout4       = new BorderLayout();
    private JLabel            jLabel11            = new JLabel();
    private JLabel            jLabel12            = new JLabel();
    private JLabel            playerHandLabel     = new JLabel();
    private JLabel            playerLibraryLabel  = new JLabel();
    private JLabel            playerGraveLabel    = new JLabel();
    private JScrollPane       jScrollPane2        = new JScrollPane();
    private JLabel            jLabel18            = new JLabel();
    private JLabel            jLabel19            = new JLabel();
    private JLabel            jLabel20            = new JLabel();
    private JLabel            oppHandLabel        = new JLabel();
    private JLabel            oppLibraryLabel     = new JLabel();
    private JLabel            oppGraveLabel       = new JLabel();
    private JPanel            stackPanel          = new JPanel();
    private GridLayout        gridLayout3         = new GridLayout();
    private JPanel            jPanel9             = new JPanel();
    private JPanel            picturePanel        = new JPanel();
    private JTextArea         combatArea          = new JTextArea();
    private GridLayout        gridLayout4         = new GridLayout();
    private JPanel            jPanel7             = new JPanel();
    private GridLayout        gridLayout5         = new GridLayout();
    private JLabel            cdLabel1            = new JLabel();
    private JLabel            cdLabel2            = new JLabel();
    private JLabel            cdLabel3            = new JLabel();
    private JLabel            cdLabel4            = new JLabel();
    private JLabel            cdLabel5            = new JLabel();
    private JScrollPane       jScrollPane5        = new JScrollPane();
    private JTextArea         cdArea              = new JTextArea();
    
    public static void main(String[] args) {
        GuiDisplay g = new GuiDisplay();
        
        //Use both so that when "un"maximizing, the frame isn't tiny
        g.setSize(1024, 740);
        g.setExtendedState(Frame.MAXIMIZED_BOTH);
        
        g.setVisible(true);
    }
    
    public GuiDisplay() {
        try {
            jbInit();
        } catch(Exception ex) {
            ErrorViewer.showError(ex);
        }
    }
    
    private void jbInit() throws Exception {
        border1 = BorderFactory.createEtchedBorder(Color.white, new Color(148, 145, 140));
        border2 = BorderFactory.createEtchedBorder(Color.white, new Color(148, 145, 140));
        titledBorder1 = new TitledBorder(border2, "Stack");
        this.getContentPane().setLayout(null);
        messageArea.setLineWrap(true);
        messageArea.setWrapStyleWord(true);
        buttonPanel.setBorder(BorderFactory.createEtchedBorder());
        buttonPanel.setBounds(new Rectangle(12, 105, 214, 38));
        buttonPanel.setLayout(flowLayout1);
        jPanel2.setBorder(new TitledBorder(
                BorderFactory.createEtchedBorder(Color.white, new Color(148, 145, 140)), "Computer"));
        jPanel2.setBounds(new Rectangle(137, 149, 89, 78));
        jPanel2.setLayout(borderLayout1);
        oppLifeLabel.setFont(new java.awt.Font("Dialog", 0, 47));
        oppLifeLabel.setToolTipText("Click here to target the computer");
        oppLifeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        oppLifeLabel.setText("20");
        jPanel3.setBorder(new TitledBorder(
                BorderFactory.createEtchedBorder(Color.white, new Color(148, 145, 140)), "Combat"));
        jPanel3.setBounds(new Rectangle(6, 401, 230, 169));
        jPanel3.setLayout(borderLayout2);
        jPanel4.setBorder(new TitledBorder(
                BorderFactory.createEtchedBorder(Color.white, new Color(148, 145, 140)), "Human"));
        jPanel4.setBounds(new Rectangle(154, 604, 90, 83));
        jPanel4.setLayout(borderLayout3);
        playerLifeLabel.setFont(new java.awt.Font("Dialog", 0, 47));
        playerLifeLabel.setToolTipText("Click here to target yourself");
        playerLifeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        playerLifeLabel.setText("20");
        jScrollPane3.setBorder(BorderFactory.createEtchedBorder(Color.white, new Color(148, 145, 140)));
        jPanel5.setBounds(new Rectangle(776, 12, 214, 663));
        jPanel5.setLayout(gridLayout3);
        jPanel6.setLayout(gridLayout1);
        gridLayout1.setHgap(10);
        gridLayout1.setRows(5);
        gridLayout1.setVgap(10);
        oppLandPanel.setBorder(BorderFactory.createEtchedBorder());
        oppLandPanel.setToolTipText("Computer\'s Land");
        oppCreaturePanel.setBorder(BorderFactory.createEtchedBorder());
        oppCreaturePanel.setToolTipText("Computer\'s Creatures");
        playerHandPanel.setBorder(BorderFactory.createEtchedBorder());
        playerHandPanel.setToolTipText("Cards in your hand");
        playerCreaturePanel.setBorder(BorderFactory.createEtchedBorder());
        playerCreaturePanel.setToolTipText("Your Creatures");
        playerLandPanel.setBorder(BorderFactory.createEtchedBorder());
        playerLandPanel.setToolTipText("Your Land");
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel3.setText("Hand: ");
        jLabel3.setBounds(new Rectangle(39, 608, 60, 28));
        jPanel12.setToolTipText("Mana Pool");
        jPanel12.setBounds(new Rectangle(1, 571, 246, 30));
        jPanel12.setLayout(gridLayout2);
        gridLayout2.setColumns(6);
        gridLayout2.setHgap(5);
        gridLayout2.setRows(0);
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("10");
        jPanel13.setBackground(Color.white);
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16));
        jLabel5.setForeground(Color.white);
        jLabel5.setText("10");
        jPanel14.setBackground(Color.black);
        jPanel14.setForeground(Color.white);
        jPanel15.setBackground(Color.blue);
        jPanel15.setToolTipText("");
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16));
        jLabel6.setForeground(Color.white);
        jLabel6.setText("10");
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16));
        jLabel7.setForeground(Color.white);
        jLabel7.setText("10");
        jPanel16.setBackground(Color.red);
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 16));
        jLabel8.setForeground(Color.white);
        jLabel8.setText("10");
        jPanel17.setBackground(Color.gray);
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 16));
        jLabel9.setText("10");
        jPanel18.setBackground(Color.green);
        jScrollPane4.setBounds(new Rectangle(244, 12, 525, 685));
        jScrollPane1.setBounds(new Rectangle(12, 6, 214, 91));
        jPanel19.setBorder(titledBorder1);
        jPanel19.setBounds(new Rectangle(6, 233, 230, 169));
        jPanel19.setLayout(borderLayout4);
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel11.setText("Library: ");
        jLabel11.setBounds(new Rectangle(39, 639, 71, 23));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel12.setText("Grave: ");
        jLabel12.setBounds(new Rectangle(39, 664, 60, 26));
        playerHandLabel.setFont(new java.awt.Font("Dialog", 0, 18));
        playerHandLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        playerHandLabel.setText("7");
        playerHandLabel.setBounds(new Rectangle(91, 608, 32, 28));
        playerLibraryLabel.setFont(new java.awt.Font("Dialog", 0, 18));
        playerLibraryLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        playerLibraryLabel.setText("32");
        playerLibraryLabel.setBounds(new Rectangle(91, 639, 32, 23));
        playerGraveLabel.setFont(new java.awt.Font("Dialog", 0, 18));
        playerGraveLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        playerGraveLabel.setText("2");
        playerGraveLabel.setBounds(new Rectangle(91, 664, 32, 26));
        jScrollPane2.setBorder(BorderFactory.createEtchedBorder());
        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel18.setText("Hand:");
        jLabel18.setBounds(new Rectangle(28, 152, 66, 20));
        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel19.setText("Library:");
        jLabel19.setBounds(new Rectangle(28, 181, 70, 20));
        jLabel20.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel20.setText("Grave:");
        jLabel20.setBounds(new Rectangle(28, 210, 76, 20));
        oppHandLabel.setFont(new java.awt.Font("Dialog", 0, 18));
        oppHandLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        oppHandLabel.setText("6");
        oppHandLabel.setBounds(new Rectangle(59, 152, 55, 20));
        oppLibraryLabel.setFont(new java.awt.Font("Dialog", 0, 18));
        oppLibraryLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        oppLibraryLabel.setText("30");
        oppLibraryLabel.setBounds(new Rectangle(59, 181, 55, 20));
        oppGraveLabel.setFont(new java.awt.Font("Dialog", 0, 18));
        oppGraveLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        oppGraveLabel.setText("2");
        oppGraveLabel.setBounds(new Rectangle(59, 210, 55, 20));
        gridLayout3.setColumns(1);
        gridLayout3.setRows(2);
        gridLayout3.setVgap(5);
        picturePanel.setBorder(BorderFactory.createEtchedBorder());
        jPanel9.setBorder(BorderFactory.createEtchedBorder());
        jPanel9.setLayout(gridLayout4);
        gridLayout4.setColumns(1);
        gridLayout4.setRows(2);
        jPanel7.setLayout(gridLayout5);
        gridLayout5.setColumns(1);
        gridLayout5.setRows(5);
        cdArea.setLineWrap(true);
        cdArea.setWrapStyleWord(true);
        cdLabel4.setHorizontalAlignment(SwingConstants.LEFT);
        cdLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        cdLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        cdLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        cdLabel5.setHorizontalAlignment(SwingConstants.LEFT);
        this.getContentPane().add(jScrollPane1, null);
        this.getContentPane().add(buttonPanel, null);
        this.getContentPane().add(jScrollPane4, null);
        this.getContentPane().add(jPanel3, null);
        jPanel3.add(jScrollPane3, BorderLayout.CENTER);
        jPanel12.add(jPanel13, null);
        jPanel13.add(jLabel4, null);
        jPanel12.add(jPanel14, null);
        jPanel14.add(jLabel5, null);
        jPanel12.add(jPanel15, null);
        jPanel15.add(jLabel6, null);
        jPanel12.add(jPanel16, null);
        jPanel16.add(jLabel7, null);
        jPanel12.add(jPanel18, null);
        jPanel18.add(jLabel9, null);
        jPanel12.add(jPanel17, null);
        jPanel17.add(jLabel8, null);
        this.getContentPane().add(jLabel12, null);
        this.getContentPane().add(playerHandLabel, null);
        this.getContentPane().add(jLabel3, null);
        this.getContentPane().add(jLabel11, null);
        this.getContentPane().add(playerLibraryLabel, null);
        this.getContentPane().add(playerGraveLabel, null);
        this.getContentPane().add(jLabel19, null);
        this.getContentPane().add(jLabel18, null);
        this.getContentPane().add(oppHandLabel, null);
        this.getContentPane().add(jLabel20, null);
        this.getContentPane().add(oppLibraryLabel, null);
        this.getContentPane().add(oppGraveLabel, null);
        this.getContentPane().add(jPanel5, null);
        this.getContentPane().add(jPanel2, null);
        jPanel2.add(oppLifeLabel, BorderLayout.CENTER);
        this.getContentPane().add(jPanel19, null);
        jPanel19.add(jScrollPane2, BorderLayout.CENTER);
        jScrollPane2.getViewport().add(stackPanel, null);
        this.getContentPane().add(jPanel4, null);
        jPanel4.add(playerLifeLabel, BorderLayout.CENTER);
        this.getContentPane().add(jPanel12, null);
        jScrollPane4.getViewport().add(jPanel6, null);
        jPanel6.add(oppLandPanel, null);
        jPanel6.add(oppCreaturePanel, null);
        jPanel6.add(playerCreaturePanel, null);
        jPanel6.add(playerLandPanel, null);
        jPanel6.add(playerHandPanel, null);
        jScrollPane1.getViewport().add(messageArea, null);
        jPanel5.add(jPanel9, null);
        jScrollPane3.getViewport().add(combatArea, null);
        jPanel7.add(cdLabel1, null);
        jPanel7.add(cdLabel2, null);
        jPanel7.add(cdLabel3, null);
        jPanel7.add(cdLabel4, null);
        jPanel7.add(cdLabel5, null);
        jPanel9.add(jPanel7, null);
        jPanel9.add(jScrollPane5, null);
        jPanel5.add(picturePanel, null);
        jScrollPane5.getViewport().add(cdArea, null);
    }
}
