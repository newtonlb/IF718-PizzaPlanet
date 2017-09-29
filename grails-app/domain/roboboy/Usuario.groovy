package roboboy
import roboboy.pedido.*;
import roboboy.usuario.*;

class Usuario {
  String login;
  String nome;
  String telefone;
  String senha;
  int tipo;
  static hasMany = [pedidos:Pedido]
    static constraints = {
      tipo inList: [UsuarioConfig.PIZZARIA_CODE /*estabelecimento*/, UsuarioConfig.CLIENTE_CODE /*cliente*/]
    }
}
