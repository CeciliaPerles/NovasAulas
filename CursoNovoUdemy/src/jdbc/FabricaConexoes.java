package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexoes {

	public static Connection getConexao() {
	try {
	final String stringDeConexao  = "jdbc:mysql://cecilia-mysql.c4upaclrw1rx.us-east-1.rds.amazonaws.com:3306/curso_java";
	final String usuario = "admin";
	final String senha = "minhacasa123";
	
	
	return DriverManager.getConnection(stringDeConexao, usuario, senha);	
} catch (SQLException e){
	throw new RuntimeException(e);
}
}
}