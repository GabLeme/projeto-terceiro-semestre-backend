package io.eCare.eCare;
import io.eCare.eCare.models.Consumers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Repository("Usuario")
public class ConsumerRepository  implements io.eCare.eCare.Usuario{
    @Autowired
    private MongoTemplate template;

    @Override
    public Consumers consumerLogin( String Email, String Password) {
        Query query = new Query();

        Consumers consume = template.findOne(query.addCriteria(
                Criteria.where("email").is(Email)), Consumers.class);

        if (consume != null) {
            BCryptPasswordEncoder Encriptor = new BCryptPasswordEncoder();

            if (Encriptor.matches(Password, consume.getPassword())) {
                return consume;
            } else {
                return null;
            }
        } else {
            return null;
        }

    }
    @Override
    public void cadastro(Consumers User) {

        template.insert(User);

    }


}
