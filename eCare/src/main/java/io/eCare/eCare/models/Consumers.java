package io.eCare.eCare.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

/**
 *
 * @author Gabriel Leme
 */
@Component
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
