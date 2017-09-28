package roboboy.pedido

class ComBorda extends Pizza{
    private Pizza pizza;
    private String borda;


    ComBorda(Pizza pizza, String borda){
      this.pizza = pizza
      this.borda = borda
    }
    def getDescricao(){
      this.pizza.getDescricao() + " & borda de ${this.borda}";
    }
    def getPrice(){
      return this.pizza.getPrice() + 7.5;
    }
}
