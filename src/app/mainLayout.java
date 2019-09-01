package app;

import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class mainLayout {

    //UI components
    private JFrame mainFrame;
    private JLabel CurrentDateLabel;
    private JButton FirstButton;
    private JLabel HeaderLabel;
    private JPanel JournalPanel;
    private JTextArea JournalTextEntry;
    private JButton LastButton;
    private JLabel NavButtonsLabel;
    private JPanel NavPanel;
    private JButton NextButton;
    private JButton PreviousButton;
    private JButton SaveButton;
    private JScrollPane jScrollPane1;
    private JButton DatePicker;

    //Vars
    private Calendar workingDate;

    public mainLayout(){
        initComponents();
    }

    private void initComponents() {

        mainFrame = new javax.swing.JFrame();
        HeaderLabel = new javax.swing.JLabel();
        JournalPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JournalTextEntry = new javax.swing.JTextArea();
        CurrentDateLabel = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        DatePicker = new javax.swing.JButton();
        NavPanel = new javax.swing.JPanel();
        FirstButton = new javax.swing.JButton();
        PreviousButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        LastButton = new javax.swing.JButton();
        NavButtonsLabel = new javax.swing.JLabel();

        mainFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setTitle("Journal Application");
        mainFrame.setPreferredSize(new java.awt.Dimension(750, 500));

        HeaderLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HeaderLabel.setText("Journal Application");
        HeaderLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        JournalTextEntry.setColumns(20);
        JournalTextEntry.setRows(5);
        jScrollPane1.setViewportView(JournalTextEntry);

        CurrentDateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CurrentDateLabel.setText("Current Entry Date: 99.99.9999");

        SaveButton.setText("Save");
        SaveButton.setToolTipText("");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        DatePicker.setText("Pick Date");
        DatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatePickerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JournalPanelLayout = new javax.swing.GroupLayout(JournalPanel);
        JournalPanel.setLayout(JournalPanelLayout);
        JournalPanelLayout.setHorizontalGroup(
            JournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JournalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                    .addGroup(JournalPanelLayout.createSequentialGroup()
                        .addComponent(CurrentDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(DatePicker)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveButton)))
                .addContainerGap())
        );
        JournalPanelLayout.setVerticalGroup(
            JournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JournalPanelLayout.createSequentialGroup()
                .addGroup(JournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurrentDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(SaveButton)
                    .addComponent(DatePicker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );

        CurrentDateLabel.getAccessibleContext().setAccessibleName("DateLabel");
        SaveButton.getAccessibleContext().setAccessibleName("SaveButton");

        FirstButton.setText("<<");
        FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstButtonActionPerformed(evt);
            }
        });

        PreviousButton.setText("<");
        PreviousButton.setToolTipText("");
        PreviousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousButtonActionPerformed(evt);
            }
        });

        NextButton.setText(">");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        LastButton.setText(">>");
        LastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastButtonActionPerformed(evt);
            }
        });

        NavButtonsLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NavButtonsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NavButtonsLabel.setText("Navigation Buttons");

        javax.swing.GroupLayout NavPanelLayout = new javax.swing.GroupLayout(NavPanel);
        NavPanel.setLayout(NavPanelLayout);
        NavPanelLayout.setHorizontalGroup(
            NavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavPanelLayout.createSequentialGroup()
                .addComponent(FirstButton)
                .addGap(18, 18, 18)
                .addComponent(PreviousButton)
                .addGap(18, 18, 18)
                .addComponent(NextButton)
                .addGap(18, 18, 18)
                .addComponent(LastButton))
            .addComponent(NavButtonsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NavPanelLayout.setVerticalGroup(
            NavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NavButtonsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LastButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(NextButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PreviousButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FirstButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        FirstButton.getAccessibleContext().setAccessibleName("FirstButton");
        PreviousButton.getAccessibleContext().setAccessibleName("PreviousButton");
        NextButton.getAccessibleContext().setAccessibleName("NextButton");
        LastButton.getAccessibleContext().setAccessibleName("LastButton");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(mainFrame.getContentPane());
        mainFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JournalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NavPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NavPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HeaderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(JournalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        HeaderLabel.getAccessibleContext().setAccessibleName("Jounal Application");
        NavPanel.getAccessibleContext().setAccessibleName("NBavButton_Panel");
        mainFrame.getAccessibleContext().setAccessibleName("JournalApplication");

        SaveButton.setVisible(false);
        DatePicker.setVisible(false);

        mainFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                //Code goes here
                formWindowClosing(e);
                //saveFile(workingDate, JournalTextEntry.getText());
                mainFrame.dispose();
                System.exit(0);
            }
        });

        mainFrame.pack();
        workingDate = Calendar.getInstance();
        updateDateLabel(workingDate);
        getFirstDate();
        updateTextArea(workingDate);
    }                     

    private void FirstButtonActionPerformed(ActionEvent evt) {                                            
        dateControler(-2);
    }                                           
    private void PreviousButtonActionPerformed(ActionEvent evt) {                                               
        dateControler(-1);
    }                                              
    private void NextButtonActionPerformed(ActionEvent evt) {
        dateControler(1);
    }                                          
    private void LastButtonActionPerformed(ActionEvent evt) {                                           
        dateControler(2);
    }                                          
    private void SaveButtonActionPerformed(ActionEvent evt) {                                           
        //Figure this out later
    }
    private void DatePickerActionPerformed(java.awt.event.ActionEvent evt) {                                           
        //Figure this out later
    }
    private void formWindowClosing(WindowEvent e){
        saveFile(workingDate, JournalTextEntry.getText());
    }

    private void dateControler(int condition){
        //Save the current file
        Calendar c = workingDate;
        saveFile(c, JournalTextEntry.getText());
        switch(condition){
            case 1:
                c.add(Calendar.DAY_OF_YEAR, 1);
                if(c.after(Calendar.getInstance())){
                    c.add(Calendar.DAY_OF_YEAR, -1);
                    JOptionPane.showMessageDialog(mainFrame, "Cannot create journal entry for future dates", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 2:
                //Last day in sequence should be today
                c = Calendar.getInstance();
                break;
            case -1:
                c.add(Calendar.DAY_OF_YEAR, -1);
                if(c.before(getFirstDate())){
                    c.add(Calendar.DAY_OF_YEAR, 1);
                    JOptionPane.showMessageDialog(mainFrame, "Cannot create jounrnal entry before first date. \nIf you know what you're doing then you can go ahead \nand fiddle with the file. If it breaks, then just delete the file.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case -2:
                    c = getFirstDate();
                break;
            default:
                //Do nothing
                break;
        }
        workingDate = c;
        updateDateLabel(c);
        updateTextArea(c);
    }

    private Calendar getFirstDate(){
        //Get the current date just in case it fails
        Calendar c = Calendar.getInstance();
        
        //Try to get the date
        String firstEntryDate = getFileContents("OtherFiles/firstDate.txt");
        if(firstEntryDate.equals("!!FILEDOESNOTEXIST!!")){
            File f = new File("OtherFiles/firstDate.txt");
            try {
                f.createNewFile();
                //c.add(Calendar.DAY_OF_YEAR, -1);
                int y, m, d;
                y = c.get(Calendar.YEAR);
                m = c.get(Calendar.MONTH);
                d = c.get(Calendar.DAY_OF_MONTH);
                m++;
                String content = y + " " + m + " " + d;
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                    bw.write(content);
                }

            } catch (IOException e) {
                JOptionPane.showMessageDialog(mainFrame, "An error occured when creating a file", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        else if(firstEntryDate.equals("!!IOEXCEPTION!!")){
            JOptionPane.showMessageDialog(mainFrame, "An error occured when reading from firstDate.txt", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd", Locale.ENGLISH);
            try {
                c.setTime(sdf.parse(firstEntryDate));
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(mainFrame, "An error occured when parsing a date", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return c;
    }

    private void saveFile(Calendar c, String content){
        //Check if the content is null
        if(content == null){
            JOptionPane.showMessageDialog(mainFrame, "Content can't be null", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            //Content is good, get the filepath to save it to
            String fp = "JournalFiles/";
            int y, m, d;
            y = c.get(Calendar.YEAR);
            m = c.get(Calendar.MONTH);
            m++;
            d = c.get(Calendar.DAY_OF_MONTH);
            fp = fp + y + "_" + m + "_" + d + ".txt";

            File f = new File(fp);
            try {
                if(!f.exists()){ //If the file doens't exist, create it
                    f.createNewFile();
                }
                else { //If the file DOES exist, then get rid and create it again so we can replace the content
                    f.delete();
                    f.createNewFile();
                }
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                    bw.write(content);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(mainFrame, "An error occured when saving a file", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }

    private void updateDateLabel(Calendar c){
        String s = "Current entry date: ";
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        month++;
        s = s + " " + year + "/" + month + "/" + day;
        CurrentDateLabel.setText(s);
    }

    private void updateTextArea(Calendar c){
        //Figure out what date the file is
        String fp = "JournalFiles/";
        int y, m, d;
        y = c.get(Calendar.YEAR);
        m = c.get(Calendar.MONTH);
        d = c.get(Calendar.DAY_OF_MONTH);
        m++;
        fp = fp + y + "_" + m + "_" + d + ".txt";
        
        //Go get the content of that file
        String SDateFileContent = getFileContents(fp);
        if(SDateFileContent.equals("!!FILEDOESNOTEXIST!!") || SDateFileContent.equals("!!IOEXCEPTION!!")){
            JOptionPane.showMessageDialog(mainFrame, "An error occured when reading from a file", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            //Set the file contents to the thing we got from getFileContents
            JournalTextEntry.setText(SDateFileContent);
        }
    }

    private String getFileContents(String filepath){
        String contents = "";
        File f = new File(filepath);
        if(!f.exists()){
            return "!!FILEDOESNOTEXIST!!";
        }
        try (FileReader fr = new FileReader(f);
            BufferedReader buffer = new BufferedReader(fr)) {
                String line = "";
                while ((line = buffer.readLine()) != null) {
                    if (line.isEmpty()) {
                        break;
                    }
                    contents = contents + line;
                }                
        }
        catch(IOException ex){
            return "!!IOEXCEPTION!!";
        }
        return contents;
    }

    public void setVisibility(Boolean b){
        mainFrame.setVisible(b);
    }
}