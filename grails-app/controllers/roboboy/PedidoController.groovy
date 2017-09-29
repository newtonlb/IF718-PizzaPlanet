package roboboy
import roboboy.pedido.*;

class PedidoController extends RestfulController{

    def pizzaria(){
      render (view: "pizzaria")
    }
    def cliente(){
      render (view: "cliente")
    }

    def findBy(String attr, String id){
      def pedido;
      switch(attr){
        case 'id':
          pedido = Pedido.findById(id);;
        case 'usuario':
          def usuario = Usuario.findById(id);
          pedido = Pedido.findByCliente(usuario);
      }

      return pedido;
    }
    def list(){
      return Pedido.list();
    }
    def newRecord(){

      def data = this.getRequestJson();
      def cliente = Usuario.findById(data.cliente)
      def pizza = this.montaPizza(data);

      return new Pedido(
        pizza: pizza,
        usuario: cliente
        );
    }

    def montaPizza(data){
      def pizza = new Pizza(data.sabor1);

      if(data.sabor2)
        pizza = new DoisSabores(pizza, data.sabor2);

      if(data.borda)
        pizza = new ComBorda(pizza, data.borda)

        return pizza;
    }
}
