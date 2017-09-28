package roboboy.pedido

class DoisSabores extends Pizza{
    private Pizza pizza;
    private String extra;


    DoisSabores(Pizza pizza, String extra){
      this.pizza = pizza
      this.extra = extra
    }
    def getPrice(){
      return this.pizza.getPrice() + 10;
    }
    def getSabor(){
      return this.pizza.getSabor() + " / ${this.extra}";
    }
}
