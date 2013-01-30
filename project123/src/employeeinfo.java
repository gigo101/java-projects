/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class employeeinfo extends javax.swing.JFrame {
    /**
     * Creates new form employeeinfo
     */
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public employeeinfo() {
        initComponents();
        conn =javaconnect.ConnecrDb();
        Update_table();
        fillcombo();
        CurrentDate();
    }
   
    private void Update_table(){
        
        try{
            //Statement st=conn.createStatement();
            String sql="Select employeeid, name, surname, age from employeeinfo";
            
            //rs=st.executeQuery(sql); //if using simple query not prepared statment
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            Table_employee.setModel(DbUtils.resultSetToTableModel(rs));     
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);    
            
        } finally{
            try {
                rs.close();
                pst.close();
                                
            } catch (Exception e) {
            }
        }
        
    }
    
    
    private void Update_Table_search_surname(){
        try{
            //Statement st=conn.createStatement();
            String sql="Select employeeid, name, surname, age from employeeinfo where surname=?";
            
            //rs=st.executeQuery(sql); //if using simple query not prepared statment
            pst=conn.prepareStatement(sql);
            pst.setString(1, txt_surname.getText());
            rs=pst.executeQuery();
            
            Table_employee.setModel(DbUtils.resultSetToTableModel(rs));     
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);    
            
        } finally{
            try {
                rs.close();
                pst.close();
                                
            } catch (Exception e) {
            }
        }
    }
    
    
    private void fillcombo(){
        try{
            String sql="Select employeeid, name, surname, age from employeeinfo";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            while(rs.next()){
                String name= rs.getString("name");
                Combox_Name.addItem(name);
            }
                        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);                
        } finally{
            try {
                rs.close();
                pst.close();
                
            } catch (Exception e) {
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        txt_employeeid = new javax.swing.JTextField();
        txt_firstname = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Combox_Name = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_employee = new javax.swing.JTable();
        cmdSave = new javax.swing.JButton();
        cmdNew = new javax.swing.JButton();
        cmdDelete = new javax.swing.JButton();
        cmd_update = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmd_search = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mnuNew = new javax.swing.JMenuItem();
        mnuClose = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuDate = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txt_employeeid.setEnabled(false);

        jLabel3.setText("Last Name");

        Combox_Name.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Combox_NamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        Combox_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combox_NameActionPerformed(evt);
            }
        });

        jLabel4.setText("Age");

        jLabel2.setText("First Name");

        jLabel1.setText("Employee ID");

        Table_employee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Table_employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_employeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_employee);

        cmdSave.setText("Save");
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        cmdNew.setText("New");
        cmdNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNewActionPerformed(evt);
            }
        });

        cmdDelete.setText("Delete");
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmd_update.setText("Update");
        cmd_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_updateActionPerformed(evt);
            }
        });

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        jLabel5.setText("Search");

        cmd_search.setText("....");
        cmd_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combox_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_employeeid, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmd_search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmdDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmd_update, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(Combox_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txt_employeeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(cmd_search)
                        .addGap(76, 76, 76)
                        .addComponent(cmdSave)
                        .addGap(12, 12, 12)
                        .addComponent(cmdNew)
                        .addGap(6, 6, 6)
                        .addComponent(cmdDelete)
                        .addGap(17, 17, 17)
                        .addComponent(cmd_update))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel2, gridBagConstraints);

        jMenu3.setText("File");

        mnuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnuNew.setText("New");
        mnuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNewActionPerformed(evt);
            }
        });
        jMenu3.add(mnuNew);

        mnuClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuClose.setText("Close");
        mnuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCloseActionPerformed(evt);
            }
        });
        jMenu3.add(mnuClose);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        mnuDate.setText("Date");
        jMenuBar2.add(mnuDate);

        setJMenuBar(jMenuBar2);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-848)/2, (screenSize.height-508)/2, 848, 508);
    }// </editor-fold>//GEN-END:initComponents

    private void Combox_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combox_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combox_NameActionPerformed

    private void Table_employeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_employeeMouseClicked
        // TODO add your handling code here:
        try {
            int row=Table_employee.getSelectedRow();
            String Table_click= (Table_employee.getModel().getValueAt(row, 0).toString());    
            String sql="Select employeeid, name, surname, age from employeeinfo where employeeid='"+Table_click+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            if(rs.next()){
                
                String emptxt=rs.getString("employeeid");
                txt_employeeid.setText(emptxt);
                
                String nametxt=rs.getString("name");
                txt_firstname.setText(nametxt);
                
                String lasttxt=rs.getString("surname");
                txt_surname.setText(lasttxt);
                
                String agetxt=rs.getString("age");
                txt_age.setText(agetxt);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
                
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_Table_employeeMouseClicked

    private void Combox_NamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Combox_NamePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String tmp = (String)Combox_Name.getSelectedItem();
        try {
            String sql="Select * from employeeinfo where name=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, tmp);
            rs=pst.executeQuery();
            
            if(rs.next()){
                String emptxt=rs.getString("employeeid");
                txt_employeeid.setText(emptxt);
                
                String firstnametxt=rs.getString("name");
                txt_firstname.setText(firstnametxt);
                
                String surnametxt=rs.getString("surname");
                txt_surname.setText(surnametxt);
                
                String agetxt=rs.getString("age");
                txt_age.setText(agetxt);
                
            
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);                 
        }finally{
            try {
                rs.close();
                pst.close();
                
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_Combox_NamePopupMenuWillBecomeInvisible

    public void CurrentDate(){
        Calendar cal=new GregorianCalendar();
        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        
        mnuDate.setText((month+1) + "/ "+ day +"/ " + year);
    
    }
    
    private void mnuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuNewActionPerformed

    private void mnuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCloseActionPerformed
        // TODO add your handling code here:
        System.exit(1);
       
    }//GEN-LAST:event_mnuCloseActionPerformed

    private void cmdNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNewActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new user_ino().setVisible(true);
    }//GEN-LAST:event_cmdNewActionPerformed

    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        // TODO add your handling code here:
        int p=JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
       
        if (p==0){
        
        try {
            String sql="Delete from employeeinfo where employeeid=?";
            String idnum=txt_employeeid.getText();
            pst=conn.prepareStatement(sql);
            pst.setString(1, idnum);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Data deleted!"); 
            Update_table();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);                 
            
        }
        
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed
        // TODO add your handling code here:
        try {
            String sql ="Insert into employeeinfo (name,surname,age,username,password) values (?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
      
            String txtname= txt_surname.getText();
            String txtsurname= txt_surname.getText();
            String txtage= txt_age.getText();
            
            pst.setString(1, txtname);
            pst.setString(2, txtsurname);
            pst.setString(3, txtage);
            pst.setString(4, "user");
            pst.setString(5, "password");
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Data saved!"); 
            Update_table();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);                 
            
        }
    }//GEN-LAST:event_cmdSaveActionPerformed

    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_updateActionPerformed
        // TODO add your handling code here:
        try {
            
            String txtidnum= txt_employeeid.getText();
            String txtname= txt_surname.getText();
            String txtsurname= txt_surname.getText();
            String txtage= txt_age.getText();
            String sql ="Update employeeinfo set employeeid='"+txtidnum+"',name='"+txtname+"',surname='"+txtsurname +"',age='"+txtage+"' where employeeid='"+txtidnum+"'";
            pst=conn.prepareStatement(sql);
                       
            //pst.setString(1, txtidnum);
            //pst.setString(2, txtname);
            //pst.setString(3, txtsurname);
            //pst.setString(4, txtage);
            //pst.setString(5, "user");
            //pst.setString(6, "password");
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Data updated!"); 
            Update_table();
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmd_updateActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_searchKeyPressed

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_searchKeyTyped

    private void cmd_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_searchActionPerformed
        // TODO add your handling code here:

        try {
            String sql="Select employeeid, name, surname, age from employeeinfo where surname  like '%"+txt_search.getText()+"%'";
          //  like '%" + jTextField1.getText() + "%'
            String searchstring=txt_search.getText();
           //pst=conn.prepareStatement(sql);
           // pst.setString(1, searchstring);
            //rs=pst.executeQuery();
            Statement st=conn.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next()){
                txt_employeeid.setText(rs.getString("employeeid"));
                txt_firstname.setText(rs.getString("name"));
                txt_surname.setText(rs.getString("surname"));
                txt_age.setText(rs.getString("age"));
            
            }  
            Update_Table_search_surname();            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);   
        }
        
        try {
            String sql="Select employeeid, name, surname, age from employeeinfo where name= ?";
            String searchstring=txt_search.getText();
            pst=conn.prepareStatement(sql);
            pst.setString(1, searchstring);
            rs=pst.executeQuery();
            
            if(rs.next()){
                txt_employeeid.setText(rs.getString("employeeid"));
                txt_firstname.setText(rs.getString("name"));
                txt_surname.setText(rs.getString("surname"));
                txt_age.setText(rs.getString("age"));
            
            }
            Update_Table_search_surname();            
          
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);                 
            
        }
        
        try {
            String sql="Select employeeid, name, surname, age from employeeinfo where employeeid= ?";
            String searchstring=txt_search.getText();
            pst=conn.prepareStatement(sql);
            pst.setString(1, searchstring);
            rs=pst.executeQuery();
            
            if(rs.next()){
                txt_employeeid.setText(rs.getString("employeeid"));
                txt_firstname.setText(rs.getString("name"));
                txt_surname.setText(rs.getString("surname"));
                txt_age.setText(rs.getString("age"));
            
            }
            
            Update_Table_search_surname( );
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);                 
            
        }
    }//GEN-LAST:event_cmd_searchActionPerformed

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
            java.util.logging.Logger.getLogger(employeeinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new employeeinfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combox_Name;
    private javax.swing.JTable Table_employee;
    private javax.swing.JButton cmdDelete;
    private javax.swing.JButton cmdNew;
    private javax.swing.JButton cmdSave;
    private javax.swing.JButton cmd_search;
    private javax.swing.JButton cmd_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuClose;
    private javax.swing.JMenu mnuDate;
    private javax.swing.JMenuItem mnuNew;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_employeeid;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_surname;
    // End of variables declaration//GEN-END:variables
}