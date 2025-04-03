package clase.singletonEager;

import clase.DatabaseConnection;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolEager {
    private List<DatabaseConnection> availableConnections;
    private List<DatabaseConnection> usedConnections;
    private static final int MAX_CONNECTIONS=3;

    private static final ConnectionPoolEager instance= new ConnectionPoolEager();

    public ConnectionPoolEager() {
        this.availableConnections = new ArrayList<>();
        this.usedConnections=new ArrayList<>();
        for (int i=0;i<MAX_CONNECTIONS;i++){
            availableConnections.add(new DatabaseConnection(i));
        }
    }

    public static ConnectionPoolEager getInstance(){
        return instance;
    }

    public DatabaseConnection getConnection(){
        if(!availableConnections.isEmpty()){
            DatabaseConnection conn=availableConnections.remove(0);
            usedConnections.add(conn);
            return conn;
        }else{
            System.out.println("No available connections!");
            return null;
        }
    }

    public void releaseConnection(DatabaseConnection conn) {
        if (usedConnections.remove(conn)) {
            availableConnections.add(conn);
            System.out.println(conn + " has been released.");
        }
    }

    public void showStatus() {
        System.out.println("Available: " + availableConnections);
        System.out.println("Used: " + usedConnections);
    }

}
