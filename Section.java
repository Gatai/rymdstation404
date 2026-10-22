// Section is the base class for all rooms (airlock, lab, reactor), and each room implements its own version of what happens when the team enters.

import Enum.SectionType;

public abstract class Section {
    private String name;

    // AIRLOCK, LAB... ECT
    private SectionType sectionType;

    public abstract void enter(CrewMember member);
}
