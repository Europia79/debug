/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.Europia79.debug;

import org.bukkit.entity.Player;

/**
 *
 * @author Nikolai
 */
public class DebugOn implements DebugInterface {

    @Override
    public void log(String m) {
        
    }

    @Override
    public void messagePlayer(Player p, String m) {
        p.sendMessage(m);
    }


}
