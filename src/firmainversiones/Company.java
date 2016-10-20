/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firmainversiones;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Company {
    private HashMap<String, Client> clients;
    
    public Company(){
       this.clients = new HashMap<>();
    }
    
    public boolean addClient(Client client){
       return true;
    }
    
    public double calAmountAllMarket(){
      return 0;
    }
    
    public double calAllProfit(){
      return 0;
    }
    
    public ArrayList calMarketAndProfitByAsset(){
      return null;
    }
    public ArrayList calMarketAndProfitByAge(){
      return null;
    }
    
    public Client calClientMaxProfit(){
       return null;
    }
    
    public ArrayList listClient(){
      return null;
    }
}
