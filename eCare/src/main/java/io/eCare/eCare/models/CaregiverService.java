/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.eCare.models;

import javax.annotation.Generated;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Aluno
 */
@Document(collection = "caregiverService")
public class CaregiverService {

    @Id
    public ObjectId _id;
    public String description, subtitle, title;
    public int value;

    public CaregiverService(ObjectId _id, String Title, String description, String subtitle, String title, int value) {
        this._id = _id;
        this.title = Title;
        this.subtitle = subtitle;
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
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CaregiverService() {
    }
}
