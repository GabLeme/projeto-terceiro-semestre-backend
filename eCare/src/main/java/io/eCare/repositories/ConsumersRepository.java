package io.eCare.repositories;

import io.eCare.models.Consumers;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gabriel Leme
 */
@Repository
public interface ConsumersRepository extends MongoRepository<Consumers, String> {
  Consumers findBy_id(ObjectId _id);
}
