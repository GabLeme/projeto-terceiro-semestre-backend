package io.eCare.repositories;

import io.eCare.models.Providers;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Gabriel Leme
 */
public interface ProvidersRepository extends MongoRepository<Providers, String> {
  Providers findBy_id(ObjectId _id);
}

