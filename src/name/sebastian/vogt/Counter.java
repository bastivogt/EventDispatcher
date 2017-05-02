package name.sebastian.vogt;

import name.sebastian.vogt.events.Event;
import name.sebastian.vogt.events.EventDispatcher;
import name.sebastian.vogt.events.IEventDispatcher;

/**
 * Created by sebastian on 04.11.16.
 */
public class Counter extends EventDispatcher implements IEventDispatcher {

    protected int start;
    protected int end;
    protected int steps;
    protected int count;

    public Counter(int start, int end, int steps) {
        this.reset(start, end, steps);
    }


    public void reset(int start, int end, int steps) {
        this.start = start;
        this.end = end;
        this.steps = steps;
        this.count = 0;
    }

    public void run() {
        this.fireUpdate(new Event(this, Event.START));
        for(int i = this.start; i < this.end; i += this.steps) {
            this.count = i;
            this.fireUpdate(new Event(this, Event.CHANGE));
        }
        this.fireUpdate(new Event(this, Event.FINISH));
    }

    public int getCount() {
        return this.count;
    }
}
