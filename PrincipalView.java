/**
 *
 * @author NILDO BUENO CORREIA FILHO  -
 * AXL - DESENVOLVIMENTO DE SISTEMAS
 * MSN: nil_bueno@hotmai.com
 * CACHOEIRO DE ITAPEMIRIN - ES, 26 DE JUNHO DE 2011, 08:14:09
 */

package br.com.bueno.view;


import br.com.bueno.util.data;
import java.beans.Beans;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.nio.channels.FileChannel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.PatternSyntaxException;
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class PrincipalView extends javax.swing.JFrame {
      data mostra_data;
    public PrincipalView() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
       mostra_data = new data();
       mostra_data.le_data();
       mostra_data.le_hora();
       jLabel3.setText(mostra_data.dia_semana + ", " + mostra_data.dia + " de " + mostra_data.mes + " de " + mostra_data.ano);
       timer2.start();
       setSize(584, 624);
       setResizable(false);
       setLocationRelativeTo(null);
       ler_Confs();
      Jtable();
      jLabel2.setVisible(false);
      jLabel3.setVisible(false);
      jLabel6.setVisible(false);
      jLabel7.setVisible(false);
     // jPanel4.setVisible(false);
      
      int vjt = jTable1.getRowCount();
      jLabel10.setText(String.valueOf(vjt));
      if(vjt == 0){

          bt_iniciar_aplicacao.setEnabled(false);
          bt_parar.setEnabled(false);

      }
      System.gc();
    
        }
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("adminfilePU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Acoes a");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        timer2 = new org.netbeans.examples.lib.timerbean.Timer();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        tf_diretorio_analise = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        dataCriacaoLabel = new javax.swing.JLabel();
        insert_transaction = new javax.swing.JButton();
        caminhoSaidaLabel = new javax.swing.JLabel();
        caminhoAnaliseLabel = new javax.swing.JLabel();
        tf_hora_acao = new javax.swing.JTextField();
        refreshButton = new javax.swing.JButton();
        tf_hash_arquivo = new javax.swing.JTextField();
        tf_acao_arquivo = new javax.swing.JTextField();
        tf_nome_arquivo = new javax.swing.JTextField();
        acaoLabel = new javax.swing.JLabel();
        tf_perdefoc_data_acao = new javax.swing.JTextField();
        save_transaction = new javax.swing.JButton();
        tf_tam = new javax.swing.JTextField();
        tf_patch_arquivo = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        tamanhoKbLabel = new javax.swing.JLabel();
        dataAcaoLabel = new javax.swing.JLabel();
        nomeArquivoLabel = new javax.swing.JLabel();
        hashLabel = new javax.swing.JLabel();
        horaAcaoLabel = new javax.swing.JLabel();
        tf_dir_saida = new javax.swing.JTextField();
        tf_data_criacao = new javax.swing.JFormattedTextField();
        tf_data_acao = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_hora_criacao = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        tf_usuario_da_acao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_saida = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        tf_pesquisa = new javax.swing.JTextField();
        bt_pesquisar = new javax.swing.JButton();
        tf_variavel_pesquisa = new javax.swing.JTextField();
        bt_atualizar_jTablePesquisa = new javax.swing.JButton();
        bt_iniciar_aplicacao = new javax.swing.JButton();
        bt_parar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        timer2.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer2OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("BUSCA DE ARQUIVOS");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/images/VARIAVEL.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x32/binary.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PATCH", "NOME ARQUIVO", "ULT MODI/ CRIAÇÃO"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x24/kfilereplace.png"))); // NOI18N

        tf_diretorio_analise.setBackground(new java.awt.Color(236, 233, 216));
        tf_diretorio_analise.setEditable(false);
        tf_diretorio_analise.setText("C:\\Arquivos1\\");

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_diretorio_analise, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_diretorio_analise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGap(35, 35, 35))
            );

            jTabbedPane1.addTab("ARQUVOS LISTADOS", jPanel2);

            masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
            masterTable.setEnabled(false);

            org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
            org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idAcao}"));
            columnBinding.setColumnName("COD.");
            columnBinding.setColumnClass(Integer.class);
            columnBinding.setEditable(false);
            columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caminhoAnalise}"));
            columnBinding.setColumnName("DIR. ANALISE");
            columnBinding.setColumnClass(String.class);
            columnBinding.setEditable(false);
            columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeArquivo}"));
            columnBinding.setColumnName("NOME ARQUIVO");
            columnBinding.setColumnClass(String.class);
            columnBinding.setEditable(false);
            columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataCriacao}"));
            columnBinding.setColumnName("DATA CRIAÇÃO");
            columnBinding.setColumnClass(java.util.Date.class);
            columnBinding.setEditable(false);
            columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaCriacao}"));
            columnBinding.setColumnName("HORA CRIAÇÃO");
            columnBinding.setColumnClass(String.class);
            columnBinding.setEditable(false);
            columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tamanhoKb}"));
            columnBinding.setColumnName("TAM. KB");
            columnBinding.setColumnClass(String.class);
            columnBinding.setEditable(false);
            columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${hashArquivo}"));
            columnBinding.setColumnName("HASH");
            columnBinding.setColumnClass(String.class);
            columnBinding.setEditable(false);
            columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${acao}"));
            columnBinding.setColumnName("AÇÃO");
            columnBinding.setColumnClass(String.class);
            columnBinding.setEditable(false);
            columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataAcao}"));
            columnBinding.setColumnName("DATA AÇÃO");
            columnBinding.setColumnClass(java.util.Date.class);
            columnBinding.setEditable(false);
            columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaAcao}"));
            columnBinding.setColumnName("HORA AÇÃO");
            columnBinding.setColumnClass(String.class);
            columnBinding.setEditable(false);
            columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caminhoSaida}"));
            columnBinding.setColumnName("DIR. SAIDA");
            columnBinding.setColumnClass(String.class);
            columnBinding.setEditable(false);
            columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuarioAcao}"));
            columnBinding.setColumnName("USUÁRIO");
            columnBinding.setColumnClass(String.class);
            columnBinding.setEditable(false);
            jTableBinding.setSourceNullValue(list);
            jTableBinding.setSourceUnreadableValue(list);
            bindingGroup.addBinding(jTableBinding);
            jTableBinding.bind();
            jScrollPane2.setViewportView(masterTable);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(250);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            masterTable.getColumnModel().getColumn(6).setPreferredWidth(130);
            masterTable.getColumnModel().getColumn(10).setPreferredWidth(250);

            dataCriacaoLabel.setText("Data Criacao:");

            insert_transaction.setText("New");
            insert_transaction.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    insert_transactionActionPerformed(evt);
                }
            });

            caminhoSaidaLabel.setText("Caminho Saida:");

            caminhoAnaliseLabel.setText("Caminho Analise:");

            org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.horaAcao}"), tf_hora_acao, org.jdesktop.beansbinding.BeanProperty.create("text"));
            bindingGroup.addBinding(binding);
            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), tf_hora_acao, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            refreshButton.setText("Refresh");
            refreshButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    refreshButtonActionPerformed(evt);
                }
            });

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.hashArquivo}"), tf_hash_arquivo, org.jdesktop.beansbinding.BeanProperty.create("text"));
            bindingGroup.addBinding(binding);
            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), tf_hash_arquivo, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.acao}"), tf_acao_arquivo, org.jdesktop.beansbinding.BeanProperty.create("text"));
            bindingGroup.addBinding(binding);
            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), tf_acao_arquivo, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nomeArquivo}"), tf_nome_arquivo, org.jdesktop.beansbinding.BeanProperty.create("text"));
            bindingGroup.addBinding(binding);
            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), tf_nome_arquivo, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            acaoLabel.setText("Acao:");

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), tf_perdefoc_data_acao, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            save_transaction.setText("Save");
            save_transaction.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    save_transactionActionPerformed(evt);
                }
            });

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tamanhoKb}"), tf_tam, org.jdesktop.beansbinding.BeanProperty.create("text"));
            bindingGroup.addBinding(binding);
            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), tf_tam, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.caminhoAnalise}"), tf_patch_arquivo, org.jdesktop.beansbinding.BeanProperty.create("text"));
            bindingGroup.addBinding(binding);
            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), tf_patch_arquivo, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            deleteButton.setText("Delete");
            deleteButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    deleteButtonActionPerformed(evt);
                }
            });

            tamanhoKbLabel.setText("Tamanho Kb:");

            dataAcaoLabel.setText("Data Acao:");

            nomeArquivoLabel.setText("Nome Arquivo:");

            hashLabel.setText("Hash:");

            horaAcaoLabel.setText("Hora Acao:");

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.caminhoSaida}"), tf_dir_saida, org.jdesktop.beansbinding.BeanProperty.create("text"));
            bindingGroup.addBinding(binding);
            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), tf_dir_saida, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            tf_data_criacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataCriacao}"), tf_data_criacao, org.jdesktop.beansbinding.BeanProperty.create("value"));
            bindingGroup.addBinding(binding);
            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), tf_data_criacao, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            tf_data_acao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataAcao}"), tf_data_acao, org.jdesktop.beansbinding.BeanProperty.create("value"));
            bindingGroup.addBinding(binding);
            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), tf_data_acao, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            jLabel1.setText("jLabel1");

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.horaCriacao}"), tf_hora_criacao, org.jdesktop.beansbinding.BeanProperty.create("text"));
            bindingGroup.addBinding(binding);
            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), tf_hora_criacao, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataAcao}"), jDateChooser1, org.jdesktop.beansbinding.BeanProperty.create("date"));
            bindingGroup.addBinding(binding);
            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jDateChooser1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataCriacao}"), jDateChooser2, org.jdesktop.beansbinding.BeanProperty.create("date"));
            bindingGroup.addBinding(binding);
            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jDateChooser2, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
            bindingGroup.addBinding(binding);

            binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.usuarioAcao}"), tf_usuario_da_acao, org.jdesktop.beansbinding.BeanProperty.create("text"));
            bindingGroup.addBinding(binding);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(caminhoAnaliseLabel)
                                .addComponent(nomeArquivoLabel)
                                .addComponent(tamanhoKbLabel)
                                .addComponent(dataCriacaoLabel)
                                .addComponent(hashLabel)
                                .addComponent(caminhoSaidaLabel)
                                .addComponent(acaoLabel)
                                .addComponent(dataAcaoLabel)
                                .addComponent(horaAcaoLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_dir_saida, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                                .addComponent(tf_acao_arquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                                .addComponent(tf_hora_acao, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tf_data_criacao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(tf_hora_criacao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tf_nome_arquivo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_patch_arquivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tf_tam, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_hash_arquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addGap(86, 86, 86)
                                    .addComponent(tf_data_acao, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(tf_perdefoc_data_acao, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30))
                                .addComponent(tf_usuario_da_acao, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(insert_transaction)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(refreshButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(save_transaction)))
                    .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(caminhoAnaliseLabel)
                        .addComponent(tf_patch_arquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nomeArquivoLabel)
                        .addComponent(tf_nome_arquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tamanhoKbLabel)
                        .addComponent(tf_tam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataCriacaoLabel)
                            .addComponent(jLabel1)
                            .addComponent(tf_hora_criacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_data_criacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hashLabel)
                        .addComponent(tf_hash_arquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(caminhoSaidaLabel)
                        .addComponent(tf_dir_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(acaoLabel)
                        .addComponent(tf_acao_arquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataAcaoLabel)
                            .addComponent(tf_perdefoc_data_acao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_data_acao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(horaAcaoLabel)
                        .addComponent(tf_hora_acao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(tf_usuario_da_acao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(save_transaction)
                        .addComponent(refreshButton)
                        .addComponent(deleteButton)
                        .addComponent(insert_transaction))
                    .addContainerGap())
            );

            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x24/folder_sent_mail.png"))); // NOI18N

            tf_saida.setBackground(new java.awt.Color(236, 233, 216));
            tf_saida.setEditable(false);

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_saida, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                            .addContainerGap(25, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())))
            );
            jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(tf_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jTabbedPane1.addTab("REGISTROS DE AÇÕES", jPanel5);

            jPanel4.setBackground(new java.awt.Color(204, 204, 255));
            jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

            tf_pesquisa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
            tf_pesquisa.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    tf_pesquisaActionPerformed(evt);
                }
            });

            bt_pesquisar.setText("PESQUISAR");
            bt_pesquisar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bt_pesquisarActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bt_pesquisar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                    .addComponent(tf_variavel_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_variavel_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(bt_pesquisar))
                    .addContainerGap())
            );

            bt_atualizar_jTablePesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/quick_restart_1.png"))); // NOI18N
            bt_atualizar_jTablePesquisa.setText("ATUALIZAR");
            bt_atualizar_jTablePesquisa.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bt_atualizar_jTablePesquisaActionPerformed(evt);
                }
            });

            bt_iniciar_aplicacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/player_play.png"))); // NOI18N
            bt_iniciar_aplicacao.setText("INICIA");
            bt_iniciar_aplicacao.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bt_iniciar_aplicacaoActionPerformed(evt);
                }
            });

            bt_parar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/agt_pause-queue.png"))); // NOI18N
            bt_parar.setText("PARAR");
            bt_parar.setEnabled(false);
            bt_parar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bt_pararActionPerformed(evt);
                }
            });

            jLabel3.setText("jLabel3");

            jLabel2.setText("jLabel2");

            jButton1.setText("FECHAR");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(210, 210, 210))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bt_atualizar_jTablePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(bt_iniciar_aplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(bt_parar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addContainerGap())
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_atualizar_jTablePesquisa)
                        .addComponent(bt_iniciar_aplicacao)
                        .addComponent(bt_parar)
                        .addComponent(jButton1))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
            );

            bindingGroup.bind();

            java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
            setBounds((screenSize.width-584)/2, (screenSize.height-624)/2, 584, 624);
        }// </editor-fold>//GEN-END:initComponents

    private void insert_transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_transactionActionPerformed
        br.com.bueno.bean.Acoes a = new br.com.bueno.bean.Acoes();
        entityManager.persist(a);
        list.add(a);
        int row = list.size()-1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
}//GEN-LAST:event_insert_transactionActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
refreshTransaction();
System.gc();
}//GEN-LAST:event_refreshButtonActionPerformed

    private void save_transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_transactionActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<br.com.bueno.bean.Acoes> merged = new ArrayList<br.com.bueno.bean.Acoes>(list.size());
            for (br.com.bueno.bean.Acoes a : list) {
                merged.add(entityManager.merge(a));
            }
            list.clear();
            list.addAll(merged);
        }
        refreshTransaction();
}//GEN-LAST:event_save_transactionActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<br.com.bueno.bean.Acoes> toRemove = new ArrayList<br.com.bueno.bean.Acoes>(selected.length);
        for (int idx=0; idx<selected.length; idx++) {
            br.com.bueno.bean.Acoes a = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(a);
            entityManager.remove(a);
        }
        list.removeAll(toRemove);
}//GEN-LAST:event_deleteButtonActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
SelecSetaSalvaMoveEx();
System.gc();
    }//GEN-LAST:event_timer1OnTime

    private void bt_iniciar_aplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_iniciar_aplicacaoActionPerformed
        String conflitante = tf_saida.getText();
        String conflito = tf_diretorio_analise.getText();
//        int trcon = conflito.length();
//        String conflitoTratado = conflito.substring((trcon), trcon-1);
//        System.out.println(conflitoTratado);
        if(conflito.equals(conflitante)){
//

       JOptionPane.showMessageDialog(null, "OS DIRETORIOS DE ORIGEM E DESTINOS SÃO OS MESMOS", "ALERTA DO SISTEMA", JOptionPane.ERROR_MESSAGE);
       int opcao;
                   Object[] botoes = {" SIM "," NÃO "};
                   opcao = JOptionPane.showOptionDialog(null, "DESEJA CONFIGURAR CORRETAMENTE OS DIRETORIOS DE ANÁLISE E SAIDA AGORA?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                   if (opcao ==  JOptionPane.YES_OPTION) {
                          new ConfDiretorios().show();
                          dispose();

                   }
        }else{

        timer1.start();
jPanel4.setVisible(false);
   
bt_parar.setEnabled(true);
    }

    }//GEN-LAST:event_bt_iniciar_aplicacaoActionPerformed

    private void bt_pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pararActionPerformed
        timer1.stop();
        refreshTransaction();
        jPanel4.setVisible(true);
        tf_pesquisa.setText("");
        bt_pesquisar.doClick();
        tf_variavel_pesquisa.setEditable(true);
        tf_variavel_pesquisa.setEnabled(true);
         bt_atualizar_jTablePesquisa.setEnabled(true);
    //    bt_iniciar_aplicacao.setEnabled(true);
     
        tf_variavel_pesquisa.setText("");




bt_pesquisar.setEnabled(true);
        tf_variavel_pesquisa.setEnabled(true);
        tf_pesquisa.setEnabled(true);
        tf_variavel_pesquisa.setEnabled(true);
        tf_variavel_pesquisa.setEditable(true);
         bt_atualizar_jTablePesquisa.setEnabled(true);
         bt_iniciar_aplicacao.setEnabled(true);
         bt_parar.setEnabled(false);
 
    }//GEN-LAST:event_bt_pararActionPerformed

    private void timer2OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer2OnTime
    mostra_data.le_hora();
    jLabel2.setText("Hora atual " + mostra_data.hora);
    }//GEN-LAST:event_timer2OnTime

    private void tf_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pesquisaActionPerformed
 DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
 final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(modelo);
 jTable1.setRowSorter(sorter);
 String text = tf_pesquisa.getText();

if (text.length() == 0)
{sorter.setRowFilter(null);}
else
{
     try
     {
         RowFilter<TableModel, Object> rf = null;
          try {rf = RowFilter.regexFilter(text, 1);}
          catch (Exception e) {
              JOptionPane.showMessageDialog(null,""+ e);
          }
          sorter.setRowFilter(rf);
     }
     catch (PatternSyntaxException pse)  {
     System.err.println("Erro");
     }
}
 System.gc();
    }//GEN-LAST:event_tf_pesquisaActionPerformed

    private void bt_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pesquisarActionPerformed
 DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
 final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(modelo);
 jTable1.setRowSorter(sorter);
 String text = tf_pesquisa.getText();

if (text.length() == 0)
{sorter.setRowFilter(null);}
else
{
     try
     {
         RowFilter<TableModel, Object> rf = null;
          try {rf = RowFilter.regexFilter(text, 1);}
          catch (Exception e) {JOptionPane.showMessageDialog(null,""+ e);}
          sorter.setRowFilter(rf);
     }
     catch (PatternSyntaxException pse)  {
           System.err.println("Erro");
     }
}
 System.gc();
    }//GEN-LAST:event_bt_pesquisarActionPerformed

    private void bt_atualizar_jTablePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizar_jTablePesquisaActionPerformed
        query = entityManager.createNamedQuery("Acoes.findAll");
        java.util.Collection ReloadList = query.getResultList();
        list.clear();
        list.addAll(ReloadList);
        Jtable();


        int ver = jTable1.getRowCount();
        if(ver == 0){

        JOptionPane.showMessageDialog(null, "NÃO FORAM ENCONTRADOS ARQUIVOS NO DIRETÓRIO DE ANÁLISE", "AVISO DO SISTEMA", JOptionPane.WARNING_MESSAGE);


        }else  if (ver > 0 ){

        bt_iniciar_aplicacao.setEnabled(true);
        bt_parar.setEnabled(true);
        }
        
        jLabel10.setText(String.valueOf(ver));
        jLabel11.setText("ARQUIVOS ENCONTRADOS");
        bt_parar.setEnabled(false);



    }//GEN-LAST:event_bt_atualizar_jTablePesquisaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            int opcao;
            Object[] botoes = {" SIM "," NÃO "};
            opcao = JOptionPane.showOptionDialog(null, "DESEJA FECHAR O SISTEMA?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);

                 if (opcao ==  JOptionPane.YES_OPTION) {
                       StopBeliving();
                       StandByMe();
                   }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(final String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
                jLabel6.setText(args[1]);
                jLabel7.setText(args[0]);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acaoLabel;
    private javax.swing.JButton bt_atualizar_jTablePesquisa;
    private javax.swing.JButton bt_iniciar_aplicacao;
    private javax.swing.JButton bt_parar;
    private javax.swing.JButton bt_pesquisar;
    private javax.swing.JLabel caminhoAnaliseLabel;
    private javax.swing.JLabel caminhoSaidaLabel;
    private javax.swing.JLabel dataAcaoLabel;
    private javax.swing.JLabel dataCriacaoLabel;
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel hashLabel;
    private javax.swing.JLabel horaAcaoLabel;
    private javax.swing.JButton insert_transaction;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private static javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<br.com.bueno.bean.Acoes> list;
    private javax.swing.JTable masterTable;
    private javax.swing.JLabel nomeArquivoLabel;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton save_transaction;
    private javax.swing.JLabel tamanhoKbLabel;
    private javax.swing.JTextField tf_acao_arquivo;
    private javax.swing.JFormattedTextField tf_data_acao;
    private javax.swing.JFormattedTextField tf_data_criacao;
    private javax.swing.JTextField tf_dir_saida;
    private javax.swing.JTextField tf_diretorio_analise;
    private javax.swing.JTextField tf_hash_arquivo;
    private javax.swing.JTextField tf_hora_acao;
    private javax.swing.JTextField tf_hora_criacao;
    private javax.swing.JTextField tf_nome_arquivo;
    private javax.swing.JTextField tf_patch_arquivo;
    private javax.swing.JTextField tf_perdefoc_data_acao;
    private javax.swing.JTextField tf_pesquisa;
    private javax.swing.JTextField tf_saida;
    private javax.swing.JTextField tf_tam;
    private javax.swing.JTextField tf_usuario_da_acao;
    private javax.swing.JTextField tf_variavel_pesquisa;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    private org.netbeans.examples.lib.timerbean.Timer timer2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

        public void ler_Confs(){

        File confA = new File ("C:\\Arquivos de programas\\FileX\\EnginerX\\004\\CA1000DA.nbx");
        File confS = new File ("C:\\Arquivos de programas\\FileX\\EnginerX\\004\\CS1000DS.nbx");

 FileInputStream fluxoArquivo = null;
 ObjectInputStream entradaObjeto = null;
 DataInputStream ob_Pri = null;


 FileInputStream fluxoArquivo2 = null;
 ObjectInputStream entradaObjeto2 = null;
 DataInputStream ob_Pri2 = null;

    try
    {
    fluxoArquivo = new FileInputStream(confA);
    entradaObjeto = new ObjectInputStream(fluxoArquivo);
    ob_Pri = new DataInputStream( fluxoArquivo);
    String textChar = (String) entradaObjeto.readObject();

    fluxoArquivo2 = new FileInputStream(confS);
    entradaObjeto2 = new ObjectInputStream(fluxoArquivo2);
    ob_Pri2 = new DataInputStream( fluxoArquivo2);
    String textChar2 = (String) entradaObjeto2.readObject();

    tf_diretorio_analise.setText(textChar);
    tf_saida.setText(textChar2);

    entradaObjeto.close();
    ob_Pri.close();

    entradaObjeto2.close();
    ob_Pri2.close();

    }catch(Exception e){
    }
    System.gc();
    }

    public void Jtable()
    {

        jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);

        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(1);

                try
                {

                    File arquivo = new File (tf_diretorio_analise.getText());
                    String arquivos [] = arquivo.list();

             
                for (String s : arquivos)

                       {
                       File f = new File(s);

                      int  numeroLinhas = modelo.getRowCount();

      jLabel10.setText(String.valueOf(numeroLinhas+1));
        jLabel11.setText("ARQUIVOS ENCONTRADOS");

         String filtro = f.getName();
         int tmt = filtro.length();
         String filtrado = filtro.substring((tmt-3), tmt);
         String filnome = filtro.substring(0, (tmt-3));

         File g = new File(tf_diretorio_analise.getText()+"\\"+filnome+filtrado);

         DateFormat formatDatacr = new SimpleDateFormat("dd/MM/yyyy");
         String datag = formatDatacr.format(new Date(g.lastModified()));
         
//         Date in = new Date();
//         Date al = new Date();
//         Date q = (Date)formatDatacr.parse(datag);
//         try
//         {
//         al = Data_Final.getDate();
//         in = Data_Inicial.getDate();
//
//
//         }catch (Exception e){System.out.println(e);}
//
//         if (in.before(q) && al.after(q)){
           if(filtrado.equalsIgnoreCase("jpg")   ||
            (filtrado.equalsIgnoreCase("gif")) ||
            (filtrado.equalsIgnoreCase("bmp")) ||
            (filtrado.equalsIgnoreCase("png"))  )
         {
          modelo.addRow(new Object[]{(tf_diretorio_analise.getText()+"\\"+filnome+filtrado),filnome+filtrado,datag});
         System.gc();}else {}}
               // }
    }catch (Exception exc){
                JOptionPane.showMessageDialog(null,"Naõ pode localizar os arquivos"+ exc);
                String va = null;
   
           }System.gc();
}

    public void SelecSetaSalvaMoveEx (){


           jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
             jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
             jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
             DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
             jTable1.setRowSelectionInterval(0, 0);



             int idx[] = jTable1.getSelectedRows();
        //     insert_transacion.doClick();

             for(int j =0; j<idx.length;j++)
             {
                 int k = idx[j]-j;

               //  String str1 = String.valueOf(obj);


       
       if(tf_variavel_pesquisa.getText().equals("") ||tf_variavel_pesquisa.getText().equals(null)){

       Jtable();
       String va = JOptionPane.showInputDialog("Informe A Variável de Pesquisa");
       tf_variavel_pesquisa.setText(va);
       


    }
//
//
//
       else if (tf_variavel_pesquisa.getText() != null )
               {
                tf_pesquisa.setText(tf_variavel_pesquisa.getText());
                tf_pesquisa.requestFocusInWindow();
                tf_pesquisa.setCaretPosition(1);
                bt_pesquisar.doClick();
                bt_pesquisar.setEnabled(false);
//                tf_variavel_pesquisa.setEnabled(false);
//                tf_pesquisa.setEnabled(false);
//                tf_variavel_pesquisa.setEnabled(false);
//                tf_variavel_pesquisa.setEditable(false);
//                 bt_atualizar_jTablePesquisa.setEnabled(false);
//                 bt_iniciar_aplicacao.setEnabled(false);
                insert_transaction.doClick();
                jTable1.setRowSelectionInterval(0, 0);
                int jColunnTable = 0;
                Object obj = jTable1.getValueAt(k,jColunnTable);
//        int jColunnTable = 0;
//        Object obj = jTable1.getValueAt(jTable1.getSelectedRow(),jColunnTable);
        String str1 = String.valueOf(obj);
        System.gc();
    try
      {
      File diretorio = new File(str1);

         tf_patch_arquivo.setText(diretorio.getAbsolutePath());
         tf_nome_arquivo.setText(diretorio.getName());
         String dt = String.valueOf(diretorio.hashCode());
         tf_hash_arquivo.setText(String.valueOf(dt));
         Long tam = diretorio.length();
         Long  kb = tam / 1024;
         String kj = String.valueOf(kb);
         Double db = Double.parseDouble(kj);
         tf_tam.setText(String.valueOf(db)+" "+"Kb");

         DateFormat formatDatacr = new SimpleDateFormat("dd/MM/yyyy");
         String data = formatDatacr.format(new Date(diretorio.lastModified()));
         SimpleDateFormat formatHora = new SimpleDateFormat("HH:mm:ss");
         String hora = formatHora.format(new Date(diretorio.lastModified()));
         Date date2 = (Date)formatDatacr.parse(data);
         jDateChooser2.setDate(date2);
         tf_hora_criacao.setText(hora);
         tf_acao_arquivo.setText("Movido");
         tf_usuario_da_acao.setText(jLabel7.getText());
         tf_dir_saida.setText(tf_saida.getText());
         tf_hora_acao.setText(""+mostra_data.hora);
         Date dataTempo = new Date();
         String dia = ""+dataTempo.getDate();
         String mes = ""+String.valueOf(dataTempo.getMonth()+1);
         String ano = ""+(1900 + dataTempo.getYear());
         if (Integer.parseInt(mes)<=9)
         mes = "0"+mes;
         jDateChooser1.setDate(dataTempo);
         }catch (Exception err){ }
         save_transaction.doClick();System.gc();
        // MOVE O ARQUIVO

        try
        {
             File dirMov = new File(str1);

            FileInputStream fis = null;
            fis = new FileInputStream (dirMov.getAbsolutePath());
            FileChannel origem = null ;
            origem = fis.getChannel();
            FileOutputStream fos = null;
            fos = new FileOutputStream(tf_saida.getText()+"\\"+dirMov.getName());
            FileChannel destino = null;
            destino = fos.getChannel();
            destino.transferFrom(origem, 0, origem.size());
            origem.close();
            destino.close();

         }catch(Exception e){}
            try// DELETAR O ARQUIVO
            {
                File arqu = new File (str1);
                if(arqu.exists())
            {
                    arqu.delete();   
            }
            }catch(Exception e){
            }
     modelo.removeRow(idx[j]-j);
     int verr = jTable1.getRowCount();
     jLabel10.setText(String.valueOf(verr));

        int ll = jTable1.getRowCount();
        if(ll == 0 ){
        
       JOptionPane.showMessageDialog(null, "NÃO FORAM ENCONTRADOS ARQUIVOS DE IMAGEM", "AVISO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE);
 
        refreshTransaction();
        jPanel4.setVisible(true);
        tf_pesquisa.setText("");
        bt_pesquisar.doClick();
        tf_variavel_pesquisa.setEditable(true);
        tf_variavel_pesquisa.setEnabled(true);
        bt_atualizar_jTablePesquisa.setEnabled(true);
    //  bt_iniciar_aplicacao.setEnabled(true);
        tf_variavel_pesquisa.setText("");
        bt_pesquisar.setEnabled(true);
        tf_variavel_pesquisa.setEnabled(true);
        tf_pesquisa.setEnabled(true);
        tf_variavel_pesquisa.setEnabled(true);
        tf_variavel_pesquisa.setEditable(true);
        bt_atualizar_jTablePesquisa.setEnabled(true);
        bt_iniciar_aplicacao.setEnabled(true);
        bt_parar.setEnabled(false);
        timer1.stop();
        }
       }
             }
    }

    public void refreshTransaction(){
     entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }


    public void StopBeliving(){
        timer1.stop();
        refreshTransaction();
        jPanel4.setVisible(true);
        tf_pesquisa.setText("");
        bt_pesquisar.doClick();
        tf_variavel_pesquisa.setEditable(true);
        tf_variavel_pesquisa.setEnabled(true);
         bt_atualizar_jTablePesquisa.setEnabled(true);
        bt_iniciar_aplicacao.setEnabled(true);
       // jButton1.setEnabled(true);
        tf_variavel_pesquisa.setText("");

    }

    public void StandByMe(){

   
            dispose();
        

    }

  
}