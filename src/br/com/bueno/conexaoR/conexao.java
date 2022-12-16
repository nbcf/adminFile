package br.com.bueno.conexaoR;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.sql.*;
import javax.swing.*;



        public class conexao
        {




        final private String driver = "com.mysql.jdbc.Driver";
        final private String url = "jdbc:mysql://localhost/adminfile";
        final private String usuario = "root";
        final private String senha = "root";
        private Connection conexao;
        public Statement statement;
        public ResultSet resultset;


        public boolean conecta()
        {
         
            boolean result = true;
            try
            {
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, usuario, senha);
              
                
           }        
           catch(ClassNotFoundException Driver)
           {
                JOptionPane.showMessageDialog(null,"Driver não localizado:"+Driver);
                result = false;
           }
           catch(SQLException Fonte)
           {
                JOptionPane.showMessageDialog(null,"ERRO NA CONEX�O"+
                        "AO ACESSAR O BANCO DE DADOS"+Fonte);
                result = false;
           }
            
           return result; 
        }
        
        public void desconecta()
        {
                boolean result = true;
                try
                {
                    conexao.close();
                    JOptionPane.showMessageDialog(null,"banco fechado");
                }        
                catch(SQLException erroSQL)
                {
                JOptionPane.showMessageDialog(null,"N�o foi possivel"+
                        "echar o banco de dados"+erroSQL.getMessage());
                
                result = false;
                
                }
         }
        public void executeSQL(String sql)
        {
                
               try 
               {
                    statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                    resultset = statement.executeQuery(sql);
                    
               
               }        
               catch (SQLException sqlex)
               {
               JOptionPane.showMessageDialog(null,sqlex.getMessage());
               
               }
        
        }




    public void addItem(String string) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
      

}