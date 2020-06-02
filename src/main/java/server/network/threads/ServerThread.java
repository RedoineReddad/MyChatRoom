package server.network.threads;

import server.database.User;
import server.network.ChatServer;

import java.io.*;
import java.net.Socket;

public class ServerThread extends Thread{
    private Socket socket;
    private ChatServer server;
    private PrintWriter writer;
    private BufferedReader reader;


    /**
     * Constructeur
     * @param socket Socket d'écoute du thread
     * @param server Serveur de chat
     */
    public ServerThread(Socket socket, ChatServer server) {
        this.socket = socket;
        this.server = server;
    }

    public void run() {
        try{
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(input));
            writer = new PrintWriter(output, true);
            // Affiche les utilisateurs déjà connectés au serveur
            displayConnectedUsers();
            // TODO récuperer le User correspondant à ce thread
            server.addUser((User)input.readObject());

            String serverMessage = "New user connected";
            server.broadcast(serverMessage);
            String clientMessage;

            do {
                clientMessage = reader.readLine();

            }while(!clientMessage.equals("off")); // TODO envoyer le message "off" lors de la déconnexion

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Affiche la liste des utilisateurs connectés
     */
    private void  displayConnectedUsers() {
        if (server.hasUsers()) {
            // TODO afficher (append) dans la zone de chat dans la zone de chat la liste des utilisateurs
            writer.println("Connected users: " + server.getUsers().toString());
        } else {
            // TODO afficher (append) sur la zone de chat qu'aucun utilisateur n'est connecté
            writer.println("No other users connected");
        }
    }

    /**
     * Envoie un message au client.
     * @param message envoyé au serveur
     */
    public void sendMessage(String message) {
        writer.println(message);
    }
}
