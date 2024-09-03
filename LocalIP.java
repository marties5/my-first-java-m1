import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalIP {
    public static String localIp(String[] argrs) {
        try {
            InetAddress localIp = InetAddress.getLocalHost();
            return localIp.getHostAddress();
        } catch (UnknownHostException e) {
            System.out.println("Error get Local Ip");
            e.printStackTrace();
            return null;
        }
    }
}