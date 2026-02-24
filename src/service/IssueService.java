package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("Cannot access student portal", 3));
        issues.add(new Issue("Exam schedule conflict", 1));
        issues.add(new Issue("Lost student ID card", 4));
        issues.add(new Issue("GPA calculation seems wrong", 2));
        issues.add(new Issue("Course registration blocked", 1));
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        if (issues.isEmpty()) {
            System.out.println("No issues.");
            return;
        }
        System.out.println("Most urgent: " + issues.peek());
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        if (issues.isEmpty()) {
            System.out.println("No issues to resolve.");
            return;
        }
        System.out.println("Resolving up to 2 issues...");
        for (int i = 0; i < 2; i++) {
            Issue removed = issues.poll();
            if (removed == null) break;
            System.out.println("Resolved: " + removed);
        }
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        if (issues.isEmpty()) {
            System.out.println("No remaining issues.");
            return;
        }
        System.out.println("=== Remaining Issues (iteration order is NOT sorted) ===");
        Iterator<Issue> it = issues.iterator();
        while (it.hasNext()) {
            System.out.println("- " + it.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        issues.add(new Issue(description, urgency));
        System.out.println("Added new issue: " + description + " (urgency " + urgency + ")");
    }
}
