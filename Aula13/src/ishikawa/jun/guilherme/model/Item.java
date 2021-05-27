package ishikawa.jun.guilherme.model;

/**
 * Classe que apresenta um item armazenado no sistema
 */
public class Item
{
    final public String nome;
    final public double preco;

    /**
     * Constructor do elemento item
     * @param nome
     * @param preco
     */
    public Item(String nome, double preco)
    {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Metodo que representa o estado do objeto item
     * @return
     */
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    /**
     * Metodo que cria um objeto Item dada uma String de entrada
     * @param dados String com os valores do nome e do preco do item
     * @return Uma instancia de item
     */
    public static Item pegaItem(String dados)
    {
        return  new Item(dados.split(",")[0],
                Double.parseDouble(dados.split(",")[1]));
    }
}
