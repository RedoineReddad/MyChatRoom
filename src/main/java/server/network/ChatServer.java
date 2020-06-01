package server.network;

import server.database.User;
import server.network.threads.ServerThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer {
    private boolean chatOn;
    private ServerSocket serverSocket;
    private Set<ServerThread> serverThreads = new HashSet<>();
    private Set<User> users = new HashSet<>(); // TODO gérer les users, verifier la transmission des messages

    public Set<User> getUsers() {
        return users;
    }

    public void connect(){
        try {
            serverSocket = new ServerSocket(6666);
            System.out.println("Server waiting for user to connect...");
            chatOn = true; // TODO mettre la variable à false lors de la clôture du serveur
            while(chatOn){
                Socket socket = serverSocket.accept();

                // Each time a new connection is made, start a new thread to handle it
                ServerThread serverThread = new ServerThread(socket, this);
                serverThreads.add(serverThread);
                serverThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (serverSocket != null && !serverSocket.isClosed()){
                try {
                    serverSocket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    /**
     * @return True si le serveur a des utilisateurs connéctés
     */
    public boolean hasUsers(){
        return !users.isEmpty();
    }

    /**
     * Ajoute un nouvel utilisateur à la liste des utilisateurs connéctés
     * @param user : utilisateur à ajouter
     */
    public void addUser(User user){
        users.add(user);
    }

    /**
     * Envoi un message à tous les autres utilisateurs
     * @param message à envoyé
     */
    public void broadcast(String message){
        // Envoi le message à chaque utilisateur via leur thread respectif
        for (ServerThread currentThread : serverThreads) {
                currentThread.sendMessage(message);
        }
    }
}
