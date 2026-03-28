package my.app;

public class Service {
	
	private Repository respository;

	public Service() {
		super();
	}

	public Repository getRepository() {
		return respository;
	}

	public void setRepository(Repository respository) {
		this.respository = respository;
	}

	@Override
	public String toString() {
		return "Service [repo=" + respository + "]";
	}
	
	

}
