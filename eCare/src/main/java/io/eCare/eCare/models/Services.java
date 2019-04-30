/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.eCare.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Aluno
 */
@Document(collection = "services")
public class Services {

    @Id
    public ObjectId _id;
    public String description, category, title;
    public int value;
    

    public Services(ObjectId _id, String Title, String description, String category, String title, int value) {
        this._id = _id;
        this.title = Title;
        this.category = category;
        this.description = description;
        this.value = value;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubtitle() {
        return category;
    }

    public void setSubtitle(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Services() {
    }
}
