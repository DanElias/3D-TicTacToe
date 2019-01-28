/*Author: Daniel Elias Becerra A01208905
Description: This class creates a GUI that displays the rules of the game.
Date: 22/04/18
*/
package tictactoe;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Rules extends javax.swing.JFrame {

    public Rules() { // CONSTRUCTOR
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rules_text = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setFont(new java.awt.Font("TESLA", 0, 48)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setText("RULES");
        getContentPane().add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 710, 60));

        menu.setBackground(new java.awt.Color(10, 22, 38));
        menu.setFont(new java.awt.Font("TESLA", 1, 28)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setText("MENU");
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.setIconTextGap(0);
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 150, 50));

        jScrollPane2.setBackground(new java.awt.Color(0, 51, 102));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setFont(new java.awt.Font("Aller", 1, 14)); // NOI18N
        jScrollPane2.setInheritsPopupMenu(true);
        jScrollPane2.setOpaque(false);

        rules_text.setBackground(new java.awt.Color(9, 29, 48));
        rules_text.setColumns(20);
        rules_text.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rules_text.setForeground(new java.awt.Color(255, 255, 255));
        rules_text.setRows(5);
        rules_text.setText("- The game can only function if only 2 real users are going to play it.\n\n - User 2 will always be the X’s. \n\n- User 1 will always be the O’s. \n\n- A user can only select where to put a symbol if it is his/her turn.\n\n-A user can only select where to put a symbol one-at-a-time. \n\n- After one user has finished selecting where to put their symbol, then the turn of the other user starts. \n\n- If no one completes a 3 in-a-row for their specific figure, a tie is declared and no one wins or receives points. \n \n- To win one user has to complete 3 in-a-row for their specific figure (x or o) \n\n-There are 49 ways of winning, Be careful and good luck!\n \n ");
        rules_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(rules_text);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 960, 410));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/images_tictactoe/background.png"))); // NOI18N
        background.setToolTipText("");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        new Menu().setVisible(true); // RETURNS TO MENU
        setVisible(false);
    }//GEN-LAST:event_menuMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton menu;
    private javax.swing.JTextArea rules_text;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
