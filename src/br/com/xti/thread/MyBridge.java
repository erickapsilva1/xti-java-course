package br.com.xti.thread;

/**
 * A <code>Bridge</code> represents the connecting link between Information <i>Producer</i>
 * and <i>Consumer</i> objects. Producers use Bridges to record information and share that
 * information with Consumers who  read that data from the Bridge for processing.
 *
 * @author Erick A. da Silva
 * @author Ricaro Lopes - XTI
 * @version 1
 * @since 1.0
 *
 * @see UnsynchronizedBridge
 * @see SynchronizedBridge
 */

public interface MyBridge {

    /**
     * Stores the value informed in the bridge. It is usually called by Data Producer classes.
     * @param value
     * @throws InterruptedException
     */
    public void set(int value) throws InterruptedException;

    /**
     * Retrieves the information stored in the Bridge. This method will be called by Data Consumers.
     * @return
     * @throws InterruptedException
     */
    public int  get() throws InterruptedException;

}
