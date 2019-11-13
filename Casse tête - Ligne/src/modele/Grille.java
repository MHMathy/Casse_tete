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
public class Grille {
    
    int tx;
    int ty;
    int nbSymbole;
    
    Case[][] caseGrille;
    ArrayList<Chemin> cheminFini = new ArrayList<Chemin>();
    Chemin cheminActu;
    
    public Grille(int x,int y, int nbS){
        this.tx = x;
        this.ty = y;
        this.nbSymbole = nbS;
        this.caseGrille = new Case[x][y];
        
        for(int i=0;i<nbS;i+=1){
            
        }
        
    }
    
    public void initCases(){
        for(int i=0;i<this.nbSymbole;i+=1){
            int x = rand 
            while()
        }
    }
}
