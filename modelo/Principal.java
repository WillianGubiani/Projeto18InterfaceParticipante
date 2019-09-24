/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Willian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Participante part1 = new Participante("Willian");
        
        System.out.println("O Participante: " + part1.getNome() + " está " + part1.Lendo() + " e " + part1.Programando() + ".");

    }
    
}
