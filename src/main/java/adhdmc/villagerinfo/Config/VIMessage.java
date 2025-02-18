package adhdmc.villagerinfo.Config;


public enum VIMessage {
    // General
    PLUGIN_PREFIX("<#3256a8><bold>[</bold><#4dd5ff>Villager Info<#3256a8><bold>]<reset>"),
    TOGGLE_ON("<plugin_prefix> <green> Villager Info Toggled <u>ON"),
    TOGGLE_OFF("<plugin_prefix> <red> Villager Info Toggled <u>OFF"),
    LOGGER_INVALID_LOCALE_KEY("Invalid locale key found: "),
    NO_PERMISSION("<red>You don't have permission to use this command!"),
    NO_COMMAND("<red>No command by that name!"),
    CONFIG_RELOADED("<plugin_prefix> <gold>VillagerInfo Config Reloaded!"),
    HELP_MAIN("<plugin_prefix> <#4dd5ff> • How to use Villager Info\n<grey>Crouch-right-click a villager while toggle is on to have a villager's information displayed"),
    HELP_TOGGLE("<#4dd5ff> • /vill toggle\n<grey>Toggles the ability to receive villager information on or off."),
    HELP_RELOAD("<#4dd5ff> • /vill reload\n<grey>Reloads the plugin, applies config values"),
    NOT_A_PLAYER("<plugin_prefix> <red>Sorry, you must be a player to use this command"),

    // Villager Info
    PURPUR_LOBOTOMIZED("<#05bff7><hover:show_text:'<aqua>Lobotomized: <grey><state>'>[<#c4fff7>Lobotomized</#c4fff7>]"),
    ZOMBIE_VILLAGER_CONVERSION_TIME("<#05bff7><hover:show_text:'<aqua>Conversion Time: <grey><time>'>[<#c4fff7>Time Until Converted</#c4fff7>]</hover>"),
    VILLAGER_AGE("<#05bff7><hover:show_text:'<aqua>Childhood Left: <grey><age>'>[<#c4fff7>Time Until Adult</#c4fff7>]"),
    VILLAGER_PROFESSION("<#05bff7><hover:show_text:'<aqua>Profession: <grey><profession>'>[<#c4fff7>Profession</#c4fff7>]"),
    VILLAGER_HEALTH("<#05bff7><hover:show_text:'<aqua>Health: <grey><current><aqua>/</aqua><total>'>[<#c4fff7>Health</#c4fff7>]"),
    VILLAGER_JOBSITE("<#05bff7><hover:show_text:'<aqua>POI: <grey><jobsitelocation>'>[<#c4fff7>Job Site</#c4fff7>]"),
    VILLAGER_LAST_WORKED("<#05bff7><hover:show_text:'<aqua>Last Worked: <grey><worktime>'>[<#c4fff7>Last Worked At Workstation</#c4fff7>]"),
    VILLAGER_RESTOCKS("<#05bff7><hover:show_text:'<aqua>Restocks: <grey><restockcount>'>[<#c4fff7>Restocks Today</#c4fff7>]"),
    VILLAGER_HOME("<#05bff7><hover:show_text:'<aqua>Bed: <grey><homelocation>'>[<#c4fff7>Home</#c4fff7>]"),
    VILLAGER_SLEPT("<#05bff7><hover:show_text:'<aqua>Last Slept: <grey><sleeptime>'>[<#c4fff7>Last Slept</#c4fff7>]"),
    VILLAGER_INVENTORY("<#05bff7><hover:show_text:'<aqua>Inventory: <grey><contents>'>[<#c4fff7>Villager Inventory</#c4fff7>]"),
    INVENTORY_CONTENTS("\n • <item> (<amount>)"),
    PLAYER_REPUTATION("<#05bff7><hover:show_text:'<#05bff7>[<#c4fff7>Player Reputation</#c4fff7>]'><reputation>"),

    // Fillers
    TRUE("<grey>True"), FALSE("<grey>False"),
    NONE("<grey>None"), NEVER("<grey>Never"), EMPTY("\n<grey>Empty"),
    NO_INFORMATION("<grey>No information to display on this villager"),

    // Time
    HOUR("h, "), MINUTE("m, "), SECOND("s"), AGO(" Ago"),

    // Location
    LOCATION_X("<int>x, "), LOCATION_Y("<int>y, "), LOCATION_Z("<int>z");

    String message;
    VIMessage(String message) {
        this.message = message;
    }
    public String getMessage() { return this.message; }
    public void setMessage(String message) { this.message = message; }
}
