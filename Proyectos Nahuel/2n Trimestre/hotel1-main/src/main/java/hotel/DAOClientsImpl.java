package hotel;

import database.Database;
import interfaces.DAOClients;
import java.sql.PreparedStatement;
import java.util.List;
import models.Clients;

public class DAOClientsImpl extends Database implements DAOClients{

    @Override
    public void register(Clients client) throws Exception {
        try {
            this.connect();
            
            // Nahuel, si ves esto, me quiero morir. (El id no lo metemos porque es autoincrement)
            PreparedStatement st = this.connection.prepareStatement("INSERT INTO clients(name, surname, email, nif, phone, direction) VALUES(?,?,?,?,?,?,?);");
            st.setString(1, client.getName());
            st.setString(2, client.getSurname());
            st.setString(3, client.getEmail());
            st.setString(4, client.getNif());
            st.setString(5, client.getPhone());
            st.setString(6, client.getDirection());
            
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            this.closeConnection();
        }
    }

    @Override
    public void modify(Clients client) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove(Clients client) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Clients> list(Clients client) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
