/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credito_interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author HAN
 */
public class pichincha extends javax.swing.JFrame {

    /**
     * Creates new form pichincha
     */
    public pichincha() {
        initComponents();
         this.setLocationRelativeTo(null);
         inicio ventanauno =new inicio();
         nombre.setText(ventanauno.n); // ventana para que traiga el dato del nombre de la pantalla inicial//
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconp = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        educa = new javax.swing.JButton();
        vehi = new javax.swing.JButton();
        vivi = new javax.swing.JButton();
        libre = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        meses = new javax.swing.JTextField();
        credito = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        fija1 = new javax.swing.JLabel();
        testo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        fija = new javax.swing.JLabel();
        fondopp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/credito_interfaz/pichin.png"))); // NOI18N
        getContentPane().add(iconp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 90));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("REESTABLECER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        educa.setBackground(new java.awt.Color(255, 255, 0));
        educa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        educa.setText("educacion");
        educa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                educaActionPerformed(evt);
            }
        });
        getContentPane().add(educa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        vehi.setBackground(new java.awt.Color(255, 255, 0));
        vehi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vehi.setText("VEHICULO");
        vehi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiActionPerformed(evt);
            }
        });
        getContentPane().add(vehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        vivi.setBackground(new java.awt.Color(255, 255, 0));
        vivi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        vivi.setText("vivienda");
        vivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viviActionPerformed(evt);
            }
        });
        getContentPane().add(vivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        libre.setBackground(new java.awt.Color(255, 255, 0));
        libre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        libre.setText("LIBRE INVERSION");
        libre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                libreActionPerformed(evt);
            }
        });
        getContentPane().add(libre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("meses a diferir el credito:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 170, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("valor del credito:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 20));

        meses.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(meses, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 150, -1));

        credito.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, -1));

        total.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 170, 20));

        total1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        total1.setText("total a pagar es:");
        getContentPane().add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 170, 20));

        fija1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fija1.setText("cuota mensual es:");
        getContentPane().add(fija1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 170, 20));

        testo.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        getContentPane().add(testo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 460, 20));

        nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 200, 20));

        nombre1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombre1.setText("reciba un cordial saludo señor ,ra ");
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 320, 20));

        fija.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(fija, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 170, 20));

        fondopp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/credito_interfaz/pichin1.jpg"))); // NOI18N
        getContentPane().add(fondopp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         meses.setText(null);
         credito.setText(null);
        total.setText(null);
        fija.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void educaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_educaActionPerformed
        // TODO add your handling code here:
        double c,m,i,tc,tm,ti;

        c=Double.parseDouble(this.credito.getText());
        m=Double.parseDouble(this.meses.getText());
        

        tc=c*(1+(0.1/100));
        tm=tc/m;

        total.setText(String.valueOf(tc));
        fija.setText(String.valueOf(tm));
        
        testo.setText("USTED HA SELECIONADO EDUCACION CON UN EL INTERES DEL 0.1");
         
         inicio ventanauno =new inicio();
         nombre.setText(ventanauno.n);// ventana para que traiga el dato del nombre de la pantalla inicial//
         
    }//GEN-LAST:event_educaActionPerformed

    private void vehiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiActionPerformed
        // TODO add your handling code here:
         double c,m,i,tc,tm,ti;

        c=Double.parseDouble(this.credito.getText());
        m=Double.parseDouble(this.meses.getText());
        

        tc=c*(1+(0.3/100));
        tm=tc/m;

        total.setText(String.valueOf(tc));
        fija.setText(String.valueOf(tm));
        
        testo.setText("USTED HA SELECIONADO VEHICULO CON UN EL INTERES DEL 0.3");
    }//GEN-LAST:event_vehiActionPerformed

    private void viviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viviActionPerformed
        // TODO add your handling code here:
         double c,m,i,tc,tm,ti;

        c=Double.parseDouble(this.credito.getText());
        m=Double.parseDouble(this.meses.getText());
        

        tc=c*(1+(0.5/100));
        tm=tc/m;

        total.setText(String.valueOf(tc));
        fija.setText(String.valueOf(tm));
        
        testo.setText("USTED HA SELECIONADO VIVIENDA  CON UN EL INTERES DEL 0.5");
    }//GEN-LAST:event_viviActionPerformed

    private void libreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_libreActionPerformed
        // TODO add your handling code here:
         double c,m,i,tc,tm,ti;

        c=Double.parseDouble(this.credito.getText());
        m=Double.parseDouble(this.meses.getText());
        

        tc=c*(1+(1/100));
        tm=tc/m;

        total.setText(String.valueOf(tc));
        fija.setText(String.valueOf(tm));
        
        testo.setText("USTED HA SELECIONADO LIBRE INVERSION CON UN EL INTERES DEL 1");
    }//GEN-LAST:event_libreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"GRACIAS POR ELEGIRNOS");//mensaje generado antes de salir//
        System.exit(0);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pichincha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pichincha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pichincha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pichincha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pichincha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField credito;
    private javax.swing.JButton educa;
    private javax.swing.JLabel fija;
    private javax.swing.JLabel fija1;
    private javax.swing.JLabel fondopp;
    private javax.swing.JLabel iconp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton libre;
    private javax.swing.JTextField meses;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel testo;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total1;
    private javax.swing.JButton vehi;
    private javax.swing.JButton vivi;
    // End of variables declaration//GEN-END:variables
}
