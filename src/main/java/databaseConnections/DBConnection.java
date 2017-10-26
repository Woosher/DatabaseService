package databaseConnections;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

import java.net.MalformedURLException;

public class DBConnection {
    private HttpClient httpClient;
    private CouchDbInstance dbInstance;
    private CouchDbConnector db;

    public DBConnection(String dbName) {
        try {
            httpClient = new StdHttpClient.Builder()
                    .url("http://localhost:5984")
                    .build();

            dbInstance = new StdCouchDbInstance(httpClient);
            db = new StdCouchDbConnector(dbName, dbInstance);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

    public CouchDbConnector getDb() {
        return db;
    }
}
