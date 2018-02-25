package com.bluetowel.artrial;

import com.bluetowel.core.src.Game;
import com.jme3.app.AndroidHarness;

import java.util.logging.Level;
import java.util.logging.LogManager;

public class MainActivity extends AndroidHarness {
    public MainActivity() {
        appClass = Game.class.getCanonicalName();
        exitDialogTitle = "Exit?";
        exitDialogMessage = "Are you sure you want to quit?";
        mouseEventsEnabled = true;
        LogManager.getLogManager().getLogger("").setLevel(Level.INFO);
    }
}