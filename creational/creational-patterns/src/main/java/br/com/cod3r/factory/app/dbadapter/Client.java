package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.DBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.DatabaseSimpleFactory;

//Todo: Factory Review
/*
	In this implementation, we have the Factory Method Pattern applyed in the
	Simple Factory approach.

	The client knows the 'DBFactory' interface, 'DB interface' and the 'DatabaseSimpleFactory'.
	The client do not know the logic and decisions made by 'DatabaseSimpleFactory', he only
	provides an parameter informing the kind of database that he wants to operate and the factory
	does the work behind that.

	This approach provides us a low level of coupling and a high level of security in maintenance.
*/

public class Client {

	public static void main(String[] args) {
		DBFactory factoryDB = new DatabaseSimpleFactory();
		DB db = factoryDB.getDatabase("postgres");

		if(db != null){
			db.query("SELECT * FROM users;");
		}else{
			System.out.println("ERROR: database is null");
		}
	}
}
