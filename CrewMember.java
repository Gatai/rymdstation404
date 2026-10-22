// Base class for all crew members.
// Holds shared data like name, energy and role.
// Subclasses define specific behavior.

import Enum.Role;
import Enum.Status;

public abstract class CrewMember {
    private String name;
    private int energy;
    private Status status;
    private Role role;

    public CrewMember(String name, int energy, Status status, Role role) {
        this.name = name;
        this.energy = energy;
        this.status = status;
        this.role = role;
    }

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
