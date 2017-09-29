package roboboy
import grails.rest.*;
import roboboy.pedido.Pedido;

class Usuario {
  String login;
  String nome;
  String telefone;
  String senha;
  int tipo;

    static constraints = {
      tipo inList: [0 /*estabelecimento*/, 1 /*cliente*/]
    }
}
