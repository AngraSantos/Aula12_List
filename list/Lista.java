package list;

import java.util.ArrayList;
import java.util.List;

public class Lista {
   
    public static void main(String[] args) {
        
        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(new Pessoa(1, "Angra", 25, "11-970510060", "Rua dos cafes, 14"));
        pessoas.add(new Pessoa(2, "Maria", 34, "11-837362526", "Rua dos acucar, 6789"));
        pessoas.add(new Pessoa(3, "João", 56, "11-986252662", "Rua dos rosas, 5262"));
        pessoas.add(new Pessoa(4, "Fernanda", 13, "11-998754527", "Rua dos pinheiros, 567"));
        pessoas.add(new Pessoa(5, "Carol", 39, "11-908754655", "Rua dos uvas, 98"));
        
        for(int i = 0; i < pessoas.size(); i++){
            Pessoa pessoa = pessoas.get(i);
            System.out.println(pessoa.getNome());
            System.out.println(" ");
        }

        Pessoa pessoaPeloNome = buscaPeloNome(pessoas,"Angra");
        
        if(pessoaPeloNome != null){
            System.out.println("Pessoa pelo nome: " + pessoaPeloNome.getId() + "|" + pessoaPeloNome.getNome() + "|" +
                                pessoaPeloNome.getIdade() + "|" + pessoaPeloNome.getTelefone() + "|" + pessoaPeloNome.getEndereco());

        }
    }
        public static Pessoa buscaPeloNome(List<Pessoa> pessoas, String nome) {
            for(Pessoa pessoa : pessoas){
                if(pessoa.getNome() == nome){
                    return pessoa;
                }
            }

            return null;
        }   
    }
