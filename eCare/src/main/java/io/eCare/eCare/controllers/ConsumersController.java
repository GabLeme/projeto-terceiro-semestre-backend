package io.eCare.eCare.controllers;

import io.eCare.eCare.Usuario;
import io.eCare.eCare.models.Consumers;
import io.eCare.eCare.repositories.ConsumersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import org.bson.types.ObjectId;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 *
 * @author Gabriel Leme
 */
@RestController
@RequestMapping("/consumers")
public class ConsumersController {

    @Autowired
    private ConsumersRepository consumersRepository;

    @Autowired
    private MongoTemplate template;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Consumers> getAllConsumers() {
        return consumersRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Consumers getConsumerById(@PathVariable("id") ObjectId id) {
        return consumersRepository.findBy_id(id);
    }
    @Autowired
    private Usuario user;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("Consumers", new Consumers());
        return "Consumes/index";
    }

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String consumerLogin(ModelMap modelmap) {
        modelmap.put("Consumers", new Consumers());
        return "Consumes/login";
    }

    @RequestMapping(value="cadastro", method = RequestMethod.GET)
    public String Cadastrovai(ModelMap modelmap) {
        modelmap.put("Consumers", new Consumers());
        return "Consumes/cadastro";
    }
    @RequestMapping(value="cadastro", method = RequestMethod.POST)
    public String Cadastro(@ModelAttribute("consumers")Consumers Consumer) {
        user.cadastro(Consumer);
        return "redirect:../login.html";
    }
    //@PostMapping("/login")
    //public Consumers consumerLogin(@RequestBody String email, String password) {
    //    return consumersRepository.makeLogin(email, password);
    //}
    //@RequestMapping(value = "/login", method = RequestMethod.GET)
   // public Consumers consumerLogin(@RequestBody String Email, String Password) {
   //     Query query = new Query();
//
   //     Consumers consume = template.findOne(query.addCriteria(
   //             Criteria.where("email").is(Email)), Consumers.class);
//
   //     if (consume != null) {
   //         BCryptPasswordEncoder Encriptor = new BCryptPasswordEncoder();
//
   //         if (Encriptor.matches(Password, consume.getPassword())) {
   //             return consume;
   //         } else {
   //             return null;
   //         }
   //     } else {
   //         return null;
   //     }
//
   // }

   //@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
   //public void cadastro(@RequestBody Consumers User) {

   //    template.insert(User);

   //}
}