package credito_interfaz;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class inicio extends javax.swing.JFrame {

    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public static String n = "";
    //se hace la n una variable publica para el nombre//
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abrir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        año = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        dia = new javax.swing.JComboBox<>();
        banco = new javax.swing.JComboBox<>();
        fechaA = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abrir.setText("Continuar");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        getContentPane().add(abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese su nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione su banco:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 166, -1));

        año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año...", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1864", "1963", "1962", "1961", "1960" }));
        año.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoActionPerformed(evt);
            }
        });
        getContentPane().add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        banco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "BBVA", "Bancolombia", "Banco Caja Social", "Banco Pichincha" }));
        banco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bancoActionPerformed(evt);
            }
        });
        getContentPane().add(banco, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 166, -1));
        getContentPane().add(fechaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 80, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/credito_interfaz/slide-agustiniana-1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 590, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
        Calendar cal =new GregorianCalendar();
        int mesA=cal.get(Calendar.MONTH),anioA=cal.get(Calendar.YEAR),diaA=cal.get(Calendar.DAY_OF_MONTH);
    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        n =nombre.getText();
        // El nombre de la variable para que en las demas pantallas se pueda tomar el tomar el campo del nombre//
        int a=0,m=0,d=0;
        
        a=Integer.parseInt((String)año.getSelectedItem());
        m=Integer.parseInt((String)mes.getSelectedItem());
        d=Integer.parseInt((String)dia.getSelectedItem());
        
        int anioR=Math.abs(a-anioA);
        int mesR=mesA-m;
        int diaR=diaA-d;
        
        
        
        if(anioR<=18 && mesR<=0 && diaR<=0){
            JOptionPane.showMessageDialog(null,"Usted es menor de edad, no puede acceder a un credito");
        }else{
            String op=(String)banco.getSelectedItem();
            if(op.equals("BBVA")){
                bbva abrir=new bbva();
                abrir.setVisible(true);
                dispose();
            }else if(op.equals("Bancolombia")){
                bancolombia abrir=new bancolombia();
                abrir.setVisible(true);
                dispose();
            }else if(op.equals("Banco Caja Social")){
                social abrir=new social();
                abrir.setVisible(true);
                dispose();
            }else if(op.equals("Banco Pichincha")){
                pichincha abrir=new pichincha();
                abrir.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Debe seleccionar un banco");
            }
        }    
    }//GEN-LAST:event_abrirActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void añoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoActionPerformed
        
    }//GEN-LAST:event_añoActionPerformed

    private void bancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bancoActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrir;
    private javax.swing.JComboBox<String> año;
    private javax.swing.JComboBox<String> banco;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JLabel fechaA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
