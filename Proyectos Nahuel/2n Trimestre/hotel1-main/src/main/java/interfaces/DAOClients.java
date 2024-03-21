package interfaces;

import java.util.List;
import models.Clients;

public interface DAOClients {
    public void register(Clients client) throws Exception;
    public void modify(Clients client) throws Exception;
    public void remove(Clients client) throws Exception;
    public List<Clients> list(Clients client) throws Exception;
}
