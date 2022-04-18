package dao

import shared.SharedPaths
import java.sql.*

class ConexaoDAO {
    var preparedStatement: PreparedStatement?
    val connection : Connection
    var statement : Statement?
    var resultSet : ResultSet?

    init {
        this.connection = DriverManager.getConnection(SharedPaths.STRING_DE_CONEXAO_JDBC)
        this.statement = null
        this.resultSet = null
        this.preparedStatement = null
    }

    fun executeQuery(sqlString : String) : ResultSet? {
        this.statement = this.connection.createStatement()
        this.resultSet = this.statement?.executeQuery(sqlString)
        return this.resultSet
    }

    fun close() {
        this.connection.close()
        this.statement?.close()
        this.resultSet?.close()
    }

    fun getPreparedStatement(sqlString: String): PreparedStatement? {
        this.preparedStatement = this.connection?.prepareStatement(sqlString)
        return this.preparedStatement
    }

    fun commit() {

    }
}