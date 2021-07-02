package KTVTKPM.ASummary.ChainOfResponsibilityPattern;

public interface Handler {
	public void setNext(Handler h);
	public void handler();
}
