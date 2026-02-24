package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        // TODO: Add 4 actions
        actions.addLast("Submitted Assignment");
        actions.addLast("Dropped Course");
        actions.addLast("Registered Course");
        actions.addLast("Updated Profile");
    }

    public void undoLastAction() {
        // TODO: Remove last action
        if (actions.isEmpty()){
            System.out.println("History is empty!!");
            return;
        }
        String removed = actions.removeLast();
        System.out.println("Undone: " + removed);
    }

    public void addRequestedTranscript() {
        // TODO: Add "Requested Transcript"
        actions.addLast("Requested Transcript");
        System.out.println("Added: Requested Transcript");
    }

    public void showFirstAndLast() {
        // TODO: Print first and last action
        if (actions.isEmpty()) {
            System.out.println("History is empty.");
            return;
        }
        System.out.println("First action: " + actions.peekFirst());
        System.out.println("Last action: " + actions.peekLast());
    }

    public void printHistory() {
        // TODO: Iterate through history
        if (actions.isEmpty()) {
            System.out.println("History is empty.");
            return;
        }
        System.out.println("=== Action History ===");
        Iterator<String> it = actions.iterator();
        while (it.hasNext()) {
            System.out.println("- " + it.next());
        }
    }
}
