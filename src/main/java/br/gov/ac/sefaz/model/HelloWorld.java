package br.gov.ac.sefaz.model;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService // marca a classse com webservice
@SOAPBinding // protocolo
public interface HelloWorld {
    @WebMethod
    String sayHelloWorld(String content);
}
