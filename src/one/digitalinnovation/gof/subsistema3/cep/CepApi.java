package one.digitalinnovation.gof.subsistema3.cep;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Belo Horizonte";

    }

    public String recuperarEstado(String cep){
        return "MG";

    }


}
