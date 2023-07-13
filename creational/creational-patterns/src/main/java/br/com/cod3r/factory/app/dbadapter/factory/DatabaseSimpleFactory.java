package br.com.cod3r.factory.app.dbadapter.factory;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.db.OracleDB;
import br.com.cod3r.factory.app.dbadapter.db.PostgresDB;

public class DatabaseSimpleFactory implements DBFactory{
    public DB getDatabase(String databaseProvider){
        DB database = null;

        if("postgres".equals(databaseProvider)){
            database = new PostgresDB();
            return database;
        }else if("oracle".equals(databaseProvider)){
            database = new OracleDB();
            return database;
        }

        return database;
    }
}
