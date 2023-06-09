/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package videoplayer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud
 */
public class UpdateFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateFrame
     */
    public UpdateFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpdatePanel = new javax.swing.JPanel();
        VidedoName = new javax.swing.JTextField();
        VideoPath = new javax.swing.JTextField();
        VideoAction = new javax.swing.JTextField();
        VidPlayerName = new javax.swing.JTextField();
        Home_Team = new javax.swing.JTextField();
        addOK = new javax.swing.JButton();
        Away_Team = new javax.swing.JTextField();
        AwayTeamLab = new javax.swing.JLabel();
        VidNameLab = new javax.swing.JLabel();
        VidPathLab = new javax.swing.JLabel();
        VidCategoryLab = new javax.swing.JLabel();
        SpPlayerLab = new javax.swing.JLabel();
        HomeTeamLab = new javax.swing.JLabel();
        updateframeclose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(530, 410));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpdatePanel.setBackground(new java.awt.Color(102, 102, 102));
        UpdatePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        UpdatePanel.add(VidedoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 184, 33));
        UpdatePanel.add(VideoPath, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 184, 33));
        UpdatePanel.add(VideoAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 184, 33));
        UpdatePanel.add(VidPlayerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 184, 33));

        Home_Team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_TeamActionPerformed(evt);
            }
        });
        UpdatePanel.add(Home_Team, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 184, 33));

        addOK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addOK.setText("ok");
        addOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOKActionPerformed(evt);
            }
        });
        UpdatePanel.add(addOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 90, -1));

        Away_Team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Away_TeamActionPerformed(evt);
            }
        });
        UpdatePanel.add(Away_Team, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 184, 33));

        AwayTeamLab.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        AwayTeamLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AwayTeamLab.setText("Away Team");
        UpdatePanel.add(AwayTeamLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 140, 30));

        VidNameLab.setBackground(new java.awt.Color(255, 255, 255));
        VidNameLab.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        VidNameLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VidNameLab.setText("Video Name");
        UpdatePanel.add(VidNameLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 140, 30));

        VidPathLab.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        VidPathLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VidPathLab.setText("Video Path");
        UpdatePanel.add(VidPathLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, 30));

        VidCategoryLab.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        VidCategoryLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VidCategoryLab.setText("Video Category");
        UpdatePanel.add(VidCategoryLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 140, 30));

        SpPlayerLab.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        SpPlayerLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SpPlayerLab.setText("Spicial Player");
        UpdatePanel.add(SpPlayerLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 140, 30));

        HomeTeamLab.setBackground(new java.awt.Color(255, 255, 255));
        HomeTeamLab.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        HomeTeamLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeTeamLab.setText("Home Team");
        UpdatePanel.add(HomeTeamLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 140, 30));

        updateframeclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videoplayer/close.png"))); // NOI18N
        updateframeclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateframecloseMouseClicked(evt);
            }
        });
        UpdatePanel.add(updateframeclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 30, 30));

        getContentPane().add(UpdatePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Home_TeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_TeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Home_TeamActionPerformed

    private void addOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOKActionPerformed
        // TODO add your handling code here:
        String VidName = VidedoName.getText();
        String Path = VideoPath.getText();
        String Action = VideoAction.getText();
        String PlayerName = VidPlayerName.getText();
        String Team1 = Home_Team.getText();
        String Team2 = Away_Team.getText();
        //Video UpdateValues = new Video(VidName, Path,Action, PlayerName, Team1,Team2);
        Link.LS.update((String) VideoPlayerGUI.UpdateWhere, VidName, Path,Action, PlayerName, Team1,Team2);
        //Linkedlist.ls.set(VideoPlayerGUI.UpdateWhereIndex, UpdateValues);
        try{
            //call jdbc
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //create connection
            Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=videos;user=mahmoudd;password=123456");
            Statement stm = con.createStatement();
            stm.executeUpdate("UPDATE Video SET VN = '"+VidName+"', P = '"+Path+"',"
                + "A = '"+Action+"',PL = '"+PlayerName+"',T1 = '"+Team1+"',T2 = '"+Team2+"'"
                        + "WHERE P = '"+VideoPlayerGUI.UpdateWhere+"';");

            //Show Successful Message
            JOptionPane.showMessageDialog(null, "UPDATED Successfuly");
            //disconnect with database
            con.close();
        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        this.setVisible(false);
    }//GEN-LAST:event_addOKActionPerformed

    private void Away_TeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Away_TeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Away_TeamActionPerformed

    private void updateframecloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateframecloseMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_updateframecloseMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AwayTeamLab;
    private javax.swing.JTextField Away_Team;
    private javax.swing.JLabel HomeTeamLab;
    private javax.swing.JTextField Home_Team;
    private javax.swing.JLabel SpPlayerLab;
    private javax.swing.JPanel UpdatePanel;
    private javax.swing.JLabel VidCategoryLab;
    private javax.swing.JLabel VidNameLab;
    private javax.swing.JLabel VidPathLab;
    private javax.swing.JTextField VidPlayerName;
    private javax.swing.JTextField VidedoName;
    private javax.swing.JTextField VideoAction;
    private javax.swing.JTextField VideoPath;
    private javax.swing.JButton addOK;
    private javax.swing.JLabel updateframeclose;
    // End of variables declaration//GEN-END:variables
}
