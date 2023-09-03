package user.roles.groups.system.manegement.model;

import java.util.HashSet;
import java.util.Set;

public class Group {
    
    private Long id;
    private String name;
    private Set<Role> roles;    

    public Group(Long id, String name) {
        this.id = id;
        this.name = name;
        this.roles = new HashSet<>();
    }

    public void addRole(Role role) {
        if (!this.roles.contains(role)) {
            this.roles.add(role);
        }
    }

    public Set<Role> getRoles() {
        return this.roles;
    }

    public boolean containRole(Role role) {
        return this.roles.contains(role);
    }
}
