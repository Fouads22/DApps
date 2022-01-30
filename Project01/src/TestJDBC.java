
//Mise en oeuvre JDBC
import java.sql.*;

public class TestJDBC {
    public static void main( String[] args ) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection cx = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Project01?useSSL=false",
                "root",
                "");

        Statement st = cx.createStatement();

        st.execute("CREATE TABLE IF NOT EXISTS Voitures(" +
                "id int NOT NULL, " +
                "Immatriculation VARCHAR (10) NOT NULL, " +
                "Marque VARCHAR (25) NOT NULL, " +
                "Couleur VARCHAR (25) NOT NULL, " +
                "PRIMARY KEY(id))");

        st.execute("INSERT INTO Voitures(id, Immatriculation, Marque, Couleur) VALUES (1,'B111', 'BMW', 'Noire');");
        st.execute("INSERT INTO Voitures(id, Immatriculation, Marque, Couleur) VALUES (2,'Z123', 'Mercedes', 'Blanche');");
        st.execute("INSERT INTO Voitures(id, Immatriculation, Marque, Couleur) VALUES (3,'B234', 'Mercedes', 'Grise');");

        ResultSet rs = st.executeQuery("SELECT * FROM Voitures");

        while (rs.next()) {
            String Immatriculation = rs.getString("Immatriculation");
            String marque = rs.getString("Marque");
            System.out.println( Immatriculation + " est de marque " + marque);
        }
        rs.close();
        st.close();
        cx.close();
    }
}
