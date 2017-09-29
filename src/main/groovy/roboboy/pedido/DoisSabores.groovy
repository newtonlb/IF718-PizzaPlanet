package roboboy.pedido

class DoisSabores extends APizza{
    private APizza pizza;
    private String extra;


    DoisSabores(APizza pizza, String extra){
      this.pizza = pizza
      this.extra = extra
    }

    def getSabor(){
      return this.pizza.getSabor() + " / ${this.extra}";
    }
    def getPreco(){
      return this.pizza.getPreco() + 10;
    }
    def getExtras(){
      return this.pizza.getExtras();
    }

}
