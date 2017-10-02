package roboboy
import roboboy.pedido.*;

class PedidoController extends RestfulController{

    static final String PEDIDO_PIZZARIA_URL = '/pedido/pizzaria';
    static final String PEDIDO_CLIENTE_URL  = '/pedido/cliente';

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

      pedido = this.openingRecord(pedido)

      return pedido;
    }
    def list(){
      return Pedido.list().collect{
        return this.openingRecord(it)
      };
    }
    def newRecord(){

      def data = this.getRequestJson();
      def cliente = Usuario.findById(data.cliente)
      def pizza = this.montaPizza(data);

      def record;
      //
      // pizza = new PizzaBase("Três Queijos");
      // pizza = new ComBorda(pizza, "Chocolate");
      // pizza = new DoisSabores(pizza, "Banana");
      // record = new Pedido(pizza, Usuario.findById(1));

      // def pedido = record;
      def pedido = new Pedido(
        pizza,
        cliente
      );
      return pedido;
    }
    def openingRecord(pedido){
      pedido = new PedidoReader(pedido);
      return pedido
    }
    def montaPizza(data){
      println(data);

      def pizza = new PizzaBase(data.sabor1.trim());

      if(data.sabor2.trim())
        pizza = new DoisSabores(pizza, data.sabor2);

      if(data.borda.trim())
        pizza = new ComBorda(pizza, data.borda)

        println("construindo pizza")
        println(pizza.getDescricaoCompleta());

        return pizza;
    }
    def getName(){
      return "Pedido";
    }
}
