package autocarro
import roboboy.BaseController;

class AutocarroController extends BaseController{

    def disponivel(){

      def carro = new Carro()

      this.renderHash(carro)
    }
    def enviar(){
      def id = params.id
      
      this.renderHash([
        enviado: true,
        id: "42hjkh"
        ])
    }
}
