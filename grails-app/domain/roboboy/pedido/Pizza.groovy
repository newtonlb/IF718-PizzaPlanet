package roboboy.pedido;
import java.text.DecimalFormat
class Pizza {
    private String sabor;
    private double price = 30;

    Pizza(String sabor){
      this.sabor = sabor;
    }

    def getSabor(){
      return this.sabor;
    }
    def getDescricao(){
      return this.getSabor();
    }
    def getPreco(){
      return this.price;
    }

    def getDescricaoCompleta(){
      def moneyform = new DecimalFormat("\$##,###.##");
      def price = moneyform.format(this.getPreco());

      return this.getDescricao() + "\n R\$${price}";
    }
    static constraints = {
    }
}
