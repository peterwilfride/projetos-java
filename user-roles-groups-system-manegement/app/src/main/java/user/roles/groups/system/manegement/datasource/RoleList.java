package user.roles.groups.system.manegement.datasource;

import java.util.ArrayList;
import java.util.List;

import user.roles.groups.system.manegement.model.Role;

public class RoleList {

    private static List<Role> roles;

    public static List<Role> getList() {
        if (roles == null) {
            roles = new ArrayList<>();
        }
        return roles;
    }
}
