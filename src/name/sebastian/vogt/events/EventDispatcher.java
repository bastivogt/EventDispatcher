package name.sebastian.vogt.events;

import java.util.ArrayList;

/**
 * Created by sebastian on 04.11.16.
 */
public class EventDispatcher {

    protected ArrayList<Listener> listerners;

    public EventDispatcher() {
        this.listerners = new ArrayList<Listener>();
    }


    public void addListener(Listener listener) {
        this.listerners.add(listener);
    }

    public void removeListerner(Listener listener) {
        this.listerners.remove(listener);
    }


    public void fireUpdate(Event e) {
        for(Listener listener : this.listerners) {
            listener.update(e);
        }
    }
}
