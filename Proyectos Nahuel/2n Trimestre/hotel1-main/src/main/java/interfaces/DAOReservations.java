package interfaces;

import java.util.List;
import models.Reservations;

public interface DAOReservations {
    public void add(Reservations reservation) throws Exception;
    public void modify(Reservations reservation) throws Exception;
    public List<Reservations> list(Reservations reservation) throws Exception;
}
