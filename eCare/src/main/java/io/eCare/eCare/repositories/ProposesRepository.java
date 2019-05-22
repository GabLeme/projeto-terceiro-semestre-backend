/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.eCare.repositories;

import io.eCare.eCare.models.Proposes;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author gabriel.leme
 */
public interface ProposesRepository extends MongoRepository<Proposes, String> {

    @Query("{'senderEmail' : ?0}")
    List<Proposes> findBySender(String senderEmail);

    @Query("{'receiverEmail' : ?0}")
    List<Proposes> findByReceiver(String receiverEmail);
    
    Proposes findBy_id(ObjectId _id);
}
