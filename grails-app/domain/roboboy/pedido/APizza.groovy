package roboboy.pedido;
import java.text.DecimalFormat

abstract class APizza{

    abstract def getPreco();
    abstract def getExtras();
    abstract def getSabor();
    
    def getDescricao(){
      return this.getSabor() + "\n" + this.getExtras();
    }

    def getDescricaoCompleta(){
      def moneyform = new DecimalFormat("\$##,###.##");
      def price = moneyform.format(this.getPreco());

      return this.getDescricao() + "\n" + price;
    }
}
