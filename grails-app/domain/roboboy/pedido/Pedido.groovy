package roboboy.pedido;

import roboboy.Usuario;

class Pedido {
  APizza pizza;

  static embedded = ['pizza']
  static belongsTo = [ cliente: Usuario ]
}
