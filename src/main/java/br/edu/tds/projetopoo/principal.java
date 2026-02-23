/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.projetopoo;

/**
 *
 * @author aluno
 */
public class principal {
     
    public static void main(String[] args){
        System.out.println("Testando objeto da classe cliente");
        //usando a classe cliente
        String mensagem = "ola mundo";
        int contador = 1;
        cliente c1 = new cliente("Pedro", 16, "12345678");
        c1.imprimeDadosCliente();
    }
}
