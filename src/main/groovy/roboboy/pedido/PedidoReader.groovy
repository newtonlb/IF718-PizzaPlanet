package roboboy.pedido;
import java.text.DecimalFormat

class PedidoReader{
  private Pedido pedido;

  PedidoReader(Pedido pedido){
    this.pedido = pedido;
  }

    def getPizzaObject(){
      return pedido.pizza
    }
    def getDescricao(){

      return  pedido.pizza.sabor + "\n" + pedido.pizza.extras;
    }

    def getDescricaoCompleta(){
      return getDescricao() + "\n" + getFormatedPreco();
    }

    def getFormatedPreco(){
      def moneyform = new DecimalFormat("\$##,###.##");
      def price = moneyform.format(pedido.pizza.preco);
      return price;
    }

    def getId(){
      return pedido.id
    }
    def getCliente(){
      return pedido.cliente
    }
}
