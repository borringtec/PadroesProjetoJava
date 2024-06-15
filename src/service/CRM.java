package service;

public class CRM {
    private CRM() {
        super();
    }

    public static void record(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM:");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
