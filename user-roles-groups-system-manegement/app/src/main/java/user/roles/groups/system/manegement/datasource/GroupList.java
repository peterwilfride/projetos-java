package user.roles.groups.system.manegement.datasource;

import java.util.ArrayList;
import java.util.List;

import user.roles.groups.system.manegement.model.Group;

public class GroupList {

    private static List<Group> groups;

    public static List<Group> getList() {
        if (groups == null) {
            groups = new ArrayList<>();
        }
        return groups;
    }   
}
