/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.eCare.controllers;

import io.eCare.eCare.models.Services;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.eCare.eCare.repositories.ServicesRepository;

@RestController
@RequestMapping("/api/services")
public class ServicesController {

    @Autowired
    private ServicesRepository servicesRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Services> GetAll() {
        return servicesRepository.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Services CreateService(@RequestBody Services Service) {
        servicesRepository.save(Service);
        return Service;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Services GetById(@PathVariable("id") ObjectId id) {
        return servicesRepository.findBy_id(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Services> getByCategory(@RequestParam String category) {
        return servicesRepository.getByCategory(category);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable("id") String id) {
        servicesRepository.deleteById(id);
    }

}
