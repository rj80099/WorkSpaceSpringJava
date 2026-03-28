package my.app;

public class Repository {
	
	private String entity;

	
	//Alt + Shift > O > generate constructor
	public Repository() {
		super();
	}

	
	//Alt + Shift > R > generate getter and setter
	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}


	@Override
	public String toString() {
		return "Repsitory [entity=" + entity + "]";
	}
	
	//Alt + Shift > S > generate toString
	
	
	
	
	

}
