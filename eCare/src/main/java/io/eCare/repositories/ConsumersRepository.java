package io.eCare.repositories;

import io.eCare.models.Consumers;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Gabriel Leme
 */
public interface ConsumersRepository extends MongoRepository<Consumers, String> {
  Consumers findBy_id(ObjectId _id);
}
