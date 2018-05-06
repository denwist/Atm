package readers;

import bank.Client;

import java.io.*;
import java.util.ArrayList;

/**
 * Чтение клиентов из файла
 * Denis
 * 25.03.2018
 */
public class ClientFileReader implements IFileReader{
    @Override
    public ArrayList read(String file) {
        ArrayList<Client> clients = new ArrayList<>();
        try {
            // Чтение
            Client tmpClient;
            try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
                while ((tmpClient = (Client) in.readObject()) != null) {
                    clients.add(tmpClient);
                }
            } catch (EOFException e) {
                //System.out.println(e.getMessage()); // null
            }

        } catch (IOException | ClassNotFoundException e) {
            //e.printStackTrace();
        }

        return clients;
    }
}
