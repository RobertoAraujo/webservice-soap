package br.gov.ac.sefaz.model;

import javax.jws.WebService;

@WebService(endpointInterface = "br.gov.ac.sefaz.model.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String sayHelloWorld(String content) {
        return " Ola Seja bem vindo ao meu Webservice " + content + "!";
    }
}
