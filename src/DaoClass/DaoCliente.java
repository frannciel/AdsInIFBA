package DaoClass;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Conexao.Conexao;
import Entidades.Cliente;

public class DaoCliente {

	Conexao conect;
	Statement state;
	Connection conn;

	public DaoCliente() {

		conect = new Conexao();// CONECT recebe uma instancia da classe conexao
		conn = conect.conectar(); // CONN recebe uma instancia de Connection
									// classe conexao metodo conectar
	}

	public void inserir(Cliente cliente) {

		try {
			state = conn.createStatement();
			state.executeUpdate("INSERT INTO MACONARIA (GRAN_MESTRE) VALUES ('MRDIEGO')");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conect.fechar();
		}
	}

	public void alterar(Cliente cliente) {

		try {
			state = conn.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conect.fechar();
		}

	}

	public void consultar(Cliente cliente) {

		try {
			state = conn.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conect.fechar();
		}
	}

	public void excluir(Cliente cliente) {

		try {
			state = conn.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conect.fechar();
		}

	}
}
