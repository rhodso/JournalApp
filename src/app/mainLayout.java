package app;

public class mainLayout {

    private javax.swing.JFrame mainFrame;
    private javax.swing.JLabel CurrentDateLabel;
    private javax.swing.JButton FirstButton;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JPanel JournalPanel;
    private javax.swing.JTextArea JournalTextEntry;
    private javax.swing.JButton LastButton;
    private javax.swing.JLabel NavButtonsLabel;
    private javax.swing.JPanel NavPanel;
    private javax.swing.JButton NextButton;
    private javax.swing.JButton PreviousButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JScrollPane jScrollPane1;

    public mainLayout(){
        initComponents();
    }

    private void initComponents() {

        //Vars
        mainFrame = new javax.swing.JFrame();
        HeaderLabel = new javax.swing.JLabel();
        JournalPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JournalTextEntry = new javax.swing.JTextArea();
        CurrentDateLabel = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        NavPanel = new javax.swing.JPanel();
        FirstButton = new javax.swing.JButton();
        PreviousButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        LastButton = new javax.swing.JButton();
        NavButtonsLabel = new javax.swing.JLabel();

        //Main frame
        mainFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setTitle("Journal Application");
        mainFrame.setPreferredSize(new java.awt.Dimension(750, 500));

        //Header label
        HeaderLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        HeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HeaderLabel.setText("Journal Application");
        HeaderLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        //Journal Text entry
        JournalTextEntry.setColumns(20);
        JournalTextEntry.setRows(5);
        jScrollPane1.setViewportView(JournalTextEntry);

        //Date label
        CurrentDateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CurrentDateLabel.setText("Current Entry Date: 99.99.9999");

        //Save button
        SaveButton.setText("Save");
        SaveButton.setToolTipText("");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        //Journal panel
        javax.swing.GroupLayout JournalPanelLayout = new javax.swing.GroupLayout(JournalPanel);
        JournalPanel.setLayout(JournalPanelLayout);
        JournalPanelLayout.setHorizontalGroup(
            JournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JournalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(JournalPanelLayout.createSequentialGroup()
                        .addComponent(CurrentDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveButton)))
                .addContainerGap())
        );
        JournalPanelLayout.setVerticalGroup(
            JournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JournalPanelLayout.createSequentialGroup()
                .addGroup(JournalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurrentDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(SaveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                .addContainerGap())
        );

        //First button
        FirstButton.setText("<<");
        FirstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstButtonActionPerformed(evt);
            }
        });

        //Previous button
        PreviousButton.setText("<");
        PreviousButton.setToolTipText("");
        PreviousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousButtonActionPerformed(evt);
            }
        });

        //Next button
        NextButton.setText(">");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        //Last button
        LastButton.setText(">>");
        LastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastButtonActionPerformed(evt);
            }
        });

        //Nav buttons label
        NavButtonsLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NavButtonsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NavButtonsLabel.setText("Navigation Buttons");

        //Nav panel
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

        //Finish up mainframe
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

        //Pack mainframe
        mainFrame.pack();
    }

    private void FirstButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void PreviousButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void LastButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }
    
    public void setVisibility(Boolean b){
        mainFrame.setVisible(b);
    }
}