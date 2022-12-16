/**
 *
 * @author NILDO BUENO CORREIA FILHO  -
 * AXL - DESENVOLVIMENTO DE SISTEMAS
 * MSN: nil_bueno@hotmail.com
 * CACHOEIRO DE ITAPEMIRIN , 26 DE JUNHO DE 2011, 19:14
 */

package br.com.bueno.view;

import br.com.bueno.util.data2;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class ZipaView extends javax.swing.JFrame {
data2 mostra_data;
static final int TAM_BUFFER = 1024;
    public ZipaView() {
        initComponents();
        setSize(625, 570);
        setLocationRelativeTo(null);
        setResizable(false);
        mostra_data = new data2();
        mostra_data.le_data();
        mostra_data.le_hora();
        timer1.start();
        setaData();
        
        jTextField4.setVisible(false);
        jTextField6.setVisible(false);
        jTextField5.setVisible(false);
        tf_nomeArquivo.setEnabled(false);
        tf_nomeArquivo.setEditable(false);
        jLabel7.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        testePesquisaJcalendar1 = new br.com.bueno.view.TestePesquisaJcalendar();
        bt_compactar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_sair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bt_novo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_logs = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        tf_dirDestino = new javax.swing.JTextField();
        tf_dirLocal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nomeArquivo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bt_compactar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/button_ok.png"))); // NOI18N
        bt_compactar.setText("compactar");
        bt_compactar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_compactarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x48/zip-icone-8264-48.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/images/CPA.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/cancel.png"))); // NOI18N
        bt_sair.setText("Sair");
        bt_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sairActionPerformed(evt);
            }
        });

        jLabel7.setText(" ");

        bt_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/filenew.png"))); // NOI18N
        bt_novo.setText("Novo");
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("LOG DE SAIDA"));

        ta_logs.setColumns(20);
        ta_logs.setRows(5);
        ta_logs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        ta_logs.setEnabled(false);
        jScrollPane1.setViewportView(ta_logs);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel3.setText("C:\\");

            jTextField6.setEditable(false);
            jTextField6.setFont(new java.awt.Font("Tahoma", 0, 1));

            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Diretorio Arquivos"));

            tf_dirDestino.setEditable(false);
            tf_dirDestino.setFont(new java.awt.Font("Tahoma", 0, 12));
            tf_dirDestino.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

            tf_dirLocal.setEditable(false);
            tf_dirLocal.setFont(new java.awt.Font("Tahoma", 0, 12));
            tf_dirLocal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

            jLabel4.setText("Local");

            jLabel6.setText("Destino");

            tf_nomeArquivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
            tf_nomeArquivo.addFocusListener(new java.awt.event.FocusAdapter() {
                public void focusLost(java.awt.event.FocusEvent evt) {
                    tf_nomeArquivoFocusLost(evt);
                }
            });

            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/fileopen.png"))); // NOI18N
            jButton1.setEnabled(false);
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/folder_sent_mail.png"))); // NOI18N
            jButton2.setEnabled(false);
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            jLabel5.setText("Nome do Arquivo");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_nomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tf_dirLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                                .addComponent(tf_dirDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(tf_nomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(tf_dirLocal))
                            .addGap(28, 28, 28))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tf_dirDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap())
            );

            jTextField4.setEditable(false);
            jTextField4.setFont(new java.awt.Font("Tahoma", 0, 1));

            jTextField5.setEditable(false);
            jTextField5.setFont(new java.awt.Font("Tahoma", 0, 1));

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(62, 62, 62)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(180, 180, 180)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(635, 635, 635))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(227, Short.MAX_VALUE)
                    .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)
                    .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)
                    .addComponent(bt_compactar)
                    .addGap(43, 43, 43))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_compactar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_novo))
                    .addGap(1, 1, 1)
                    .addComponent(jLabel7)
                    .addContainerGap())
            );

            java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
            setBounds((screenSize.width-625)/2, (screenSize.height-570)/2, 625, 570);
        }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void bt_compactarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_compactarActionPerformed
      
        String erroCampoNull = "null\\";

        jLabel3.setText(tf_dirDestino.getText() +tf_nomeArquivo.getText()+"_"+jTextField6.getText()+".zip");
       if(tf_dirLocal.getText().isEmpty() &  (tf_dirDestino.getText().isEmpty()) & (tf_nomeArquivo.getText().isEmpty()))
        {
            JOptionPane.showMessageDialog(null,"Não há Diretórios selecionados.\nNão há Nome de Arquivo Declarado","Aviso",JOptionPane.WARNING_MESSAGE);}
       else if(tf_dirLocal.getText() != null & (tf_dirDestino.getText().isEmpty()) & (tf_nomeArquivo.getText().isEmpty()))
        {
            JOptionPane.showMessageDialog(null," Voçê Selecionou um Local.\nPorém Não Selecionou um Destino.\nNão há Nome de Arquivo Declarado","Aviso",JOptionPane.WARNING_MESSAGE);}
       else if (tf_dirLocal.getText().isEmpty() & (tf_dirDestino.getText()!= null ) & (tf_nomeArquivo.getText().isEmpty()))
        {
            JOptionPane.showMessageDialog(null," Voçê Selecionou um Destino.\nPorém Não Selecionou um Local\nNão há Nome de Arquivo Declarado","Aviso",JOptionPane.WARNING_MESSAGE);}
        else if (tf_dirLocal.getText() != null & (tf_dirDestino.getText()!= null ) & (tf_nomeArquivo.getText().isEmpty()))
        {
            JOptionPane.showMessageDialog(null," Voçê Selecionou Diretorios de Entrada e Saida.\nPorém Não há Nome de Arquivo Declarado","Aviso",JOptionPane.WARNING_MESSAGE);}
       else if (tf_dirLocal.getText().isEmpty() & (tf_dirDestino.getText().isEmpty()) & (tf_nomeArquivo.getText() != null))
        {
            JOptionPane.showMessageDialog(null," Voçê Declarou um Nome de Arquivo.\nPorém não há Diretorios Selecionados","Aviso",JOptionPane.WARNING_MESSAGE);}
        else if (tf_dirLocal.getText().equals("null\\") & (tf_dirDestino.getText().isEmpty()) & (tf_nomeArquivo.getText() != null))
        {
            JOptionPane.showMessageDialog(null," Voçê Cancelou Selecionamento do Diretorio do Campo 'Local'","Aviso",JOptionPane.WARNING_MESSAGE);}
        else if (tf_dirLocal.getText().equals("null\\") & (tf_dirDestino.getText().equals("null\\")) & (tf_nomeArquivo.getText() != null))
        {
            JOptionPane.showMessageDialog(null," Voçê Cancelou Selecionamento dos Diretórios.\nPrencha todos os campos!","Aviso",JOptionPane.WARNING_MESSAGE);}
        else if (tf_dirLocal.getText().equals("null\\") & (tf_dirDestino.getText() != null) & (tf_nomeArquivo.getText() != null))
        {
            JOptionPane.showMessageDialog(null," Voçê Cancelou Selecionamento do Diretorio do Campo 'Destino'","Aviso",JOptionPane.WARNING_MESSAGE);}
        else if (tf_dirLocal.getText() != null & (tf_dirDestino.getText().equals("null\\")) & (tf_nomeArquivo.getText() != null))
        {
            JOptionPane.showMessageDialog(null," Voçê Cancelou Selecionamento dos Diretórios.\nPrencha todos os campos!","Aviso",JOptionPane.WARNING_MESSAGE);}
        else if (tf_dirLocal.getText().isEmpty() & (tf_dirDestino.getText()!= null) & (tf_nomeArquivo.getText() != null))
        {
            JOptionPane.showMessageDialog(null," Voçê nao Selecionou Diretórios de Arquivos para Compactar.\nPrencha todos os campos!","Aviso",JOptionPane.WARNING_MESSAGE);
            bt_novo.doClick();
        }


        else{
          String    or =  tf_dirLocal.getText();
          String    de = jLabel3.getText();
          String origem = or;
          String destino = de;
        try
        {
        File  arq = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream buffer = null;
        ZipOutputStream zip = null;
        ZipEntry entry = null;
        byte[] dados = new byte [TAM_BUFFER];
        fos = new FileOutputStream(destino);
        zip = new ZipOutputStream(new BufferedOutputStream(fos));
        arq = new File(origem);
        
        String [] arquivos = arq.list();
                for(int i = 0 ; i < (arquivos.length); i++)
                {
                    arquivos[i] = origem + arquivos[i];
                        if (!(arquivos[i].equals(destino)));
                           {
                            File arquivo = new File (arquivos[i]);
                                 if(arquivo.isFile())
                                 {
                                     ta_logs.append("COMPACTANDO "+arquivos[i]+"\n");
                                     
                                    int  l = i;
                                     jLabel7.setText("TOTAL ARQUIVOS COMPACTADOS: "+String.valueOf(l));
                                    
                                        fis = new FileInputStream(arquivos[i]);
                                        buffer = new BufferedInputStream(fis,TAM_BUFFER);
                                        entry = new ZipEntry(arquivos[i]);
                                        zip.putNextEntry(entry);

                                        int len;
                                        while((len = buffer.read(dados)) > 0)
                                          {zip.write(dados, 0, len);}
                                          buffer.close();
                                      }
                               }
                        }
                        zip.close();
                
                        jLabel2.setText("COMPACTAR ARQUIVOS");
                        ta_logs.append(jLabel7.getText()+"\n");
       ta_logs.append("Operação Realizada com Sucesso!"+"\n");
       tf_nomeArquivo.setText("");
       tf_dirLocal.setText("");
       tf_dirDestino.setText("");
       tf_nomeArquivo.setEnabled(false);
       tf_nomeArquivo.setEditable(false);


        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Não Foi Possivel Compactar Diretórios.\nInforme o Erro ao Suporte.\n" +e, "AVISO DO SISTEMA",JOptionPane.ERROR_MESSAGE );}}
    }//GEN-LAST:event_bt_compactarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    JFileChooser local = new JFileChooser();
    local.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
     int res = local.showSaveDialog(null);
     if(res == JFileChooser.FILES_AND_DIRECTORIES){
     }
   File diretorio = local.getSelectedFile();
   tf_dirLocal.setText(String.valueOf(diretorio)+"\\");
   if(tf_dirLocal.getText().equals("null\\"))
   {
   tf_dirLocal.setText("");
   }
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    JFileChooser local = new JFileChooser();
    local.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int res = local.showSaveDialog(null);
    if(res == JFileChooser.FILES_AND_DIRECTORIES){

     }

   File diretorio = local.getSelectedFile();
   String direct = String.valueOf( diretorio);
   tf_dirDestino.setText(direct+"\\");
   if(tf_dirDestino.getText().equals("null\\"))
   {
   tf_dirDestino.setText("");
   }
  
jLabel3.setText(tf_dirDestino.getText()+tf_nomeArquivo.getText()+"_"+jTextField6.getText()+".zip");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
     mostra_data.le_hora();
    jTextField4.setText(mostra_data.hora);

    }//GEN-LAST:event_timer1OnTime

    private void bt_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sairActionPerformed
dispose(); 
    }//GEN-LAST:event_bt_sairActionPerformed

    private void tf_nomeArquivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_nomeArquivoFocusLost
jLabel3.setText(tf_dirDestino.getText()+tf_nomeArquivo.getText()+"_"+jTextField6.getText()+".zip");
    }//GEN-LAST:event_tf_nomeArquivoFocusLost

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
tf_nomeArquivo.setEnabled(true);
tf_nomeArquivo.setEditable(true);
tf_nomeArquivo.setText("");
tf_dirLocal.setText("");
tf_dirDestino.setText("");
jButton1.setEnabled(true);
jButton2.setEnabled(true);

    }//GEN-LAST:event_bt_novoActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZipaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_compactar;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_sair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextArea ta_logs;
    private br.com.bueno.view.TestePesquisaJcalendar testePesquisaJcalendar1;
    private javax.swing.JTextField tf_dirDestino;
    private javax.swing.JTextField tf_dirLocal;
    private javax.swing.JTextField tf_nomeArquivo;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables

  public void setaData ()
  {
            Date dataTempo = new Date();
            String dia = ""+dataTempo.getDate();
            String mes = ""+String.valueOf(dataTempo.getMonth()+1);
            String ano = ""+(1900 + dataTempo.getYear());
            if (Integer.parseInt(mes)<=9)
            mes = "0"+mes;
    jTextField6.setText(dia+"_"+mes+"_"+ano+"__"+mostra_data.hora);
  }
}