package roboboy
import roboboy.*;
import roboboy.pedido.*;

class BootStrap {

    def init = { servletContext ->
      def u1, u2;
      (u1 = new Usuario(
        nome: "Igor, ViajaMais Q'Trabalha",
        login: "ivqt",
        telefone: "99899.9899",
        senha: 'im',
        tipo: 1
      )).save(flush:true);
      (u2 = new Usuario(
        nome: "Niltu, saido crossfit",
        login: "niltu",
        telefone: "99899.9899",
        senha: 'ni',
        tipo: 0
      )).save(flush:true);

      def pizza;

      pizza = new Pizza("Três Queijos").save(flush:true);
      pizza = new ComBorda(pizza, "Catupiry");
      (new Pedido(
        pizza: pizza,
        usuario: u1
      )).save(flush:true);

      pizza = new Pizza("Nutella");
      println(pizza.getDescricao())

      pizza = new DoisSabores(pizza, "Banana");
      println(pizza.getDescricao())

      pizza = new ComBorda(pizza, "Chocolate");
      println(pizza.getDescricao())

      def pedido;
      (pedido = new Pedido(
        pizza: pizza,
        usuario: u2
      )).save(flush:true);

      println(pedido.pizza);
    }
    def destroy = {
    }
}
