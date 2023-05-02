package zakariagrpc.server;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import zakariagrpc.service.GameImpl;

import java.io.IOException;



public class GameServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new GameImpl())
                .build();


        server.start();
        System.out.println("Serveur démarré sur le port " + server.getPort());
        server.awaitTermination();
    }
}
