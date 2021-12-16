package br.gov.ac.sefaz;

import br.gov.ac.sefaz.model.HelloWorldImpl;

import javax.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8090/ws/helloworld", new HelloWorldImpl());
        System.out.println("Service esta rodando ....");
    }
}
