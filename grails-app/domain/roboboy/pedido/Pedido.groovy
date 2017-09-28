package roboboy.pedido;

import grails.rest.*;
import roboboy.Usuario;

class Pedido {
  Pizza pizza;
  static embedded = ['pizza']
  static belongsTo = [ usuario: Usuario ]
}
