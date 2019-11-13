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
public class CaseSymbole extends Case{
    EnumSymbole symbole;
    
    public CaseSymbole(int x, int y, EnumSymbole sym){
        super(x,y);
        this.symbole = sym;
    }
    
}
