package io.github.crawlerbot.models;

import io.github.crawlerbot.models.crawl.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class InputLinkHelper {
    public static Channel translateFromChannelToInputLink(Channel channel) {
        Channel inputLink = new Channel();
        return inputLink;
    }
    public static List<Action> getSiteActions(Channel inputLink, Integer level) {
        if (inputLink == null || level == null) return null;
        Set<SiteAction> actions = inputLink.getSiteActionConfigs();
        //SiteAction> actions = inputLink.getSiteActionConfigs();
        if (actions == null) return null;
        List<Action> result = new ArrayList<>();
        for (SiteAction siteAction : actions) {
            for(Action action: siteAction.getActions()) {
                if(action.getLevel() == level) {
                    result.add(action);
                }
            }
        }
        return result;
    }
    public static List<ConfigGroup> getConfigGroupByLevel(Integer currentLevel, Set<ConfigGroup> configGroups) {
        if (configGroups == null || configGroups.size() == 0) return null;
        List<ConfigGroup> configGroupList = new ArrayList<>();
        for (ConfigGroup configGroup : configGroups) {
            if (configGroup.getCurrentLevel() == currentLevel) {
                configGroupList.add(configGroup);
            }
        }
        return configGroupList;
    }

    public static List<Mapping> getMappingByLevel(Integer currentLevel,Set<ConfigGroup> configGroups) {
        if(configGroups == null || configGroups.size() ==0) return null;
        List<Mapping> mappingList = new ArrayList<>();
        for(ConfigGroup configGroup: configGroups) {
           if(configGroup.getCurrentLevel() == currentLevel) {
               Set<Mapping> mappings = configGroup.getMappings();
               for(Mapping mapping: mappings) {
                   mappingList.add(mapping);
               }
           }
        }
        return mappingList;
    }
}
