/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.eCare.models;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author gabriel.leme
 */
@Document(collection = "proposes")
public class Proposes {
    public ObjectId _id;
    public String senderEmail;
    public String receiverEmail;
    public String serviceDate;
    public float value;

    public Proposes(String senderEmail, String receiverEmail, String serviceDate, float value) {
        this.senderEmail = senderEmail;
        this.receiverEmail = receiverEmail;
        this.serviceDate = serviceDate;
        this.value = value;
    }
    
    public Proposes(){}

    public String getId() {
        return _id.toHexString();
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
    
    
    
}
