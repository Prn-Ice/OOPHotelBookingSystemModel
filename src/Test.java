import com.hotel.Hotel;
import com.users.Guest;
import com.users.Manager;

public class Test {

    public static void main(String[] args) {
        /// If the model expects to handle only one hotel at a time
        /// I would suggest [Hotel] be static and once its values are set, they can be accessed by any class without creating an object
        /// So kiki = new Manager();
        /// Hotel would be used within Manager
        /// No need for the app object
        /// same for the Guest();

        /// Also you can do type checks like when you ask for room number, and I type 'a'

        /// But im nitpicking really youve done really well
        /// Love the modularisation too

        /// just noticed that code stops at
        /// Card type:

//        Hotel app = new Hotel();
//        app.setName("Elite Guys Hotel");

        Manager kiki = new Manager("Chiza",234, "ciza@gmail.com");

        kiki.getHotel().addAvailableRoom();
        kiki.getHotel().addAvailableRoom();

        Guest guest1 = new Guest("Stanley",222, "stanley@gmail.com");

        guest1.bookRoom();
        kiki.getHotel().roomsInThisHotel();
        guest1.reservationDetails();

    }
}
