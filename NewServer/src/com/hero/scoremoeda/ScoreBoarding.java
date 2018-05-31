package com.hero.scoremoeda;

import java.util.ArrayList;

import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import net.milkbowl.vault.permission.Permission;
import net.minecraft.server.v1_8_R1.PlayerList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

import com.hero.moedaplugin.Main;
import com.hero.moedaplugin.moedas.Cash;

@SuppressWarnings("deprecation")
public class ScoreBoarding implements Listener {
	
	
	public static ScoreBoarding t = new ScoreBoarding();
	
	public static ScoreBoarding getScoreBoard(){
		return t;
	}


	public void ScoreBoardManager(Player p) {
		
		Scoreboard s = Bukkit.getScoreboardManager().getNewScoreboard();
		Objective o = s.registerNewObjective("Scoreboard", "dummy");
		o.setDisplayName("§c§lSurv§f§lival");
		o.setDisplaySlot(DisplaySlot.SIDEBAR);
		
		
		
		
		Score score1 = o.getScore("§b§lMundo");
		Score mundo = o.getScore(ChatColor.WHITE + p.getWorld().getName());
		Score espacooo = o.getScore("§5");
		Score jogadores = o.getScore("§c§lOnline");
		Score jogadores2 = o.getScore(Main.players.size() + "/" + Bukkit.getServer().getMaxPlayers());
		Score espaco23 = o.getScore("§f§l");
		Score score3 = o.getScore("§6§lCoins");
		Score coins = o.getScore("" + Main.economy.getBalance(p.getName()) );
		Score espaco3 = o.getScore("§f");
		Score score4 = o.getScore("§a§lCash");
		Score cash = o.getScore("§f" + Cash.get(p.getName()));
		Score espaco4 = o.getScore("");
		Score score5 = o.getScore("§7§lSite");
		Score site = o.getScore("§fsplashmc.com.br");
		Score espaco5 = o.getScore("§f§l----------------");
		
		
		score1.setScore(14);
		mundo.setScore(13);
		espacooo.setScore(12);
		jogadores.setScore(11);
		jogadores2.setScore(10);
		espaco23.setScore(9);
		score3.setScore(8);
		coins.setScore(7);
		espaco3.setScore(6);
		score4.setScore(5);
		cash.setScore(4);
		espaco4.setScore(3);
		score5.setScore(2);
		site.setScore(1);
		espaco5.setScore(0);
		
		p.setScoreboard(s);
		
		}
	
	@EventHandler
	  public void onJoinScore(PlayerJoinEvent e){
	    final Player p = e.getPlayer();
	    
	    Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
	    
	      public void run()
	      {
	    	  ScoreBoardManager(p);
	      }
	    }, 0L, 20L);
	    
	    
	}
	
	
}

	
	

