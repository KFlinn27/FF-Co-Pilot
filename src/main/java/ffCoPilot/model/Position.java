package ffCoPilot.model;

public class Position {

    String name;

    public Position(String pos){
        this.name = pos;
    }

    public String fullText() {
        switch(this.name.toLowerCase()){
            case "qb": return "Quarterback";
            case "rb": return "Running Back";
            case "wr": return "Wide Receiver";
            case "te": return "Tight End";
            case "k": return "Kicker";
            default : return "Invalid Pos";
        }
    }

}
