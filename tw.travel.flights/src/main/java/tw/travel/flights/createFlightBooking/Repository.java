package tw.travel.flights.createFlightBooking;

public interface Repository<T> {
    T save(T t);
    T get(String id);
    T delete(String id);
}
