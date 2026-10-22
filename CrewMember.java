// Base class for all crew members.
// Holds shared data like name, energy and role.
// Subclasses define specific behavior.

import javax.management.relation.Role;

import Enum.Status;

public class CrewMember {
    private String name;
    private int energy;
    private Status status;
    private Role role;

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public Status getStatus() {
        return status;
    }

    public Role getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
