/* @author Flavio Luiz Bé & Felipe Busch*/
package sistservice;

import apoio.ConexaoBD;
import java.sql.*;
import javax.swing.JOptionPane;
import tela.FrmPrincipal;

public class SistService {

    /**
     * @param args the command line arguments
     */
    static Connection conexao = null;

    public static void main(String[] args) {
        if (ConexaoBD.getInstance().getConnection() != null) {
            new FrmPrincipal().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no Banco de Dados!");
        }
    }
}
