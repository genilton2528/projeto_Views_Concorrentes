package user_interface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UpdateValue implements Runnable {
    private final long sleep;
    private final String path;

    public UpdateValue(long sleep) {
        this.sleep = sleep;
        this.path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "io_data" + File.separator;

    }

    public void refresh(int view, int like, int dislike) throws InterruptedException {
        int newValue = Convert.converteInt(Panel.view_value.getText()) + view;
        Panel.view_value.setText(newValue + "");
        Panel.view_value.repaint();

        newValue = Convert.converteInt(Panel.like_value.getText()) + like;
        Panel.like_value.setText(newValue + "");
        Panel.like_value.repaint();

        newValue = Convert.converteInt(Panel.dislike_value.getText()) + dislike;
        Panel.dislike_value.setText(newValue + "");
        Panel.dislike_value.repaint();

        Thread.sleep(this.sleep);
        System.out.println(view + ", " + like + ", " + dislike);
    }

    @Override
    public void run() {
        try {
            FileReader file = new FileReader(path + "atualizarValores.txt");
            BufferedReader readFile = new BufferedReader(file);

            String line = readFile.readLine();

            while (line != null) {

                String[] values = line.split(" ");

                if (values.length == 3) {
                    this.refresh(Convert.converteInt(values[0]),
                            Convert.converteInt(values[1]),
                            Convert.converteInt(values[2]));
                }

                line = readFile.readLine();
            }

            file.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        } catch (InterruptedException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
