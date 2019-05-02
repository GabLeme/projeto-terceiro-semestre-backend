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

    @Query("{'email' : ?0, password : ?1}")
    Consumers findByEmailAndPassword(String email, String password);

    @Query("{'email' : ?0}")
    Consumers ValidationExists(String email);

}
