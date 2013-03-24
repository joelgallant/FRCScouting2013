package edu.ata.scouting;

import edu.ata.scouting.points.Points;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchData {

    private ArrayList<Points> points;
    private TeamMatch.RobotType robotType;
    private TeamMatch.StartingPosition startingPosition;
    private ArrayList<TeamMatch.Intake> intakes;
    private TeamMatch.ShooterType shooterType;
    private TeamMatch.MatchResult matchResult;
    private TeamMatch.AutoDiscCount autoDiscCount;
    private HashMap<TeamMatch.NoteType, String> notes;

    public MatchData() {
        points = new ArrayList<>();
        robotType = TeamMatch.RobotType.Unknown;
        startingPosition = TeamMatch.StartingPosition.Unknown;
        intakes = new ArrayList<>();
        shooterType = TeamMatch.ShooterType.NoShooter;
        matchResult = TeamMatch.MatchResult.Unknown;
        autoDiscCount = TeamMatch.AutoDiscCount.NoDisc;
        notes = new HashMap<>();
    }

    public MatchData(MatchData matchData) {
        points = matchData.points;
        robotType = matchData.robotType;
        startingPosition = matchData.startingPosition;
        intakes = matchData.intakes;
        shooterType = matchData.shooterType;
        matchResult = matchData.matchResult;
        autoDiscCount = matchData.autoDiscCount;
        notes = matchData.notes;
    }

    public void addPoints(Points p) {
        points.add(p);
    }

    public void popLastPoints() {
        points.remove(points.size() - 1);
    }

    public void setRobotType(TeamMatch.RobotType robotType) {
        this.robotType = robotType;
    }

    public void setStartingPosition(TeamMatch.StartingPosition startingPosition) {
        this.startingPosition = startingPosition;
    }

    public void addIntake(TeamMatch.Intake i) {
        if (!intakes.contains(i)) {
            intakes.add(i);
        }
    }

    public void removeIntake(TeamMatch.Intake i) {
        intakes.remove(i);
    }

    public void setShooterType(TeamMatch.ShooterType shooterType) {
        this.shooterType = shooterType;
    }

    public void setMatchResult(TeamMatch.MatchResult matchResult) {
        this.matchResult = matchResult;
    }

    public void setAutoDiscCount(TeamMatch.AutoDiscCount autoDiscCount) {
        this.autoDiscCount = autoDiscCount;
    }

    public void setNote(TeamMatch.NoteType noteType, String note) {
        notes.put(noteType, note);
    }

    public List<Points> getPoints() {
        return Collections.unmodifiableList(points);
    }

    public TeamMatch.RobotType getRobotType() {
        return robotType;
    }

    public TeamMatch.StartingPosition getStartingPosition() {
        return startingPosition;
    }

    public List<TeamMatch.Intake> getIntakes() {
        return Collections.unmodifiableList(intakes);
    }

    public TeamMatch.ShooterType getShooterType() {
        return shooterType;
    }

    public TeamMatch.MatchResult getMatchResult() {
        return matchResult;
    }

    public TeamMatch.AutoDiscCount getAutoDiscCount() {
        return autoDiscCount;
    }

    public Map<TeamMatch.NoteType, String> getNotes() {
        return Collections.unmodifiableMap(notes);
    }
}
