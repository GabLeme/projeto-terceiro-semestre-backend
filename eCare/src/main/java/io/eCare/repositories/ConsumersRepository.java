/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.repositories;

import io.eCare.models.Consumers;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Aluno
 */
public interface ConsumersRepository extends MongoRepository<Consumers, String> {
  Consumers findBy_id(ObjectId _id);
}
