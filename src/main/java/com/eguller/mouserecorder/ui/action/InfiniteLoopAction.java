package com.eguller.mouserecorder.ui.action;

import com.eguller.mouserecorder.config.Config;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * User: eguller
 * Date: 3/9/14
 * Time: 11:50 PM
 */
public class InfiniteLoopAction extends BooleanMenuAction {
    public InfiniteLoopAction(Config config) {
        super(config);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JCheckBoxMenuItem infiniteLoopMenuItem = (JCheckBoxMenuItem) actionEvent.getSource();
        if (infiniteLoopMenuItem.isSelected()) {
            config.activeInfiniteLoop();
        } else {
            config.deactivateInfiniteLoop();
        }
    }
}
