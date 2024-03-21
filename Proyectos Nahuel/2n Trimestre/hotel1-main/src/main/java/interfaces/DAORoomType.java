package interfaces;

import java.util.List;
import models.RoomType;

public interface DAORoomType {
    public void add(RoomType client) throws Exception;
    public void modify(RoomType client) throws Exception;
    public void remove(RoomType client) throws Exception;
    public List<RoomType> list(RoomType roomType) throws Exception;
}
