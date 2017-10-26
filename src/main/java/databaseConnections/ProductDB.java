package databaseConnections;

import models.Product;
import org.ektorp.CouchDbConnector;
import org.ektorp.support.CouchDbRepositorySupport;

public class ProductDB extends CouchDbRepositorySupport<Product> {
    public ProductDB(CouchDbConnector db){
        super(Product.class, db);
    }
}
