package roboboy.pedido;

class Pizza extends APizza{
    private String sabor;
    private double price = 30;

    Pizza(String sabor){
      this.sabor = sabor;
    }

    def getSabor(){
      return this.sabor;
    }
    def getPreco(){
      return this.price;
    }
    def getExtras(){
      return '';
    }
}
