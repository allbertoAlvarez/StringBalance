package TDA;

import GenericEstructure.Node;

public interface iQueue <T> {
	
	public void equeue(T type);
	public Node<T> frond();
	public void dequeue();
}
