// Represents the space station and controls the mission flow through its different sections. Ex, [ START ]  ->  [ LUFTSLUSS ]  ->  [ LABB ]  ->  [ REAKTOR ]

import Enum.SectionType;

public class Station {
    // Current section the team is in.
    private SectionType currentSection;

    // All section in order.
    private Section[] sections;

    // the recure team.
    private CrewMember[] crew;

    // Mission status
    private boolean missionFailed;
    private boolean missionCompleted;

    public static void createStation() {

    }
}
