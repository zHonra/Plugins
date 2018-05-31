package com.hero.moedaplugin.moedas;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CashCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lb, String[] args) {

		if (cmd.getName().equalsIgnoreCase("cash")){
			Player p = (Player)sender;
			if (args.length == 0){
				if (p.hasPermission("hero.cashadmin")){
					p.sendMessage("�cUse: �f/cash �7(set, add, retirar)");
				}
				p.sendMessage("�eSeu cash: �a" + Cash.get(p.getName()));
				return true;
			}

			if (args.length > 0){
				if (!p.hasPermission("hero.cashadmin")){
					p.sendMessage("�eSeu cash: �a" + Cash.get(p.getName()));
					return true;
				}
				if (args[0].equalsIgnoreCase("set")){
					if (args.length == 1){
						p.sendMessage("�cUse: �f/cash set �7(player, valor)");
						return true;
					}
					String target = args[1];
					String numero = args[2];
					if (!Cash.cash.contains(target)){
						p.sendMessage("�cEste jogador n�o existe!");
						return true;
					}
					Integer valor;
					try {
						valor = Integer.parseInt(numero);
					} catch (NumberFormatException e) {
						p.sendMessage("�cDigite um valor v�lido!");
						return true;
					}
					Cash.set(target, valor);
					p.sendMessage("�eVoc� setou os cash do jogador �f" + target + "�e para �f" + valor);
				}
				if (args[0].equalsIgnoreCase("add")){
					if (args.length == 1){
						p.sendMessage("�cUse: �f/cash add �7(player, valor)");
						return true;
					}
					String target = args[1];
					String numero = args[2];
					if (!Cash.cash.contains(target)){
						p.sendMessage("�cEste jogador n�o existe!");
						return true;
					}
					Integer valor;
					try {
						valor = Integer.parseInt(numero);
					} catch (NumberFormatException e) {
						p.sendMessage("�cDigite um valor v�lido!");
						return true;
					}
					Cash.add(target, valor);
					p.sendMessage("�eVoc� adicionou �f" + valor + "�e cash para o jogador �f" + target);
				}
				if (args[0].equalsIgnoreCase("retirar")){
					if (args.length == 1){
						p.sendMessage("�cUse: �f/cash retirar �7(player, valor)");
						return true;
					}
					String target = args[1];
					String numero = args[2];
					if (!Cash.cash.contains(target)){
						p.sendMessage("�cEste jogador n�o existe!");
						return true;
					}
					Integer valor;
					try {
						valor = Integer.parseInt(numero);
					} catch (NumberFormatException e) {
						p.sendMessage("�cDigite um valor v�lido!");
						return true;
					}
					Cash.retirar(target, valor);
					p.sendMessage("�eVoc� retirou �f" + valor + "�e de cash do jogador �f" + target);
				}
			}
		}

		return false;
	}

}
