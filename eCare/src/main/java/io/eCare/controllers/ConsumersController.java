package io.eCare.controllers;

import io.eCare.models.Consumers;
import io.eCare.repositories.ConsumersRepository;
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
@RequestMapping("/consumers")
public class ConsumersController {

    @Autowired
    private ConsumersRepository consumersRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Consumers> getAllConsumers() {
        return consumersRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Consumers getConsumerById(@PathVariable("id") ObjectId id) {
        return consumersRepository.findBy_id(id);
    }
}
