package jardebugger.window;

import java.io.*;
import javax.swing.*;
import javax.swing.text.BadLocationException;

public class MainWindow extends javax.swing.JFrame {

    String directory = "";
    String fileName = "";

    static String arg1;
    static String arg2;
    static String arg3;
    static String arg4;
    static String arg5;

    public MainWindow() {
        initComponents();
        setLocationRelativeTo(null);
        redirectConsoleTo(console);

        try {
            console.getDocument().remove(0, console.getDocument().getLength());
        } catch (BadLocationException ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();
        browserButton = new javax.swing.JButton();
        dirDisplay = new javax.swing.JTextField();
        runButton = new javax.swing.JButton();
        arg0TextField = new javax.swing.JTextField();
        arg1TextField = new javax.swing.JTextField();
        arg2TextField = new javax.swing.JTextField();
        arg3TextField = new javax.swing.JTextField();
        arg4TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jar Debugger ");

        console.setBackground(new java.awt.Color(51, 51, 51));
        console.setColumns(20);
        console.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        console.setForeground(new java.awt.Color(0, 255, 0));
        console.setRows(5);
        jScrollPane2.setViewportView(console);

        browserButton.setText("Browse");
        browserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browserButtonActionPerformed(evt);
            }
        });

        dirDisplay.setEditable(false);
        dirDisplay.setText("Select JAR Directory");

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(runButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(browserButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(arg0TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(arg1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(arg2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(arg3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(arg4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dirDisplay))
                        .addGap(0, 541, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browserButton)
                    .addComponent(dirDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(runButton)
                    .addComponent(arg0TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arg1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arg2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arg3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arg4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browserButtonActionPerformed

        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setMultiSelectionEnabled(false);
        switch (fileChooser.showOpenDialog(this)) {

            case JFileChooser.APPROVE_OPTION:
                File file = fileChooser.getSelectedFile();
                dirDisplay.setText(file.getPath());
                directory = file.getParent();
                fileName = file.getName();
        }
    }//GEN-LAST:event_browserButtonActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        exec(console);
    }//GEN-LAST:event_runButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }

        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    public void exec(JTextArea area) {

        String endCommand = " && java -jar " + fileName;
        try {
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd " + directory + endCommand);
            builder.redirectErrorStream(true);
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            String text = "";

            while (true) {
                line = r.readLine();
                if (line == null) {
                    break;
                }
                text = text + line + "\n";
                console.setText(text);
                console.update(console.getGraphics());
            }
        } catch (Exception e) {
        }
    }

    public static void redirectConsoleTo(final JTextArea textarea) {
        PrintStream out = new PrintStream(new ByteArrayOutputStream() {
            @Override
            public synchronized void flush() throws IOException {
                textarea.setText(toString());
            }
        }, true);
        System.setErr(out);
        System.setOut(out);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arg0TextField;
    private javax.swing.JTextField arg1TextField;
    private javax.swing.JTextField arg2TextField;
    private javax.swing.JTextField arg3TextField;
    private javax.swing.JTextField arg4TextField;
    private javax.swing.JButton browserButton;
    private javax.swing.JTextArea console;
    private javax.swing.JTextField dirDisplay;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton runButton;
    // End of variables declaration//GEN-END:variables
}
