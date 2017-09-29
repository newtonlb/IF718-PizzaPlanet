package roboboy
import roboboy.*;
import roboboy.pedido.*;
import roboboy.usuario.*;

class BootStrap {

    def init = { servletContext ->
      def u1, u2;

      println("");
      println("Cadastrando Usuarios");

      (u1 = new Usuario(
        nome: "Igu, ViajaMais Q'Trabalha",
        login: "ivqt",
        telefone: "99899.9899",
        senha: 'im',
        tipo: UsuarioConfig.CLIENTE_CODE
      )).save();

      (u2 = new Usuario(
        nome: "Niltu, Saido Crossfit",
        login: "niltu",
        telefone: "8897.7887",
        senha: 'ni',
        tipo: UsuarioConfig.PIZZARIA_CODE
      )).save();

      println(u1);
      println(u2);

      println("");

      println("Cadastrando Pedidos");

      def pizza;
      def pedido;

      pizza = new Pizza("Três Queijos")
      pizza = new ComBorda(pizza, "Catupiry")
      pedido = new Pedido(pizza: pizza, cliente:u1);
      pedido.save();

      println(pedido.pizza.getDescricaoCompleta());


      pizza = new Pizza("Nutella")
      pizza = new DoisSabores(pizza, "Banana");
      pizza = new ComBorda(pizza, "Chocolate");
      pedido = new Pedido(pizza: pizza, cliente:u2);
      pedido.save();

      println(pedido.pizza.getDescricaoCompleta());

      println("");

    }
    def destroy = {
    }
}
