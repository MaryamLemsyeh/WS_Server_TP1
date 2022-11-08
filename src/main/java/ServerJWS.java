import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args){
        /*permet de démarrer un serveur http pour consulter uniquement ce webService*/
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("Web service déployé sur http://0.0.0.0:9191/");
    }
}
