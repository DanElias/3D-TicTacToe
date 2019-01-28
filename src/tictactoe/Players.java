/*Author: Daniel Elias Becerra A01208905
Description: This class creates the GUI where the user introduce their names.
Date: 17/04/18 - 20/04/18
*/

package tictactoe;

import logic.*;//Imports the classes in the package logic: Game and Player

public class Players extends javax.swing.JFrame {
    private String name1="";
    private String name2="";

    public Players() {// Creates new form Players
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void setName1(String name1){
        this.name1=name_player1.getText();
    }
    
    public void setName2 (String name2){
        this.name2=name_player2.getText();
    }
    
    public String getName1(){
        return name1;
    }
    public String getName2(){
        return name2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dots_gif = new javax.swing.JLabel();
        menu_button = new javax.swing.JButton();
        playnow_button = new javax.swing.JButton();
        name_player1 = new javax.swing.JTextField();
        name_player2 = new javax.swing.JTextField();
        subtitle2 = new javax.swing.JLabel();
        tresd = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        subtitle1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dots_gif.setFont(new java.awt.Font("Pokemon Hollow", 1, 60)); // NOI18N
        dots_gif.setForeground(new java.awt.Color(255, 255, 255));
        dots_gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/images_tictactoe/dots.gif"))); // NOI18N
        getContentPane().add(dots_gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 320, 260));

        menu_button.setBackground(new java.awt.Color(10, 22, 38));
        menu_button.setFont(new java.awt.Font("TESLA", 1, 18)); // NOI18N
        menu_button.setForeground(new java.awt.Color(255, 255, 255));
        menu_button.setText("BACK TO  MENU");
        menu_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_button.setIconTextGap(0);
        menu_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(menu_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 230, 50));

        playnow_button.setBackground(new java.awt.Color(10, 22, 38));
        playnow_button.setFont(new java.awt.Font("TESLA", 1, 28)); // NOI18N
        playnow_button.setForeground(new java.awt.Color(255, 255, 255));
        playnow_button.setText("PLAY");
        playnow_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playnow_button.setIconTextGap(0);
        playnow_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playnow_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(playnow_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 180, 50));

        name_player1.setBackground(new java.awt.Color(8, 55, 77));
        name_player1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        name_player1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(name_player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 580, 60));

        name_player2.setBackground(new java.awt.Color(8, 55, 77));
        name_player2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        name_player2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(name_player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 580, 60));

        subtitle2.setFont(new java.awt.Font("TESLA", 2, 35)); // NOI18N
        subtitle2.setForeground(new java.awt.Color(255, 255, 255));
        subtitle2.setText("INSERT NAME - PLAYER 2:");
        getContentPane().add(subtitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 600, 60));

        tresd.setFont(new java.awt.Font("Pokemon Hollow", 1, 60)); // NOI18N
        tresd.setForeground(new java.awt.Color(255, 255, 255));
        tresd.setText("3D");
        getContentPane().add(tresd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 110, 110));

        title.setFont(new java.awt.Font("TESLA", 1, 60)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("TIC TAC TOE");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 570, 110));

        subtitle1.setFont(new java.awt.Font("TESLA", 2, 35)); // NOI18N
        subtitle1.setForeground(new java.awt.Color(255, 255, 255));
        subtitle1.setText("INSERT NAME - PLAYER 1:");
        getContentPane().add(subtitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 600, 60));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/images_tictactoe/TicTacToeMainBackground.png"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_buttonMouseClicked
       new Menu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menu_buttonMouseClicked

    private void playnow_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playnow_buttonMouseClicked
        setName1(name1); // Sets the names introduced by the user.
        setName2(name2);
        new Play_Frame(name1, name2).setVisible(true); // Crestes the Play frame that receives the names of the objects to create the objects of Player1 and Player 2
        setVisible(false);
    }//GEN-LAST:event_playnow_buttonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel dots_gif;
    private javax.swing.JButton menu_button;
    private javax.swing.JTextField name_player1;
    private javax.swing.JTextField name_player2;
    private javax.swing.JButton playnow_button;
    private javax.swing.JTextField respuesta1;
    private javax.swing.JTextField respuesta2;
    private javax.swing.JTextField respuesta3;
    private javax.swing.JTextField respuesta4;
    private javax.swing.JLabel subtitle1;
    private javax.swing.JLabel subtitle2;
    private javax.swing.JLabel title;
    private javax.swing.JLabel tresd;
    // End of variables declaration//GEN-END:variables
}
