/* @author Flavio Luiz Bé & Felipe Busch*/
package dao;

import apoio.ConexaoBD;
import apoio.IDAOT;
import entidade.Clientes;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ClientesDAO implements IDAOT<Clientes> {

    @Override
    public String salvar(Clientes o) {
        if (o.getCpf() == null) {
            try {
                Statement st = ConexaoBD.getInstance().getConnection().createStatement();
                String sql = "INSERT INTO clientes "
                        + "VALUES "
                        + "(default, "
                        + "'" + o.getNome() + "', "
                        + "'" + o.getEmail() + "', "
                        + "'" + o.getEndereco() + "', "
                        + "'" + o.getNumero() + "', "
                        + "'" + o.getComplemento() + "', "
                        + "'" + o.getBairro() + "', "
                        + "'" + o.getCidade() + "', "
                        + "'" + o.getCep() + "', "
                        + "" + o.getCpf() + ", "
                        + "'" + o.getCnpj() + "', "
                        + "'" + o.getTelefone() + "', "
                        + "'" + o.getStatus() + "')";

                System.out.println("SQL: " + sql);
                int retorno = st.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Erro ao salvar registro: " + e);
                return e.toString();
            }
        }
        if (o.getCnpj() == null) {
            try {
                Statement st = ConexaoBD.getInstance().getConnection().createStatement();
                String sql = "INSERT INTO clientes "
                        + "VALUES "
                        + "(default, "
                        + "'" + o.getNome() + "', "
                        + "'" + o.getEmail() + "', "
                        + "'" + o.getEndereco() + "', "
                        + "'" + o.getNumero() + "', "
                        + "'" + o.getComplemento() + "', "
                        + "'" + o.getBairro() + "', "
                        + "'" + o.getCidade() + "', "
                        + "'" + o.getCep() + "', "
                        + "'" + o.getCpf() + "', "
                        + "" + o.getCnpj() + ", "
                        + "'" + o.getTelefone() + "', "
                        + "'" + o.getStatus() + "')";

                System.out.println("SQL: " + sql);
                int retorno = st.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Erro ao salvar registro: " + e);
                return e.toString();
            }
        }
        if (o.getCpf() == null && o.getCnpj() == null) {
            try {
                Statement st = ConexaoBD.getInstance().getConnection().createStatement();
                String sql = "INSERT INTO clientes "
                        + "VALUES "
                        + "(default, "
                        + "'" + o.getNome() + "', "
                        + "'" + o.getEmail() + "', "
                        + "'" + o.getEndereco() + "', "
                        + "'" + o.getNumero() + "', "
                        + "'" + o.getComplemento() + "', "
                        + "'" + o.getBairro() + "', "
                        + "'" + o.getCidade() + "', "
                        + "'" + o.getCep() + "', "
                        + "" + o.getCpf() + ", "
                        + "" + o.getCnpj() + ", "
                        + "'" + o.getTelefone() + "', "
                        + "'" + o.getStatus() + "')";

                System.out.println("SQL: " + sql);
                int retorno = st.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Erro ao salvar registro: " + e);
                return e.toString();
            }
        }
        if (o.getCpf() != null && o.getCnpj() != null) {
            try {
                Statement st = ConexaoBD.getInstance().getConnection().createStatement();
                String sql = "INSERT INTO clientes "
                        + "VALUES "
                        + "(default, "
                        + "'" + o.getNome() + "', "
                        + "'" + o.getEmail() + "', "
                        + "'" + o.getEndereco() + "', "
                        + "'" + o.getNumero() + "', "
                        + "'" + o.getComplemento() + "', "
                        + "'" + o.getBairro() + "', "
                        + "'" + o.getCidade() + "', "
                        + "'" + o.getCep() + "', "
                        + "'" + o.getCpf() + "', "
                        + "'" + o.getCnpj() + "', "
                        + "'" + o.getTelefone() + "', "
                        + "'" + o.getStatus() + "')";

                System.out.println("SQL: " + sql);
                int retorno = st.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Erro ao salvar registro: " + e);
                return e.toString();
            }
        }
        return null;
    }

    @Override
    public String atualizar(Clientes o) {
        if (o.getCpf() == null) {
            try {
                Statement st = ConexaoBD.getInstance().getConnection().createStatement();
                String sql = "UPDATE clientes "
                        + "SET "
                        + "nome = '" + o.getNome() + "', "
                        + "email = '" + o.getEmail() + "', "
                        + "endereco = '" + o.getEndereco() + "', "
                        + "numero = '" + o.getNumero() + "', "
                        + "complemento = '" + o.getComplemento() + "', "
                        + "bairro = '" + o.getBairro() + "', "
                        + "cidade = '" + o.getCidade() + "', "
                        + "cep = '" + o.getCep() + "', "
                        + "cpf = " + o.getCpf() + ", "
                        + "cnpj = '" + o.getCnpj() + "', "
                        + "telefone = '" + o.getTelefone() + "', "
                        + "status = '" + o.getStatus() + "' "
                        + "WHERE id = " + o.getId();

                System.out.println("SQL: " + sql);
                int retorno = st.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Erro ao atualizar registro: " + e);
                return e.toString();
            }
        }
        if (o.getCnpj() == null) {
            try {
                Statement st = ConexaoBD.getInstance().getConnection().createStatement();
                String sql = "UPDATE clientes "
                        + "SET "
                        + "nome = '" + o.getNome() + "', "
                        + "email = '" + o.getEmail() + "', "
                        + "endereco = '" + o.getEndereco() + "', "
                        + "numero = '" + o.getNumero() + "', "
                        + "complemento = '" + o.getComplemento() + "', "
                        + "bairro = '" + o.getBairro() + "', "
                        + "cidade = '" + o.getCidade() + "', "
                        + "cep = '" + o.getCep() + "', "
                        + "cpf = '" + o.getCpf() + "', "
                        + "cnpj = " + o.getCnpj() + ", "
                        + "telefone = '" + o.getTelefone() + "', "
                        + "status = '" + o.getStatus() + "' "
                        + "WHERE id = " + o.getId();

                System.out.println("SQL: " + sql);
                int retorno = st.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Erro ao atualizar registro: " + e);
                return e.toString();
            }
        }
        if (o.getCpf() == null && o.getCnpj() == null) {
            try {
                Statement st = ConexaoBD.getInstance().getConnection().createStatement();
                String sql = "UPDATE clientes "
                        + "SET "
                        + "nome = '" + o.getNome() + "', "
                        + "email = '" + o.getEmail() + "', "
                        + "endereco = '" + o.getEndereco() + "', "
                        + "numero = '" + o.getNumero() + "', "
                        + "complemento = '" + o.getComplemento() + "', "
                        + "bairro = '" + o.getBairro() + "', "
                        + "cidade = '" + o.getCidade() + "', "
                        + "cep = '" + o.getCep() + "', "
                        + "cpf = " + o.getCpf() + ", "
                        + "cnpj = " + o.getCnpj() + ", "
                        + "telefone = '" + o.getTelefone() + "', "
                        + "status = '" + o.getStatus() + "' "
                        + "WHERE id = " + o.getId();

                System.out.println("SQL: " + sql);
                int retorno = st.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Erro ao atualizar registro: " + e);
                return e.toString();
            }
        }
        if (o.getCpf() != null && o.getCnpj() != null) {
            try {
                Statement st = ConexaoBD.getInstance().getConnection().createStatement();
                String sql = "UPDATE clientes "
                        + "SET "
                        + "nome = '" + o.getNome() + "', "
                        + "email = '" + o.getEmail() + "', "
                        + "endereco = '" + o.getEndereco() + "', "
                        + "numero = '" + o.getNumero() + "', "
                        + "complemento = '" + o.getComplemento() + "', "
                        + "bairro = '" + o.getBairro() + "', "
                        + "cidade = '" + o.getCidade() + "', "
                        + "cep = '" + o.getCep() + "', "
                        + "cpf = '" + o.getCpf() + "', "
                        + "cnpj = '" + o.getCnpj() + "', "
                        + "telefone = '" + o.getTelefone() + "', "
                        + "status = '" + o.getStatus() + "' "
                        + "WHERE id = " + o.getId();

                System.out.println("SQL: " + sql);
                int retorno = st.executeUpdate(sql);
            } catch (Exception e) {
                System.out.println("Erro ao atualizar registro: " + e);
                return e.toString();
            }
        }
        return null;
    }

    @Override
    public String excluir(int id) {
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = "DELETE FROM clientes "
                    + "WHERE id = " + id;
            
            System.out.println("SQL: " + sql);
            int retorno = st.executeUpdate(sql);
            return null;
        } catch (Exception e) {
            System.out.println("Erro ao excluir registro: " + e);
            return e.toString();
        }
    }

    @Override
    public ArrayList<Clientes> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Clientes> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Clientes consultarId(int id) {
        Clientes cliente = null;
        try {
            Statement st = ConexaoBD.getInstance().getConnection().createStatement();
            String sql = ""
                    + "SELECT * "
                    + "FROM clientes "
                    + "WHERE id = " + id;
            System.out.println("SQL: " + sql);
            ResultSet retorno = st.executeQuery(sql);

            while (retorno.next()) {
                cliente = new Clientes();

                cliente.setId(retorno.getInt("id"));
                cliente.setNome(retorno.getString("nome"));
                cliente.setEmail(retorno.getString("email"));
                cliente.setEndereco(retorno.getString("endereco"));
                cliente.setNumero(retorno.getString("numero"));
                cliente.setComplemento(retorno.getString("complemento"));
                cliente.setBairro(retorno.getString("bairro"));
                cliente.setCidade(retorno.getString("cidade"));
                cliente.setCep(retorno.getString("cep"));
                cliente.setCpf(retorno.getString("cpf"));
                cliente.setCnpj(retorno.getString("cnpj"));
                cliente.setTelefone(retorno.getString("telefone"));
                cliente.setStatus(retorno.getString("status"));
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar registros: " + e);
        }
        return cliente;
    }

    public void popularTabela(JTable tabela, String criterio) {

        ResultSet resultadoQ;

        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[13];
        cabecalho[0] = "ID";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Email";
        cabecalho[3] = "Endereço";
        cabecalho[4] = "Número";
        cabecalho[5] = "Complemento";
        cabecalho[6] = "Bairro";
        cabecalho[7] = "Cidade";
        cabecalho[8] = "CEP";
        cabecalho[9] = "CPF";
        cabecalho[10] = "CNPJ";
        cabecalho[11] = "Telefone";
        cabecalho[12] = "Status";

        // cria matriz de acordo com nº de registros da tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) "
                    + "FROM clientes "
                    + "WHERE "
                    + "nome ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][13];

        } catch (Exception e) {
            System.out.println("Erro ao consultar registros: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * "
                    + "FROM clientes "
                    + "WHERE "
                    + "nome ILIKE '%" + criterio + "%' "
                    + "ORDER BY nome");
            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getInt("id");
                dadosTabela[lin][1] = resultadoQ.getString("nome");
                dadosTabela[lin][2] = resultadoQ.getString("email");
                dadosTabela[lin][3] = resultadoQ.getString("endereco");
                dadosTabela[lin][4] = resultadoQ.getString("numero");
                dadosTabela[lin][5] = resultadoQ.getString("complemento");
                dadosTabela[lin][6] = resultadoQ.getString("bairro");
                dadosTabela[lin][7] = resultadoQ.getString("cidade");
                dadosTabela[lin][8] = resultadoQ.getString("cep");
                dadosTabela[lin][9] = resultadoQ.getString("cpf");
                dadosTabela[lin][10] = resultadoQ.getString("cnpj");
                dadosTabela[lin][11] = resultadoQ.getString("telefone");
                dadosTabela[lin][12] = resultadoQ.getString("status");

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("O sistema apresentou um problema para exibir a tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {
                if (column == 2) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });

        // permite selecao de apenas uma linha da tabela
        tabela.setSelectionMode(0);

        // redimensiona as colunas de uma tabela
        TableColumn column = null;
        for (int i = 0; i < tabela.getColumnCount(); i++) {
            column = tabela.getColumnModel().getColumn(i);
            switch (i) {
                case 0:
                    column.setPreferredWidth(5);
                    break;
                case 1:
                    column.setPreferredWidth(120);
                    break;
                case 2:
                    column.setPreferredWidth(120);
                    break;
                case 3:
                    column.setPreferredWidth(120);
                    break;
                case 4:
                    column.setPreferredWidth(5);
                    break;
                case 5:
                    column.setPreferredWidth(120);
                    break;
                case 6:
                    column.setPreferredWidth(30);
                    break;
                case 7:
                    column.setPreferredWidth(30);
                    break;
                case 8:
                    column.setPreferredWidth(5);
                    break;
                case 9:
                    column.setPreferredWidth(5);
                    break;
                case 10:
                    column.setPreferredWidth(5);
                    break;
                case 11:
                    column.setPreferredWidth(5);
                    break;
                case 12:
                    column.setPreferredWidth(5);
                    break;
            }
        }
        // renderizacao das linhas da tabela = mudar a cor
//        jTable1.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//
//            @Override
//            public Component getTableCellRendererComponent(JTable table, Object value,
//                    boolean isSelected, boolean hasFocus, int row, int column) {
//                super.getTableCellRendererComponent(table, value, isSelected,
//                        hasFocus, row, column);
//                if (row % 2 == 0) {
//                    setBackground(Color.GREEN);
//                } else {
//                    setBackground(Color.LIGHT_GRAY);
//                }
//                return this;
//            }
//        });
    }
}
