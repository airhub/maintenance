package pw.rfield.ezmaintenance;

import org.bukkit.plugin.java.JavaPlugin;

public class MaintenancePlugin extends JavaPlugin {

    public static MaintenancePlugin instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static MaintenancePlugin getInstance() {
        return instance;
    }
}

