package interfaces;

import java.util.List;
import models.Rooms;

public interface DAORooms {
    public void add(Rooms room) throws Exception;
    public void modify(Rooms room) throws Exception;
    public void remove(Rooms room) throws Exception;
    public List<Rooms> list(Rooms room) throws Exception;
}
