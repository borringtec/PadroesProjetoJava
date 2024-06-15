package facade;

import service.*;

public class Facade {
    public void migrate(String nome, String cep) {
        String city = CEP.getInstance().getCity(cep);
        String state = CEP.getInstance().getState(cep);
        CRM.record(nome, cep, city, state);
    }
}
