
import java.sql.{Connection, DriverManager}
object MysqlScal {
  def main(args: Array[String]): Unit = {
    // Database connection properties
    val url = "jdbc:mysql://localhost:3306/homework"
    val username = "root"
    val password = "Falom2013!!"

    // Load the MySQL JDBC driver
    Class.forName("com.mysql.cj.jdbc.Driver")

    // Create a connection to the database
    val connection: Connection = DriverManager.getConnection(url, username, password)

    try {
      // Create a statement
      val statement = connection.createStatement()

      // Execute a query
      val query = "SELECT STUDENT_ID,FIRST_NAME,LAST_NAME FROM STUDENTSSa;"
      val resultSet = statement.executeQuery(query)

      // Process the query results
      while (resultSet.next()) {
        val column1 = resultSet.getString("STUDENT_ID")
        val column2 = resultSet.getString("FIRST_NAME")
        val column3 = resultSet.getString("LAST_NAME")

        // Add more columns as needed

        // Do something with the retrieved data (e.g., print it)
        println(s"$column1 $column2 $column3")

        // Your database operations here
        // For example, you can execute SQL queries using this connection
      }
    } finally {
      // Close the connection when done
      connection.close()
    }

  }

}
