package roboboy.pedido

class DoisSabores extends APizza{
    private APizza pizza;
    private String sabor;
    private double preco = 10;


    DoisSabores(APizza pizza, String sabor){
      this.pizza = pizza
      this.sabor = sabor
    }

    String getSabor(){
      return this.pizza.getSabor() + " / ${this.sabor}";
    }
    double getPreco(){
      return this.pizza.getPreco() + preco;
    }
    Map getExtras(){
      return this.pizza.getExtras();
    }

}
