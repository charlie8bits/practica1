/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.awt.Component;
import java.awt.Label;
import java.awt.TextArea;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    public LSLCNC lst1;
    public LSLCNC lst2;
    ArrayList<String> lstPermutaciones;
    String objHilera = "";
    String objHileraIngresada="";

    public principal() {
        initComponents();
        lblNoGrafica1.setText("0");
        lblNoGrafica2.setText("0");
        txtDeleteNodo.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void Dibujar(LSLCNC lst, TextArea objTxt, JLabel lblGrafica,String hileraingresada) {
        long time = 5;
        int cont = 0;
        long count = 0;
        nodoSimple p = lst.primerNodo();
        //objTxt.setText("");
        if (hileraingresada.length()>0) {
            objTxt.append("LA HILERA INGRESADA ES : \"" + hileraingresada + "\"");
            objTxt.append("\n");
            objTxt.append("\n");
            objTxt.append("\n");
        }

        while (!lst.finDeRecorrido(p)) {
            try {
                count++;
                objTxt.append(p.retornaPermutacion());
                objTxt.append("\t");
                cont++;
                if (cont >= 6) {
                    objTxt.append("\n");
                    cont = 0;
                }
                p = p.retornaLiga();
                Thread.sleep(time);
            } catch (InterruptedException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        lblGrafica.setText(Objects.toString(count));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        canvas1 = new java.awt.Canvas();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtGrafica1 = new java.awt.TextArea();
        jPanel2 = new javax.swing.JPanel();
        txtGrafica2 = new java.awt.TextArea();
        jPanel4 = new javax.swing.JPanel();
        txtNoAleatorio = new javax.swing.JTextField();
        generarHileraAleatoria = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        txtHilera = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDeleteNodo = new javax.swing.JTextField();
        eliminarNodo = new javax.swing.JButton();
        ordenInverso = new javax.swing.JButton();
        ordenarAlfabeticamente = new javax.swing.JButton();
        eliminarPermutacionesRepetidas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNoGrafica1 = new javax.swing.JLabel();
        lblNoGrafica2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Permutaciones");

        txtGrafica1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGrafica1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGrafica1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtGrafica1.getAccessibleContext().setAccessibleName("");

        jTabbedPane1.addTab("Grafica  1", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGrafica2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGrafica2, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Grafica  2", jPanel2);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        generarHileraAleatoria.setText("Hilera Aleatoria");
        generarHileraAleatoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarHileraAleatoriaActionPerformed(evt);
            }
        });

        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });

        txtHilera.setToolTipText("");

        jLabel1.setText("Hilera :");

        eliminarNodo.setText("Eliminar nodo");
        eliminarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarNodoActionPerformed(evt);
            }
        });

        ordenInverso.setText("Orden inverso");
        ordenInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenInversoActionPerformed(evt);
            }
        });

        ordenarAlfabeticamente.setText("Ordenar");
        ordenarAlfabeticamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarAlfabeticamenteActionPerformed(evt);
            }
        });

        eliminarPermutacionesRepetidas.setText("Eliminar Repetidas");
        eliminarPermutacionesRepetidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPermutacionesRepetidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtNoAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(generarHileraAleatoria))
                    .addComponent(jLabel1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtHilera, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ordenInverso, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarPermutacionesRepetidas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtDeleteNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ordenarAlfabeticamente, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHilera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generarHileraAleatoria))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeleteNodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarNodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordenarAlfabeticamente)
                .addGap(4, 4, 4)
                .addComponent(ordenInverso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarPermutacionesRepetidas)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel2.setText("Grafica 1 :");

        jLabel3.setText("Grafica 2 :");

        lblNoGrafica1.setText("0");

        lblNoGrafica2.setText("0");

        jLabel4.setText("Numero de Permutaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNoGrafica2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNoGrafica1))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jSeparator1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblNoGrafica1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblNoGrafica2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTabbedPane1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarPermutacionesRepetidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPermutacionesRepetidasActionPerformed
       
        txtGrafica2.setText(" ELIMINAR REPETIDAS : \n \n" );
        
        nodoSimple p  = lst2.primero;
        
        while(lst2.finDeRecorrido(p)==false){
            nodoSimple y = p.retornaLiga();
            while(lst2.finDeRecorrido(y)==false){
                nodoSimple aux = y.retornaLiga();
                if(p.retornaPermutacion().equals(y.retornaPermutacion())){
                    lst2.desconectar(y);
                }
                y=aux;
            }
            p=p.retornaLiga();
        }
        
        Dibujar(lst2, txtGrafica2, lblNoGrafica2,objHileraIngresada);
        
        
    }//GEN-LAST:event_eliminarPermutacionesRepetidasActionPerformed

    private void ordenInversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenInversoActionPerformed
        txtGrafica2.setText(" ORDEN INVERSO : \n \n" );
        lst2.ordenInverso();
        Dibujar(lst2, txtGrafica2, lblNoGrafica2,objHileraIngresada);
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_ordenInversoActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        String hilera = txtHilera.getText();
        txtGrafica1.setText(null);
        if (hilera.length() > 0) {
            objHilera = hilera;
            Permutar objpermutar = new Permutar(hilera.length());
            lstPermutaciones = objpermutar.Permutacion(hilera);
            lst1 = new LSLCNC();
            lst2 = new LSLCNC();
            lst1.InsertarLista(lstPermutaciones);
            lst2.InsertarLista(lstPermutaciones);
            Thread r = new Thread() {

                @Override
                public void run() {
                    Dibujar(lst1, txtGrafica1, lblNoGrafica1,objHilera);
                }
            };
            r.start();

        } else {
            String msg = "La hilera no puede ser vacia ";
            JOptionPane.showMessageDialog((Component) evt.getSource(), msg, "Alerta", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_ingresarActionPerformed

    private void eliminarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarNodoActionPerformed

        nodoSimple x = lst2.buscarDato(txtDeleteNodo.getText());
        if (x != null) {
            txtGrafica2.setText("");
            lst2.borrar(x);
            txtGrafica2.setText(" ELIMINAR NODO : \n \n" );
            Dibujar(lst2, txtGrafica2, lblNoGrafica2,objHileraIngresada);
        }
        jTabbedPane1.setSelectedIndex(1);


    }//GEN-LAST:event_eliminarNodoActionPerformed

    private void generarHileraAleatoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarHileraAleatoriaActionPerformed

        String regex = "[0-9]+";
        String d = txtNoAleatorio.getText();
        if (d.length() > 0) {
            if (d.matches(regex) == false) {
                JOptionPane.showMessageDialog((Component) evt.getSource(), "debe ingresar numeros ", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            Permutar p = new Permutar();
            int num = Integer.parseInt(d);
            if (num > objHilera.length()) {
                String msg = "el numero ingresado no debe superar el tamaño de la hilera orginal";
                JOptionPane.showMessageDialog((Component) evt.getSource(), msg, "Alerta", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String objRandomHilera = p.RamdonHilera(num, objHilera);
            objHileraIngresada=objRandomHilera;
            p = new Permutar(objRandomHilera.length());
            ArrayList<String> lstPer = p.Permutacion(objRandomHilera);
            lst2 = new LSLCNC();
            lst2.InsertarLista(lstPer);
            Dibujar(lst2, txtGrafica2, lblNoGrafica2,objHileraIngresada);
            jTabbedPane1.setSelectedIndex(1);
        }

    }//GEN-LAST:event_generarHileraAleatoriaActionPerformed

    private void ordenarAlfabeticamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarAlfabeticamenteActionPerformed
      
//        nodoSimple p = lst2.ultimoNodo();
//        p=lst2.anterior(p);
//        nodoSimple x = lst2.anterior(p);
//        x=lst2.anterior(x);
//        lst2.Intercambiar(x, p);
        lst2.OrdenAlfabetico();
        Dibujar(lst2, txtGrafica2, lblNoGrafica2, objHileraIngresada);
        jTabbedPane1.setSelectedIndex(1);
        
    }//GEN-LAST:event_ordenarAlfabeticamenteActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton eliminarNodo;
    private javax.swing.JButton eliminarPermutacionesRepetidas;
    private javax.swing.JButton generarHileraAleatoria;
    private javax.swing.JButton ingresar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblNoGrafica1;
    private javax.swing.JLabel lblNoGrafica2;
    private javax.swing.JButton ordenInverso;
    private javax.swing.JButton ordenarAlfabeticamente;
    private javax.swing.JTextField txtDeleteNodo;
    private java.awt.TextArea txtGrafica1;
    private java.awt.TextArea txtGrafica2;
    private javax.swing.JTextField txtHilera;
    private javax.swing.JTextField txtNoAleatorio;
    // End of variables declaration//GEN-END:variables
}
