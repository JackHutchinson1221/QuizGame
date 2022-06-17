/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jahut9646
 */
public class Quiz_Game extends javax.swing.JFrame {
    
    String p1;
    String p2;
    String button;
    double RNT;
    double quest = 0;
    int during = 0;
    int numofplay = 0;
    int turn;
    int playtwo;
    int playone;
    int p1num;
    int p2num;
    int p1score;
    int p2score;
    public void question(double q){
        if (q == 1){
        Question_lbl.setText("Question: What's the 100 digit of PI.");
        A_lbl.setText("A: 9");
        B_lbl.setText("B: 7");
        C_lbl.setText("C: 3");
        D_lbl.setText("D: 1");
        during = 1;       
        }
        else if (q == 2){
            during = 1;
        Question_lbl.setText("Question: What animal dosn't lay eggs.");
        A_lbl.setText("A: Fish");
        B_lbl.setText("B: Mammal");
        C_lbl.setText("C: Bird");
        D_lbl.setText("D: Reptile");        
        }
        else if (q == 3){
            during = 1;
        Question_lbl.setText("Question: How many PPI is needed for large prints.");
        A_lbl.setText("A: 180");
        B_lbl.setText("B: 230");
        C_lbl.setText("C: 300");
        D_lbl.setText("D: 455");        
        }
        else if (q == 4){
            during = 1;
        Question_lbl.setText("Question: What's the longest you can go without food.");
        A_lbl.setText("A: 2 weeks");
        B_lbl.setText("B: 1 week");
        C_lbl.setText("C: 15 days");
        D_lbl.setText("D: 21 days");        
        }
        else if (q == 5){
            during = 1;
        Question_lbl.setText("Question: Whats the speed of sound.");
        A_lbl.setText("A: 343 m/s");
        B_lbl.setText("B: 1230 km/h");
        C_lbl.setText("C: 1220 km/h");
        D_lbl.setText("D: 434 m/s");        
        } 
        else if (q == 6){
            during = 1;
        Question_lbl.setText("Question: How long can you go without water.");
        A_lbl.setText("A: 1 week");
        B_lbl.setText("B: 3 days");
        C_lbl.setText("C: 6 days");
        D_lbl.setText("D: 8 days");        
        }
        else if (q == 7){
            during = 1;
        Question_lbl.setText("Question: what's special about a felting needle.");
        A_lbl.setText("A: it's dull on the end");
        B_lbl.setText("B: nothing");
        C_lbl.setText("C: it's spikey");
        D_lbl.setText("D: you don't use a needle");        
        }
        else if (q == 8){
            during = 1;
        Question_lbl.setText("Question: how much is a bitcoin worth.");
        A_lbl.setText("A: 37,124 CAD");
        B_lbl.setText("B: 3,908,203 Yen");
        C_lbl.setText("C: 29,085 USD");
        D_lbl.setText("D: 389,011 DOGE");        
        }
        else if (q == 9){
            during = 1;
        Question_lbl.setText("Question: how much is the white house worth.");
        A_lbl.setText("A: 13698 bitcoin");
        B_lbl.setText("B: 399 mil USD");
        C_lbl.setText("C: 506 mil CAD");
        D_lbl.setText("D: 18,173 mil Ruble");        
        }
        else if (q == 10){
            during = 1;
        Question_lbl.setText("Question: how much is a mail order bride.");
        A_lbl.setText("A: 29000 USD");
        B_lbl.setText("B: 4 mil yen");
        C_lbl.setText("C: 39000 CAD");
        D_lbl.setText("D: 1.05 bitcoin");        
        }
        else if (q == 11){
            during = 1;
        Question_lbl.setText("Question: how much coffee can kill a cat.");
        A_lbl.setText("A: 3.86 fl/pound");
        B_lbl.setText("B: 3.28 fl/pound");
        C_lbl.setText("C: 100 mg/pound");
        D_lbl.setText("D: 50 mg/pound");        
        }
        else if (q == 12){
        during = 1;    
        Question_lbl.setText("Question: what's justin trudeaus 2 middle names.");
        A_lbl.setText("A: William Francis");
        B_lbl.setText("B: William James");
        C_lbl.setText("C: Francis Pierre ");
        D_lbl.setText("D: Pierre James");        
        }
        else{
        during = 1;    
        Question_lbl.setText("Question: what's the net worth of will smith.");
        A_lbl.setText("A: 283 mil Pounds");
        B_lbl.setText("B: 358 mil USD");
        C_lbl.setText("C: 454 mil CAD");
        D_lbl.setText("D: 12063 bitcoin");        
        }
    
    }
    public void guessp1(double q){
        if (q == 1){
            if (p1.equals("a")){
                turn_lbl.setText("P1 Wins!!!");
                
            }
            else{
                turn = 2;
                turn_lbl.setText("Turn: P2");
            }     
        }
        else if (q == 2){
            if (p1num == 2){
                turn_lbl.setText("P1 Wins!!!");
                
            }
        else{
            turn = 2;
                turn_lbl.setText("Turn: P2");
            }      
        }        
        else if (q == 3){
        if (p1num == 3){
        turn_lbl.setText("P1 Wins!!!");
        }
        else{
        turn = 2;
        turn_lbl.setText("Turn: P2");}       
        }
        else if (q == 4){
        if (p1num == 4){
        turn_lbl.setText("P1 Wins!!!");
        }
        else{
        turn = 2;
        turn_lbl.setText("Turn: P2");}        
        }
        else if (q == 5){
        if (p1num == 1){
        turn_lbl.setText("P1 Wins!!!");
        }
        else{
        turn = 2;
        turn_lbl.setText("Turn: P2");}        
        } 
        else if (q == 6){
        if (p1num == 2){
        turn_lbl.setText("P1 Wins!!!");
        }
        else{
        turn = 2;
        turn_lbl.setText("Turn: P2");}        
        }
        else if (q == 7){
        if (p1num == 3){
        turn_lbl.setText("P1 Wins!!!");
        }
        else{
        turn = 2;
        turn_lbl.setText("Turn: P2");}       
        }
        else if (q == 8){
        if (p1num == 4){
        turn_lbl.setText("P1 Wins!!!");
        }
        else{
        turn = 2;
        turn_lbl.setText("Turn: P2");}        
        }
        else if (q == 9){
        if (p1num == 1){
        turn_lbl.setText("P1 Wins!!!");
        }
        else{
        turn = 2;
        turn_lbl.setText("Turn: P2");}        
        }
        else if (q == 10){
        if (p1num == 2){
        turn_lbl.setText("P1 Wins!!!");
        }
        else{
        turn = 2;
        turn_lbl.setText("Turn: P2");}        
        }
        else if (q == 11){
        if (p1num == 3){
        turn_lbl.setText("P1 Wins!!!");
        }
        else{
        turn = 2;
        turn_lbl.setText("Turn: P2");}
        }
        else if (q == 12){
        if (p1num == 4){
        turn_lbl.setText("P1 Wins!!!");
        }
        else{
        turn = 2;
        turn_lbl.setText("Turn: P2");}    
        }
        else{
        if (p1num == 4){
        turn_lbl.setText("P1 Wins!!!");
        }
        else{
        turn = 2;
        turn_lbl.setText("Turn: P2");}
        
        }
        turn = 2;
    }
    public void guessp2(double q){
        if (q == 1){
        if (p2num == 1){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
        turn = 1;
        turn_lbl.setText("Turn: P1");}     
        }
        else if (q == 2){
        if (p2num == 2){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
        turn = 1;
        turn_lbl.setText("Turn: P1");}
        }
        else if (q == 3){
        if (p2num == 3){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
        turn = 1;
        turn_lbl.setText("Turn: P1");}      
        }
        else if (q == 4){
        if (p2num == 4){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
        turn = 1;
        turn_lbl.setText("Turn: P1");}        
        }
        else if (q == 5){
        if (p2num == 1){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
        turn = 1;
        turn_lbl.setText("Turn: P1");}       
        } 
        else if (q == 6){
        if (p2num == 2){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
        turn = 1;
        turn_lbl.setText("Turn: P1");}       
        }
        else if (q == 7){
        if (p2num == 3){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
        turn = 1;
        turn_lbl.setText("Turn: P1");}      
        }
        else if (q == 8){
        if (p2num == 4){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
        turn = 1;
        turn_lbl.setText("Turn: P1");}        
        }
        else if (q == 9){
        if (p2num == 1){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
        turn = 1;
        turn_lbl.setText("Turn: P1");}      
        }
        else if (q == 10){
        if (p2num == 2){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
        turn = 1;
        turn_lbl.setText("Turn: P1");}      
        }
        else if (q == 11){
        if (p2num == 3){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
        turn = 1;
        turn_lbl.setText("Turn: P1");}
        }
        else if (q == 12){
        if (p2num == 4){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
       turn = 1;
        turn_lbl.setText("Turn: P1");}   
        }
        else{
        if (p2num == 4){
        turn_lbl.setText("P2 Wins!!!");
        }
        else{
        turn = 1;
        turn_lbl.setText("Turn: P1");}
        
        }
        turn = 1;
    }
    public void p1g (){
             if (p1.equals("a")){
        p1num = 1;
        }
        else if (p1.equals("b")){
        p1num = 2;
        }
        else if (p1.equals("c")){
        p1num = 3;
        }
        else if (p1.equals("d")){
        p1num = 4;
        }
        P1_txt.setText("");}
    public void p2g (){
        if (p2.equals("a")){
        p2num = 1;
        }
        else if (p2.equals("b")){
        p2num = 2;
        }
        else if (p2.equals("c")){
        p2num = 3;
        }
        else if (p2.equals("d")){
        p2num = 4;
        }
        P2_txt.setText("");}
    public void p2gbot (){
        if (RNT == 1){
        p2.equals("a");}
        else if (RNT == 2){
        p2.equals("b");}
        else if (RNT == 3){
        p2.equals("c");}
        else if (RNT == 4){
        p2.equals("d");}
        }

   
    /**
     * Creates new form Quiz_Game
     */
    public Quiz_Game() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        NumOfppl = new javax.swing.ButtonGroup();
        Title_tlt = new javax.swing.JLabel();
        Question_lbl = new javax.swing.JLabel();
        Start_btb = new javax.swing.JButton();
        A_lbl = new javax.swing.JLabel();
        B_lbl = new javax.swing.JLabel();
        C_lbl = new javax.swing.JLabel();
        D_lbl = new javax.swing.JLabel();
        One_btn = new javax.swing.JRadioButton();
        two_btn = new javax.swing.JRadioButton();
        numplay_tlt = new javax.swing.JLabel();
        P1_tlt = new javax.swing.JLabel();
        P2_tlt = new javax.swing.JLabel();
        P1_txt = new javax.swing.JTextField();
        P2_txt = new javax.swing.JTextField();
        P2Guess_lbl = new javax.swing.JLabel();
        P1Guess_lbl = new javax.swing.JLabel();
        turn_lbl = new javax.swing.JLabel();
        End_btb = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title_tlt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title_tlt.setText("Quiz Game");

        Question_lbl.setText("Question:-------------------------------");

        Start_btb.setText("Start");
        Start_btb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_btbActionPerformed(evt);
            }
        });

        A_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_lbl.setText("A:--");

        B_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_lbl.setText("B:--");

        C_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C_lbl.setText("C:--");

        D_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D_lbl.setText("D:--");

        NumOfppl.add(One_btn);
        One_btn.setText("1");
        One_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                One_btnActionPerformed(evt);
            }
        });

        NumOfppl.add(two_btn);
        two_btn.setText("2");
        two_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_btnActionPerformed(evt);
            }
        });

        numplay_tlt.setText("# of Players");

        P1_tlt.setText("P1");

        P2_tlt.setText("P2");

        P1_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1_txtActionPerformed(evt);
            }
        });

        P2Guess_lbl.setText("guess:  ");

        P1Guess_lbl.setText("guess:  ");

        turn_lbl.setText("Turn: --");

        End_btb.setText("End");
        End_btb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                End_btbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Question_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title_tlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P1_tlt)
                                    .addComponent(P2_tlt)
                                    .addComponent(P1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P1Guess_lbl)
                                    .addComponent(P2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P2Guess_lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(A_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(B_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(C_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(D_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(turn_lbl)))
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(numplay_tlt)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(two_btn)
                                                    .addComponent(One_btn)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(End_btb, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Start_btb))
                                        .addGap(165, 165, 165)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title_tlt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question_lbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numplay_tlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P1_tlt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P1_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P1Guess_lbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(One_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(two_btn))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D_lbl)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Start_btb))
                            .addComponent(turn_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(End_btb)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(P2_tlt)
                        .addGap(5, 5, 5)
                        .addComponent(P2_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P2Guess_lbl)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Start_btbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_btbActionPerformed
        // TODO add your handling code here:
        //get random for bot
        RNT = Math.random() * 3 + 1;
        playtwo = (int) RNT;
        RNT = (int) RNT;
        //get random for question
        if (quest == 0){        
            quest = Math.random() * 12;
            quest = (int) quest;}
        //quest = 1;
        //get text for p1
        if (two_btn.isSelected())
            p2num = (int) RNT;
        //get text for p2
        p2 = P2_txt.getText();
        p2 = p2.toLowerCase();
        p1 = P1_txt.getText();
        p1 = p1.toLowerCase();
        
        
        if (during == 0){
            question(quest);
            //turn = (int) Math.random() * 3 + 1;
            
            if (turn == 1 || turn == 3){
                turn_lbl.setText("Turn: P1");
                turn = 1;
            }
                
            else if (turn == 2){
                turn = 2;
                turn_lbl.setText("Turn: P2");
            }
            else{
                turn = 2;
                turn_lbl.setText("Turn: P2");
            }    
        }
        
        //if it's player one tern then get his answer else get players twos answer.
        if (turn  == 1){
            P1Guess_lbl.setText("guess: " + p1);
            P2Guess_lbl.setText("guess: ");
        }
        else if (turn == 2){
            P2Guess_lbl.setText("guess: " + p2);
            P1Guess_lbl.setText("guess: ");
        }
        //check the number of players playing.
        if (One_btn.isSelected()) {
            numofplay = 1;
        }
        else if (two_btn.isSelected()) {
            numofplay = 2;
        }
        //changes start text to guess text
        button = Start_btb.getText();
        if (button == "Start")
            Start_btb.setText("Guess");
        
        
        
        
        
            if (numofplay == 1){
                if (turn == 1){
                    p1g();
                    guessp1(quest);
            }
                else if(turn == 2){
                    p2num = (int) RNT;
                    P2Guess_lbl.setText("guess: " + p2);
                    p2gbot();
                    guessp2(quest);
                }    
            }
        
            else if (numofplay == 2){        
                if (turn == 1){
                    p1g();
                    guessp1(quest);}
                else if(turn == 2){
                    p2g();
                    guessp2(quest);}}
            
        
       
        
        
        
        
        
            
    }//GEN-LAST:event_Start_btbActionPerformed

    private void One_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_One_btnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_One_btnActionPerformed

    private void End_btbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_End_btbActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_End_btbActionPerformed

    private void P1_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1_txtActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_P1_txtActionPerformed

    private void two_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_two_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Quiz_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz_Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz_Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A_lbl;
    private javax.swing.JLabel B_lbl;
    private javax.swing.JLabel C_lbl;
    private javax.swing.JLabel D_lbl;
    private javax.swing.JButton End_btb;
    private javax.swing.ButtonGroup NumOfppl;
    private javax.swing.JRadioButton One_btn;
    private javax.swing.JLabel P1Guess_lbl;
    private javax.swing.JLabel P1_tlt;
    private javax.swing.JTextField P1_txt;
    private javax.swing.JLabel P2Guess_lbl;
    private javax.swing.JLabel P2_tlt;
    private javax.swing.JTextField P2_txt;
    private javax.swing.JLabel Question_lbl;
    private javax.swing.JButton Start_btb;
    private javax.swing.JLabel Title_tlt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel numplay_tlt;
    private javax.swing.JLabel turn_lbl;
    private javax.swing.JRadioButton two_btn;
    // End of variables declaration//GEN-END:variables
}
