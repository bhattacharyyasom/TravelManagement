package tw.travel.ValueObjects;

import lombok.Value;

//Using @Value as a shorthand to create a immutable ValueObject(DDD)
@Value
public class FlightLeg {
    String source;
    String destination;
    String food;
    String seat;
    String seatType;
    String getLegDetails(){
     return source + ":" +destination;
    }
}