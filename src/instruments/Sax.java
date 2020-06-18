package instruments;

public class Sax extends Musical_Instrument implements Tuneable, VolumeAdjustable{

    private String saxType;

    public Sax(String saxType) {
        this.saxType = saxType;
    }

    public Sax(String instrumentClassification, String saxType) {
        super(instrumentClassification);
        this.saxType = saxType;
    }

    public String getSaxType() {
        return saxType;
    }

    public void setSaxType(String saxType) {
        this.saxType = saxType;
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
