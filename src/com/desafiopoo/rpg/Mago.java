package com.desafiopoo.rpg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Mago extends Personagem {
	

    private List<String> magia = new ArrayList<>();

    public Mago() {

    }

    public Mago(String nome, Integer vida, Integer mana, Float xp, Integer inteligencia, Integer forca, Integer level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }

    @Override
    public void lvlUp() {
        super.setVida(getVida()+1);
        super.setXp(getXp()+1);
        super.setForca(getForca()+1);
        super.setMana(getMana()+5);
        super.setInteligencia(getInteligencia()+5);
        super.setLevel(getLevel()+1);

    }

    public void attack(){
        Random random = new Random();

        int aleatorio = random.nextInt(300) + 1;

        super.setInteligencia((getInteligencia()*getLevel()) + aleatorio);

        System.out.println(super.getInteligencia());

    }

    public void aprenderMagia(){
        Scanner scan = new Scanner(System.in);
        String mag = scan.next();
        magia.add(mag);

    }


    @Override
    public String toString() {
        return "Mago{" +
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
