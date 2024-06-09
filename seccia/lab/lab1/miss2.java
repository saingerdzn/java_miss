package lab.lab1;

public class miss2 {
    public static void main(String[] args) {
        String[] actions = {"Like", "Dislike", "Dislike", "Like", "Like"};
        String finalState = getFinalState(actions);
        System.out.println(finalState);
    }

    public static String getFinalState(String[] actions) {
        String state = "Nothing";
        for (String action : actions) {
            state = action.equals(state) ? "Nothing" : action;
        }
        return state;
    }
}