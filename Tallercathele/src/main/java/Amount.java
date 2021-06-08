public class Amount {

    private final int value;

    public Amount(int value) {
        value = value;
    }

    public static Amount amountOf(int value) {
        return new Amount(value);
    }

    public Amount plus(Amount otheramount){
        return  amountOf(this.value+otheramount.value);
    }

    public Amount negative(Amount otheramount){
        return  amountOf(this.value-otheramount.value);
    }

    public boolean isGreaterThat(Amount otherAmount){
        return
    }






}
