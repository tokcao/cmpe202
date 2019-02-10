
public interface GumballMachine {

	public void insertQuarter();

	public void ejectQuarter();

	public void turnCrank();

	public void setState(State state);

	public void releaseBall();

	public int getCount();

	public State getState();

}
