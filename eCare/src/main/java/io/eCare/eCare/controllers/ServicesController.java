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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/services")
public class ServicesController {

    @Autowired
    private ServicesRepository servicesRepository;

    @GetMapping("/")
    public List<Services> GetAll() {
        return servicesRepository.findAll();
    }

    @PostMapping
    public Services CreateService(@RequestBody Services Service) {
        servicesRepository.save(Service);
        return Service;
    }

    @GetMapping("/{id}")
    public Services GetById(@PathVariable("id") ObjectId id) {
        return servicesRepository.findBy_id(id);
    }

    @GetMapping
    public List<Services> GetByCategory(@RequestParam String category) {
        return servicesRepository.getByCategory(category);
    }

    @GetMapping("/filter")
    public List<Services> FilterByValue(@RequestParam int value, String category) {
        return servicesRepository.filterByValue(value, category);
    }

    @GetMapping("/filter/list")
    public List<Services> FilterByProviderName(@RequestParam String providerName) {
        return servicesRepository.filterByProviderName(providerName);
    }

    @DeleteMapping("/{id}")
    public void DeleteById(@PathVariable("id") String id) {
        servicesRepository.deleteById(id);
    }
//
//    @PostMapping
//    public List<Services> updateTotalStars(@RequestParam Services services) {
//        servicesRepository.save(services);
//        return GetAll();
//    }

}
