package roboboy
import grails.converters.JSON

abstract class BaseController{

  def renderError(error){
    this.renderHash([error: true, message: error]);
  }
  def renderHash(hash){
    render (hash as JSON);
  }
  def printHash(hash){
    println(hash as JSON)
  }
  def getName(){
    return "";
  }
}
