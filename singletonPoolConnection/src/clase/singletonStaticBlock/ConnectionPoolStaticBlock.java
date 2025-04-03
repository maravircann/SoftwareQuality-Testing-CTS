package clase.singletonStaticBlock;

import clase.DatabaseConnection;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolStaticBlock {
    private List<DatabaseConnection> availableConnections;
    private List<DatabaseConnection> usedConnections;
    private static final int MAX_CONNECTIONS= 3;

    private static ConnectionPoolStaticBlock instance;

    public ConnectionPoolStaticBlock() {
        this.usedConnections = new ArrayList<>();
        this.availableConnections = new ArrayList<>();
        for(int i=0;i<MAX_CONNECTIONS;i++){
            availableConnections.add(new DatabaseConnection(i));
        }
    }


    static{
        try {
            instance=new ConnectionPoolStaticBlock();
            System.out.println("Instance ready!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ConnectionPoolStaticBlock getInstance(){
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

    public void releaseConnection(DatabaseConnection conn){
        if(usedConnections.remove(conn)){
            availableConnections.add(conn);
            System.out.println(conn + " has been released.");
        }
    }

    public void showStatus(){
        System.out.println("Available: "+availableConnections);
        System.out.println("Used: "+usedConnections);
    }


}
