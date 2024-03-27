import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 123;
        var rewardValue = new RewardValue(cashValue);
        cashValue = 4232;
        int milesValue = (int) (cashValue / 0.0035);
        assertEquals(milesValue, rewardValue.convertCash(cashValue));
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 1234;
        var rewardValue = new RewardValue(milesValue);
        milesValue = 4321;
        double cashValue = milesValue * 0.0035;
        assertEquals(cashValue, rewardValue.convertMiles(milesValue));
    }
}
