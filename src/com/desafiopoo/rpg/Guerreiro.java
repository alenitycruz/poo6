package com.desafiopoo.rpg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Guerreiro extends Personagem {
	
	private List<String> habilidade = new ArrayList<>();

    public Guerreiro() {
    }

    public Guerreiro(String nome, Integer vida, Integer mana, Float xp, Integer inteligencia, Integer forca, Integer level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }



    @Override
    public void lvlUp() {
        super.setVida(getVida()+5);
        super.setXp(getXp()+1);
        super.setForca(getForca()+5);
        super.setMana(getMana()+1);
        super.setInteligencia(getInteligencia()+1);
    }

    public void attack(){
        Random random = new Random();

        int aleatorio = random.nextInt(300) + 1;

        super.setForca((getForca()*getLevel()) + aleatorio);

        System.out.println(super.getForca());
    }

    public void aprenderHabilidade(){
        Scanner scan = new Scanner(System.in);
        String hab = scan.next();
        habilidade.add(hab);

    }



    @Override
    public String toString() {
        return "Guerreiro{" +
                "nome='" + super.nome + '\'' +
                ", vida=" + super.vida +
                ", mana=" + super.mana +
                ", xp=" + super.xp +
                ", inteligencia=" + super.inteligencia +
                ", forca=" + super.forca +
                ", level=" + super.level +
                '}';
    }


}
