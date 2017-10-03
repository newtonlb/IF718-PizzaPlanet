package roboboy.pedido;

import roboboy.Usuario;
import roboboy.pedido.Pizza

class Pedido {
  Pizza pizza;
  Usuario cliente;


  static embedded = ['pizza']
  Pedido(APizza pizza, Usuario cliente){
    this.pizza = pizza.getPizza();
    this.cliente = cliente;
  }
}
