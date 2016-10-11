package jardebugger.window;

import java.awt.event.*;
import java.io.*;
import java.nio.channels.FileChannel;
import javax.swing.*;
import javax.swing.text.*;

public final class MainWindow extends javax.swing.JFrame {

	String runJarDirectory = "";
	String newFileDirectory = "";
	String oldFileDirectory = "";

	String runFileName = "";
	String newFileName = "";
	String oldFileName = "";

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

		addingFocus(arg0TextField, "Args 1");
		addingFocus(arg1TextField, "Args 2");
		addingFocus(arg2TextField, "Args 3");
		addingFocus(arg3TextField, "Cmd 1");
		addingFocus(arg4TextField, "Cmd 2");

		DefaultCaret caret = (DefaultCaret) console.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
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
        selectNewButton = new javax.swing.JButton();
        selectOldButton = new javax.swing.JButton();
        newDirDisplay = new javax.swing.JTextField();
        oldDirDisplay = new javax.swing.JTextField();
        libsCheckBox = new javax.swing.JCheckBox();
        switchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        killJVM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jar Debugger ");

        console.setEditable(false);
        console.setBackground(new java.awt.Color(51, 51, 51));
        console.setColumns(20);
        console.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        console.setForeground(new java.awt.Color(102, 255, 102));
        console.setLineWrap(true);
        console.setRows(5);
        jScrollPane2.setViewportView(console);

        browserButton.setText("Browse");
        browserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browserButtonActionPerformed(evt);
            }
        });
        browserButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                browserButtonKeyPressed(evt);
            }
        });

        dirDisplay.setEditable(false);
        dirDisplay.setText("Running JAR Directory");

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        arg0TextField.setText("Args 1");

        arg1TextField.setText("Args 2");

        arg2TextField.setText("Args 3");

        arg3TextField.setText("Cmd 1");

        arg4TextField.setText("Cmd 2");

        selectNewButton.setText("From");
        selectNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNewButtonActionPerformed(evt);
            }
        });

        selectOldButton.setText("To");
        selectOldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectOldButtonActionPerformed(evt);
            }
        });

        newDirDisplay.setEditable(false);
        newDirDisplay.setText("New JAR Location");

        oldDirDisplay.setEditable(false);
        oldDirDisplay.setText("Old JAR Location");

        libsCheckBox.setText("  lib");

        switchButton.setText("Switch");
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        killJVM.setText("Kill JVM");
        killJVM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                killJVMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(runButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(browserButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dirDisplay)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(arg0TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(arg1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(arg2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(arg3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(arg4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newDirDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oldDirDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectNewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectOldButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(switchButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(libsCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(killJVM)))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1301, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(browserButton)
                                .addComponent(dirDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(selectNewButton)
                                .addComponent(newDirDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(runButton)
                                .addComponent(arg0TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(arg1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(arg2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(arg3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(arg4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(selectOldButton)
                                .addComponent(oldDirDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(killJVM)
                                .addComponent(libsCheckBox))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(clearButton)
                            .addGap(2, 2, 2)))
                    .addComponent(switchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
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
				runJarDirectory = file.getParent();
				runFileName = file.getName();
				break;
		}
    }//GEN-LAST:event_browserButtonActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
		new Thread(() -> {
			exec(console);
		}).start();
    }//GEN-LAST:event_runButtonActionPerformed

    private void selectNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNewButtonActionPerformed

		JFileChooser fileChooser = new JFileChooser();

		fileChooser.setMultiSelectionEnabled(false);
		switch (fileChooser.showOpenDialog(this)) {
			case JFileChooser.APPROVE_OPTION:
				File file = fileChooser.getSelectedFile();
				newDirDisplay.setText(file.getPath());
				newFileDirectory = file.getParent();
				newFileName = file.getName();
				break;
		}
    }//GEN-LAST:event_selectNewButtonActionPerformed

    private void selectOldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectOldButtonActionPerformed
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fileChooser.setMultiSelectionEnabled(false);
		switch (fileChooser.showOpenDialog(this)) {
			case JFileChooser.APPROVE_OPTION:
				oldDirDisplay.setText(fileChooser.getSelectedFile().getPath());
				oldFileDirectory = fileChooser.getSelectedFile().getPath();
				break;
		}
    }//GEN-LAST:event_selectOldButtonActionPerformed

    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed
		switchFiles();
    }//GEN-LAST:event_switchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
		console.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void killJVMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_killJVMActionPerformed
		System.exit(0);
    }//GEN-LAST:event_killJVMActionPerformed

    private void browserButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_browserButtonKeyPressed
		if (evt.getKeyCode() == KeyEvent.VK_E) {
			runButtonActionPerformed(null);
		}
    }//GEN-LAST:event_browserButtonKeyPressed

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
		String endCommand = " & java -jar " + runFileName;

		try {
			ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "cd " + runJarDirectory + endCommand);
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

	public void switchFiles() {
		if (!oldFileDirectory.equals("") && !newFileDirectory.equals("")) {
			deleteExistingFiles();
			copyFile(new File(newFileDirectory + "\\" + newFileName), new File(oldFileDirectory + "\\" + newFileName));
			if (libsCheckBox.isSelected())
				copyFolder(new File(newFileDirectory + "\\lib"), new File(oldFileDirectory + "\\lib"));
		} else {
			System.out.println("Select directories first!");
		}
	}

	private void copyFolder(File path, File dest) {
		File[] files = path.listFiles();
		for (File file : files) {
			if (!file.isDirectory()) {
				copyFile(file, new File(dest.getParent() + "\\lib\\" + file.getName()));
			}
		}
	}

	private void copyFile(File source, File dest) {
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new FileInputStream(source);
			output = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int bytesRead;
			while ((bytesRead = input.read(buf)) > 0) {
				output.write(buf, 0, bytesRead);
			}
			input.close();
			output.close();
		} catch (FileNotFoundException ex) {
			System.out.println("f nt fnd");
		} catch (IOException e) {
		}

	}

	private void deleteExistingFiles() {

		File[] oldFiles = {new File(oldFileDirectory + "\\" + newFileName), new File(oldFileDirectory + "\\lib")};

		if (oldFiles[0].exists()) {
			oldFiles[0].delete();
		}
		if (libsCheckBox.isSelected() && oldFiles[1].exists()) {
			deleteDirectory(oldFiles[1]);
			oldFiles[1].mkdir();
		} else if (libsCheckBox.isSelected())
			oldFiles[1].mkdir();
	}

	static public boolean deleteDirectory(File path) {
		File[] files = path.listFiles();
		for (File file : files) {
			if (file.isDirectory())
				deleteDirectory(file);
			else
				file.delete();
		}
		return (path.delete());
	}

	public void addingFocus(JTextField field, String name) {
		field.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				field.setText("");
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (field.getText().equals("")) {
					field.setText(name);
				}
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arg0TextField;
    private javax.swing.JTextField arg1TextField;
    private javax.swing.JTextField arg2TextField;
    private javax.swing.JTextField arg3TextField;
    private javax.swing.JTextField arg4TextField;
    private javax.swing.JButton browserButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextArea console;
    private javax.swing.JTextField dirDisplay;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton killJVM;
    private javax.swing.JCheckBox libsCheckBox;
    private javax.swing.JTextField newDirDisplay;
    private javax.swing.JTextField oldDirDisplay;
    private javax.swing.JButton runButton;
    private javax.swing.JButton selectNewButton;
    private javax.swing.JButton selectOldButton;
    private javax.swing.JButton switchButton;
    // End of variables declaration//GEN-END:variables
}
