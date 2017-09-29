package roboboy.pedido;

class PizzaBase extends APizza{
    private String sabor;
    private double preco = 30;


    PizzaBase(String sabor){
      this.sabor = sabor;
    }

    String getSabor(){
      return sabor;
    }
    double getPreco(){
      return preco;
    }
    Map getExtras(){
      return [
        "borda": "Simples"
      ];
    }

}
