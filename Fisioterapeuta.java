/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fisioterapeuta;

import java.util.Scanner;

public class Fisioterapeuta {

    
    public static void inicio(int n, Scanner sc, String agenda[][]) {
        
        System.out.println("1 - Agendar");
        System.out.println("2 - Listar Agenda");
        System.out.println("3 - fim");
        n = sc.nextInt();
        
        switch(n)
        {
            case 1:
                agendar(0, 0, agenda);
                break;
            case 2:
                listar(sc, agenda);
                break;
            case 3:
                fim();
                break;
            default:
                inicio(0, sc, agenda);
                break;
        }
        
    }
    
    public static void agendar(int dia, int hora, String agenda[][]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        String nome = sc.nextLine();
        
        do
        {
        System.out.println("Digite o seu dia entre 1 a 5 (Segunda a Sexta)");
        dia = sc.nextInt();
        }while(dia <= 1 && dia >= 5);
        
        do
        {
        System.out.println("Digite a sua hora (Das 8 a 11)");
        hora = sc.nextInt();
        }while(hora <= 8 && hora >= 11);
        
        hora = hora - 8;
        dia--;
        
        if(agenda[hora][dia] == "vazio")
        {
            agenda[hora][dia] = nome;
        }
        else
        {
            System.out.println("ERR-R-RROR-o0R13T4RROr");
        }
        
        inicio(0, sc, agenda);
    }
    
    public static void listar(Scanner sc, String[][] agenda) {
        pulaLinha();
        System.out.println("Segunda  Terca  Quarta  Quinta   Sexta");
        pulaLinha();
        for(int hora = 0;hora <= 3; hora++){
            
            for(int dia = 0;dia <= 4; dia++){
                System.out.print(" " + agenda[hora][dia] + "  ");
            }
            System.out.println();
        }
        pulaLinha();
        
         inicio(0, sc, agenda);
    }
    
    public static void pulaLinha(){
        for(int i = 0; i <= 20; i++){
            System.out.print("--");
        }
        System.out.println();
    }
    public static void fim() {
        System.out.println("O programa acabou");
    }
    
    public static void main(String[] args) {
        /*variáveis*/
        String[][] agenda = {{"vazio", "vazio", "vazio", "vazio", "vazio"}, {"vazio", "vazio", "vazio", "vazio", "vazio"}, {"vazio", "vazio", "vazio", "vazio", "vazio"}, {"vazio", "vazio", "vazio", "vazio", "vazio"}};
        Scanner sc = new Scanner(System.in);
 
        
        /*code*/
        
        inicio(0, sc, agenda);
        
    }

}