import agenda.*;

/**
 * Created by caiomoraes on 03/10/17.
 */
public class UsaPessoa
{
    public static void main(String[] args)
    {
        Agenda agenda = new Agenda();

        agenda.inserePessoa(new Pessoa("A", "111-1111", "Rua A"));
        agenda.inserePessoa(new Pessoa("B", "222-2222", "Rua B"));
        agenda.inserePessoa(new Pessoa("C", "333-3333", "Rua C"));
        agenda.inserePessoa(new Pessoa("D", "444-4444", "Rua D"));
        agenda.inserePessoa(new Pessoa("E", "555-5555", "Rua E"));

        //Imprimindo todos os nomes
        System.out.println("Imprimindo todos os nomes");
        for (String nome : agenda.listarNomes())
        {
            System.out.println("Nome: " + nome);
        }

        //Imprimindo todos os dados
        System.out.println("Imprimindo todos os dados");
        for (Pessoa pessoa : agenda.listarPessoas())
        {
            System.out.println(pessoa);
        }

        //Buscando por uma pessoa
        System.out.println("Buscando por uma pessoa");
        System.out.println(agenda.buscaPessoa("A"));
    }

}
