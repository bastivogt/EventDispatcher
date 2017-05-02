package name.sebastian.vogt.events;

/**
 * Created by sebastian on 04.11.16.
 */
public class Event {

    public static final String START = "start";
    public static final String CHANGE = "change";
    public static final String FINISH = "finish";

    protected Object target;
    protected String type;

    public Event(IEventDispatcher target, String type) {
        this.target = target;
        this.type = type;
    }

    public Object getTarget() {
        return this.target;
    }

    public String getType() {
        return this.type;
    }
}
