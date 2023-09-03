package user.roles.groups.system.manegement.model;

import java.util.HashSet;
import java.util.Set;

public class User {
    
    private Long id;
    private Set<Role> roles;
    private Set<Group> groups;
    
    public User(Long id) {
        this.id = id;
        this.roles = new HashSet<>();
        this.groups = new HashSet<>();
    }

    public void addRole(Role role) {
        if (!roles.contains(role)) {
            this.roles.add(role);
        }
    }

    // public void removeRole(Role role) {
    //     for (Group group : this.groups) {
    //         if (!group.containRole(role)) {
    //             this.roles.remove(role);
    //         }
    //     }
    // }

    public void addGroup(Group group) {
        if (!groups.contains(group)) {
            this.groups.add(group);
            for (Role role : group.getRoles()) {
                this.addRole(role);
            } 
        }
    }

    public void removeGroup(Group group) {
        if (groups.contains(group)) {
            this.groups.remove(group);
            for (Role role : group.getRoles()) {
                this.roles.remove(role);
            } 
        }
    }
}
