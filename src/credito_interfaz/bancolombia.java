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
public class bancolombia extends javax.swing.JFrame {

    /**
     * Creates new form bancolombia
     */
    public bancolombia() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        opcion = new javax.swing.JComboBox<>();
        valor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        meses = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        interes = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        totalc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalm = new javax.swing.JTextField();
        nombre1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        atras = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fondoc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bancolombia");
        setPreferredSize(new java.awt.Dimension(490, 520));
        setSize(new java.awt.Dimension(490, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/credito_interfaz/bancolom.png"))); // NOI18N
        getContentPane().add(iconc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 290, 70));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Destino del credito:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        opcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        opcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Educativo", "Vehiculo", "Vivienda", "Libre inversion" }));
        opcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionActionPerformed(evt);
            }
        });
        getContentPane().add(opcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        valor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 159, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Valor del credito:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Meses a diferir el credito: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        meses.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        meses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesesActionPerformed(evt);
            }
        });
        getContentPane().add(meses, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 159, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Interes del credito: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        interes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        interes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interesActionPerformed(evt);
            }
        });
        interes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                interesKeyTyped(evt);
            }
        });
        getContentPane().add(interes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 159, -1));

        calcular.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        calcular.setText("CALCULAR");
        calcular.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        totalc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        totalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalcActionPerformed(evt);
            }
        });
        getContentPane().add(totalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 157, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Valor total del credito:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Cuota mesual con interes:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        totalm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        totalm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalmActionPerformed(evt);
            }
        });
        getContentPane().add(totalm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 158, -1));

        nombre1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nombre1.setForeground(new java.awt.Color(51, 51, 51));
        nombre1.setText("Reciba un cordial saludo señor(a) ");
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 200, 20));

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        fondoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/credito_interfaz/bancocolo.jpg"))); // NOI18N
        getContentPane().add(fondoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(-580, -400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionActionPerformed
        String o=(String)opcion.getSelectedItem();

        if(o.equals("Vehiculo")){
            interes.setEditable(false);
            interes.setText("0.98");
        }else if(o.equals("Educativo")){
            interes.setEditable(false);
            interes.setText("1.2");
        }else if(o.equals("Libre inversion")){
            interes.setEditable(false);
            interes.setText(("2.04"));
        }else if(o.equals("Vivienda")){
            interes.setEditable(false);
            interes.setText("1.45");
        }else{
            JOptionPane.showMessageDialog(null,"Debe selecionar el destino de su credito");

        }
    }//GEN-LAST:event_opcionActionPerformed

    private void mesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesesActionPerformed

    private void interesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interesActionPerformed

    }//GEN-LAST:event_interesActionPerformed

    private void interesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_interesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_interesKeyTyped

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        double c,m,i,tc,tm,ti;

        c=Double.parseDouble(this.valor.getText());
        m=Double.parseDouble(this.meses.getText());
        i=Double.parseDouble(this.interes.getText());

        tc=c*(1+(i/100));
        tm=tc/m;

        totalc.setText(String.valueOf(tc));
        totalm.setText(String.valueOf(tm));
        totalc.setEditable(false);
        totalm.setEditable(false);

    }//GEN-LAST:event_calcularActionPerformed

    private void totalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalcActionPerformed

    private void totalmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalmActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        inicio abrir=new inicio();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        meses.setText(null);
        valor.setText(null);
        interes.setText(null);
        totalc.setText(null);
        totalm.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(bancolombia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bancolombia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bancolombia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bancolombia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bancolombia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton calcular;
    private javax.swing.JLabel fondoc;
    private javax.swing.JLabel iconc;
    private javax.swing.JTextField interes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField meses;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JComboBox<String> opcion;
    private javax.swing.JTextField totalc;
    private javax.swing.JTextField totalm;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
