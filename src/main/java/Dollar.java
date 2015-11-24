/**
 * Created by seongjuhyeon on 11/21/15.
 */
public class Dollar {

    int amount = 0;

    Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        // TODO: NULL 값이나 다른 객체와의 비교
        Dollar dollar = (Dollar)object;
        return amount == dollar.amount;
    }
}
