package DaoClass;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Conexao.Conexao;
import Entidades.Vendedor;

public class DaoVendedor {
	Conexao conect;
	Statement state;
	Connection conn;

	public DaoVendedor(Vendedor vendedor) {

		conect = new Conexao();// CONECT recebe uma instancia da classe conexao
		conn = conect.conectar(); // CONN recebe uma instancia de Connection
									// classe conexao metodo conectar
	}

	public void inserir() {

		try {
			state = conn.createStatement();
			state.executeUpdate("INSERT INTO MACONARIA (GRAN_MESTRE) VALUES ('MRDIEGO')");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conect.fechar();
		}
	}

	public void alterar() {

		try {
			state = conn.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conect.fechar();
		}

	}

	public void consultar() {

		try {
			state = conn.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conect.fechar();
		}
	}

	public void excluir() {

		try {
			state = conn.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conect.fechar();
		}

	}

}
