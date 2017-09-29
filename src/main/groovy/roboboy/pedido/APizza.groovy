package roboboy.pedido;
import java.text.DecimalFormat

abstract class APizza{

    abstract double getPreco();
    abstract Map getExtras();
    abstract String getSabor();

    def getDescricao(){
      return  getSabor() + "\n" + getExtras().toMapString();
    }

    def getDescricaoCompleta(){
      return getDescricao() + "\n" + getFormatedPreco();
    }

    def getFormatedPreco(){
      def moneyform = new DecimalFormat("\$##,###.##");
      def price = moneyform.format(preco);
      return price;
    }

    Pizza getPizza(){
      return new Pizza(
        sabor: getSabor(),
        extra: getExtras(),
        preco: getPreco()
        );
    }


}
