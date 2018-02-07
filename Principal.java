
package examen2;

import static examen2.Banco.listaCuenta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    Banco banco = new Banco();
    String p="" ;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        buscar.setEnabled(false);
        retiro.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        nuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        balance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        interes = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        retiro = new javax.swing.JButton();
        tipoP = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cuenta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 21, -1, 22));

        nuevo.setText("Ingresar");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Balance");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 115, -1));
        getContentPane().add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 107, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Interes");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));
        getContentPane().add(interes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 107, -1));

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CuentaAhorros", "CuentaPrestamo", "CuentaHipoteca" }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 107, -1));

        jButton1.setText("Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 79, -1));

        buscar.setText("Depositar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        retiro.setText("Retirar");
        retiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retiroActionPerformed(evt);
            }
        });
        getContentPane().add(retiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 79, 20));

        tipoP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Natural", "Empresa", " " }));
        getContentPane().add(tipoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 115, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cuenta");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 450, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        String t = (String) this.tipo.getSelectedItem();
        if (t.equalsIgnoreCase("CuentaAhorros")) {
            buscar.setEnabled(true);
            retiro.setEnabled(true);

            CuentaAhorro c;
            double b = Double.parseDouble(this.balance.getText());
            double i = Double.parseDouble(this.interes.getText());
            c = new CuentaAhorro(this.nombre.getText(), (String) this.tipoP.getSelectedItem(), b, i);
            banco.agregar(c);
        }
        if (t.equalsIgnoreCase("CuentaHipoteca")) {
            buscar.setEnabled(true);
            retiro.setEnabled(false);
            CuentaHipoteca cH;
            double b1 = Double.parseDouble(this.balance.getText());
            double i1 = Double.parseDouble(this.interes.getText());
            cH = new CuentaHipoteca(this.nombre.getText(), (String) this.tipoP.getSelectedItem(), b1, i1);
            banco.agregar(cH);
        }
        if (t.equalsIgnoreCase("CuentaPrestamo")) {
            buscar.setEnabled(true);
            retiro.setEnabled(false);
            CuentaHipoteca cP;
            double b2 = Double.parseDouble(this.balance.getText());
            double i2 = Double.parseDouble(this.interes.getText());
            cP = new CuentaHipoteca(this.nombre.getText(), (String) this.tipoP.getSelectedItem(), b2, i2);
            banco.agregar(cP);
        }

// TODO add your handling code here:
    }//GEN-LAST:event_nuevoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        banco.presentar();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String n = this.nombre.getText();
        Cuenta cc = depositar(n);

        JOptionPane.showMessageDialog(null, cc);

        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void retiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retiroActionPerformed

        String n = this.nombre.getText();
        Cuenta cr = retirar(n);
        JOptionPane.showMessageDialog(null, cr);

// TODO add your handling code here:
    }//GEN-LAST:event_retiroActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            grabar();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            leer();// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    public void grabar() throws IOException {
        
        FileWriter fw = new FileWriter(new File(p + ".csv"));
        try {

            for (Cuenta cuenta : listaCuenta) {
                if (cuenta instanceof CuentaAhorro) {
                    fw.write("Cuenta Ahorro" + ";" + cuenta + "\n");
                }
                if (cuenta instanceof CuentaHipoteca) {
                    fw.write("Cuenta Hipoteca" + ";" + cuenta + "\n");
                }
                if (cuenta instanceof CuentaPrestamo) {
                    fw.write("Cuenta Prestamo" + ";" + cuenta + "\n");
                }

            }
            fw.close();
        } catch (IOException e) {
        }
    }

    public Cuenta depositar(String n) {
        for (Cuenta cuenta : listaCuenta) {
            if (n.equalsIgnoreCase(cuenta.getCliente())) {
                int d = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad a depositar"));
                cuenta.setBalance(cuenta.getBalance() + d);
                return cuenta;
            }
        }
        return null;
    }

    public Cuenta retirar(String n) {

        for (Cuenta cuenta : listaCuenta) {
            if (n.equalsIgnoreCase(cuenta.getCliente())) {
                if (cuenta instanceof CuentaHipoteca) {

                    break;
                } else {
                    int d = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad a retirar"));
                    cuenta.setBalance(cuenta.getBalance() - d);
                    return cuenta;
                }

            }
        }
        return null;
    }

    public void leer() throws IOException {
        String cadena;
        p = JOptionPane.showInputDialog(null, "Ingrese el nombre del archivo", "Banco");
        FileReader f = new FileReader(new File(p + ".csv"));
        BufferedReader b = new BufferedReader(f);
        String lista[] = new String[4];

        while ((cadena = b.readLine()) != null) {
            String l[] = cadena.split(";");
            System.out.println(l[0]);

            if (l[0].equalsIgnoreCase("Cuenta Ahorro")) {

                String x1[] = l[1].split(",");
                for (int i = 0; i < 4; i++) {
                    String x2[] = x1[i].split("=");

                    lista[i] = x2[1];
                }
                CuentaAhorro c;
                double lb = Double.parseDouble(lista[2]);
                double li = Double.parseDouble(lista[3]);
                c = new CuentaAhorro(lista[0], lista[1], lb, li);
                banco.agregar(c);

            }
            if (l[0].equalsIgnoreCase("Cuenta Hipoteca")) {
                CuentaHipoteca cH;
                String x1[] = l[1].split(",");
                for (int i = 0; i < 4; i++) {
                    String x2[] = x1[i].split("=");

                    lista[i] = x2[1];
                }
                CuentaAhorro c;
                double lb = Double.parseDouble(lista[2]);
                double li = Double.parseDouble(lista[3]);

                cH = new CuentaHipoteca(lista[0], lista[1], lb, li);
                banco.agregar(cH);
            }
            if (l[0].equalsIgnoreCase("Cuenta Prestamo")) {
                CuentaHipoteca cP;
                String x1[] = l[1].split(",");
                for (int i = 0; i < 4; i++) {
                    String x2[] = x1[i].split("=");

                    lista[i] = x2[1];
                }
                CuentaAhorro c;
                double lb = Double.parseDouble(lista[2]);
                double li = Double.parseDouble(lista[3]);

                cP = new CuentaHipoteca(lista[0], lista[1], lb, li);
                banco.agregar(cP);
            }
        }
        b.close();
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balance;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField interes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton retiro;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JComboBox<String> tipoP;
    // End of variables declaration//GEN-END:variables
}
