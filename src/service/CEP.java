package service;

public class CEP {
    private static CEP instance = new CEP();

    private CEP() {
        super();
    }

    public static CEP getInstance() {
        return instance;
    }

    public String getCity(String cep) {
        return "Cristinápolis";
    }

    public String getState(String cep) {
        return "SE";
    }
}
