package tw.travel.flights;

import org.junit.jupiter.api.Test;
import tw.travel.ValueObjects.PersonId;
import tw.travel.flights.createFlightBooking.User;

class UserTest {

    @Test
    public void testCreateFlightBooking(){
        PersonId personId = PersonId.builder().loginId("ralph@mmt.com").name("Ralph Towner").build();
        User loggedinUser = User.builder().personId(personId).build();
        //loggedinUser.bookFlight();
    }

}