/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGINS;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.text.*;
import java.awt.print.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import javafx.print.Printer;
import javax.swing.JTextArea;



public class RentalS extends javax.swing.JFrame {

  
    public RentalS() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextCustomerID = new javax.swing.JTextField();
        jTextFirstName = new javax.swing.JTextField();
        jTextAddress = new javax.swing.JTextField();
        jTextPostcode = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextProveOfID = new javax.swing.JComboBox<>();
        jTextSurName = new javax.swing.JTextField();
        jTextDeposit = new javax.swing.JTextField();
        jTextDownPayment = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextTown2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextNumberOfRooms = new javax.swing.JComboBox<>();
        jTextCost = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextTotalPayment = new javax.swing.JTextField();
        jTextElectricity = new javax.swing.JTextField();
        jTextLocalTax = new javax.swing.JTextField();
        jTextWaterBill = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        RentalButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        PrintButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Home Rental System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 1370, 150));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("ID PROVE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Customer details");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Town");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("SellerID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("FirstName");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("SurName");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Address");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("PostCode");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jTextCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCustomerIDActionPerformed(evt);
            }
        });
        jPanel2.add(jTextCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 180, 30));
        jPanel2.add(jTextFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, 30));

        jTextAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAddressActionPerformed(evt);
            }
        });
        jPanel2.add(jTextAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 180, 30));
        jPanel2.add(jTextPostcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 180, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("downpayment");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jTextProveOfID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "licence", "student id", "passport" }));
        jPanel2.add(jTextProveOfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 130, 30));
        jPanel2.add(jTextSurName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 180, 30));
        jPanel2.add(jTextDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 180, 30));

        jTextDownPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDownPaymentActionPerformed(evt);
            }
        });
        jPanel2.add(jTextDownPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 180, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("deposit");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));
        jPanel2.add(jTextTown2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 180, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 860, 360));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 390, 380));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 180, 450, 430));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Cost");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Location");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cairo", "alex", "giza" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, 30));

        jTextNumberOfRooms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel4.add(jTextNumberOfRooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 130, 30));

        jTextCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCostActionPerformed(evt);
            }
        });
        jPanel4.add(jTextCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("number of rooms");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 450, 250));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Total payment");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Electricity");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("LocalTax");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("WaterBill");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jTextTotalPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTotalPaymentActionPerformed(evt);
            }
        });
        jPanel5.add(jTextTotalPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 180, 30));
        jPanel5.add(jTextElectricity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 180, 30));
        jPanel5.add(jTextLocalTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, 30));
        jPanel5.add(jTextWaterBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 180, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 420, 250));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RentalButton.setText("Rental");
        RentalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentalButtonActionPerformed(evt);
            }
        });
        jPanel6.add(RentalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 90, 40));

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        jPanel6.add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 80, 40));

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel6.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 90, 40));

        PrintButton.setText("Print");
        PrintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtonActionPerformed(evt);
            }
        });
        jPanel6.add(PrintButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 58, 90, 40));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 630, 460, 160));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTotalPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTotalPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTotalPaymentActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
       
       jTextCustomerID.setText(null);
            jTextFirstName.setText(null);
            jTextSurName.setText(null);
        jTextAddress.setText(null);
        jTextPostcode.setText(null);
        jTextTown2.setText(null);
        jTextDeposit.setText(null);
            jTextDownPayment.setText(null);
            jTextCost.setText(null);
            jTextElectricity.setText(null);
            jTextWaterBill.setText(null);
            jTextLocalTax.setText(null);
            jTextTotalPayment.setText(null);
            jTextArea2.setText(null);
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void jTextAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAddressActionPerformed

    private void jTextCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCostActionPerformed

    private void RentalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentalButtonActionPerformed
         Customer iCustomer= new Customer();
        Rental iRental= new Rental();
        Utilities iUtilities= new Utilities();
        
        double iCustDeposit, iCustPayment, icost , ilocalTax , iwaterBill , ielectricity ;
        String strCost;
         iCustDeposit= Double.parseDouble(jTextDeposit.getText());
        iCustPayment= Double.parseDouble(jTextDownPayment.getText());
        icost= Double.parseDouble(jTextCost.getText());
        
        ilocalTax= Double.parseDouble(jTextLocalTax.getText());
       iwaterBill= Double.parseDouble(jTextWaterBill.getText());
        ielectricity= Double.parseDouble(jTextElectricity.getText());
        
        
        iCustomer.setDeposit(iCustDeposit);
        iCustomer.setDownPayment(iCustPayment);
        
        iRental.setCost(icost);
        iUtilities.setElectricity(ielectricity);
        iUtilities.setLocalTax(ilocalTax);
        iUtilities.setWaterbill(iwaterBill);
        
        strCost=String.format("*&.2f", iCustomer.getDeposit()+ iCustomer.getDownPayment()+ iRental.getCost()+iUtilities.getElectricity()+iUtilities.getLocalTax()+iUtilities.getWaterbill());
      jTextTotalPayment.setText(strCost);
        jTextArea2.append("\tRent Managment System"+"\n"+"------------------------------------------------------------------------------------"+"\n");
        jTextArea2.append("CustomerID"+"\t\t\t"+ jTextCustomerID.getText() +"\n");
        jTextArea2.append("FirstName"+"\t\t\t"+ jTextFirstName.getText()+"\n");
        jTextArea2.append("surname"+"\t\t\t"+ jTextSurName.getText()+"\n");
        jTextArea2.append("Postcode"+"\t\t\t"+ jTextPostcode.getText() + "\n");
        jTextArea2.append("ProveofID"+"\t\t\t"+ jTextProveOfID.getSelectedItem() + "\n");
        jTextArea2.append("Town"+"\t\t\t"+ jTextTown2.getText() + "\n");
        
        jTextArea2.append("Deposit"+"\t\t\t"+ jTextDeposit.getText() + "\n");
        jTextArea2.append("Down Payment"+"\t\t\t"+ jTextDownPayment.getText() + "\n");
        jTextArea2.append("Number of rooms"+"\t\t\t"+ jTextNumberOfRooms.getSelectedItem() + "\n");        
        
        jTextArea2.append("electricity"+"\t\t\t"+ jTextElectricity.getText() + "\n");
        jTextArea2.append("local bill"+"\t\t\t"+ jTextLocalTax.getText() + "\n");
        jTextArea2.append("water bill"+"\t\t\t"+ jTextWaterBill.getText() + "\n");
        
        jTextArea2.append("Total Payment"+"\t\t\t" + jTextTotalPayment.getText() + "\n");
    }//GEN-LAST:event_RentalButtonActionPerformed

    private void jTextDownPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDownPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDownPaymentActionPerformed

    private void PrintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtonActionPerformed
try{
    {
    boolean complete=jTextArea2.print();
    
    if(complete){
        JOptionPane.showMessageDialog(null,"Done Printing","information",JOptionPane.INFORMATION_MESSAGE);
    }
    else{
                JOptionPane.showMessageDialog(null,"Printing","printer",JOptionPane.ERROR_MESSAGE);

            }
    }
    
}    

catch(PrinterException ex){
    Logger.getLogger(RentalS.class.getName()).log(Level.SEVERE,null,ex);
    

        }  
    }//GEN-LAST:event_PrintButtonActionPerformed

    private void jTextCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCustomerIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(RentalS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentalS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentalS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentalS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentalS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton PrintButton;
    private javax.swing.JButton RentalButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextCost;
    private javax.swing.JTextField jTextCustomerID;
    private javax.swing.JTextField jTextDeposit;
    private javax.swing.JTextField jTextDownPayment;
    private javax.swing.JTextField jTextElectricity;
    private javax.swing.JTextField jTextFirstName;
    private javax.swing.JTextField jTextLocalTax;
    private javax.swing.JComboBox<String> jTextNumberOfRooms;
    private javax.swing.JTextField jTextPostcode;
    private javax.swing.JComboBox<String> jTextProveOfID;
    private javax.swing.JTextField jTextSurName;
    private javax.swing.JTextField jTextTotalPayment;
    private javax.swing.JTextField jTextTown2;
    private javax.swing.JTextField jTextWaterBill;
    // End of variables declaration//GEN-END:variables
}
