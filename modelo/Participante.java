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
public class Participante implements ILeitor, IProgramador{
    protected String nome;

    public Participante(String nome) {
        this.nome = nome;
    }

    public Participante() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String Programando(){
        return "programando";
    }
    
    @Override
    public String Lendo(){
        return "lendo um programa";
    }
}
