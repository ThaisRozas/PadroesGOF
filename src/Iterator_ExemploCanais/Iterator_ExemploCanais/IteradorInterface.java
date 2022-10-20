package src.Iterator_ExemploCanais.Iterator_ExemploCanais;

public interface IteradorInterface {
	void first();
	 
    void next();
 
    boolean isDone();
 
    Canal currentItem();
}
