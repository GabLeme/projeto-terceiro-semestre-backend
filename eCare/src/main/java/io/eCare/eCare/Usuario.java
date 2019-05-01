package io.eCare.eCare;

import io.eCare.eCare.models.Consumers;

public interface Usuario {
    public Consumers consumerLogin(String Email, String Password);
    public void cadastro(Consumers consume);

}
