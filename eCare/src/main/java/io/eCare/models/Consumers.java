/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Aluno
 */
public class Consumers {

    @Id
    public ObjectId _id;
    public String email;
    public String password;

    public Consumers() {
    }

    public Consumers(ObjectId _id, String email, String password) {
        this._id = _id;
        this.email = email;
        this.password = password;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
}
