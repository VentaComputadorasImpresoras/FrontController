/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.htsoft.front.controller.front;

import mx.htsoft.front.controller.dispatcher.Dispatcher;

/**
 *
 * @author Erik Guerrero Bravo Version 1.0.0
 */
public class FrontController {
    private Dispatcher dispatcher;
    
    public FrontController(){
      dispatcher = new Dispatcher();
   }

   private boolean isAuthenticUser(){
      System.out.println("El Usuario se Autentico Satisfactoriamente.");
      return true;
   }

   private void trackRequest(String request){
      System.out.println("Petición de la Pagina: " + request);
   }
    public void dispatchRequest(String request){
      
      trackRequest(request);
   
      if(isAuthenticUser()){
         dispatcher.dispatch(request);
      }	
   }
   
}
