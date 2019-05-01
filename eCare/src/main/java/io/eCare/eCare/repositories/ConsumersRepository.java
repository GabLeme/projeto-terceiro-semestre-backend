package io.eCare.eCare.repositories;

import io.eCare.eCare.models.Consumers;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Gabriel 
 */
@Repository
public interface ConsumersRepository extends MongoRepository<Consumers, String> {

    Consumers findBy_id(ObjectId _id);

    @Query("{$and: ["
            + "{'email': ?0}, "
            + "{'password': ?0} "
            + "]}")
    Consumers makeLogin(String email, String password);

    @Override
    <S extends Consumers> S insert(S s);
}
