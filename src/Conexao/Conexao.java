package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	Connection con = null;
	
	public Connection conectar() {

			
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();// Abre a conex�o
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CONCESSIONARIA","root","");
			System.out.println("Conex�o realizada com sucesso.");
			

		} catch (InstantiationException  | IllegalAccessException e) {
                } catch (ClassNotFoundException cfe){
                    System.out.println("Classe nao encontrada");
                } catch (SQLException sq){
                     System.out.println("Erro de sql de ao abri conecção"+ sq.getMessage());
                }
              		return con;

	}
	public void fechar(){
		try {
			this.con.close();
			System.out.println("Conex�o fechada com sucesso.");
		} catch (SQLException e) {
			 System.out.println("Erro ao fechar conex�o"+ e.getMessage());
		}
	}

}
