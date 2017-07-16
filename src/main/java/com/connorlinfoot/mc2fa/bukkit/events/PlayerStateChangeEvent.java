package com.connorlinfoot.mc2fa.bukkit.events;

import com.connorlinfoot.mc2fa.shared.AuthHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerStateChangeEvent extends Event implements Cancellable {
    private Player player;
    private AuthHandler.AuthState authState;
    private boolean canceled = false;

    public PlayerStateChangeEvent(Player player, AuthHandler.AuthState authState) {
        this.player = player;
        this.authState = authState;
    }

    @Override
    public HandlerList getHandlers() {
        return new HandlerList();
    }

    @Override
    public boolean isCancelled() {
        return canceled;
    }

    @Override
    public void setCancelled(boolean canceled) {
        this.canceled = canceled;
    }

    public Player getPlayer() {
        return player;
    }

    public AuthHandler.AuthState getAuthState() {
        return authState;
    }

}