/*
 * Created by JFormDesigner on Wed Mar 09 16:47:38 CST 2022
 */

package test;

import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class dsd extends JFrame{
    public dsd() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // TODO add your code here
        String x = this.textField1.getText();

        String pattern = "\\d{4}-\\d{8}|\\d{8}";  // 电话号码要求

        boolean isMatch = Pattern.matches(pattern, x);


        if (x==null|| "".equals(x)) {
            JOptionPane.showMessageDialog(null,"电话不能为空！");
            return;
        }
        if (isMatch){
            JOptionPane.showMessageDialog(null,"电话验证合格！");
        }else  {
            JOptionPane.showMessageDialog(null,"当前输入电话号码不合格！");
        }
    }

    private void button2(ActionEvent e) {
        // TODO add your code here
    }

    private void button3(ActionEvent e) {
        // TODO add your code here
    }

    private void button4(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        label3 = new JLabel();
        textField2 = new JTextField();
        label4 = new JLabel();
        textField3 = new JTextField();
        button2 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u672c\u4f8b\u4f7f\u7528\u7b49\u4ef7\u7c7b\u5212\u5206\u6cd5\u8bbe\u8ba1\u6d4b\u8bd5\u7528\u4f8b");

        //---- label2 ----
        label2.setText("\u7535\u8bdd\u53f7\u7801");

        //---- button1 ----
        button1.setText("\u68c0\u6d4b");
        button1.addActionListener(e -> button1(e));

        //---- label3 ----
        label3.setText("\u5ba2\u6237\u540d\u79f0");

        //---- label4 ----
        label4.setText("\u767b\u5f55\u5bc6\u7801");

        //---- button2 ----
        button2.setText("\u9a8c\u8bc1");
        button2.addActionListener(e -> {
			button2(e);
			button1(e);
		});

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label4)
                        .addComponent(label3)
                        .addComponent(label2))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(14, 14, 14))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(126, 126, 126)
                            .addComponent(button2))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(84, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(55, Short.MAX_VALUE)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button2)
                    .addGap(15, 15, 15))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JButton button1;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label4;
    private JTextField textField3;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        new dsd().setVisible(true);
    }
}
