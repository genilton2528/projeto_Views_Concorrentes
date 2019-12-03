package user_interface;

import java.util.concurrent.Semaphore;

public class Panel extends javax.swing.JFrame {

    public Panel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel_Thread = new javax.swing.JPanel();
        view_Thread_value = new javax.swing.JLabel();
        view_Thread_Label = new javax.swing.JLabel();
        like_Thread_Label = new javax.swing.JLabel();
        like_Thread_value = new javax.swing.JLabel();
        dislike_Thread_value = new javax.swing.JLabel();
        dislike_Thread_Label = new javax.swing.JLabel();
        Button_Thread_Start = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sleep_Thread_time = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Panel_Sequential = new javax.swing.JPanel();
        view_Label = new javax.swing.JLabel();
        like_Label = new javax.swing.JLabel();
        dislike_Label = new javax.swing.JLabel();
        Button_Start = new javax.swing.JButton();
        sleep_time = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        view_value = new javax.swing.JLabel();
        like_value = new javax.swing.JLabel();
        dislike_value = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        view_Thread_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view_Thread_value.setText("00");

        view_Thread_Label.setText("Views");

        like_Thread_Label.setText("Likes");

        like_Thread_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        like_Thread_value.setText("00");

        dislike_Thread_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dislike_Thread_value.setText("00");

        dislike_Thread_Label.setText("Dislikes");

        Button_Thread_Start.setText("Start");
        Button_Thread_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Thread_StartActionPerformed(evt);
            }
        });

        jLabel2.setText("Tempo entre atualizaçoes:");

        sleep_Thread_time.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        sleep_Thread_time.setText("2");

        jLabel4.setText("ms");

        javax.swing.GroupLayout Panel_ThreadLayout = new javax.swing.GroupLayout(Panel_Thread);
        Panel_Thread.setLayout(Panel_ThreadLayout);
        Panel_ThreadLayout.setHorizontalGroup(
            Panel_ThreadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ThreadLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Panel_ThreadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ThreadLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sleep_Thread_time, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(Panel_ThreadLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(view_Thread_Label)
                        .addGap(97, 97, 97)
                        .addComponent(like_Thread_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dislike_Thread_Label)
                        .addGap(78, 78, 78))
                    .addGroup(Panel_ThreadLayout.createSequentialGroup()
                        .addGroup(Panel_ThreadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_ThreadLayout.createSequentialGroup()
                                .addComponent(view_Thread_value, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(like_Thread_value, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(dislike_Thread_value, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_ThreadLayout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(Button_Thread_Start)))
                        .addContainerGap(60, Short.MAX_VALUE))))
        );
        Panel_ThreadLayout.setVerticalGroup(
            Panel_ThreadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ThreadLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(Panel_ThreadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view_Thread_value, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(like_Thread_value, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dislike_Thread_value, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel_ThreadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(like_Thread_Label)
                    .addComponent(dislike_Thread_Label)
                    .addComponent(view_Thread_Label))
                .addGap(44, 44, 44)
                .addComponent(Button_Thread_Start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(Panel_ThreadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sleep_Thread_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Concorrente", Panel_Thread);

        view_Label.setText("Views");

        like_Label.setText("Likes");

        dislike_Label.setText("Dislikes");

        Button_Start.setText("Start");
        Button_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_StartActionPerformed(evt);
            }
        });

        sleep_time.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        sleep_time.setText("2");

        jLabel1.setText("Tempo entre atualizaçoes:");

        view_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view_value.setText("00");

        like_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        like_value.setText("00");

        dislike_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dislike_value.setText("00");

        jLabel3.setText("ms");

        javax.swing.GroupLayout Panel_SequentialLayout = new javax.swing.GroupLayout(Panel_Sequential);
        Panel_Sequential.setLayout(Panel_SequentialLayout);
        Panel_SequentialLayout.setHorizontalGroup(
            Panel_SequentialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SequentialLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Panel_SequentialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_SequentialLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(Panel_SequentialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_SequentialLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(Button_Start)
                                .addContainerGap(200, Short.MAX_VALUE))
                            .addGroup(Panel_SequentialLayout.createSequentialGroup()
                                .addGroup(Panel_SequentialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Panel_SequentialLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(2, 2, 2)
                                        .addComponent(sleep_time, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))
                                    .addGroup(Panel_SequentialLayout.createSequentialGroup()
                                        .addComponent(view_Label)
                                        .addGap(97, 97, 97)
                                        .addComponent(like_Label)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(Panel_SequentialLayout.createSequentialGroup()
                        .addComponent(view_value, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(like_value, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Panel_SequentialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_SequentialLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(dislike_Label))
                            .addGroup(Panel_SequentialLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(dislike_value, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        Panel_SequentialLayout.setVerticalGroup(
            Panel_SequentialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_SequentialLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(Panel_SequentialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view_value, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(like_value, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dislike_value, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel_SequentialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(like_Label)
                    .addComponent(dislike_Label)
                    .addComponent(view_Label))
                .addGap(44, 44, 44)
                .addComponent(Button_Start)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(Panel_SequentialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sleep_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sequencial", Panel_Sequential);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_StartActionPerformed
        Panel.view_value.setText("00");
        Panel.like_value.setText("00");
        Panel.dislike_value.setText("00");
        Thread thread = new Thread(new UpdateValue(Convert.converteInt(this.sleep_time.getText()), 0, 999, 2));
        thread.start();
    }//GEN-LAST:event_Button_StartActionPerformed

    private void Button_Thread_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Thread_StartActionPerformed
        Panel.view_Thread_value.setText("00");
        Panel.like_Thread_value.setText("00");
        Panel.dislike_Thread_value.setText("00");
        Thread[] threads = new Thread[10];
        int fist = 0;
        int last = 99;
        int step = 100;

        //Inicio
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new UpdateValue(Convert.converteInt(this.sleep_Thread_time.getText()), fist, last, 1));
            threads[i].start();
            fist = last + 1;
            last += step;
        }
    }//GEN-LAST:event_Button_Thread_StartActionPerformed
    
    public static void main(String args[]) {        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Panel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Start;
    private javax.swing.JButton Button_Thread_Start;
    private javax.swing.JPanel Panel_Sequential;
    private javax.swing.JPanel Panel_Thread;
    private javax.swing.JLabel dislike_Label;
    private javax.swing.JLabel dislike_Thread_Label;
    public static javax.swing.JLabel dislike_Thread_value;
    public static javax.swing.JLabel dislike_value;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel like_Label;
    private javax.swing.JLabel like_Thread_Label;
    public static javax.swing.JLabel like_Thread_value;
    public static javax.swing.JLabel like_value;
    private javax.swing.JTextField sleep_Thread_time;
    private javax.swing.JTextField sleep_time;
    private javax.swing.JLabel view_Label;
    private javax.swing.JLabel view_Thread_Label;
    public static javax.swing.JLabel view_Thread_value;
    public static javax.swing.JLabel view_value;
    // End of variables declaration//GEN-END:variables
}
