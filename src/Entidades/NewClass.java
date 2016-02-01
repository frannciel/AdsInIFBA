/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Conexao.Conexao;

/**
 *
 * @author Cliente
 */
public class NewClass {
    
    public static void main(String []args){
        Conexao a = new Conexao();
        a.conectar();
        a.fechar();
    }
    
    
}
