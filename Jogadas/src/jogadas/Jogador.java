/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogadas;

/**
 *
 * @author usuario
 */
public class Jogador {
    
    private int pontos;
    private String nome;

    public Jogador() {}

    public Jogador(int pontos) {
        this.pontos = pontos;
        this.nome = null;
    }

    public Jogador(String nome) {
        this.nome = nome;
        this.pontos = 0;
    }
    
    public void jogar() {
        pontos += Dado.lançar();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    
}
