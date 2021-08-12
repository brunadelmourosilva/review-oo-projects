package jdbc.repository;


import com.mysql.cj.xdevapi.PreparableStatement;
import jdbc.classes.Comprador;
import jdbc.conn.ConnectionFactory;


import java.sql.*;

public class CompradorRepository {

    public static void insert(Comprador comprador) {
        String command = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getNome() + "');";

        Connection con = ConnectionFactory.getConnection();
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(command);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        String command = "UPDATE `agencia`.`comprador` SET `cpf` = '" + comprador.getCpf() + "', `nome` = '" + comprador.getNome() + "' WHERE (`id` = '" + comprador.getId() + "');";

        Connection con = ConnectionFactory.getConnection();
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(command);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Comprador comprador) {
        String command = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '" + comprador.getId() + "');";

        Connection con = ConnectionFactory.getConnection();
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(command);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void findAll() {
        String command = "SELECT * FROM agencia.comprador;";

        Connection con = ConnectionFactory.getConnection();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(command);

            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("cpf"));
                System.out.println("--------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //11-08
    public static void namesToLowerCase() {
        //realizando consulta no banco
        Connection con = ConnectionFactory.getConnection();
        String command = "SELECT * from agencia.comprador;";

        try {
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); //diz que atualiza regsitros
            ResultSet rs = st.executeQuery(command);

            while (rs.next()) {
                rs.updateString("nome", rs.getString("nome").toLowerCase()); //atualiza a coluna ResultSet
                rs.updateRow(); //atualiza no banco
            }

            rs.beforeFirst(); //cursor
            while (rs.next()) {
                System.out.println(rs.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //11-08
    //procurar com PrepareStatament
    public static void findByNamePrepareStatament(String find) {
        String command = "SELECT * FROM agencia.comprador WHERE nome LIKE ?"; //wildcard
        Connection conn = ConnectionFactory.getConnection();

        try {
            PreparedStatement ps = conn.prepareStatement(command);
            ps.setString(1, "%" + find + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("cpf"));
                System.out.println("--------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //11-08
    //atualizar com PrepareStatament
    public static void updateByPrepareStatament(Comprador comprador) {
        String command = "UPDATE `agencia`.`comprador` SET `cpf` = ? , `nome` = ?  WHERE (`id` = ? );"; //wildcard
        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement ps = con.prepareStatement(command);
            ps.setString(1, comprador.getCpf()); // wildcard 1
            ps.setString(2, comprador.getNome()); // wildcard 2
            ps.setInt(3, comprador.getId()); // wildcard 3

            ps.executeUpdate();
            System.out.println("Atualizado com PS!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //12-08
    public static void findNameByCallableStatament(String find) {
        String command = "CALL `agencia`.`getCompradoresPorNome`( ? );";
        Connection con = ConnectionFactory.getConnection();

        try {
            CallableStatement cs = con.prepareCall(command);
            cs.setString(1, "%" + find + "%");
            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("nome"));
                System.out.println(rs.getString("cpf"));
                System.out.println("--------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

