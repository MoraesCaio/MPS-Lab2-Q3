package agenda;

import java.util.*;

/**
 * Created by caiomoraes on 03/10/17.
 */
public class Agenda
{
    private Map<String, Pessoa> contatos;

    public Agenda()
    {
        this.contatos = new TreeMap<String, Pessoa>();
    }

    public Pessoa buscaPessoa(String nome)
    {
        for (Map.Entry<String, Pessoa> contato : contatos.entrySet())
        {
            if (contato.getKey().equals(nome))
            {
                return (Pessoa) contato.getValue();
            }
        }
        return null;
    }

    public void inserePessoa(Pessoa pessoa)
    {
        if (buscaPessoa(pessoa.getNome()) == null)
        {
            contatos.put(pessoa.getNome(), pessoa);
        }
    }

    public List<String> listarNomes()
    {
        List<String> nomes = new ArrayList<String>();
        for (String nome : contatos.keySet())
        {
            nomes.add(nome);
        }
        return nomes;
    }

    public List<Pessoa> listarPessoas()
    {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        for (Pessoa pessoa : contatos.values())
        {
            pessoas.add(pessoa);
        }
        return pessoas;
    }

}
