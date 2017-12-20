/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faicebroiskious;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import resources.Grafo.Handler;

/**
 *
 * @author lucascesarnf
 */
public class ClientTransport {
    private static ClientTransport instancia;
    private static int porta;
    private Handler.Client client;
    private TTransport transport; //= new TSocket("localhost", port);
    private TProtocol protocol;
    
    public static int getPorta(){
        return instancia.porta;
    }
    
    public static Handler.Client getCLient() throws TTransportException{
        if(instancia.transport == null){
           instancia.porta = 7070;
           instancia.transport = new TSocket("localhost", instancia.porta);
           instancia.transport.open();
        }
        if(instancia.protocol == null){
            instancia.protocol = new TBinaryProtocol(instancia.transport);
        }
        if(instancia.client == null){
           instancia.client = new Handler.Client(instancia.protocol);
        }
        return instancia.client;
    }
    public static void setPorta(int porta) {
        instancia.porta = porta;
    }
    
    private ClientTransport(){
    }
    
    public static synchronized ClientTransport getInstance(){
        if(instancia == null){
            instancia = new ClientTransport();
        }
        return instancia;
    }
    public String getOrientSex(int i) {
        switch (i) {
            case 0:
                return "Hétero";
            case 1:
                return "Homo";
            case 2:
                return "Bi";
            default:
                return "Undefined";
        }
    }

    public String getIdentGen(int i) {
        switch (i) {
            case 0:
                return "Homem";
            case 1:
                return "Mulher";
            default:
                return "Outxs";
        }
    }
}
