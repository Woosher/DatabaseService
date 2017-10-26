package controllers;

import databaseConnections.DBConnection;
import databaseConnections.ProductDB;
import models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class Controller {

    DBConnection productConnection = new DBConnection("Subitor");
    ProductDB productDB = new ProductDB(productConnection.getDb());

    @RequestMapping(value = "/product", method = GET)
    public Product getProduct(@RequestParam(value="id", defaultValue="lol") String id) {
        Product prod = productDB.get(id);
        return prod;
    }

    @RequestMapping(value = "/allProducts", method = GET)
    public List<Product> getAllProducts() {
        List<Product> prod = productDB.getAll();
        return prod;
    }

    @RequestMapping(value = "/product", method = POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> addProduct(@RequestBody Product prod) {
        productDB.add(prod);
        return new ResponseEntity<Product>(prod, HttpStatus.OK);
    }

}
