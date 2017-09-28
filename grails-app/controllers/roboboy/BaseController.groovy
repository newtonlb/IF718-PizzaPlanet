package roboboy
import grails.converters.JSON

abstract class BaseController{

  def renderError(error){
    this.renderHash([error: true, message: error]);
  }
  def renderHash(hash){
    render (hash as JSON);
  }
}
