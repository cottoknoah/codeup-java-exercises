package instruments;

abstract class Musical_Instrument implements Playable {

    private String instrumentClassification;

    public Musical_Instrument(){
    }

    public Musical_Instrument(String instrumentClassification) {
        this.instrumentClassification = instrumentClassification;
    }

    public String getInstrumentClassification() {
        return instrumentClassification;
    }

    public void setInstrumentClassification(String instrumentClassification) {
        this.instrumentClassification = instrumentClassification;
    }

    @Override
    public void startMusic() {

    }

    @Override
    public void stopMusic() {

    }
}
