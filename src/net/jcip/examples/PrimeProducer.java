package net.jcip.examples;

import java.math.BigInteger;
import java.util.concurrent.*;

/**
 * PrimeProducer
 * <p/>
 * Using interruption for cancellation
 *
 * @author Brian Goetz and Tim Peierls
 */
public class PrimeProducer extends Thread {
    private final BlockingQueue<BigInteger> queue;

    PrimeProducer(BlockingQueue<BigInteger> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            BigInteger p = BigInteger.ONE;
            while (!Thread.currentThread().isInterrupted()){
                queue.put(p = p.nextProbablePrime());
                System.out.println(p);
            }
            
        } catch (InterruptedException consumed) {
            /* Allow thread to exit */
        }
    }

    public void cancel() {
        interrupt();
    }
    
    public static void main(String[] args) {
    	BlockingQueue<BigInteger> queue = new LinkedBlockingQueue<>(128);
    	PrimeProducer pp = new PrimeProducer(queue);
		pp.start();
		pp.cancel();
	}
}
