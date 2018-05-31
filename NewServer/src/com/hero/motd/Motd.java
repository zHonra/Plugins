package com.hero.motd;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;


public class Motd implements Listener {
	
	
	@EventHandler
	public void onMotd(ServerListPingEvent e){
		e.setMaxPlayers(2017);
		
		if (Bukkit.hasWhitelist()){
			e.setMotd("§4§lEstamos em manutenção§f!" + "\n" + "§7§lVoltamos Logo!" );
			return;
		}
		e.setMotd("§0Stop§4Network§7: §6Seja Bem-Vindo§7!" + "\n" + "§7Factions, FullPvP e Survival | 1.8x");
	}

}



