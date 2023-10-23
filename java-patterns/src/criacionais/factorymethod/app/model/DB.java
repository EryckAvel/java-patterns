package criacionais.factorymethod.app.model;

public interface DB {
	void query(String sql);
	void update(String sql);
}
