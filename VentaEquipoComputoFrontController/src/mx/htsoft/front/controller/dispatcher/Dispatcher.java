/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.htsoft.front.controller.dispatcher;

import mx.htsoft.front.controller.view.sView;
import ejecutor.LoginView;

/**
 *
 * @author Erik Guerrero Bravo Version 1.0.0
 */
public class Dispatcher {
    
   private sView compraView;
   private LoginView loginView;
   
   public Dispatcher(){
      compraView = new sView();
      loginView = new LoginView();
   }

   public void dispatch(String request){
      if(request.equalsIgnoreCase("Jaciel")){
         compraView.show();
      }
      else{
         loginView.show();
      }	
   }
}
