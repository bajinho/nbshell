package com.qualixium.nbshell.util;

import java.awt.Color;
import javax.swing.UIManager;

public class AutoCompletionUtil {

    public static final String LOOK_AND_FEEL_NAME = UIManager.getLookAndFeel().getName();
    public static final Color FONT_COLOR_NORMAL = Color.decode("0x0000B2");
    public static final Color FONT_COLOR_DARK = Color.decode("#46F25A");

    public static Color getFontColorToUse(boolean isSelected) {
        Color fontColorToUse;
        if (isSelected) {
            fontColorToUse = Color.WHITE;
        } else {
            //TODO verify this to improve the way to deal with Colors on look and feels:
            //https://netbeans.org/bugzilla/show_bug.cgi?id=257867
            if (LOOK_AND_FEEL_NAME.contains("Dark") || LOOK_AND_FEEL_NAME.equalsIgnoreCase("Darcula")) {
                fontColorToUse = FONT_COLOR_DARK;
            } else {
                fontColorToUse = FONT_COLOR_NORMAL;
            }
        }
        return fontColorToUse;
    }
}
