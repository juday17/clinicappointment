/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakage1;

import config.dbconfig;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import static pakage1.loginForm.Login;
import static pakage1.User.date;
import static pakage1.User.firstname;
import static pakage1.User.lastname;
import static pakage1.User.middle;
import static pakage1.User.phone;
import static pakage1.User.time;


/**
 *
 * @author zanec
 */
public class patientList extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public patientList() {
        initComponents();
        ImageIcon icon2= new ImageIcon(getClass().getResource("arrow2.png"));
         Image img2= icon2.getImage().getScaledInstance(arrows.getWidth(), arrows.getHeight(), Image.SCALE_SMOOTH);
         arrows.setIcon(new ImageIcon(img2));          
    }
    public void displayData(){
       
        try{
       
            dbconfig dbc = new dbconfig();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_patient");
            patienttable.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);    
        } 
    }
        public void reset(){
        id.setText("");
        lastname.setText("");
        firstname.setText("");
        middle.setText("");
        gender.setText("");
        status.setText("");
        address.setText("");
        email.setText("");
        contact.setText("");
        date.setText("");
        time.setText("");
        remark.setText("");
        
        
     
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        arrows = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        display = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patienttable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        middle = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        remark = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        status = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(183, 30, 30));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PATIENT APPOINTMENT LIST");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 50));

        arrows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pakage1/arrow2.png"))); // NOI18N
        arrows.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arrowsMouseClicked(evt);
            }
        });
        jPanel2.add(arrows, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 37, 31));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("X");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 40, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("__");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 40, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setBackground(new java.awt.Color(255, 255, 255));
        next.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        next.setForeground(new java.awt.Color(183, 30, 30));
        next.setText("BOOK APPOINTMENT");
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextMouseExited(evt);
            }
        });
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel3.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, -1, 30));

        display.setBackground(new java.awt.Color(255, 255, 255));
        display.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        display.setForeground(new java.awt.Color(183, 30, 30));
        display.setText("DISPLAY");
        display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                displayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                displayMouseExited(evt);
            }
        });
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        jPanel3.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 98, 30));

        patienttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patienttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patienttable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 860, 150));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Contact:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 80, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Lastname:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 80, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("First Name:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Middle Initial:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 80, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Address:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 80, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Email:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 80, 30));

        contact.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel3.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 310, 30));

        lastname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel3.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 310, 30));

        firstname.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel3.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 310, 30));

        middle.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel3.add(middle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 310, 30));

        gender.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel3.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 310, 30));

        email.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 310, 30));

        insert.setBackground(new java.awt.Color(255, 255, 255));
        insert.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        insert.setForeground(new java.awt.Color(183, 30, 30));
        insert.setText("INSERT");
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertMouseExited(evt);
            }
        });
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel3.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 98, 30));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(183, 30, 30));
        update.setText("UPDATE");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 100, 30));

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(183, 30, 30));
        clear.setText("CLEAR");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 100, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Gender:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 80, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Status");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 80, 30));

        date.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 310, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Date:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 80, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Time:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 80, 30));

        time.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 310, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Remark:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 80, 30));

        remark.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel3.add(remark, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 310, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("ID:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, 30));

        id.setEditable(false);
        id.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 310, 30));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(183, 30, 30));
        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 98, 30));

        status.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 310, 30));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane2.setViewportView(address);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 176, 310, 80));

        print.setBackground(new java.awt.Color(255, 255, 255));
        print.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        print.setForeground(new java.awt.Color(183, 30, 30));
        print.setText("PRINT");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel3.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 100, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
    User us = new User();
    us.setVisible(true);
    }//GEN-LAST:event_nextActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        displayData();
    }//GEN-LAST:event_displayActionPerformed

    private void displayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseEntered
        // TODO add your handling code here
        display.setBackground(new Color(183,30,30));
        display.setForeground(Color.WHITE);
    }//GEN-LAST:event_displayMouseEntered

    private void displayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseExited
        // TODO add your handling code here:
         display.setBackground(new Color(255,255,255));
        display.setForeground(new Color(183,30,30));
    }//GEN-LAST:event_displayMouseExited

    private void nextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseEntered
        // TODO add your handling code here:
        next.setBackground(new Color(183,30,30));
        next.setForeground(Color.WHITE);
    }//GEN-LAST:event_nextMouseEntered

    private void nextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseExited
        // TODO add your handling code here:
         next.setBackground(new Color(255,255,255));
        next.setForeground(new Color(183,30,30));
    }//GEN-LAST:event_nextMouseExited

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void insertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_insertMouseEntered

    private void insertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_insertMouseExited

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        
        if (lastname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Lastname!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(firstname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Firstname", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if (middle.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Middle Name!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(gender.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Gender!", "Error", JOptionPane.ERROR_MESSAGE);
            return;      
        }else if(status.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Status!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(email.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Email!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(address.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Address!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(contact.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Contact!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(date.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type the Date!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(time.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type the Time!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(remark.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type the Remark!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        
        dbconfig dbc = new dbconfig();
        dbc.insertData("INSERT INTO tbl_patient (p_lastname, p_firstname, p_middle, p_gender, p_status, p_email, p_address, p_contact, p_date, p_time, p_remark) "
                + "VALUES ('"+lastname.getText()+"', '"+firstname.getText()+"','"+middle.getText()+"','"+gender.getText()+"','"+status.getText()+"','"+email.getText()+"','"+address.getText()+"','"+contact.getText()+"','"+date.getText()+"','"+time.getText()+"','"+remark.getText()+"')");       
        displayData();
        reset();
    }//GEN-LAST:event_insertActionPerformed

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseExited

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        dbconfig dbc = new dbconfig();
        int num = dbc.updateData("UPDATE tbl_patient "
                + "SET p_lastname = '"+lastname.getText()+"', p_firstname='"+firstname.getText()+"', "
                        + "p_middle ='"+middle.getText()+"', p_gender='"+gender.getText()+"',p_status='"+status.getText()+ "',p_email='"+email.getText()+ "',p_address='"+address.getText()+ "',p_contact='"+contact.getText()+"',p_date='"+date.getText()+"',p_time='"
                                +time.getText()+"',p_remark='"+remark.getText()+"'"
                                + "WHERE p_id = '"+id.getText()+"'");
       
        if(num == 0){
           
        }else{
           JOptionPane.showMessageDialog(null, "Updated Successfully!");
           displayData();
           reset();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_clearMouseExited

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        reset();
    }//GEN-LAST:event_clearActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMouseExited

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int rowIndex = patienttable.getSelectedRow();
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select a data first");
       }else{
            TableModel model = patienttable.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
                    if(a==JOptionPane.YES_OPTION){  
                            dbconfig dbc = new dbconfig();
                            dbc.deleteData(Integer.parseInt(id));
                            displayData();
                            reset();
                    }    
       }
    }//GEN-LAST:event_deleteActionPerformed

    private void patienttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patienttableMouseClicked
       int rowIndex = patienttable.getSelectedRow();
        if(rowIndex < 0){
            
        }else{
            TableModel model = patienttable.getModel();
            id.setText(""+model.getValueAt(rowIndex,0));
            lastname.setText(""+model.getValueAt(rowIndex,1));
            firstname.setText(""+model.getValueAt(rowIndex,2));
            middle.setText(""+model.getValueAt(rowIndex,3));
            gender.setText(""+model.getValueAt(rowIndex,4));
            status.setText(""+model.getValueAt(rowIndex,5));
            email.setText(""+model.getValueAt(rowIndex,6));
            address.setText(""+model.getValueAt(rowIndex,7));
            contact.setText(""+model.getValueAt(rowIndex,8));
            date.setText(""+model.getValueAt(rowIndex,9));
            time.setText(""+model.getValueAt(rowIndex,10));
            remark.setText(""+model.getValueAt(rowIndex,11));
        }
        
    }//GEN-LAST:event_patienttableMouseClicked

    private void arrowsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrowsMouseClicked
        Admin ad = new Admin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_arrowsMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        int a=JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_printMouseExited

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
     MessageFormat header = new MessageFormat ("CLINIC APPOINTMENT TRACKER");
     MessageFormat footer = new MessageFormat ("Clinic Appointment Tracker");
       
    try{
       patienttable.print(JTable.PrintMode.NORMAL,header,footer);
    
    }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Cannot be print!"+e.getMessage());
    }
    
   
    }//GEN-LAST:event_printActionPerformed

public static void AddRowToJTable(Object[] dataRow){
           DefaultTableModel model = (DefaultTableModel)patienttable.getModel();
           model.addRow(dataRow);
       }
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
            java.util.logging.Logger.getLogger(patientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patientList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JLabel arrows;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField date;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField middle;
    private javax.swing.JButton next;
    public static javax.swing.JTable patienttable;
    private javax.swing.JButton print;
    private javax.swing.JTextField remark;
    private javax.swing.JTextField status;
    private javax.swing.JTextField time;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
