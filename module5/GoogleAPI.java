package module5;


import java.util.Arrays;

public class GoogleAPI implements API {
    Room[] rooms = new Room[5];

    @Override
    public Room[] getRooms() {
        return new Room[0];
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] answ = new Room[0];
        for (Room r : rooms){
            if(r.getPrice() == price && r.getPersons() == persons && r.getCityName() == city && r.getHotelName() == hotel){
                answ = Arrays.copyOf(answ, answ.length + 1);
                answ[answ.length - 1] = r;
            }
        }
        return answ;
    }
}
