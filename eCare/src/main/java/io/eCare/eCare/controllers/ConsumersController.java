package io.eCare.eCare.controllers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.eCare.eCare.models.Consumers;
import io.eCare.eCare.repositories.ConsumersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.bson.types.ObjectId;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Gabriel Leme
 */
@RestController
@RequestMapping("/api/consumers")
public class ConsumersController {

    @Autowired
    private ConsumersRepository consumersRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Consumers> getAllConsumers() {
        return consumersRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Consumers getConsumerById(@PathVariable("id") ObjectId id) {
        return consumersRepository.findBy_id(id);
    }

    @PostMapping("/login")
    public Consumers consumerLogin(@RequestParam String email, String password) {
        return consumersRepository.findByEmailAndPassword(email, password);
    }

    @PostMapping("/")
    public Consumers createConsumer(@RequestBody Consumers consumer) {
        return consumersRepository.save(consumer);
    }

    @GetMapping(value = "/exists", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> exists(@RequestParam String email) {
        Consumers userWithThisEmail = consumersRepository.findByEmail(email);
        if (userWithThisEmail != null) {
            return ResponseEntity.ok().body("true");
        } else {
            return ResponseEntity.ok().body("false");
        }
    }

}
