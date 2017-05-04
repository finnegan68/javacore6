package module5;


public interface API {

    Room[] getRooms();
    Room[] findRooms(int price, int persons, String city, String hotel);
}
