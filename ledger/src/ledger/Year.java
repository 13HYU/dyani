package ledger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Year extends JFrame {
   
   public void showMemo(){
       main1Frame.setVisible(false); // �׽�Ʈ������ ����
    }      
   
   JFrame main1Frame;
   
   JPanel ratePanel;
   JTextArea rateArea;
   JScrollPane rateAreaSP;
   JPanel rateSubPanel;
   JButton detailBut; 
   JButton testBut;
   final String title = "�޸� �޷� ver 1.0";
   
   public static void main(String[] args){
      SwingUtilities.invokeLater(new Runnable(){
         public void run(){
            new MemoCalendar();
         } 
      });
   }
   
   public Year(){
      main1Frame = new JFrame(title);
      main1Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      main1Frame.setSize(500,500);
      main1Frame.setLocationRelativeTo(null);
      main1Frame.setResizable(false);
      
      ratePanel=new JPanel();
        ratePanel.setBorder(BorderFactory.createTitledBorder("�ϳ⳻��"));
        rateArea = new JTextArea();
        rateArea.setLineWrap(true);
        rateArea.setWrapStyleWord(true);
        rateAreaSP = new JScrollPane(rateArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        rateSubPanel=new JPanel();
        testBut = new JButton("�׽�Ʈ");
        detailBut = new JButton("main page�� ���ư���");
        detailBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMemo();
            }
        });
        rateSubPanel.add(detailBut);
        rateSubPanel.add(testBut);
        ratePanel.setLayout(new BorderLayout());
        ratePanel.add(rateAreaSP,BorderLayout.CENTER);
        ratePanel.add(rateSubPanel,BorderLayout.SOUTH);
        
        JPanel frameSubPanelEast = new JPanel();
        frameSubPanelEast.setLayout(new BorderLayout());
        frameSubPanelEast.add(ratePanel,BorderLayout.CENTER);
        
      main1Frame.setLayout(new BorderLayout());
      main1Frame.add(frameSubPanelEast, BorderLayout.CENTER);
      main1Frame.setVisible(true);
   }
}
    