package clase;

public class DatabaseConnection {
    private int id;

    public DatabaseConnection(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DatabaseConnection{" +
                "id=" + id +
                '}';
    }

    public void connect() {
        System.out.println("Connecting with DB using connection #" + id);
    }
}
