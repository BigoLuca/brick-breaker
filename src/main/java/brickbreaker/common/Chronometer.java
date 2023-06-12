package brickbreaker.common;

/**
 * Class representing a chronometer.
 * Method: 
 */
public class Chronometer extends Thread {

    private Integer time;
    private boolean isRunning;
    private boolean exit;

    /**
     * Chronometer constructor.
     */
    public Chronometer() {
        this.time = 1;
        this.isRunning = false;
        this.exit = false;
    }
    
    /**
     * @return the time elapsed from the start in seconds
     */
    public Integer getElepsedTime() {
        return this.time / 10;
    }
    
    public void startChrono() {
        if (!this.isAlive()) {
            this.start();
        }
        this.isRunning = true;
    }

    /**
     * Method to put the chronometer in pause.
     */
    public void pauseChrono() {
        this.isRunning = false;
    }

    /**
     * Method to stop the chronometer.
     */
    public void stopChrono() {
        this.isRunning = false;
        this.exit = true;
    }

    @Override
    public void run() {
        while (!exit) {
            synchronized (this) {
                if (isRunning) {
                    try {
                        Thread.sleep(1000);
                        time++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
