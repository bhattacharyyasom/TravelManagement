package tw.travel.ValueObjects;

import lombok.Value;

import java.util.Currency;
import java.util.Locale;

@Value
public class Price {
    Long units;
    Long minorUnits;
    Currency currency;

    Price addAmount(Price p) {
        //TODO Add some more complicated addition logic here
        return new Price(100L, 100L, Currency.getInstance(Locale.getDefault()));
    }
    Price subtractAmount(){
        //TODO Add some more complicated subtraction logic here
        return new Price(100L, 100L, Currency.getInstance(Locale.getDefault()));
    }
}
