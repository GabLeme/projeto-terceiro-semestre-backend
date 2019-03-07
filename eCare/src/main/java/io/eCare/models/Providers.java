package io.eCare.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Gabriel Leme
 */
public class Providers {

    @Id
    public ObjectId _id;
    public String email;
    public String password;

    public Providers() {
    }

    public Providers(ObjectId _id, String email, String password) {
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
