package io.eCare.eCare;

import io.eCare.eCare.models.Consumers;
import io.eCare.eCare.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("Usuario")
@Transactional
public class TesteConsume implements Usuario{
    @Autowired
  private ConsumerRepository consume;
    @Override
    public void cadastro(Consumers User){
        consume.cadastro(User);
    }
    @Override
    public Consumers consumerLogin(String Email, String Password){
        return consume.consumerLogin(Email,Password);
    }

}
