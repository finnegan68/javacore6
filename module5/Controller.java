package module5;
import java.util.Arrays;

public class Controller {

    API apis[] = new API[3];

    Room[] requstRooms(int price, int persons, String city, String hotel){
        Room[] allRequestRooms = new Room[0];
        for(API api : apis){
            for(Room r : api.findRooms(price, persons, city, hotel)){
                allRequestRooms = Arrays.copyOf(allRequestRooms, allRequestRooms.length + 1);
                allRequestRooms[allRequestRooms.length - 1] = r;
            }
        }
        return allRequestRooms;
    }
    Room[] check(API api1, API api2){
        if(api1.getRooms() == null || api2.getRooms() == null){
            System.out.println("There is no rooms in some API");
            return null;
        }
        Room[] answ = new Room[0];
        for (Room r1 : api1.getRooms()){
            for (Room r2 : api2.getRooms()){
                if(r1.equals(r2)){
                    answ = Arrays.copyOf(answ, answ.length + 1);
                    answ[answ.length - 1] = r1;
                }

            }
        }
        return answ;
    }
}
