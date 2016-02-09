package DaoClass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexao.Conexao;
import Entidades.Carro;
import java.sql.PreparedStatement;

public class DaoCarro {
	Conexao conect;
	PreparedStatement state;
	Connection conn;

	public DaoCarro() {

		conect = new Conexao();// CONECT recebe uma instancia da classe conexao
		conn = conect.conectar(); // CONN recebe uma instancia de Connection
		
                
	}

	public void inserir(Carro carro) {
            
           String query = "INSERT INTO CARRO (CHASSI, FABRICANTE, VALOR, ANO_FABRICA, COR, QTD_ESTOQUE, NOME)"
            +"VALUES('"+carro.getChassi()+"','"+ carro.getFabric()+"',"+ carro.getValor()+","+ carro.getAnoFabric()
            +",'"+ carro.getCor()+"',"+carro.getQdtEstoque()+",'" + carro.getNome()+"')";
                 
            try {
		if(carro.getNome() != null ){
		state = conn.prepareStatement(query);
		state.executeUpdate();
                System.out.println("Produto Cadstrado com sucesso");
		}else{
                    System.out.println(" O nome do produto é Obriga");
		}
            } catch (SQLException e) {
		System.out.println("Erro ao inserir novo Produto");
		e.printStackTrace();
            } finally {
		conect.fechar();
            }

	}

	public void alterar(Carro carro) {
            
                String query ="UPDATE CARRO SET NOME ='"+carro.getNome()+"'"
								+",CHASSI = '"+carro.getChassi()+"'"
								+",FABRICANTE = '"+carro.getFabric()+"'"
								+",VALOR = "+carro.getValor()
								+",ANO_FABRICA ="+carro.getAnoFabric()
								+",COR ='"+carro.getCor()+"'"
								+",QTD_ESTOQUE ="+carro.getQdtEstoque()
								+"WHERE ID_CARRO ="+carro.getId_carro()+";";

		try {
			if(carro.getNome() != null ){
			state = conn.prepareStatement(query);
                        state.executeUpdate();
                        System.out.println(" Alterado com sucesso");
			}else{
                            System.out.println(" O nome do produto é Obriga");
			}

		} catch (SQLException e) {
			System.out.println("Erro ao alterar  Produto");
			e.printStackTrace();
		} finally {
			conect.fechar();
		}
	}

	public Carro consultar(String nomeCarro) {
		
			Carro carro = new Carro();
		try {
                    String query = "SELECT * FROM CARRO WHERE NOME ='"+nomeCarro+"';";
                    state = conn.prepareStatement(query);
                    ResultSet rs = state.executeQuery();
			
                    while(rs.next()){				
			carro.setNome(rs.getString(8)); 
                        carro.setCor(rs.getString(6));
                        carro.setFabric(rs.getString(3));
                        carro.setChassi(rs.getString(2));
                        carro.setValor(rs.getDouble(4));
                        carro.setAnoFabric(rs.getInt(5));
                        carro.setQdtEstoque(rs.getInt(7));
                        carro.setId_carro(rs.getInt(1));
                    }
			
                }catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conect.fechar();
		}
		return carro;
	}
	public void consultar() {

            try {
                state = conn.prepareStatement("select * from Carro Where");
                ResultSet rs = state.executeQuery();

            } catch (SQLException e) {
            } finally {
                conect.fechar();
            }
	}

	public void excluir(Carro carro) {

		// Esclui um carro do banco recebendo um objeto carro como parametro
		try {
			state = conn.prepareStatement("DELETE FROM CARRO WHERE NOME_CARRO ='"
					+ carro.getNome() + "'");
			state.execute();
			System.out.println("Carro excluido com sucesso.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conect.fechar();
		}

	}

}