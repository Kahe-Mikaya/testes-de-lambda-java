import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("joao@gmail.com","joao",19));
        pessoas.add(new Pessoa("ana@gmail.com","ana",23));
        pessoas.add(new Pessoa("paulo@gmail.com","paulo",30));
        List<Pessoa> lista = new ArrayList<>();

        Collections.sort(pessoas,(o1, o2)-> o1.getNome().compareTo(o2.getNome())
                );
        Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));
        System.out.println(pessoas);
        for (Pessoa x : pessoas){
            if(x.getIdade() > 19){
                System.out.println(x);
            }
        }
        pessoas.stream().filter(p -> p.getIdade()>=20).forEach(p -> System.out.println(p));
        //

        for (Pessoa x : pessoas){
            if(x.getIdade() > 19){
                lista.add(x);
            }
        }
        Collections.sort(lista, Comparator.comparing(Pessoa::getIdade));
        lista = pessoas.stream().filter(pessoa -> pessoa.getIdade()>+20).sorted(Comparator.comparing(Pessoa::getIdade)).toList();
        lista.forEach(pessoa -> System.out.println(pessoa));
        System.out.println(pessoas.stream().max(Comparator.comparing(Pessoa::getIdade)));
        Random random = new Random();

        int numeros[] = random.ints(30,0,50).toArray();
        Arrays.stream(numeros).sorted().distinct().forEach(numero -> System.out.println(numero));
        //sorted ordenando, distinct para n ter repetição


        


    }

}