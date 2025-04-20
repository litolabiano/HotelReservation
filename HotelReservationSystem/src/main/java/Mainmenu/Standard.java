package Mainmenu;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Standard extends javax.swing.JFrame {
    
    private Thread animationThread = null;
    boolean x = true;

    public Standard() {
        FlatDarkLaf.setup();
        UIManager.put("Button.arc", 20);
        UIManager.put("Component.arc", 20);
        UIManager.put("TextComponent.arc", 20);
        
        initComponents();

       jPanel2.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLayeredPane = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jCombo1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Image1 = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        image3 = new javax.swing.JLabel();
        image4 = new javax.swing.JLabel();
        image5 = new javax.swing.JLabel();
        image6 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        NavBar = new javax.swing.JMenuBar();
        Back = new javax.swing.JMenu();
        File = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(60, 63, 65));
        setFocusTraversalPolicyProvider(true);
        setForeground(new java.awt.Color(60, 63, 65));
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 2000, 2000));
        setMinimumSize(new java.awt.Dimension(100, 100));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLayeredPane.setMinimumSize(new java.awt.Dimension(1600, 900));
        jLayeredPane.setPreferredSize(new java.awt.Dimension(1800, 1000));
        jLayeredPane.setRequestFocusEnabled(false);
        jLayeredPane.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(60, 63, 65));
        jPanel2.setVisible(false);
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setMinimumSize(new java.awt.Dimension(210, 210));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(jCombo1, gridBagConstraints);

        jButton1.setText("jButton1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(jButton1, gridBagConstraints);

        jButton2.setText("jButton2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(jButton2, gridBagConstraints);

        jButton3.setText("jButton3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(jButton3, gridBagConstraints);

        jLayeredPane.setLayer(jPanel2, javax.swing.JLayeredPane.PALETTE_LAYER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jLayeredPane.add(jPanel2, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(1800, 1000));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1800, 1000));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        Image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s1.png"))); // NOI18N
        Image1.setDisabledIcon(null);
        Image1.setMaximumSize(new java.awt.Dimension(500, 390));
        Image1.setMinimumSize(new java.awt.Dimension(500, 390));
        Image1.setOpaque(true);
        Image1.setPreferredSize(new java.awt.Dimension(500, 390));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(Image1, gridBagConstraints);

        image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s2.png"))); // NOI18N
        image2.setDisabledIcon(null);
        image2.setMaximumSize(new java.awt.Dimension(500, 390));
        image2.setMinimumSize(new java.awt.Dimension(500, 390));
        image2.setOpaque(true);
        image2.setPreferredSize(new java.awt.Dimension(500, 390));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(image2, gridBagConstraints);

        image3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s3.png"))); // NOI18N
        image3.setDisabledIcon(null);
        image3.setMaximumSize(new java.awt.Dimension(500, 390));
        image3.setMinimumSize(new java.awt.Dimension(500, 390));
        image3.setOpaque(true);
        image3.setPreferredSize(new java.awt.Dimension(500, 390));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(image3, gridBagConstraints);

        image4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s4.png"))); // NOI18N
        image4.setDisabledIcon(null);
        image4.setMaximumSize(new java.awt.Dimension(500, 390));
        image4.setMinimumSize(new java.awt.Dimension(500, 390));
        image4.setOpaque(true);
        image4.setPreferredSize(new java.awt.Dimension(500, 390));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(image4, gridBagConstraints);

        image5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s4.png"))); // NOI18N
        image5.setDisabledIcon(null);
        image5.setMaximumSize(new java.awt.Dimension(500, 390));
        image5.setMinimumSize(new java.awt.Dimension(500, 390));
        image5.setOpaque(true);
        image5.setPreferredSize(new java.awt.Dimension(500, 390));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(image5, gridBagConstraints);

        image6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s4.png"))); // NOI18N
        image6.setDisabledIcon(null);
        image6.setMaximumSize(new java.awt.Dimension(500, 390));
        image6.setMinimumSize(new java.awt.Dimension(500, 390));
        image6.setOpaque(true);
        image6.setPreferredSize(new java.awt.Dimension(500, 390));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(image6, gridBagConstraints);

        b1.setText("jButton5");
        b1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b1.setMaximumSize(new java.awt.Dimension(520, 420));
        b1.setMinimumSize(new java.awt.Dimension(520, 420));
        b1.setPreferredSize(new java.awt.Dimension(520, 420));
        b1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 15);
        jPanel1.add(b1, gridBagConstraints);

        b2.setText("jButton8");
        b2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b2.setMaximumSize(new java.awt.Dimension(520, 420));
        b2.setMinimumSize(new java.awt.Dimension(520, 420));
        b2.setPreferredSize(new java.awt.Dimension(520, 420));
        b2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 15);
        jPanel1.add(b2, gridBagConstraints);

        b3.setText("jButton7");
        b3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b3.setMaximumSize(new java.awt.Dimension(520, 420));
        b3.setMinimumSize(new java.awt.Dimension(520, 420));
        b3.setPreferredSize(new java.awt.Dimension(520, 420));
        b3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 15);
        jPanel1.add(b3, gridBagConstraints);

        b4.setText("jButton4");
        b4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b4.setMaximumSize(new java.awt.Dimension(520, 420));
        b4.setMinimumSize(new java.awt.Dimension(520, 420));
        b4.setPreferredSize(new java.awt.Dimension(520, 420));
        b4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 15);
        jPanel1.add(b4, gridBagConstraints);

        b5.setText("jButton4");
        b5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b5.setMaximumSize(new java.awt.Dimension(520, 420));
        b5.setMinimumSize(new java.awt.Dimension(520, 420));
        b5.setPreferredSize(new java.awt.Dimension(520, 420));
        b5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 15);
        jPanel1.add(b5, gridBagConstraints);

        b6.setText("jButton4");
        b6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        b6.setMaximumSize(new java.awt.Dimension(520, 420));
        b6.setMinimumSize(new java.awt.Dimension(520, 420));
        b6.setPreferredSize(new java.awt.Dimension(520, 420));
        b6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 15);
        jPanel1.add(b6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jLayeredPane.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLayeredPane, gridBagConstraints);

        NavBar.setBackground(new java.awt.Color(60, 63, 65));
        NavBar.setMaximumSize(new java.awt.Dimension(1000, 80));
        NavBar.setMinimumSize(new java.awt.Dimension(1000, 80));
        NavBar.setOpaque(true);
        NavBar.setPreferredSize(new java.awt.Dimension(1000, 100));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hamburger.png"))); // NOI18N
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Back.setMinimumSize(new java.awt.Dimension(150, 150));
        Back.setPreferredSize(new java.awt.Dimension(120, 120));
        Back.setRequestFocusEnabled(false);
        Back.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/hamburg.jpg"))); // NOI18N
        Back.setVerifyInputWhenFocusTarget(false);
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        NavBar.add(Back);

        File.setText("Standard Room");
        File.setEnabled(false);
        File.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        File.setMinimumSize(new java.awt.Dimension(100, 100));
        File.setPreferredSize(new java.awt.Dimension(380, 380));
        File.setRequestFocusEnabled(false);
        File.setRolloverEnabled(false);
        File.setVerifyInputWhenFocusTarget(false);
        NavBar.add(File);

        setJMenuBar(NavBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        if (animationThread != null && animationThread.isAlive()) {
  return;
        }
        if (x) {
            animationThread = new Thread() {
                @Override
                public void run() {   
            
                    try {
                        for (int i = -210; i <= 0; i++) {
                            if (Thread.interrupted()) {
                               
                                return;
                            }
                            Thread.sleep(1);

                            jPanel2.setBounds(i+2, 5, 210, jPanel1.getHeight()+2);
                                   jPanel2.setVisible(true);

                        }
                    } catch (Exception e) {
                        if (!(e instanceof InterruptedException)) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                }
            };
            animationThread.start();
            x = false;
            
        } else {
            animationThread = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i >= -210; i--) {
                            if (Thread.interrupted()) {
                                return;
                            }
                            Thread.sleep(1);
                            jPanel2.setBounds(i-2, 5, 210, jPanel1.getHeight()+2);                
                        }       
                    } catch (Exception e) {
                        if (!(e instanceof InterruptedException)) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                }
            };
            animationThread.start();
           x = true;
        }
    }//GEN-LAST:event_BackMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JMenu Back;
    javax.swing.JMenu File;
    javax.swing.JLabel Image1;
    javax.swing.JMenuBar NavBar;
    javax.swing.JButton b1;
    javax.swing.JButton b2;
    javax.swing.JButton b3;
    javax.swing.JButton b4;
    javax.swing.JButton b5;
    javax.swing.JButton b6;
    javax.swing.JLabel image2;
    javax.swing.JLabel image3;
    javax.swing.JLabel image4;
    javax.swing.JLabel image5;
    javax.swing.JLabel image6;
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JComboBox<String> jCombo1;
    javax.swing.JLayeredPane jLayeredPane;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Standard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Standard().setVisible(true);
            }
        });
    }
}
