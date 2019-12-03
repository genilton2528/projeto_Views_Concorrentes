/*
 * Essa Classe foi criada para validar e controlar os dados
 */
package user_interface;

import javax.swing.JOptionPane;

public class Convert {

    public static int converteInt(String s) {
        s = s.trim();
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo, desconsidere esse teste", "Error", 0);
        }
        return 0;
    }
}
