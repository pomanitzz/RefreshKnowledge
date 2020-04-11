package theme.java_versions.version14.instance_of;

public class SimpleInstrumentDemoService {

    public String getInstrumentDescription(Object object) {
        if(object instanceof Violin violin) {
            return "Violin say: " + violin.getDescription();
        }
        if(object instanceof Instrument instrument) {
            return "Instrument say: " + instrument.getDescription();
        }
        return "Unknown";
    }

}
