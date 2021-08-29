/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.adivinhe_o_numero;

import java.util.Random;

/**
 *
 * @author Wanderson
 */
public class Processamento {

    Random gerador = new Random();

    public int geraNumero() {

        int n = gerador.nextInt(50);

        return n;
    }

}
