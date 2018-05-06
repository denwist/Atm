package writers;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Запись клиентов (объектов) в файл
 * Denis
 * 25.03.2018
 */
public class ClientFileWriter implements IFileWriter {
    @Override
    public void write(ArrayList<Object> objects, String file) {

        try {
            ObjectOutputStream out;
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            for (Object object : objects) {
                out.writeObject(object);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
