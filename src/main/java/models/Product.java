package models;

import org.codehaus.jackson.annotate.*;
import org.ektorp.support.CouchDbDocument;

public class Product extends CouchDbDocument{


    private String _id;

    private String _rev;

    private String description, picture_url, brand, model, price;


    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
    }

    public String getRevision() {
        return _rev;
    }

    public void setRevision(String revision) {
        this._rev = revision;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}