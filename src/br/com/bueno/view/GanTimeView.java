/**
 *
 * @author NILDO BUENO CORREIA FILHO  -
 * AXL - DESENVOLVIMENTO DE SISTEMAS
 * MSN: nil_bueno@hotmail.com
 * CACHOEIRO DE ITAPEMIRIN , 12 DE JULHO DE 2011, 14:33:04
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
import javax.persistence.RollbackException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GanTimeView extends javax.swing.JFrame {
data mostra_data;
//int sobrou = 1;
//(Integer)Integer.parseInt(jLabel6.getText());;
   
    public GanTimeView() {
       initComponents();
       if (!Beans.isDesignTime()) {
       entityManager.getTransaction().begin();
       setSize(639, 587);
       setResizable(false);
       setLocationRelativeTo(null);
       jLabel1.setVisible(false);
       jLabel7.setVisible(false);
       jl_inf01.setVisible(false);
       jl_inf02.setVisible(false);
        mostra_data = new data();
       mostra_data.le_data();
       mostra_data.le_hora();
       jLabel7.setText(mostra_data.dia_semana + ", " + mostra_data.dia + " de " + mostra_data.mes + " de " + mostra_data.ano);
       timer1.start();
       ler_Confs();
      int rr = masterTable.getRowCount();
      jLabel5.setText(String.valueOf(rr));
       
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        tf_dir_analise = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jl_inf05 = new javax.swing.JLabel();
        jl_inf06 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        tamanhoKbField = new javax.swing.JTextField();
        nomeArquivoField = new javax.swing.JTextField();
        caminhoAnaliseField = new javax.swing.JTextField();
        caminhoSaidaField = new javax.swing.JTextField();
        acaoField = new javax.swing.JTextField();
        hashArquivoField = new javax.swing.JTextField();
        horaCriacaoField = new javax.swing.JTextField();
        usuarioAcaoField = new javax.swing.JTextField();
        horaAcaoField = new javax.swing.JTextField();
        nomeArquivoLabel = new javax.swing.JLabel();
        caminhoAnaliseLabel = new javax.swing.JLabel();
        dataCriacaoLabel = new javax.swing.JLabel();
        tamanhoKbLabel = new javax.swing.JLabel();
        hashArquivoLabel = new javax.swing.JLabel();
        caminhoSaidaLabel = new javax.swing.JLabel();
        acaoLabel = new javax.swing.JLabel();
        dataAcaoLabel = new javax.swing.JLabel();
        horaAcaoLabel = new javax.swing.JLabel();
        horaCriacaoLabel = new javax.swing.JLabel();
        usuarioAcaoLabel = new javax.swing.JLabel();
        dataCriacaoField = new com.toedter.calendar.JDateChooser();
        dataAcaoField = new com.toedter.calendar.JDateChooser();
        save_transaction = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        insert_transacion = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_saida = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jl_inf01 = new javax.swing.JLabel();
        jl_inf02 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Data_Final = new com.toedter.calendar.JDateChooser();
        Data_Inicial = new com.toedter.calendar.JDateChooser();
        jl_inf03 = new javax.swing.JLabel();
        jl_inf04 = new javax.swing.JLabel();
        bt_Filtrar = new javax.swing.JButton();
        bt_Iniciar = new javax.swing.JButton();
        bt_parar = new javax.swing.JButton();
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

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DIRETORIO ARQUIVO", "NOME ARQUIVO", "DATA ULTIMA  MOD/CRIAÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        tf_dir_analise.setBackground(new java.awt.Color(51, 51, 51));
        tf_dir_analise.setForeground(new java.awt.Color(255, 255, 255));
        tf_dir_analise.setEnabled(false);
        tf_dir_analise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dir_analiseActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x24/kfilereplace.png"))); // NOI18N

        jl_inf05.setForeground(new java.awt.Color(255, 255, 255));
        jl_inf05.setText("00000");

        jl_inf06.setForeground(new java.awt.Color(255, 255, 255));
        jl_inf06.setText("ARQUIVOS ENCONTRADOS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_dir_analise, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jl_inf05)
                .addGap(18, 18, 18)
                .addComponent(jl_inf06)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_dir_analise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jl_inf06)
                        .addComponent(jl_inf05))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Lista de Arquivos", jPanel3);

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        masterTable.setGridColor(new java.awt.Color(255, 255, 255));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caminhoAnalise}"));
        columnBinding.setColumnName("DIRETORIO ANALISADO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeArquivo}"));
        columnBinding.setColumnName("NOME ARQUIVO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tamanhoKb}"));
        columnBinding.setColumnName("TAMANHO Kb");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${hashArquivo}"));
        columnBinding.setColumnName("HASH");
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
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${acao}"));
        columnBinding.setColumnName("AÇÃO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caminhoSaida}"));
        columnBinding.setColumnName("CAMINHO DESTINO");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataAcao}"));
        columnBinding.setColumnName("Data Acao");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaAcao}"));
        columnBinding.setColumnName("Hora Acao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${usuarioAcao}"));
        columnBinding.setColumnName("Usuario Acao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);
        masterTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        masterTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        masterTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        masterTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        masterTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        masterTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        masterTable.getColumnModel().getColumn(6).setPreferredWidth(100);
        masterTable.getColumnModel().getColumn(7).setPreferredWidth(200);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tamanhoKb}"), tamanhoKbField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), tamanhoKbField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nomeArquivo}"), nomeArquivoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), nomeArquivoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.caminhoAnalise}"), caminhoAnaliseField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), caminhoAnaliseField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.caminhoSaida}"), caminhoSaidaField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), caminhoSaidaField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.acao}"), acaoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), acaoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.hashArquivo}"), hashArquivoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), hashArquivoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.horaCriacao}"), horaCriacaoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), horaCriacaoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.usuarioAcao}"), usuarioAcaoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), usuarioAcaoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.horaAcao}"), horaAcaoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        nomeArquivoLabel.setText("Nome Arquivo:");

        caminhoAnaliseLabel.setText("Caminho Analise:");

        dataCriacaoLabel.setText("Data Criacao:");

        tamanhoKbLabel.setText("Tamanho Kb:");

        hashArquivoLabel.setText("Hash Arquivo:");

        caminhoSaidaLabel.setText("Caminho Saida:");

        acaoLabel.setText("Acao:");

        dataAcaoLabel.setText("Data Acao:");

        horaAcaoLabel.setText("Hora Acao:");

        horaCriacaoLabel.setText("Hora Criacao:");

        usuarioAcaoLabel.setText("Usuario Acao:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataCriacao}"), dataCriacaoField, org.jdesktop.beansbinding.BeanProperty.create("date"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), dataCriacaoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataAcao}"), dataAcaoField, org.jdesktop.beansbinding.BeanProperty.create("date"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), dataAcaoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        save_transaction.setText("Save");
        save_transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_transactionActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        insert_transacion.setText("New");
        insert_transacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_transacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caminhoAnaliseLabel)
                            .addComponent(nomeArquivoLabel)
                            .addComponent(tamanhoKbLabel)
                            .addComponent(dataCriacaoLabel)
                            .addComponent(hashArquivoLabel)
                            .addComponent(caminhoSaidaLabel)
                            .addComponent(acaoLabel)
                            .addComponent(dataAcaoLabel)
                            .addComponent(horaAcaoLabel)
                            .addComponent(horaCriacaoLabel)
                            .addComponent(usuarioAcaoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(caminhoAnaliseField, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(nomeArquivoField, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(tamanhoKbField, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(hashArquivoField, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(caminhoSaidaField, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(acaoField, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(horaAcaoField, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(horaCriacaoField, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(usuarioAcaoField, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(dataCriacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataAcaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(insert_transacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save_transaction)
                        .addContainerGap(118, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_transaction)
                    .addComponent(refreshButton)
                    .addComponent(deleteButton)
                    .addComponent(insert_transacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caminhoAnaliseLabel)
                    .addComponent(caminhoAnaliseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeArquivoLabel)
                    .addComponent(nomeArquivoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamanhoKbLabel)
                    .addComponent(tamanhoKbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataCriacaoLabel)
                    .addComponent(dataCriacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hashArquivoLabel)
                    .addComponent(hashArquivoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caminhoSaidaLabel)
                    .addComponent(caminhoSaidaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acaoLabel)
                    .addComponent(acaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dataAcaoLabel)
                    .addComponent(dataAcaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaAcaoLabel)
                    .addComponent(horaAcaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaCriacaoLabel)
                    .addComponent(horaCriacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioAcaoLabel)
                    .addComponent(usuarioAcaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x24/folder_sent_mail.png"))); // NOI18N

        tf_saida.setBackground(new java.awt.Color(51, 51, 51));
        tf_saida.setForeground(new java.awt.Color(255, 255, 255));
        tf_saida.setEnabled(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("00000");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ARQUIVOS ENCONTRADOS");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_saida, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5))
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Ultimos Arquivos Movidos", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jl_inf01.setText("Usuário");

        jl_inf02.setText("Login");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/images/BUSCA POR DATA.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x32/date.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(148, 148, 148)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jl_inf02, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(214, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jl_inf01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(231, 231, 231))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jl_inf01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_inf02)
                .addGap(69, 69, 69))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        jLabel7.setText("jLabel7");

        jLabel1.setText("jLabel1");

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Data_Final.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Data_Final.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Data_Inicial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Data_Inicial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jl_inf03.setText("De");

        jl_inf04.setText("Á");

        bt_Filtrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/find.png"))); // NOI18N
        bt_Filtrar.setToolTipText("Filtrar Arquivos Criados entre datas.");
        bt_Filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_FiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_inf03)
                .addGap(10, 10, 10)
                .addComponent(Data_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_inf04)
                .addGap(10, 10, 10)
                .addComponent(Data_Final, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_Filtrar)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jl_inf03)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Data_Inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(bt_Filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Data_Final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_inf04))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_Iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/player_play.png"))); // NOI18N
        bt_Iniciar.setText("Iniciar");
        bt_Iniciar.setToolTipText("Iniciar Cópia para pasta pré-selecionada.");
        bt_Iniciar.setEnabled(false);
        bt_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_IniciarActionPerformed(evt);
            }
        });

        bt_parar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/player_pause.png"))); // NOI18N
        bt_parar.setText("Parar");
        bt_parar.setToolTipText("Parar Cópia.");
        bt_parar.setEnabled(false);
        bt_parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pararActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/bueno/img/x22/cancel.png"))); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bt_parar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_Iniciar)
                            .addComponent(bt_parar)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        bindingGroup.bind();

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-639)/2, (screenSize.height-587)/2, 639, 587);
    }// </editor-fold>//GEN-END:initComponents

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

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
}//GEN-LAST:event_refreshButtonActionPerformed

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

    private void insert_transacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_transacionActionPerformed
br.com.bueno.bean.Acoes a = new br.com.bueno.bean.Acoes();
entityManager.persist(a);
list.add(a);
int row = list.size()-1;
masterTable.setRowSelectionInterval(row, row);
masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
}//GEN-LAST:event_insert_transacionActionPerformed

    private void bt_FiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_FiltrarActionPerformed
if(Data_Inicial.getDate().before(Data_Final.getDate()) )
{
    Jtable();
    bt_Iniciar.setEnabled(true);
    bt_parar.setEnabled(true);
}
else if(Data_Inicial.getDate().after(Data_Final.getDate()))
{
    JOptionPane.showMessageDialog(null,"INFORME AS DATAS NA ORDEM CORRETA\n\nPARA PESQUISAR ARQUIVOS CRIADOS ENTRE 10/08/1998 Á 11/08/2003, POR EXEMPLO.\nINFORME SEMPRE UM DIA ANTES NA DATA INICIAL ASSIM. De 09/08/1998 Á 11/08/2003   ", "ALERTA DO SISTEMA", JOptionPane.WARNING_MESSAGE );}
}//GEN-LAST:event_bt_FiltrarActionPerformed

    private void bt_pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pararActionPerformed
timer2.stop();
Data_Inicial.setEnabled(true);
Data_Final.setEnabled(true);
bt_Filtrar.setEnabled(true);
}//GEN-LAST:event_bt_pararActionPerformed

    private void bt_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_IniciarActionPerformed

        String conflitante = tf_saida.getText();
        String conflito = tf_dir_analise.getText();
//        int trcon = conflito.length();
//        String conflitoTratado = conflito.substring((trcon), trcon-1);
//        System.out.println(conflitoTratado);
     if(conflito.equals(conflitante+"\\") || conflito.isEmpty() || conflitante.isEmpty()){
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
        
        timer2.start();
        Data_Inicial.setEnabled(false);
        Data_Final.setEnabled(false);
        bt_Filtrar.setEnabled(false);
        }
}//GEN-LAST:event_bt_IniciarActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
mostra_data.le_hora();
jLabel1.setText("Hora atual " + mostra_data.hora);
}//GEN-LAST:event_timer1OnTime

    private void timer2OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer2OnTime
remover();
    }//GEN-LAST:event_timer2OnTime




    private void tf_dir_analiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dir_analiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dir_analiseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


                   int opcao;
                   Object[] botoes = {" SIM "," NÃO "};
                   opcao = JOptionPane.showOptionDialog(null, "DESEJA FECHAR O SISTEMA?", "PERGUNTA DO SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
                   if (opcao ==  JOptionPane.YES_OPTION) {
       timer2.stop();
       Data_Inicial.setEnabled(true);
       Data_Final.setEnabled(true);
       bt_Filtrar.setEnabled(true);
    
            dispose();
      
                   }

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(final String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GanTimeView().setVisible(true);
                jl_inf02.setText(args[0]);
                jl_inf01.setText(args[1]);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Data_Final;
    private com.toedter.calendar.JDateChooser Data_Inicial;
    private javax.swing.JTextField acaoField;
    private javax.swing.JLabel acaoLabel;
    private javax.swing.JButton bt_Filtrar;
    private javax.swing.JButton bt_Iniciar;
    private javax.swing.JButton bt_parar;
    private javax.swing.JTextField caminhoAnaliseField;
    private javax.swing.JLabel caminhoAnaliseLabel;
    private javax.swing.JTextField caminhoSaidaField;
    private javax.swing.JLabel caminhoSaidaLabel;
    private com.toedter.calendar.JDateChooser dataAcaoField;
    private javax.swing.JLabel dataAcaoLabel;
    private com.toedter.calendar.JDateChooser dataCriacaoField;
    private javax.swing.JLabel dataCriacaoLabel;
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JTextField hashArquivoField;
    private javax.swing.JLabel hashArquivoLabel;
    private javax.swing.JTextField horaAcaoField;
    private javax.swing.JLabel horaAcaoLabel;
    private javax.swing.JTextField horaCriacaoField;
    private javax.swing.JLabel horaCriacaoLabel;
    private javax.swing.JButton insert_transacion;
    private javax.swing.JButton jButton1;
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private static javax.swing.JLabel jl_inf01;
    private static javax.swing.JLabel jl_inf02;
    private javax.swing.JLabel jl_inf03;
    private javax.swing.JLabel jl_inf04;
    private static javax.swing.JLabel jl_inf05;
    private javax.swing.JLabel jl_inf06;
    private java.util.List<br.com.bueno.bean.Acoes> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JTextField nomeArquivoField;
    private javax.swing.JLabel nomeArquivoLabel;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton save_transaction;
    private javax.swing.JTextField tamanhoKbField;
    private javax.swing.JLabel tamanhoKbLabel;
    private javax.swing.JTextField tf_dir_analise;
    private javax.swing.JTextField tf_saida;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    private org.netbeans.examples.lib.timerbean.Timer timer2;
    private javax.swing.JTextField usuarioAcaoField;
    private javax.swing.JLabel usuarioAcaoLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
  
         public void remover()
         {
             jTable1.getColumnModel().getColumn(0).setPreferredWidth(190);
             jTable1.getColumnModel().getColumn(1).setPreferredWidth(60);
             jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
             DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
             jTable1.setRowSelectionInterval(0, 0);
             
             
             
             int idx[] = jTable1.getSelectedRows();
             insert_transacion.doClick();
             
             for(int j =0; j<idx.length;j++)
             {
                 int k = idx[j]-j;
                 int jColunnTable = 0;
                 Object obj = jTable1.getValueAt(k,jColunnTable);
                 String str1 = String.valueOf(obj);
             
                 try{
                     File diretorio = new File(str1);
                     caminhoAnaliseField.setText(diretorio.getAbsolutePath());
                     nomeArquivoField.setText(diretorio.getName());
                     String dt = String.valueOf(diretorio.hashCode());
                     hashArquivoField.setText(String.valueOf(dt));
                     
                     Long tam = diretorio.length();
                     Long  kb = tam / 1024;
                     String kj = String.valueOf(kb);
                     Double db = Double.parseDouble(kj);
                     tamanhoKbField.setText(String.valueOf(db)+" "+"Kb");
                     
                     DateFormat formatDatacr = new SimpleDateFormat("dd/MM/yyyy");
                     String data = formatDatacr.format(new Date(diretorio.lastModified()));
                     SimpleDateFormat formatHora = new SimpleDateFormat("HH:mm:ss");
                     String hora = formatHora.format(new Date(diretorio.lastModified()));
                     Date date2 = (Date)formatDatacr.parse(data);

                     dataCriacaoField.setDate(date2);
                     horaCriacaoField.setText(hora);
                     acaoField.setText("Movido");
                     usuarioAcaoField.setText(jl_inf02.getText());
                     caminhoSaidaField.setText(tf_saida.getText());
                     horaAcaoField.setText(""+mostra_data.hora);

                     Date dataTempo = new Date();
                     String dia = ""+dataTempo.getDate();
                     String mes = ""+String.valueOf(dataTempo.getMonth()+1);
                     String ano = ""+(1900 + dataTempo.getYear());
                     if (Integer.parseInt(mes)<=9)mes = "0" +mes;
                     dataAcaoField.setDate(dataTempo);
         
                     }catch (Exception err) {}

                        save_transaction.doClick();
                         try{
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
                             origem.close();destino.close();
                            }catch(Exception e){  }
                            try{
                               File arqu = new File (str1);
                               if(arqu.exists()){
                               arqu.delete();
                               }
                           }catch(Exception e){}
         modelo.removeRow(idx[j]-j);
         int removido = modelo.getRowCount();
         jl_inf05.setText(String.valueOf(removido));
         jl_inf06.setText("Arquivos Restantes");}
         int ll = jTable1.getRowCount();
         if(ll == 0 ){
             JOptionPane.showMessageDialog(null, "A Cópia dos Arquivos Terminou","AVISO DO SISTEMA", JOptionPane.INFORMATION_MESSAGE);
             jl_inf06.setText("Arquivos Encontrados");
         }
         }
         public void Jtable(){
             jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
             jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
             DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
             modelo.setNumRows(0);
             try{
               File arquivo = new File (tf_dir_analise.getText());
               String arquivos [] = arquivo.list();
               for (String s : arquivos)
               {
                   File f = new File(s);
                   int  numeroLinhas = modelo.getRowCount();
                   jl_inf05.setText(String.valueOf(numeroLinhas+1));
                   String filtro = f.getName();
                   int tmt = filtro.length();
                   String filtrado = filtro.substring((tmt-3), tmt);
         String filnome = filtro.substring(0, (tmt-3));
         File g = new File(tf_dir_analise.getText()+filnome+filtrado);
         DateFormat formatDatacr = new SimpleDateFormat("dd/MM/yyyy");
         String data = formatDatacr.format(new Date(g.lastModified()));
         Date in = new Date();
         Date al = new Date();
         Date q = (Date)formatDatacr.parse(data);
         try{al = Data_Final.getDate();
         in = Data_Inicial.getDate();
         }catch (Exception e)
         {System.out.println(e);}

         if (in.before(q) && al.after(q)){
             if(filtrado.equalsIgnoreCase("jpg")||(filtrado.equalsIgnoreCase("gif"))||(filtrado.equalsIgnoreCase("bmp"))||(filtrado.equalsIgnoreCase("png")))
         {
                 modelo.addRow(new Object[]{(tf_dir_analise.getText()+filnome+filtrado),filnome+filtrado,data});
             }
         else {}
         }
         else{}
               }}catch (Exception exc){
                   JOptionPane.showMessageDialog(null,"Houve um erro ao carregar os arquivos\nInforme ao Suporte "+ exc);}}
         public void refreshTransaction(){
             entityManager.getTransaction().rollback();
             entityManager.getTransaction().begin();
             java.util.Collection data = query.getResultList();
             for (Object entity : data) {
                 entityManager.refresh(entity);
             }list.clear();
             list.addAll(data);
         }
         public void ler_Confs(){
             File confA = new File ("C:\\Arquivos de programas\\FileX\\EnginerX\\004\\CA1000DA.nbx");
             File confS = new File ("C:\\Arquivos de programas\\FileX\\EnginerX\\004\\CS1000DS.nbx");
         FileInputStream fluxoArquivo = null;ObjectInputStream entradaObjeto = null;DataInputStream ob_Pri = null;FileInputStream fluxoArquivo2 = null;
         ObjectInputStream entradaObjeto2 = null;DataInputStream ob_Pri2 = null;
         try{
             fluxoArquivo = new FileInputStream(confA);entradaObjeto = new ObjectInputStream(fluxoArquivo);
             ob_Pri = new DataInputStream( fluxoArquivo);
             String textChar = (String) entradaObjeto.readObject();
         fluxoArquivo2 = new FileInputStream(confS);
         entradaObjeto2 = new ObjectInputStream(fluxoArquivo2);
         ob_Pri2 = new DataInputStream( fluxoArquivo2);
         String textChar2 = (String) entradaObjeto2.readObject();
         tf_dir_analise.setText(textChar+"\\");
         tf_saida.setText(textChar2);entradaObjeto.close();ob_Pri.close();
         entradaObjeto2.close();
         ob_Pri2.close();
         }catch(Exception e)
         {}
         }
}