package dao

import models.Produto
import java.sql.DriverManager

class ProdutoDAO : GenericoDAO {
    override fun pegarUm(id: Int): Any {
        var produtos = mutableListOf<Produto>()
        try {
            //Cria uma conexão com o banco
            val connection = ConexaoDAO()
            val resultSet = connection.executeQuery("SELECT * FROM produtos WHERE id == ${id};")
            //Intera pelo resultado obtido
            while (resultSet?.next()!!) {
                produtos.add(
                    Produto(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getDouble("valor"),
                        resultSet.getInt("quantidade")
                    )
                )
            }
            connection.close()
        } catch (e:Exception) {
            e.printStackTrace()
        }
        return produtos
    }

    override fun pegarTodos(): List<Any> {
        //Cria uma conexão com o banco
        val connection = DriverManager.getConnection("jdbc:sqlite:meubanco.db")
        //Cria um caminho para realizar queries sql no banco
        val sqlStatement = connection.createStatement()
        //Executa uma query de busca
        val resultSet = sqlStatement.executeQuery("SELECT * FROM produtos")
        //Intera pelo resultado obtido
        var produtos = mutableListOf<Produto>()
        while (resultSet.next())
        {
            produtos.add(Produto(
                resultSet.getInt("id"),
                resultSet.getString("nome"),
                resultSet.getDouble("valor"),
                resultSet.getInt("quantidade")
            ))
        }
        println("Produto encontrado: ${produtos}")
        resultSet.close()
        sqlStatement.close()
        connection.close()
        return produtos
    }

    fun pegarTodosSeguro(): List<Any> {
        val produtos = mutableListOf<Produto>()
        var connection : ConexaoDAO? = null
        try {
            //Cria uma conexão com o banco
            val connection = ConexaoDAO()
            val resultSet = connection.executeQuery("SELECT * FROM produtos;")
            //Intera pelo resultado obtido

            while (resultSet?.next()!!) {
                produtos.add(
                    Produto(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getDouble("valor"),
                        resultSet.getInt("quantidade")
                    )
                )
            }
            connection.close()
        } catch (exception:Exception) {
            exception.printStackTrace()
        } finally {
            connection?.close()
        }
        return produtos
    }


    override fun inserirUm(objeto: Any) {
        val conexaoDAO = ConexaoDAO()
        val preparedStatement = conexaoDAO.getPreparedStatement("""
            INSERT INTO produtos
            nome, valor, quantidade
            VALUES (?, ?, ?);
            """.trimMargin())
        val produto = objeto as Produto
        preparedStatement?.setString(1, produto.nome)
        preparedStatement?.setDouble(2, produto.valor)
        preparedStatement?.setInt(3, produto.quantidade)
        preparedStatement?.executeUpdate()
        conexaoDAO.commit()
        conexaoDAO.close()
    }

    override fun inserirVarios(lista: List<Any>) {
        TODO("Not yet implemented")
    }

    override fun atualizar(objeto: Any) {
        val conexaoDAO = ConexaoDAO()
        val preparedStatement = conexaoDAO.getPreparedStatement("""
            UPDATE INTO produtos
            SET nome = ?, valor = ?, quantidade = ?
            WHERE id = ?;
            """.trimMargin())
        val produto = objeto as Produto
        preparedStatement?.setString(1, produto.nome)
        preparedStatement?.setDouble(2, produto.valor)
        preparedStatement?.setInt(3, produto.quantidade)
        preparedStatement?.setInt(4, produto.id)
        preparedStatement?.executeUpdate()
        conexaoDAO.commit()
        conexaoDAO.close()
    }

    override fun deletar(id: Int) {
        TODO("Not yet implemented")
    }
}