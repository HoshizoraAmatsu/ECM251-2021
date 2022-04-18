import dao.ProdutoDAO
import models.Produto

fun main(args: Array<String>)
{
    //Cria um DAO para os produtos
    val produtosDao = ProdutoDAO()
    var produtos = ProdutoDAO().pegarTodosSeguro()
    //Intera pelo resultado obtido
    for (produto in produtos) {
        println(produto)
    }
    produtosDao.inserirUm(Produto(0, "Agua", 5.0, 12))
    produtos = produtosDao.pegarTodosSeguro()
    //Intera pelo resultado obtido
    for (produto in produtos) {
        println(produto)
    }
}