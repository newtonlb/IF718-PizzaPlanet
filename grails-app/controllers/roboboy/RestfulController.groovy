package roboboy
import roboboy.pedido.*;
import grails.converters.JSON

abstract class RestfulController extends BaseController{

    def show(){

      def specific = this.requestingSpecific();
      def target;
      if(specific){
        target = this.findBy(specific.attr, specific.id);
      }else{
        target = this.list();
      }

      this.renderHash(target);
    }



    def save() {

      def record = this.newRecord();

      if(record.save()){
        println("Salvando " + this.getControllerName())
      }else{
        record = [erro: "Erro ao Salvar"];
      }

      this.renderHash(record);

     }

    def requestingSpecific(){

      String attr;
      String id;
      if(params.attr){
        if(params.id)
        {
          attr = params.attr;
          id   = params.id;
        }else{
          attr = "id";
          id   = params.attr;
        }
      }else return false;

      return [
        attr: attr,
        id: id
      ]
    }
    def getRequestJson(){

      return request.JSON;
    }
    abstract findBy(String attr, String id);
    abstract list();
    abstract newRecord();
}
