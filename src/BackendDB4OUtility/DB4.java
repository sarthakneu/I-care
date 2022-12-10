/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendDB4OUtility;

import OperatingSystems.SystemConfig;
import OperatingSystems.Operatesys;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.nio.file.Paths;

/**
 *
 * @author asus
 */
public class DB4 {
    
    private static final String FILENAME = Paths.get("databasev.db4o").toAbsolutePath().toString();
    private static DB4 dB4OUtil;
    
    public synchronized static DB4 getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }
    
    private ObjectContainer createConnection() {
        try {

            ObjectContainer db = Db4oEmbedded.openFile(FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }


    public synchronized void storeSystem(Operatesys system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public Operatesys retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<Operatesys> systems = conn.query(Operatesys.class); // Change to the object you want to save
        Operatesys system;
        if (systems.size() == 0){
            system = SystemConfig.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
