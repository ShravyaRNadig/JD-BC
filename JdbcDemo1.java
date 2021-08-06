import java.sql.*;
class JdbcDemo1{
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");		
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","XXX","YYY");//connection with 
		System.out.println("Connection is established");
		
		Statement st = con.createStatement();//vehicle is created for the dedicated route
		
		
		String query = "SELECT * FROM emp";//DQL
		ResultSet result=st.executeQuery(query);
		while(result.next()) {
			System.out.println(result.getInt(1)+"--"+result.getString(2)+"--"+result.getString(3));
		}
		
		con.close();
	}
}
