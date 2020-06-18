package instruments;

public class Piano extends Musical_Instrument implements Tuneable, VolumeAdjustable {

    private int numberOfKeys;

    public Piano(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public Piano(String instrumentClassification, int numberOfKeys) {
        super(instrumentClassification);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public void startMusic() {

    }

    @Override
    public void stopMusic() {

    }

    @Override
    public void tuneInstrument() {

    }

    @Override
    public void detuneInstrument() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }
}
