package roboboy.pedido;

class Pizza{
  String sabor;
  Map extra;
  double preco;
}
class PizzaReader extends APizza{
      String sabor;
      Map extra;
      double preco;

      PizzaReader(Pizza pizza){
        sabor = pizza.sabor;
        extra = pizza.extra;
        preco = pizza.preco;
      }
      Map getExtras(){
        return extra;
      }
      double getPreco(){
        return preco;
      }
      String getSabor(){
        return sabor
      }
}
