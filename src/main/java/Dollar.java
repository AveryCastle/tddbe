/**
 * Created by seongjuhyeon on 11/21/15.
 */
public class Dollar {

    int amount = 0;

    Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        amount *= multiplier;
    }
}
