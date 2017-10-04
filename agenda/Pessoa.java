package agenda;

/**
 * Created by caiomoraes on 03/10/17.
 */
public class Pessoa
{
    private String nome;
    private String telefone;
    private String endereço;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getEndereço()
    {
        return endereço;
    }

    public void setEndereço(String endereço)
    {
        this.endereço = endereço;
    }

    public Pessoa()
    {
        this("Nome e Sobrenome", "777-7777", "Logradouro Lorum");
    }

    public Pessoa(String nome, String telefone, String endereço)
    {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
    }

    @Override
    public String toString()
    {
        return "Nome: " + nome + "\n" + "Telefone: " + telefone + "\n" + "Endereço: " + endereço;
    }
}
