package adhdmc.villagerinfo.Commands.SubCommands;

import adhdmc.villagerinfo.Commands.SubCommand;
import adhdmc.villagerinfo.Config.ConfigValidator;
import adhdmc.villagerinfo.Config.LocaleConfig;
import adhdmc.villagerinfo.Config.VIMessage;
import adhdmc.villagerinfo.Config.Perms;
import adhdmc.villagerinfo.VillagerInfo;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class ReloadCommand extends SubCommand {

    public ReloadCommand() {
        super("reload", "Reloads the VillagerInfo plugin", "/vill reload");
    }


    @Override
    public void execute(CommandSender sender, String[] args) {
        MiniMessage miniMessage = VillagerInfo.getMiniMessage();
        if (!(sender instanceof Player) || sender.hasPermission(Perms.RELOAD.getVIPerm())) {
            VillagerInfo.getInstance().reloadConfig();
            LocaleConfig.getInstance().reloadLocale();
            ConfigValidator.configValidator();
            sender.sendMessage(miniMessage.deserialize(VIMessage.CONFIG_RELOADED.getMessage()));
        } else {
            sender.sendMessage(miniMessage.deserialize((VIMessage.NO_PERMISSION.getMessage())));
        }
    }

    @Override
    public List<String> getSubcommandArguments(CommandSender sender, String[] args) {
        return null;
    }
}
