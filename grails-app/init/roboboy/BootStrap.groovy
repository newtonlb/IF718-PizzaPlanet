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
      def pedido;

      pizza = new Pizza("Três Queijos")
      pizza = new ComBorda(pizza, "Catupiry")
      pedido = new Pedido(pizza: pizza, cliente:u1);
      pedido.save(flush:true);

      pizza = new Pizza("Nutella");
      pizza = new DoisSabores(pizza, "Banana");
      pizza = new ComBorda(pizza, "Chocolate");
      pedido = new Pedido(pizza: pizza, cliente: u2);
      pedido.save();

      println(pizza.getDescricaoCompleta());
    }
    def destroy = {
    }
}
