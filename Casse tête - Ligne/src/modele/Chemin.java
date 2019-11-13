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
    ArrayList<Case> cheminCase = new ArrayList<Case>();
    EnumSymbole symboleChemin;
    
    public Chemin(CaseSymbole caseDepart){
        this.symboleChemin = caseDepart.symbole;
        cheminCase.add(caseDepart);
    }
    
}
