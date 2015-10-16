/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.Documentos;


/**
 *
 * @author Tadeu
 */
public class Teste {

    private String retornaGrupoTratado(String grupo) {
        String retorno=grupo;
        while(retorno.length()<3){
            retorno="0"+retorno;
        }
        return retorno;
    }

    public static void main(String[] args) {
        Teste teste=new Teste();
        System.out.println(teste.retornaGrupoTratado("3"));
    }

}
