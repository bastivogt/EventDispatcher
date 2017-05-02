package name.sebastian.vogt.events;

/**
 * Created by beton on 02.05.2017.
 */
public interface IEventDispatcher {

    void addListener(Listener listener);
    void removeListener(Listener listener);
    void fireUpdate(Event e);
}
