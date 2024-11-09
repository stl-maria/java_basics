package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main (String[]args){
        List<String> list //declarando uma lista de numeros inteiros
                //List e Integer (wrapper): tipo da lista
                = new ArrayList<>(); //instanciando a lista com a classe ArrayList

        //adicionando
        list.add("Maria"); //por elemento
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add("Claudia");
        list.add(2, "Marco"); //em uma posição especifica

        //removendo
        list.remove("Maria"); //valor especifico
        list.remove(0); //pela posição
        list.removeIf(x -> x.charAt(0) == 'M'); //predicado: remove se o primeiro caracter de 'X' for igual a 'M', retorna verdadeiro

        //tamanho da lista
        System.out.println(list.size());

        //exibindo os elementos
        for(String i : list){
            System.out.println(i);
        }

        //localizado posição
        System.out.println("Index do Bob: "+list.indexOf("Bob")); //por elemento

        //filtro
        List<String> result = //criando uma nova lista
            list.stream().filter(x -> x.charAt(0) == 'A') //pegar a lista original ('list'), converter para stream() e filtrar
                    .toList(); //como o filter não é compativel com o tipo List, precisamos converter

        System.out.print("Exebindo o filtro: ");
        for(String i : result){
            System.out.println(i);
        }

        //encontrar o primeiro elemento
        String name = list.stream().filter(x -> x.charAt(0) == 'A')
                .findFirst() //localiza o primeiro
                .orElse(null); //caso não encontre, retorna null
        System.out.println(name);

    }
}
