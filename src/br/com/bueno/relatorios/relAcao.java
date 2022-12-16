package br.com.bueno.relatorios;

import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

import br.com.bueno.conexaoR.conexao;

public class relAcao {

    
    conexao con = new conexao();


public relAcao() {
  try 
  {
      con.conecta();
      con.executeSQL("SELECT * from acoes");
      JRResultSetDataSource jrRS = new JRResultSetDataSource(con.resultset);
      JasperPrint jasperPrint = JasperFillManager.fillReport(
      "EnginerX/001/TIPO1.jasper", new HashMap(), jrRS);
      JasperViewer.viewReport(jasperPrint,false);
    
  } catch (Exception erro){
             JOptionPane.showMessageDialog(null,"Não Conectou ="+erro);
   }
}

  public static void main (String args[]) 
  {
    new relAcao();

  }

}


