package user_interface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UpdateValue implements Runnable {
        
    private final long sleep;
    private final String path;
    private final int fist;
    private final int last;
    private final int type;
    private static final Semaphore semaphore = new Semaphore(1);

    public UpdateValue(long sleep, int fist, int last, int type) {
        this.fist = fist;
        this.last = last;
        this.sleep = sleep;
        this.path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "io_data" + File.separator;
        this.type = type;
    }

    public void refresh(int view, int like, int dislike) {
        int newValue;
        switch (this.type) {
            case 1:
                newValue = Convert.converteInt(Panel.view_Thread_value.getText()) + view;
                Panel.view_Thread_value.setText(newValue + "");
                Panel.view_Thread_value.repaint();

                newValue = Convert.converteInt(Panel.like_Thread_value.getText()) + like;
                Panel.like_Thread_value.setText(newValue + "");
                Panel.like_Thread_value.repaint();

                newValue = Convert.converteInt(Panel.dislike_Thread_value.getText()) + dislike;
                Panel.dislike_Thread_value.setText(newValue + "");
                Panel.dislike_Thread_value.repaint();

                System.out.println(Panel.view_Thread_value.getText());
//                System.out.println(view + ", " + like + ", " + dislike);

                break;
                
            case 2:
                newValue = Convert.converteInt(Panel.view_value.getText()) + view;
                Panel.view_value.setText(newValue + "");
                Panel.view_value.repaint();

                newValue = Convert.converteInt(Panel.like_value.getText()) + like;
                Panel.like_value.setText(newValue + "");
                Panel.like_value.repaint();

                newValue = Convert.converteInt(Panel.dislike_value.getText()) + dislike;
                Panel.dislike_value.setText(newValue + "");
                Panel.dislike_value.repaint();

//                System.out.println(view + ", " + like + ", " + dislike);

                break;
        }
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
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
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
                    try {
                        UpdateValue.semaphore.acquire();
                        this.refresh(
                                Convert.converteInt(valuesUp[0]),
                                Convert.converteInt(valuesUp[1]),
                                Convert.converteInt(valuesUp[2]));
                        
                        this.refresh(
                                Convert.converteInt(valuesDec[0]) * (-1),
                                Convert.converteInt(valuesDec[1]) * (-1),
                                Convert.converteInt(valuesDec[2]) * (-1));
                    } catch (InterruptedException ex) {
                        Logger.getLogger(UpdateValue.class.getName()).log(Level.SEVERE, null, ex);
                    }finally{
                        UpdateValue.semaphore.release();
                    }
                }

                try {
                    Thread.sleep(this.sleep);
                } catch (InterruptedException ex) {
                    Logger.getLogger(UpdateValue.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

//    public void run() {
//        try {
//            FileReader fileUpdate   = new FileReader(path + "atualizarValores.txt");
//            FileReader fileDecrease = new FileReader(path + "diminuirValores.txt");
//            BufferedReader readUp  = new BufferedReader(fileUpdate);
//            BufferedReader readDec = new BufferedReader(fileDecrease);
//
//            String lineUp  = readUp.readLine();
//            String lineDec = readDec.readLine();
//
//            while (lineUp != null && lineDec != null) {
//
//                String[] values = lineUp.split(" ");
//
//                if (values.length == 3) {
//                    this.refresh( Convert.converteInt(values[0]),
//                                  Convert.converteInt(values[1]),
//                                  Convert.converteInt(values[2]));
//                }
//
//                values = lineDec.split(" ");
//
//                if (values.length == 3) {
//                    this.refresh( Convert.converteInt(values[0])*(-1),
//                                  Convert.converteInt(values[1])*(-1),
//                                  Convert.converteInt(values[2])*(-1) );
//                }
//
//                lineUp  = readUp.readLine();
//                lineDec = readDec.readLine();
//                Thread.sleep(this.sleep);
//            }
//
//            fileUpdate.close();
//            fileDecrease.close();
//        } catch (IOException e) {
//            System.err.printf("Erro na abertura do arquivo: %s.\n",
//                    e.getMessage());
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
