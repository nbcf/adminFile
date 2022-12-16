/**
 *
 * @author NILDO BUENO CORREIA FILHO  -
 * AXL - DESENVOLVIMENTO DE SISTEMAS
 * MSN: nil_bueno@hotmail.com
 * CACHOEIRO DE ITAPEMIRIN , 16 DE JUNHO DE 2011, 10:26
 */

package br.com.bueno.view;

import br.com.bueno.bean.Usuario;
import br.com.bueno.util.EncriptaSenha;
import java.beans.Beans;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class LoginView extends javax.swing.JFrame {
int youtime = 3;

   String seta_look;
    /** Creates new form LoginView */
    public LoginView() {
        initComponents();
         if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
           // yTime();
    ler_ConfEstilo();
    seta_look = propertiesHalt.getText();
    lookandfeel();
    propertiesHalt.setVisible(false);
    ler();
    jl_idHDP.setVisible(false);
    jl_idBIOSP.setVisible(false);
    jl_idHD.setVisible(false);
    jl_IdBIOS.setVisible(false);
    jTextField3.setEnabled(false);
    jTextField2.setEnabled(false);
    jPanel3.setVisible(false);
    jPanel4.setVisible(false);
 

        if(getSerialNumber("C").equals(jl_idHDP.getText()) & getMotherboardSN().equals(jl_idBIOSP.getText()))
       {
            setLocationRelativeTo(null);
          //  setSize(495, 514);
            setSize(495, 311);
            setResizable(false);
            jPanel3.setVisible(true);
            jPanel4.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            
      
       }
        else if(getSerialNumber("C")!= jl_idHDP.getText() & getMotherboardSN()!=jl_idBIOSP.getText())

       {
            setLocationRelativeTo(null);
         //  setSize(495, 514);
           setSize(495, 311);
            setResizable(false);
            jPanel3.setVisible(false);
            jPanel4.setVisible(true);

            jTextField3.setEnabled(true);
            jTextField2.setEnabled(true);
            jLabel6.setVisible(false);
            jLabel3.setVisible(false);
         
         }
    }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("adminfilePU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT u FROM Usuario u");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : query.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        propertiesHalt = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bt_entrar = new javax.swing.JButton();
        bt_fechar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jl_idHDP = new javax.swing.JLabel();
        jl_idBIOSP = new javax.swing.JLabel();
        jl_idHD = new javax.swing.JLabel();
        jl_IdBIOS = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x64/gpgsm.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x32/key.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/images/validarcopia.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        propertiesHalt.setFont(new java.awt.Font("Tahoma", 0, 3));
        propertiesHalt.setText("jTextField2");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("SENHA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText(".");

        bt_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/button_ok.png"))); // NOI18N
        bt_entrar.setText("Entrar");
        bt_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_entrarActionPerformed(evt);
            }
        });

        bt_fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/exit.png"))); // NOI18N
        bt_fechar.setText("Cancelar");
        bt_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(propertiesHalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(propertiesHalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jl_idHDP.setText("jl_idHDP");

        jl_idBIOSP.setText("jl_idBIOSP");

        jl_idHD.setText("jl_idHD");

        jl_IdBIOS.setText("jl_IdBIOS");

        jButton1.setText("Validar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setText("LICENCIADO PARA:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setText("SERIAL:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_idHD)
                    .addComponent(jl_IdBIOS))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jl_idHDP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(jl_idBIOSP)
                .addGap(203, 203, 203))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_idBIOSP)
                    .addComponent(jl_idHDP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_idHD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jl_IdBIOS)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-495)/2, (screenSize.height-524)/2, 495, 524);
    }// </editor-fold>//GEN-END:initComponents

private void bt_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_entrarActionPerformed
      
    if(jTextField1.getText().isEmpty() || (jPasswordField1.getText().isEmpty()))
    {
    JOptionPane.showMessageDialog(null,"OS CAMPOS ESTÃO VAZIOS, INSIRA OS DADOS CORRETAMENTE!!", "AVISO DO SISTEMA",JOptionPane.WARNING_MESSAGE);
    
    }else {
    
    if(youtime <= 3 )
    {
    query = entityManager.createNamedQuery("Usuario.verificaLogin");
        query.setParameter("login", jTextField1.getText());
        query.setParameter("senha", EncriptaSenha.encripta(jPasswordField1.getText()));



        List<Usuario> data = query.getResultList() ;

        

        if(data.size() > 0 )
        {
        String args[] = new String [3];
        args [0] = data.get(0).getLogin();
        args [1] = data.get(0).getIdUsuario().toString();
        args [2] = data.get(0).getNome();


        MenuView.main(args);
        dispose();
        }else {
           youtime--;
           
           if( youtime == 2 )
               
            jLabel5.setText("Voçê Possui"+" "+youtime+" "+"Tentativas restantes!");
           
           else if (youtime == 1){
           jLabel5.setText("Esta é sua ultima Chance!");
           
           } else if(youtime == 0){
               JOptionPane.showMessageDialog(null, "VOÇÊ TENTOU ACESSAR O SISTEMAS COM SENHAS INVÁLIDAS\nO SISTEMA SERÁ FECHADO!", "AVISO DO SISTEMA",JOptionPane.INFORMATION_MESSAGE);
           dispose();
           
           }
        }
       
    }
    }
}//GEN-LAST:event_bt_entrarActionPerformed

private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
// TODO add your handling code here:
}//GEN-LAST:event_jPasswordField1FocusLost

private void bt_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fecharActionPerformed
System.exit(0);   
}//GEN-LAST:event_bt_fecharActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  if(jTextField2.getText().isEmpty() & jTextField3.getText().isEmpty())
  {
  JOptionPane.showMessageDialog(null, "INSIRA OS DADOS CORRETAMENTE", "AVISO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE);
  
  }else if (jTextField2.getText().equals(null) & jTextField3.getText().equals(null))
  {
  JOptionPane.showMessageDialog(null, "INSIRA OS DADOS CORRETAMENTE", "AVISO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE);
  }

  else if (jTextField2.getText() != null & jTextField3.getText().isEmpty())
  {
  JOptionPane.showMessageDialog(null, "INSIRA OS DADOS CORRETAMENTE", "AVISO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE);
  }
  else if (jTextField2.getText().isEmpty() & jTextField3.getText() != null)
  {
  JOptionPane.showMessageDialog(null, "INSIRA OS DADOS CORRETAMENTE", "AVISO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE);
  }


  else if (jTextField2.getText().length() >= 9 & jTextField3.getText().length() >= 9)
  {
  
  Ha();
    dispose();
  
  }
  else if (jTextField2.getText().length() <= 9 & jTextField3.getText().length() >= 9)
  {

JOptionPane.showMessageDialog(null, "SERIAL INCORRETO", "AVISO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE);

  }
  else if (jTextField2.getText().length() >= 9 & jTextField3.getText().length() <= 9)
  {

JOptionPane.showMessageDialog(null, "SERIAL INCORRETO", "AVISO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE);


  }
  else if (jTextField2.getText().length() <= 9 & jTextField3.getText().length() <= 9)
  {
 JOptionPane.showMessageDialog(null, "SERIAL INCORRETO", "AVISO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE);


  }



}//GEN-LAST:event_jButton1ActionPerformed

private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained


}//GEN-LAST:event_jTextField1FocusGained

private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

      if (evt.getKeyCode()!=32 & evt.getKeyCode()!=8 & evt.getKeyCode()!=37 & evt.getKeyCode()!=39)
        //JOptionPane.showMessageDialog(null, evt.getKeyCode(),"Código da tecla", 0);
       jTextField1.setText(jTextField1.getText().toUpperCase());
}//GEN-LAST:event_jTextField1KeyReleased
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
                String sn = getSerialNumber("C");
                String cpuId = getMotherboardSN();
                jl_idHD.setText(sn);
                jl_IdBIOS.setText(cpuId);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_entrar;
    private javax.swing.JButton bt_fechar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private static javax.swing.JLabel jl_IdBIOS;
    private javax.swing.JLabel jl_idBIOSP;
    private static javax.swing.JLabel jl_idHD;
    private javax.swing.JLabel jl_idHDP;
    private java.util.List list;
    private javax.swing.JTextField propertiesHalt;
    private javax.persistence.Query query;
    // End of variables declaration//GEN-END:variables
public void ler(){

//commons-logging-api-1.0.5.jar
 File LerDirAnalise = new File  ("lib/commons-loggin-iap-10.5.jar");
 File LerDirAnalise1 = new File ("lib/commons-servleett-pi-10.0.jar");
 File LerCli = new File         ("lib/commons-client-nan-1.05.jar");

 FileInputStream fluxoArquivo = null;
 ObjectInputStream entradaObjeto = null;
 DataInputStream ob_Pri = null;
 FileInputStream fluxoArquivo1 = null;
 ObjectInputStream entradaObjeto1 = null;
 DataInputStream ob_Pri1 = null;
 FileInputStream fluxoArquivo2 = null;
 ObjectInputStream entradaObjeto2 = null;
 DataInputStream ob_Pri2 = null;

    try
    {
    fluxoArquivo = new FileInputStream(LerDirAnalise);
    entradaObjeto = new ObjectInputStream(fluxoArquivo);
    ob_Pri = new DataInputStream( fluxoArquivo);

    fluxoArquivo1 = new FileInputStream(LerDirAnalise1);
    entradaObjeto1 = new ObjectInputStream(fluxoArquivo1);
    ob_Pri1 = new DataInputStream( fluxoArquivo1);

    fluxoArquivo2 = new FileInputStream(LerCli);
    entradaObjeto2 = new ObjectInputStream(fluxoArquivo2);
    ob_Pri2 = new DataInputStream( fluxoArquivo2);

    String textDir = (String) entradaObjeto.readObject();
    String textDir1 = (String) entradaObjeto1.readObject();
    String textDir2 = (String) entradaObjeto2.readObject();

    jl_idHDP.setText(textDir);
    jl_idBIOSP.setText(textDir1);
    jTextField3.setText(textDir2);

    entradaObjeto.close();
    ob_Pri.close();
    entradaObjeto1.close();
    ob_Pri1.close();
    entradaObjeto2.close();
    ob_Pri2.close();


    }catch(Exception e){    }




}
    
   public static String getSerialNumber(String drive) {
  String result = "";
    try {
      File file = File.createTempFile("realhowto",".vbs");
      file.deleteOnExit();
      FileWriter fw = new java.io.FileWriter(file);

      String vbs = "Set objFSO = CreateObject(\"Scripting.FileSystemObject\")\n"
                  +"Set colDrives = objFSO.Drives\n"
                  +"Set objDrive = colDrives.item(\"" + drive + "\")\n"
                  +"Wscript.Echo objDrive.SerialNumber";  // see note
      fw.write(vbs);
      fw.close();
      Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
      BufferedReader input =
        new BufferedReader
          (new InputStreamReader(p.getInputStream()));
      String line;
      while ((line = input.readLine()) != null) {
         result += line;
      }
      input.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return result.trim();
  }


public void Ha(){

if(jTextField2.getText().equals("idonthaveyouRocket")||jTextField2.getText().equals("dsfd$%WETfwetsdfdsw2werwe") ||
   jTextField2.getText().equals("dsfdfvl&*&ETYhgfqw2werwe")  || jTextField2.getText().equals("dsfdfvla@#RFDSFdw2werwe") ||
   jTextField2.getText().equals("dsfdfvladER%TFDSV2werwe") || jTextField2.getText().equals("dsw34876yhr2werwe") ||
   jTextField2.getText().equals("dsfdfvls&$yfgn3qw2werwe") || jTextField2.getText().equals("dsfdfvlad-skfn3qw2werwe") ||
   jTextField2.getText().equals("dsfdfvlad-skfn3qw2werwe") || jTextField2.getText().equals("dsfdfvl451245346435***6werwe") ||
   jTextField2.getText().equals("dsfdf122334GHdwerwe") || jTextField2.getText().equals("dsfdfvla$w2w@erwe") ||
   jTextField2.getText().equals("dsf34!adskfn3qw2werwe") || jTextField2.getText().equals("dsfdfvla%$FHGGHn3qw2werwe") ||
   jTextField2.getText().equals("ds@#Dvladskfn3qw2werwe") || jTextField2.getText().equals("dsfdfvladskfn3qAPQ@rwe") ||
   jTextField2.getText().equals("DFfdfvladskfn3qw2w%De") || jTextField2.getText().equals("fvladskfn$$3qw2e") ||
   jTextField2.getText().equals("@F*ZZ3SD!qw2werwe") || jTextField2.getText().equals("%678!dskfn3qw2werwe") ||
   jTextField2.getText().equals("D12adskfn3qw2werwe") || jTextField2.getText().equals("Johnny$%DFGRivers") ||
   jTextField2.getText().equals("WANNADancefn3qw2werwe") || jTextField2.getText().equals("Nil3qw2werwe5664d") ||
   jTextField2.getText().equals("ASmOLadskfn3qw2werwe") || jTextField2.getText().equals("AASF!ladskfn3qw2werwe") ||
   jTextField2.getText().equals("dsfvKHGHNFqw2werwe") || jTextField2.getText().equals("ÇPLKUkfn3qw2werwe") ||
   jTextField2.getText().equals("456345546hfdo332ddf") || jTextField2.getText().equals("AQCVFRR4563!!00") ||
   jTextField2.getText().equals("ASEQTTfD#412ppdvc") || jTextField2.getText().equals("d&&&&&&&&&34dfsssfvbrasil") ||
   jTextField2.getText().equals("dontCryBaby!!000") || jTextField2.getText().equals("smaltalksogly2333") ||
   jTextField2.getText().equals("axel$%234gtTggf4A")  || jTextField2.getText().equals("RocketQueennSlash111")  ||
   jTextField2.getText().equals("DontNoGoosddd34") ||  jTextField2.getText().equals("DontCryTonightqqq")  ||
   jTextField2.getText().equals("DontCryTonight@@59AAAAA") ||  jTextField2.getText().equals("TakSoBad21zzz#$f")  ||
   jTextField2.getText().equals("doCryToniteeeee") ||  jTextField2.getText().equals("NovemberRainB4by%brasil")  ||
   jTextField2.getText().equals("andlOOktooneyes")
)
{
Treck8();


} 
else 

{
JOptionPane.showMessageDialog(null, "SERIAL INVÁLIDO", "AVISO DO SISTEMA",JOptionPane.INFORMATION_MESSAGE);


}



}
     public void Treck8(){

                          File dirAnalise = new File ("lib/commons-loggin-iap-10.5.jar");
                          File dirSaida = new File ("lib/commons-servleett-pi-10.0.jar");
                          File cl = new File ("lib/commons-client-nan-1.05.jar");
                          FileOutputStream fluxInDirAnalise = null;
                          FileOutputStream fluxInDirSaida = null;
                          FileOutputStream fluxInCli = null;
                          ObjectOutputStream fluxOutDirAnalise = null;
                          ObjectOutputStream fluxOutDirSaida = null;
                          ObjectOutputStream fluxOutCli = null;
                          Object c1 = (Object)getSerialNumber("C");
                          Object c2 = (Object)getMotherboardSN();
                          Object c3 = (Object)jTextField3.getText();
                          try
                                {
                              fluxInDirAnalise = new FileOutputStream(dirAnalise);
                              fluxInDirSaida = new FileOutputStream(dirSaida);
                              fluxInCli = new FileOutputStream(cl);

                              fluxOutDirAnalise = new ObjectOutputStream(fluxInDirAnalise);
                              fluxOutDirSaida = new ObjectOutputStream(fluxInDirSaida);
                              fluxOutCli = new ObjectOutputStream(fluxInCli);

                              fluxOutDirAnalise.writeObject(c1);
                              fluxOutDirSaida.writeObject(c2);
                              fluxOutCli.writeObject(c3);

                          fluxOutDirAnalise.close();
                          fluxOutDirSaida.close();
                          fluxOutCli.close();
                                }catch(Exception e){  }
                         dispose();
                 }

 public static String getMotherboardSN() {
  String result = "";
    try {
      File file = File.createTempFile("realhowto",".vbs");
      file.deleteOnExit();
      FileWriter fw = new java.io.FileWriter(file);

String vbs = "Set objWMIService = GetObject(\"winmgmts:\\\\.\\root\\cimv2\")\n" + "Set colItems = objWMIService.ExecQuery _ \n"
        + "   (\"Select * from Win32_BIOS\") \n"+ "For Each objItem in colItems \n"+ "Wscript.Echo objItem.SerialNumber \n"
        + "    exit for  ' do the first cpu only! \n" + "Next \n";

      fw.write(vbs);
      fw.close();
      Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
      BufferedReader input =new BufferedReader(new InputStreamReader(p.getInputStream()));
      String line;
      while ((line = input.readLine()) != null) {
         result += line;
      }
      input.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    return result.trim();
  }

    public void yTime(){int ini = 3;jLabel5.setText("Voçê Possui"+" "+ini+" "+"Tentativas");}
    public void lookandfeel(){try{
    UIManager.setLookAndFeel(seta_look);SwingUtilities.updateComponentTreeUI(this);
    }catch (Exception erro){JOptionPane.showMessageDialog(null,erro);}}
    public void ler_ConfEstilo(){File confEst = new File ("C:\\Arquivos de programas\\FileX\\EnginerX\\002\\SE0200ES.nbx");
    FileInputStream fluxoArquivo = null;ObjectInputStream entradaObjeto = null;DataInputStream ob_Pri = null;
    try{fluxoArquivo = new FileInputStream(confEst);entradaObjeto = new ObjectInputStream(fluxoArquivo);ob_Pri = new DataInputStream( fluxoArquivo);
    String textChar = (String) entradaObjeto.readObject();propertiesHalt.setText(textChar);entradaObjeto.close();ob_Pri.close();}catch(Exception e){ }}}

