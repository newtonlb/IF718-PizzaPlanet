package roboboy
import grails.converters.JSON


class EntregaController {

    EntregaController(){
      super(Entrega);
    }
    def pizzaria(){
      render (view: "pizzaria")
    }
    def cliente(){

      def pedido = Pedido.findByID(params.id)

      render (view: "cliente")

    }
    def index(){
      super.index(10);
    }
}
