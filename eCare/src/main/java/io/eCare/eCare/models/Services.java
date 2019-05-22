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
    public String description, category, providerName, providerEmail, providerCellphone, announcementDate;
    public int value;
    public int totalStars;

    public Services(String description, String category, String providerName, String providerEmail, String providerCellphone, String announcementDate, int value) {
        this.description = description;
        this.category = category;
        this.providerName = providerName;
        this.providerEmail = providerEmail;
        this.providerCellphone = providerCellphone;
        this.announcementDate = announcementDate;
        this.value = value;
        this.totalStars = 0;
    }
    
    public int getTotalStars(){
        return this.totalStars;
    }
    
    public void setTotalStars(int totalStars){
        this.totalStars = totalStars;
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

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderEmail() {
        return providerEmail;
    }

    public void setProviderEmail(String providerEmail) {
        this.providerEmail = providerEmail;
    }

    public String getProviderCellphone() {
        return providerCellphone;
    }

    public void setProviderCellphone(String providerCellphone) {
        this.providerCellphone = providerCellphone;
    }

    public String getAnnouncementDate() {
        return announcementDate;
    }

    public void setAnnouncementDate(String announcementDate) {
        this.announcementDate = announcementDate;
    }

    public Services() {
    }
}
