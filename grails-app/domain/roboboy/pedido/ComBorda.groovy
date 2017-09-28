package roboboy.pedido

class ComBorda extends APizza{
    private APizza pizza;
    private String borda;
    static embedded = ['pizza']


    ComBorda(APizza pizza, String borda){
      this.pizza = pizza
      this.borda = borda
    }

    def getExtras(){
      return this.pizza.getExtras() + " & borda de ${this.borda}";
    }
    def getPreco(){
      return this.pizza.getPreco() + 7.5;
    }
    def getSabor(){
      return this.pizza.getSabor();
    }
}
