package module5;


import java.util.ArrayList;

public class RoomDAO implements DAO{

    private ArrayList<Room> roomDB = new ArrayList<>();

    public ArrayList<Room> getRoomDB() {
        return roomDB;
    }

    @Override
    public Room save(Room room) {
        if(room == null){
            System.out.println("Error. NullPointerExeption");
            return null;
        }
        getRoomDB().add(room);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        for(Room r : getRoomDB()){
            if(r.equals(room)){
                getRoomDB().remove(r);
                return true;
            }
        }
        return false;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public Room findById(long id) {
        if (id < 0){
            System.out.println("Id must be > 0");
            return null;
        }
        for (Room r : getRoomDB()){
            if(r.getId() == id){
                return r;
            }
        }
        System.out.println("There is no such room");
        return null;
    }
}
