package com.hero.moedaplugin.vip;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.PermissionAttachment;

import com.hero.moedaplugin.Main;
import com.hero.moedaplugin.Ptag;
import com.hero.moedaplugin.api.Criar;
import com.hero.moedaplugin.moedas.Cash;
import com.hero.moedaplugin.vip.ShopVipInv;

public class ShopVipEvent implements Listener {

	@EventHandler
	public void onShop(InventoryClickEvent e){
		if (!(e.getWhoClicked() instanceof Player)){
			return;
		}
		Player p = (Player)e.getWhoClicked();
		if (e.getInventory().getName().equals("§6§lVIPS")){
			e.setCancelled(true);
			if (e.getCurrentItem() == null) return;
			if (e.getCurrentItem().getType() == Material.AIR) return;
			if (e.getCurrentItem().getItemMeta().getDisplayName() == null) return;
			ItemStack item = e.getCurrentItem();
			switch (item.getItemMeta().getDisplayName()) {
			case "§8§l[§7§lIRON§8§l]":
				if (Cash.contains(p.getName(), 40)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.sendMessage("§c§lAviso: §e§lVoce recebeu 2 baus da sorte de brinde!");
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Main.permission.playerAddGroup(p, "Iron");
					Cash.retirar(p.getName(), 40);
					p.closeInventory();
					Bukkit.broadcastMessage("§2[Shop] §fO Jogador §c" + p.getName() + "§fcomprou o vip §7§lIRON por 40 cash!");
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2CASH §csuficientes!");
					return;
				}
				break;
			case "§8§l[§6§lGOLD§8§l]":
				if (Cash.contains(p.getName(), 90)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.sendMessage("§4§lAVISO: Os itens da compra foram enviados para seu inventario!");
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Main.permission.playerAddGroup(p, "Gold");
					Cash.retirar(p.getName(), 90);
					p.closeInventory();
					Bukkit.broadcastMessage("§2[Shop] §fO Jogador §c" + p.getName() + "§fcomprou o vip §6§lGOLD por 90 cash!");
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2CASH §csuficientes!");
					return;
				}
				break;
			case "§8§l[§b§lDIAMOND§8§l]":
				if (Cash.contains(p.getName(), 300)){
					p.sendMessage("§a§lCompra efetuada com sucesso!");
					p.sendMessage("§4§lAVISO: Os itens da compra foram enviados para seu inventario!");
					p.playSound(p.getLocation(), Sound.CLICK, 1f, 1f);
					Main.permission.playerAddGroup(p, "Diamond");
					Cash.retirar(p.getName(), 300);
					p.closeInventory();
					Bukkit.broadcastMessage("§2[Shop] §fO Jogador §c" + p.getName() + "§fcomprou o vip §b§lDIAMOND por 300 cash!");
				} else {
					p.sendMessage(Ptag.prefix + "§cVocê não tem §2CASH §csuficientes!");
					return;
				}
					break;
				case "§cVoltar":
					p.closeInventory();
					p.performCommand("shop");
					
				}
				

		}
			
		}
		
	}
	
	
