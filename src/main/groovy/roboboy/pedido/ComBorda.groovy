package roboboy.pedido

class ComBorda extends APizza{
    private APizza pizza;
    private String borda;
    private double preco = 7.5;


    ComBorda(APizza pizza, String borda){
      this.pizza = pizza
      this.borda = borda
    }

    Map getExtras(){
      def extra = this.pizza.getExtras();
      extra['borda'] = borda;

      return  extra;
    }
    double getPreco(){
      return this.pizza.getPreco() + preco;
    }
    String getSabor(){
      return this.pizza.getSabor();
    }
}
