package com.xl.util;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 徐立
 * @Date: 2018-05-17
 * @Time: 16:29
 * To change this template use File | Settings | File Templates.
 */
public class GUIUtil {
    /**
     * 将一个对话框居中
     *
     * @param dialog 要居中的对话框
     */
    public static void makeCenter(JDialog dialog) {
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        dialog.setLocation(width / 2 - dialog.getWidth() / 2, height / 2 - dialog.getHeight() / 2);
    }

    public static void makeCenter(JFrame dialog) {
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        dialog.setLocation(width / 2 - dialog.getWidth() / 2, height / 2 - dialog.getHeight() / 2);
    }

    public static void updateFont(Component comp, Font font) {
        comp.setFont(font);
        if (comp instanceof Container) {
            Container c = (Container) comp;
            int n = c.getComponentCount();
            for (int i = 0; i < n; i++) {
                updateFont(c.getComponent(i), font);
            }
        }
    }
}

