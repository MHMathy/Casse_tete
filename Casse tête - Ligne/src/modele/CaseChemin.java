/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author p1711015
 */
public class CaseChemin extends Case{
    
    EnumChemin sensChemin;
    
    public CaseChemin(int x,int y){
        super(x,y);
        
    }
    
    public void setSens(EnumChemin sens){
        this.sensChemin = sens;
    }
    
}
