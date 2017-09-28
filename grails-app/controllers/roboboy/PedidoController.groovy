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
      switch(attr){
        case 'id':
          return Pedido.findById(id);
        case 'usuario':
          return Pedido.findByUsuario(id);
      }
    }
    def list(){
      return Usuario.list();
    }
    def newRecord(){

      def data = this.getRequestJson();
      // def usuario = Usuario.findById(data.cliente)

      return new Pedido(
        sabor1: data.sabor1,
        sabor2: data.sabor2,
        borda: data.borda,
        usuario: data.cliente
        );
    }
}
