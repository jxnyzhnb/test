/*
 * Created by JFormDesigner on Wed Mar 09 18:02:10 CST 2022
 */

package test;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class aa extends JFrame {
    public aa() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u7535\u8bdd\u53f7\u7801\u89c4\u5219:");

        //---- label2 ----
        label2.setText("1.\u7535\u8bdd\u53f7\u7801\u5e94\u4e3a\u6570\u5b57");

        //---- label3 ----
        label3.setText("2.\u5982\u5e26\u533a\u53f7\u5219\u5728\u533a\u53f7\u4e0e\u53f7\u7801\u4e2d\u95f4\u63d2\u5165-\u53f7");

        //---- label4 ----
        label4.setText("3.\u7535\u8bdd\u53f7\u7801\u4e3a8\u4f4d\u6570\u5b57,\u533a\u53f7\u4e3a4\u4f4d\u6570\u5b57");

        //---- label5 ----
        label5.setText("\u90b9\u8f8920192125");
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 7f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4)
                        .addComponent(label1)
                        .addComponent(label3)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(label5)
                            .addComponent(label2)))
                    .addContainerGap(134, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label5)
                    .addGap(40, 40, 40)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addComponent(label2)
                    .addGap(18, 18, 18)
                    .addComponent(label3)
                    .addGap(18, 18, 18)
                    .addComponent(label4)
                    .addContainerGap(83, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        new aa().setVisible(true);
    }
}
