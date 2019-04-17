/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.eCare.controllers;

import io.eCare.eCare.models.CaregiverService;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
