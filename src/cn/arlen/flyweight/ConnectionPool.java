package cn.arlen.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * 享元模式，实现对象的共享，即共享池，
 * 当系统中对象多的时候可以减少内存的开销
 * @author itservice
 *
 */
public class ConnectionPool {

	private Vector<Connection> pool;
	
	/*共有属性*/
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";
	
	private int poolSize = 100;
	
	private static ConnectionPool instance = null;
	
	Connection conn = null;
	
	private ConnectionPool(){
		pool = new Vector<Connection>(poolSize);
		
		for(int i = 0;i<poolSize;i++){
			try{
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url,username,password);
				pool.add(conn);
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	/*返回连接池*/
	public synchronized void release(){
		pool.add(conn);
	}
	
	public synchronized Connection getConnection(){
		if(pool.size() > 0){
			Connection conn = pool.get(0);
			return conn;
		}else{
			return null;
		}
	}
}
