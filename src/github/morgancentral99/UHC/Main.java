package github.morgancentral99.UHC;

import org.bukkit.plugin.java.JavaPlugin;

import github.morgancentral99.UHC.GameManager.GameManager;
import github.morgancentral99.UHC.Utils.LoggerAPI;

public class Main extends JavaPlugin {
	

	
	@Override
	public void onEnable() {
		LoggerAPI.info("UHC By " + getDescription().getAuthors());
		LoggerAPI.info("Version: " + getDescription().getVersion());
		LoggerAPI.debug("UHC Debug Enabled");
		
		GameManager gm;
	}

}
