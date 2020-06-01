package client.threads;

import client.ChatClient;

import java.io.*;
import java.net.Socket;
/**
*   Thread pour permettre la réception de messages depuis le serveur dans n'importe quelle condition (non bloquée par l'envoi d'un message)
 */
public class ClientThread extends Thread{
    private BufferedReader reader;
    private PrintWriter writer;
    private Socket socket;
    private ChatClient chatClient;

    public ClientThread(Socket socket, ChatClient client) {
        this.socket = socket;
        this.chatClient = client;

        try{
            ObjectInputStream input = new ObjectInputStream(this.socket.getInputStream());
            ObjectOutputStream output = new ObjectOutputStream(this.socket.getOutputStream());
            this.writer = new PrintWriter(output, true);
            this.reader = new BufferedReader(new InputStreamReader(input));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Methode appelée lors du lancement du thread : attends
     */
    public void run(){

        while (chatClient.connected){
            try {
                String response = reader.readLine();
                // TODO écrire la réponse dans la zone de chat
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Envoi un message au serveur
     * @param message contenu
     */
    public void sendMessage(String message){
        writer.println(message);
    }
}
