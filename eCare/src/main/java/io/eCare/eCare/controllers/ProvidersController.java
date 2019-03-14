package io.eCare.eCare.controllers;

import io.eCare.eCare.models.Providers;
import io.eCare.eCare.repositories.ProvidersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.bson.types.ObjectId;
import java.util.List;

/**
 *
 * @author Gabriel Leme
 */
@RestController
@RequestMapping("/providers")
public class ProvidersController {

    @Autowired
    private ProvidersRepository providersRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Providers> getAllProviders() {
        return providersRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Providers getProviderById(@PathVariable("id") ObjectId id) {
        return providersRepository.findBy_id(id);
    }
}
