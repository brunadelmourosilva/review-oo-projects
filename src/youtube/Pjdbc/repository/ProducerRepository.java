package br.com.brunadelmouro.youtube.Pjdbc.repository;

import br.com.brunadelmouro.youtube.Pjdbc.dominio.Producer;
import br.com.brunadelmouro.youtube.Pjdbc.conn.ConnectionFactory;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Log4j2 //ver status de log da aplicação ao invés de usar sout
public class ProducerRepository {

    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('" + producer.getName() + "');";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) { //cria um statament, ou seja, adiciona um valor
            int rowsAffected = stmt.executeUpdate(sql);

            log.info("Inserted producer '{}' in the database, rows affected '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while to insert producer '{}'", producer.getName(), e);
            e.printStackTrace();
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE(`id` = '" + (id) + "')";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) { //cria um statament
            int rowsAffected = stmt.executeUpdate(sql);

            log.info("Deleted producer '{}' from the database, rows affected '{}'", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while to delete producer '{}'", id, e);
            e.printStackTrace();
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = '" + producer.getName() + "' WHERE(`id` = '" + producer.getId() + "')";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) { //cria um statament
            int rowsAffected = stmt.executeUpdate(sql);

            log.info("Update producer '{}', rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while to update producer '{}'", producer.getId());
            e.printStackTrace();
        }
    }

    public static List<Producer> findAll() {
        log.info("Finding all Producers");
        return findByName("");
//        String sql = "SELECT id, name FROM `anime_store`.`producer`;";
//
//        List<Producer> producersList = new ArrayList<>();
//        try (Connection conn = ConnectionFactory.getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(sql)) {
//            while (rs.next()) {
//                //pega os dados do banco e cria o objeto
//                Producer producer = Producer
//                        .builder()
//                        .id(rs.getInt("id"))
//                        .name(rs.getString("name"))
//                        .build();
//
//                //adiciona na lista
//                producersList.add(producer);
//            }
//        } catch (SQLException e) {
//            log.error("Error while trying to find all producers ", e);
//            e.printStackTrace();
//        }
//        return producersList;
    }

    public static List<Producer> findByName(String name) {
        String sql = "SELECT id, name FROM `anime_store`.`producer` WHERE `name` like '%" + name + "%'";

        List<Producer> producersList = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                //pega os dados do banco e cria o objeto
                Producer producer = Producer
                        .builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();

                //adiciona na lista
                producersList.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers ", e);
            e.printStackTrace();
        }
        return producersList;
    }
}

