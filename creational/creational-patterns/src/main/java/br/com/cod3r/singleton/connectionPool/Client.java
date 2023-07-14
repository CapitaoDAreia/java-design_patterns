package br.com.cod3r.singleton.connectionPool;

import br.com.cod3r.singleton.connectionPool.conn.Connection;
import br.com.cod3r.singleton.connectionPool.conn.ConnectionPool;

// TODO: Singleton review
/*
	- A intenção do padrão singleton é que uma determinada classe possua somente uma instância 
	em um processo, e essa classe forneça um método estático para o acesso dessa instância.
	- No modelo abaixo, como podemos ver, a classe 'ConnectionPool' possui seu construtor privado,
	ou seja, ele só pode ser acessado dentro da própria classe. A instanciação dessa classe ocorre
	dentro dela mesma, e para compartilhar essa instância há um método estático (pertence somente à classe, 
	não a um objeto da classe) que retorna a instância dessa classe, onde é devolvida uma pool de conexões.

*/

public class Client {
	public static void doQuery1() {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A1");
	}
	
	public static void doQuery2() {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A2");
	}
	
	public static void doQuery3() {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A3");
	}

	public static void main(String[] args) {
		doQuery1();
		doQuery2();
		doQuery3();
	}
}
