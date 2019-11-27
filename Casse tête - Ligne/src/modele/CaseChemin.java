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

    public void calcSens(int xpre,int ypre, int xsui, int ysui){
      int x = xsui-xpre;
      int y = ysui-ypre;
      if(Math.abs(x)==2 && y==0){
        this.sensChemin = EnumChemin.horizontal;
      }

      else if(x==0 && Math.abs(y)==2){
        this.sensChemin = EnumChemin.vertical;
      }

      else if(Math.abs(x)==1 && Math.abs(y)==1){
        if (this.posx>xpre){this.sensChemin = EnumChemin.basGauche;}
        else{this.sensChemin = EnumChemin.hautDroite;}
      }

      else{
        if(this.posx<xpre){this.sensChemin = EnumChemin.basDroite;}
        else{this.sensChemin = EnumChemin.hautGauche;}
      }
    }

}
