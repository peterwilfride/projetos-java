/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package user.roles.groups.system.manegement;

import java.util.List;

import user.roles.groups.system.manegement.datasource.GroupList;
import user.roles.groups.system.manegement.datasource.RoleList;
import user.roles.groups.system.manegement.model.Group;
import user.roles.groups.system.manegement.model.Role;
import user.roles.groups.system.manegement.model.User;

public class App {
    public static void main(String[] args) {

        List<Role> rolesList = RoleList.getList;
        Role r1 = new Role(1L, "member");
        rolesList.add(r1);
        Role r2 = new Role(2L, "admin");
        rolesList.add(r2);
    
        List<Group> groupsList = GroupList.getList;
        Group g1 = new Group(1L, "meu grupo");
        g1.addRole(r2);
        groupsList.add(g1);


        User user = new User(1L);
        user.addRole(r1);
        user.addGroup(g1);
    }
}