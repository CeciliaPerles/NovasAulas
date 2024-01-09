package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
	//	final String stringDeConexao = "jdbc:sqlserver://localhost:1433";
		
		final String stringDeConexao  = "jdbc:mysql://cecilia-mysql.c4upaclrw1rx.us-east-1.rds.amazonaws.com:3306";
		final String usuario = "admin";
		final String senha = "minhacasa123";
		
		Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);

		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE curso_java");
		
		System.out.println("Banco criado com sucesso.");

		conexao.close();
		
		
	}

}
