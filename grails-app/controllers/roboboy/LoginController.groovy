package roboboy

import roboboy.usuario.*

class LoginController extends RestfulController {


  def save() {

    def data = this.getRequestJson();

    def login = Usuario.findByLogin(data.login);

    if(login){
      if(login.senha == data.senha){
        session['user'] = [:]
        session['user']['id'] = login.id;
        session['user']['tipo'] = login.tipo;
        session['user']['nome'] = login.tipo;

        def redirect;
        if (login.tipo == UsuarioConfig.PIZZARIA_CODE)
          redirect = PedidoController.PEDIDO_PIZZARIA_URL;

        else if (login.tipo == UsuarioConfig.CLIENTE_CODE)
          redirect = PedidoController.PEDIDO_CLIENTE_URL;



        this.renderHash ([error: false, tipo: login.tipo, login: true, redirect: redirect, nome: login.nome])
      }else{
        this.renderError("Senha incorreta")
      }
    }else{
      this.renderError("Login inexistente")
    }
   }
    def index() {
      render (view:"index")
    }


    def findBy(String attr, String id){
      switch(attr){
        case 'id':
          return Usuario.findById(id);
        case 'login':
          return Usuario.findByLogin(id);
      }
    }
    def list(){
      return Usuario.list();
    }
    def newRecord(){

      def data = this.getRequestJson();

      return new Usuario(
        nome: data.nome,
        login: data.login,
        telefone: data.login,
        senha: data.senha,
        tipo: data.tipo
        );
    }
}
