package client;

import client.threads.ClientThread;
import server.database.User;

import java.io.IOException;
import java.net.Socket;

/**
 * Classe qui initialise la connection avec le serveur et lance les threads de lecture et d'écriture
 */
public class ChatClient {
    private String ip;
    private int port;
    private User user;
    private ClientThread clientThread;
    public boolean connected = false;

    public ChatClient(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void connect(){
        try{
            // Créer la connexion
            Socket socket = new Socket(ip, port);
            this.connected = true;
            clientThread= new ClientThread(socket, this);
            clientThread.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ClientThread getClientThread() {
        return clientThread;
    }
}
