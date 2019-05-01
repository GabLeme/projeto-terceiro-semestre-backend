/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.eCare.controllers;

import io.eCare.eCare.models.CaregiverService;

import java.util.List;

import io.eCare.eCare.models.Consumers;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;
import io.eCare.eCare.repositories.CaregiverServiceRepository;

@RestController
@RequestMapping("/caregiverServices")
public class CaregiverServiceController {

    @Autowired
    private CaregiverServiceRepository CarerGiveServiceRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<CaregiverService> GetAllCarer() {
        return CarerGiveServiceRepository.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public CaregiverService createCareGiveService(@RequestBody CaregiverService Service) {
        CarerGiveServiceRepository.save(Service);
        return Service;

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CaregiverService getConsumerById(@PathVariable("id") ObjectId id) {
        return CarerGiveServiceRepository.findBy_id(id);
    }



}

