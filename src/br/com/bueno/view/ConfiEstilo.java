/**
 *
 * @author NILDO BUENO CORREIA FILHO  -
 * AXL - DESENVOLVIMENTO DE SISTEMAS
 * MSN: nil_bueno@hotmail.com
 * CACHOEIRO DE ITAPEMIRIN , 25 DE JUNHO DE 2011, 12:55:11
 */

package br.com.bueno.view;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class ConfiEstilo extends javax.swing.JFrame {

 String seta_look;


 
    public ConfiEstilo() {
        initComponents();
        setSize(466, 279);
        setResizable(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
    //    System.setProperty( "Quaqua.tabLayoutPolicy","wrap" );
        ler_ConfEstilo();
        seta_look = jTextField2.getText();
  
lookandfeel();

if(seta_look.equals("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"))
   {jc_select.setSelectedItem("NEW WINDOWS");}

else if (seta_look.equals("com.birosoft.liquid.LiquidLookAndFeel"))
   {jc_select.setSelectedItem("JAVA LIQUID");}

else if (seta_look.equals("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"))
   {jc_select.setSelectedItem("WINDOWS MS");}

else if (seta_look.equals("ch.randelshofer.quaqua.QuaquaLookAndFeel"))
   {jc_select.setSelectedItem("PIRATE MAC");}

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jc_select = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/button_ok.png"))); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/agt_add-to-desktop.png"))); // NOI18N
        jButton2.setText("Selecionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x48/kcoloredit.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/images/ESTILOSVISUAIS.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("ESTILO SELECIONADO"));

        jc_select.setFont(new java.awt.Font("Tahoma", 0, 12));
        jc_select.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "WINDOWS MS", "NEW WINDOWS", "JAVA LIQUID" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jc_select, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jc_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 3));
        jTextField1.setEnabled(false);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 3));
        jTextField2.setEnabled(false);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/agt_stop.png"))); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-466)/2, (screenSize.height-279)/2, 466, 279);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if(jc_select.getSelectedItem().equals("NEW WINDOWS"))
        {
            seta_look = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
           lookandfeel();jTextField1.setText(seta_look);
        }
        else if (jc_select.getSelectedItem().equals("JAVA LIQUID"))
        {
            seta_look = "com.birosoft.liquid.LiquidLookAndFeel";
            lookandfeel();
            jTextField1.setText(seta_look);
        }
        else if(jc_select.getSelectedItem().equals("WINDOWS MS"))
        {
            seta_look = "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";
            lookandfeel();
            jTextField1.setText(seta_look);
        }
        else if(jc_select.getSelectedItem().equals("PIRATE MAC"))
        {
            seta_look ="ch.randelshofer.quaqua.QuaquaLookAndFeel";
            lookandfeel();
            jTextField1.setText(seta_look);}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if (jTextField1.getText().isEmpty())
     {JOptionPane.showMessageDialog(null, "Selecione um estilo visual.","ALERTA DO SISTEMA",JOptionPane.WARNING_MESSAGE);}

     else if(jTextField1.getText().equals(seta_look)){int opcao;Object[] botoes = {" Sim "," Não "};
    opcao = JOptionPane.showOptionDialog(null, "Confirma A Escolha deste Estilo Visual?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                   if (opcao ==  JOptionPane.YES_OPTION) {
                       File dirAnalise = new File ("C:\\Arquivos de programas\\FileX\\EnginerX\\002\\SE0200ES.nbx");
                       FileOutputStream fluxInDirAnalise = null;
                       ObjectOutputStream fluxOutDirAnalise = null;
                       Object c1 = (Object)jTextField1.getText();
                          try
                            {
                              fluxInDirAnalise = new FileOutputStream(dirAnalise);
                              fluxOutDirAnalise = new ObjectOutputStream(fluxInDirAnalise);
                              fluxOutDirAnalise.writeObject(c1);
                              fluxOutDirAnalise.close();
                            }catch(Exception e){}
                            System.exit(0);
                   }
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfiEstilo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox jc_select;
    // End of variables declaration//GEN-END:variables

    public void lookandfeel()
           {
                try
                    {
                    UIManager.setLookAndFeel(seta_look);
                    SwingUtilities.updateComponentTreeUI(this);
                    }
                    catch (Exception erro)
                    {
                    JOptionPane.showMessageDialog(null,erro);
                    }
            }
    public void ler_ConfEstilo(){

        File confEst = new File ("C:\\Arquivos de programas\\FileX\\EnginerX\\002\\SE0200ES.nbx");
        FileInputStream fluxoArquivo = null;
        ObjectInputStream entradaObjeto = null;
        DataInputStream ob_Pri = null;
        try
           {
            fluxoArquivo = new FileInputStream(confEst);
            entradaObjeto = new ObjectInputStream(fluxoArquivo);
            ob_Pri = new DataInputStream( fluxoArquivo);
            String textChar = (String) entradaObjeto.readObject();
            jTextField2.setText(textChar);
            entradaObjeto.close();
            ob_Pri.close();
            }catch(Exception e){}
      }
}