package io.eCare.eCare.repositories;

import io.eCare.eCare.models.Providers;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gabriel Leme
 */
@Repository
public interface ProvidersRepository extends MongoRepository<Providers, String> {
  Providers findBy_id(ObjectId _id);
}

