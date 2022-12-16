/**
 *
 * @author NILDO BUENO CORREIA FILHO  -
 * AXL - DESENVOLVIMENTO DE SISTEMAS
 * MSN: nil_bueno@hotmail.com
 * CACHOEIRO DE ITAPEMIRIN , 15 DE JUNHO DE 2011, 10:20:45
 */

package br.com.bueno.view;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author  nb
 */
public class ConfDiretorios extends javax.swing.JFrame {

    /** Creates new form ConfDiretorios */
    public ConfDiretorios() {
        setSize(601, 339);
        setResizable(false);
        setLocationRelativeTo(null);
        initComponents();
        ler_Dir();
           jLabel3.setVisible(false);
        warningDir();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        bt_confirma_dir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        timer1.setDelay(500L);
        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bt_confirma_dir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x24/apply.png"))); // NOI18N
        bt_confirma_dir.setText("Confirmar");
        bt_confirma_dir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_confirma_dirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Diretório Analisado"));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x24/kfilereplace.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Diretório Arquivo Morto"));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x24/kfilereplace.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/images/CONFDIR.png"))); // NOI18N
        jLabel1.setText("DIRETÓRIOS DE ANALISE E SAIDA");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x48/folder_green.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x24/cancel.png"))); // NOI18N
        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText(" ERRO NO SISTEMA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_confirma_dir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(422, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_confirma_dir)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-601)/2, (screenSize.height-413)/2, 601, 413);
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    JFileChooser local = new JFileChooser();
    local.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
     int res = local.showSaveDialog(null);
     if(res == JFileChooser.FILES_AND_DIRECTORIES){

     }
     
   File diretorio = local.getSelectedFile();
   jTextField1.setText(String.valueOf(diretorio));
   if( jTextField1.getText().equals("null"))
   {
   jTextField1.setText("");


   }

}//GEN-LAST:event_jButton2ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    JFileChooser local = new JFileChooser();
    local.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
     int res = local.showSaveDialog(null);
     if(res == JFileChooser.FILES_AND_DIRECTORIES){
         
     }
     
   File diretorio = local.getSelectedFile();
  //JOptionPane.showMessageDialog(null, "Voce escolheu o diretório: " + diretorio.getName());
   jTextField2.setText(String.valueOf(diretorio));
   if( jTextField2.getText().equals("null"))
   {
   jTextField2.setText("");
   }

}//GEN-LAST:event_jButton4ActionPerformed



 public void warningDir(){

    if(jTextField1.getText().equals(jTextField2.getText()))
    {
       timer1.start();
    }else if(jTextField1.getText() != (jTextField2.getText())){
    
    }
 }

private void bt_confirma_dirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_confirma_dirActionPerformed
//if(jTextField1.getText().equals(jTextField2.getText()))
//{JOptionPane.showMessageDialog(null,"Não é permitida a Seleção de diretorios iguais\nEscolha diretórios de Análise e Saida distintos","Aviso",JOptionPane.WARNING_MESSAGE);}

if(jTextField1.getText().isEmpty() &  (jTextField2.getText().isEmpty()))
{JOptionPane.showMessageDialog(null,"Selecione os Diretórios Corretamente","Aviso",JOptionPane.WARNING_MESSAGE);}
else if(jTextField1.getText() != null & (jTextField2.getText().isEmpty()))
{JOptionPane.showMessageDialog(null,"Voçê Selecionou um Diretorio de Análise, porém Não Selecionou um Diretório de Saida","Aviso",JOptionPane.WARNING_MESSAGE);}
else if (jTextField1.getText().equalsIgnoreCase("\\") & (jTextField2.getText()!= null ))
{JOptionPane.showMessageDialog(null, "", "", JOptionPane.ERROR_MESSAGE);}
else if (jTextField1.getText() != null & (jTextField2.getText().equalsIgnoreCase("\\") ))
{JOptionPane.showMessageDialog(null, "", "", JOptionPane.ERROR_MESSAGE);}
else if (jTextField1.getText().equalsIgnoreCase("\\") & (jTextField2.getText().equalsIgnoreCase("\\") ))
{}
else if (jTextField1.getText().isEmpty() & (jTextField2.getText()!= null ))
{JOptionPane.showMessageDialog(null,"Voçê Selecionou um Diretorio de Saída, porém Não Selecionou um Diretório de Análise","AVISO DO SISTEMA",JOptionPane.WARNING_MESSAGE);}
else{int opcao;
                   Object[] botoes = {" SIM "," NÃO "};
                   opcao = JOptionPane.showOptionDialog(null, "Confirma A Escolha destes Diretorios de Analise e Saida?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                   if (opcao ==  JOptionPane.YES_OPTION) {
                
                         
                          File dirAnalise = new File ("C:\\Arquivos de programas\\FileX\\EnginerX\\004\\CA1000DA.nbx");
                          File dirSaida = new File ("C:\\Arquivos de programas\\FileX\\EnginerX\\004\\CS1000DS.nbx");
                          FileOutputStream fluxInDirAnalise = null;
                          FileOutputStream fluxInDirSaida = null;
                          ObjectOutputStream fluxOutDirAnalise = null;
                          ObjectOutputStream fluxOutDirSaida = null;       
                          Object c1 = (Object)jTextField1.getText();
                          Object c2 = (Object)jTextField2.getText();
                          try
                                {
                              fluxInDirAnalise = new FileOutputStream(dirAnalise);
                                    
                              fluxInDirSaida = new FileOutputStream(dirSaida);
                              
                              fluxOutDirAnalise = new ObjectOutputStream(fluxInDirAnalise);
                              
                              fluxOutDirSaida = new ObjectOutputStream(fluxInDirSaida);
                              
                              fluxOutDirAnalise.writeObject(c1);
                              fluxOutDirSaida.writeObject(c2);
                              
                          fluxOutDirAnalise.close();
                          fluxOutDirSaida.close();
                                }catch(Exception e){  }
                         dispose();
                 }
        }                
}//GEN-LAST:event_bt_confirma_dirActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
dispose();
}//GEN-LAST:event_jButton6ActionPerformed

private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime

    jLabel3.setVisible(true);
        try {
            Thread.sleep(500);
            jLabel3.setVisible(false);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConfDiretorios.class.getName()).log(Level.SEVERE, null, ex);
        }

}//GEN-LAST:event_timer1OnTime

    /**
    * @param args the command line arguments
    */
    public static void main( String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfDiretorios().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_confirma_dir;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables


     public void ler_Dir(){
 File LerDirAnalise = new File ("C:\\Arquivos de programas\\FileX\\EnginerX\\004\\CA1000DA.nbx");
 File LerDirAnalise1 = new File ("C:\\Arquivos de programas\\FileX\\EnginerX\\004\\CS1000DS.nbx");
 FileInputStream fluxoArquivo = null;
 ObjectInputStream entradaObjeto = null;
 DataInputStream ob_Pri = null;
 FileInputStream fluxoArquivo1 = null;
 ObjectInputStream entradaObjeto1 = null;
 DataInputStream ob_Pri1 = null;
    try
    {
    fluxoArquivo = new FileInputStream(LerDirAnalise);
    entradaObjeto = new ObjectInputStream(fluxoArquivo);
    ob_Pri = new DataInputStream( fluxoArquivo);
    fluxoArquivo1 = new FileInputStream(LerDirAnalise1);
    entradaObjeto1 = new ObjectInputStream(fluxoArquivo1);
    ob_Pri1 = new DataInputStream( fluxoArquivo1);
    String textDir = (String) entradaObjeto.readObject();
    String textDir1 = (String) entradaObjeto1.readObject();
    jTextField1.setText(textDir);
    jTextField2.setText(textDir1);
    entradaObjeto.close();
    ob_Pri.close();
    entradaObjeto1.close();
    ob_Pri1.close();

    }catch(Exception e){    }

  }
}