package com.github.felipemoreira07.ufg.poo.t07;

public class Devoto {

    // REFLEXÃO: isso não quebra o encapsulamento
    // que deveria existir em religião?
    // Esta é uma autodeclaração
    public Devoto(Religiao religiao) {
        religiao.novoDevoto(this);
    }
}