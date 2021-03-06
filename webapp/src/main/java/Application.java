
import java.io.IOException;

/**
 * HAProxy - Load Balancing in Practice
 */
public class Application {

    // to start the server
    //java -jar target/webapp-1.0-SNAPSHOT-jar-with-dependencies.jar 9001 server1
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("java -jar (jar name) PORT_NUMBER SERVER_NAME");
        }
        int currentServerPort = Integer.parseInt(args[0]);
        String serverName = args[1];

        WebServer webServer = new WebServer(currentServerPort, serverName);

        webServer.startServer();
    }

}
