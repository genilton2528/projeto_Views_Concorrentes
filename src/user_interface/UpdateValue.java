package user_interface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class UpdateValue implements Runnable {
        
    private final long sleep;
    private final String path;
    private final int fist;
    private final int last;
    private final int type;

    public UpdateValue(long sleep, int fist, int last, int type) {
        this.fist = fist;
        this.last = last;
        this.sleep = sleep;
        this.path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "io_data" + File.separator;
        this.type = type;
    }
    
    public String[] linesToString(String file) {
        String[] lines = new String[1000];
        try {
            FileReader fileRead = new FileReader(path + file);
            BufferedReader read = new BufferedReader(fileRead);

            String line = read.readLine();

            int i = 0;
            while (line != null) {

                lines[i] = line;

                line = read.readLine();
                i++;
            }

            fileRead.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo: " + e.getMessage(), "Error", 0);
        }
        return lines;
    }

    @Override
    public void run() {
        String[] linesUp = this.linesToString("atualizarValores.txt");
        String[] linesDec = this.linesToString("diminuirValores.txt");

        if (linesUp.length == 1000 && linesDec.length == 1000) {
            for (int i = this.fist; i <= this.last; i++) {
                String[] valuesUp = linesUp[i].split(" ");
                String[] valuesDec = linesDec[i].split(" ");

                if (valuesUp.length == 3 && valuesDec.length == 3) {
                    Panel.refresh(
                            Convert.converteInt(valuesUp[0]),
                            Convert.converteInt(valuesUp[1]),
                            Convert.converteInt(valuesUp[2]),
                            this.type
                    );
                    Panel.refresh(
                            Convert.converteInt(valuesDec[0]) * (-1),
                            Convert.converteInt(valuesDec[1]) * (-1),
                            Convert.converteInt(valuesDec[2]) * (-1),
                            this.type
                    );
                }

                try {
                    Thread.sleep(this.sleep);
                } catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Error", 0);
                }
            }
        }
    }
}
