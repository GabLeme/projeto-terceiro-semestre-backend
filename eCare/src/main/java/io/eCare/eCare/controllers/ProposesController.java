/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.eCare.eCare.controllers;

import io.eCare.eCare.models.Proposes;
import io.eCare.eCare.repositories.ProposesRepository;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gabriel.leme
 */
@RestController
@RequestMapping("/api/proposes")
public class ProposesController {

    @Autowired
    private ProposesRepository proposesRepository;

    @GetMapping("/sender")
    public List<Proposes> GetBySenderEmail(@RequestParam String senderEmail) {
        return proposesRepository.findBySender(senderEmail);
    }

    @GetMapping("/receiver")
    public List<Proposes> GetByReceiverEmail(@RequestParam String receiverEmail) {
        return proposesRepository.findByReceiver(receiverEmail);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Proposes getProposeById(@PathVariable ("id") ObjectId id) {
        return proposesRepository.findBy_id(id);
    }

    @PostMapping
    public ResponseEntity<Proposes> createPropose(@RequestBody Proposes propose) {
        proposesRepository.save(propose);
        return ResponseEntity.ok(propose);
    }

}
