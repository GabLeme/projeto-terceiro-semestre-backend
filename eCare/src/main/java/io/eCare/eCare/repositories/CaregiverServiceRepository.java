/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.eCare.repositories;

import io.eCare.eCare.models.CaregiverService;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Eu
 */
@Repository
public interface CaregiverServiceRepository extends MongoRepository<CaregiverService, String> {

    CaregiverService findBy_id(ObjectId _id);

}
