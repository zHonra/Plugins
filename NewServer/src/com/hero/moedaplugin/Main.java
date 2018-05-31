package com.hero.moedaplugin;

import java.util.ArrayList;

import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	
	 private boolean setupEconomy()
	    {
	        RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
	        if (economyProvider != null) {
	            economy = economyProvider.getProvider();
	        }

	        return (economy != null);
	    }
	
	 
	 public static ArrayList<Player> players = new ArrayList<>();
	 public static Main plugin;
	 
	@Override
	public void onEnable() {
		plugin = this;
		setupEconomy();
		setupPermissions();
		setupChat();
		new Register(this);
		getLogger().info(ChatColor.GREEN + "Plugin Ativado!");
		getLogger().info(ChatColor.GREEN + "Feito por:zHonra_");
		getLogger().info(ChatColor.GREEN + "Versao: Cash e Score.");
	}
	
	@Override
	public void onDisable() {
		HandlerList.unregisterAll();
		getLogger().info(ChatColor.RED + "Plugin Desativado!");
	}
	
	public static Main getInstance(){
		return Main.getPlugin(Main.class);
	}
	
	public static Permission permission = null;
    public static Economy economy = null;
    public static Chat chat = null;

    private boolean setupPermissions()
    {
        RegisteredServiceProvider<Permission> permissionProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
        if (permissionProvider != null) {
            permission = permissionProvider.getProvider();
        }
        return (permission != null);
    }

    private boolean setupChat()
    {
        RegisteredServiceProvider<Chat> chatProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.chat.Chat.class);
        if (chatProvider != null) {
            chat = chatProvider.getProvider();
        }

        return (chat != null);
    }
    
    public static Plugin getplugin(){
        return plugin;

    }
}
