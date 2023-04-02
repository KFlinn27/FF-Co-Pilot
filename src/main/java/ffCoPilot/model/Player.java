package ffCoPilot.model;

public class Player {

    String name;
    int id;
    int rank;
    int byeWeek;
    Position pos;
    String team;
    public Player(String name, int id, int rank, int byeWeek, Position pos, String team){
        this.name = name;
        this.id = id;
        this.rank = rank;
        this.byeWeek = byeWeek;
        this.pos = pos;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getByeWeek() {
        return byeWeek;
    }

    public void setByeWeek(int byeWeek) {
        this.byeWeek = byeWeek;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
