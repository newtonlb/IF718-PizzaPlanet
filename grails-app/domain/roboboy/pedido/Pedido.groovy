package roboboy.pedido;

import grails.rest.*;
import roboboy.Usuario;

class Pedido {
  Pizza pizza;
  static belongsTo = [ usuario: Usuario ]

  static constraints = {
    sabor2 nullable: true
  }
}
