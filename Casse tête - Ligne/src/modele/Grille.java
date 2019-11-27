/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import java.util.Arrays;



/**
 *
 * @author p1711015
 */
public class Grille {

    int tx;
    int ty;
    int nbSymbole;

    Case[][] caseGrille;
    ArrayList<Chemin> cheminFini = new ArrayList<>();
    Chemin cheminActu;

    public Grille(int x,int y, int nbS){
        tx = x;
        ty = y;
        nbSymbole = nbS;
        caseGrille = new Case[x][y];
        this.initCases();
    }

    private void initCases(){
      ArrayList<EnumSymbole> ts = new ArrayList<>();
      ts.addAll(Arrays.asList(EnumSymbole.getlistSymbole()));
      for(int i=0;i<nbSymbole;i+=1){
          EnumSymbole s = ts.remove((int)(Math.random()*ts.size()));

          while(true){
            int x = (int) (Math.random()*tx);
            int y = (int) (Math.random()*ty);
            if(caseGrille[x][y].getClass()!=CaseSymbole.class){
              caseGrille[x][y] = new CaseSymbole(x,y,s);
              break;
            }
          }

          while(true){
            int x = (int) (Math.random()*tx);
            int y = (int) (Math.random()*ty);
            if(caseGrille[x][y].getClass()==CaseSymbole.class){
              caseGrille[x][y] = new CaseSymbole(x,y,s);
              break;
            }
          }
      }

      for(int i=0;i<tx;i+=1){
        for(int j=0;j<ty;j+=1){
          if(caseGrille[i][j].getClass()!=CaseSymbole.class){caseGrille[i][j] = new CaseChemin(i,j);}
        }
      }
    }

    public void newCheminActu(int x, int y){
      if(caseGrille[x][y].getClass()==CaseSymbole.class){
        cheminActu = new Chemin((CaseSymbole) caseGrille[x][y]);
      }
    }

    public void addCaseCheminActu(int x, int y){
      if( (caseGrille[x][y].getClass()==CaseChemin.class && ((CaseChemin)caseGrille[x][y]).sensChemin==null) || caseGrille[x][y].getClass()==CaseSymbole.class){
        cheminActu.add(caseGrille[x][y]);
      }

      if (caseGrille[x][y].getClass()==CaseSymbole.class) {
        if(((CaseSymbole)caseGrille[x][y]).symbole == cheminActu.symboleChemin && x!=cheminActu.cheminCase.get(0).posx && y!=cheminActu.cheminCase.get(0).posy){
          cheminFini.add(cheminActu);
          cheminActu = null;
        }
        else{
          cheminActu.clean();
          cheminActu = null;
        }
      }
    }

  
  public boolean estFini(){
      if(cheminFini.size()==nbSymbole){
        for(int i=0;i<tx;i+=1){
          for(int j=0;j<ty;j+=1){
            if(!((caseGrille[i][j].getClass()==CaseChemin.class && ((CaseChemin)caseGrille[i][j]).sensChemin!=null) || caseGrille[i][j].getClass()==CaseSymbole.class)) {
              return false;
            }
          }
        }
        return true;
      }
      else{
        return false;
      }
  }
  
  public static void main(String []args){
    Grille g1 = new Grille(3,3,2);
    
  }
}
