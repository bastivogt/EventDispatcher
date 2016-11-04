package name.sebastian.vogt;

import name.sebastian.vogt.events.Event;
import name.sebastian.vogt.events.Listener;

public class Main implements Listener{

    private Counter counter;


    public Main() {
        this.counter = new Counter(0, 10, 1);
        this.counter.addListener(this);
        //this.counter.removeListerner(this);
        this.counter.run();

    }

    public void update(Event e) {
        Counter target = (Counter) e.getTarget();
        if(e.getType() == Event.START) {
            System.out.println("onStart");
        }

        if(e.getType() == Event.CHANGE) {
            System.out.println("onChange count = " + target.getCount());
        }

        if(e.getType() == Event.FINISH) {
            System.out.println("onFinish");
        }
    }









    public static void main(String[] args) {
	// write your code here

        new Main();




        Counter counter = new Counter(0, 10, 1);

/*        counter.addListener(new Listener() {
            @Override
            public void update(Event e) {

                Counter target = (Counter) e.getTarget();
                if(e.getType() == Event.START) {
                    System.out.println("onStart");
                }

                if(e.getType() == Event.CHANGE) {
                    System.out.println("onChange count = " + target.getCount());
                }

                if(e.getType() == Event.FINISH) {
                    System.out.println("onFinish");
                }

            }
        });*/



        Listener counterListener = new Listener() {
            @Override
            public void update(Event e) {
                Counter target = (Counter) e.getTarget();
                if(e.getType() == Event.START) {
                    System.out.println("onStart");
                }

                if(e.getType() == Event.CHANGE) {
                    System.out.println("onChange count = " + target.getCount());
                }

                if(e.getType() == Event.FINISH) {
                    System.out.println("onFinish");
                }
            }
        };

        counter.addListener(counterListener);
        //counter.removeListerner(counterListener);



        counter.run();

    }


}
