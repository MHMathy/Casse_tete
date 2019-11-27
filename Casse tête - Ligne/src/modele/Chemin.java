/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author p1711015
 */
public class Chemin {
    ArrayList<Case> cheminCase = new ArrayList<>();
    EnumSymbole symboleChemin;

    public Chemin(CaseSymbole caseDepart){
        symboleChemin = caseDepart.symbole;
        cheminCase.add(caseDepart);
    }

    public void add(Case newcase){
      cheminCase.add(newcase);
      if(cheminCase.get(cheminCase.size()-2).getClass()!=CaseSymbole.class){
        ((CaseChemin)cheminCase.get(cheminCase.size()-2)).calcSens(cheminCase.get(cheminCase.size()-3).posx,cheminCase.get(cheminCase.size()-3).posy, cheminCase.get(cheminCase.size()-1).posx, cheminCase.get(cheminCase.size()-1).posy);
      }
    }

    public void clean(){
      for(Case c:cheminCase){
        if(c.getClass()==CaseChemin.class){
          ((CaseChemin)c).sensChemin = null;
        }
      }
    }
}
