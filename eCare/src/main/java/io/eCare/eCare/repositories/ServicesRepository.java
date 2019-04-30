/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.eCare.repositories;

import io.eCare.eCare.models.Services;

import io.eCare.eCare.controllers.ServicesController;
import io.eCare.eCare.models.Services;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Eu
 */
@Repository
public interface ServicesRepository extends MongoRepository<Services, String> {

    Services findBy_id(ObjectId _id);

    @Query("{ 'category' : ?0 }")
    List<Services> getByCategory(String category);

}
