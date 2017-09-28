package roboboy
import grails.rest.*;
import roboboy.pedido.*;
class Entrega {
    String endereco;
    static belongsTo = [ pedido: Pedido ]
    static constraints = {
    }
}
