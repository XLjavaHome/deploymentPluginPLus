package com.xl.plugin.xlplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.xl.plugin.xlplugin.gui.DeployForm;
import org.jetbrains.annotations.NotNull;

/**
 * Created with 徐立.
 *
 * @author 徐立
 * @version 1.0 2019-03-25 9:33
 * To change this template use File | Settings | File Templates.
 * @date 2019-03-25
 * @time 9:33
 */
public class XLPlusAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent anActionEvent) {
        String basePath = anActionEvent.getProject().getBasePath();
        System.out.println(basePath);
        DeployForm dialog = new DeployForm();
        dialog.pack();
        com.xl.util.GUIUtil.makeCenter(dialog);
        dialog.setVisible(true);
    }
}
