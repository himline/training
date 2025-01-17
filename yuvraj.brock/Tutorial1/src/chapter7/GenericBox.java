package chapter7;

public class GenericBox<E> {
	private E content;

	GenericBox(E content) {
		this.content = content;
	}

	public E getContent() {
		return content;
	}

	public void setContent(E content) {
		this.content = content;
	}


	public String toString() {
		return content + " (" + content.getClass() + ")";
	}

}
