package Greedy;


import java.util.*;

public class Activity_Selection {

    public static void main(String[] args) {
        int start[] = {0, 3, 1, 5, 5, 8};
        int end[] =   {6, 4, 2, 9, 7, 9};
        int n = start.length;

        List<Activity> act = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            act.add(new Activity(start[i], end[i]));
        }

        act.sort((a, b) -> a.end - b.end);

        System.out.println("Selected Activities:");
        System.out.println(act.get(0).start + " -> " + act.get(0).end);

        int count = 1;
        int lastEnd = act.get(0).end;

        for (int i = 1; i < n; i++) {
            if (act.get(i).start >= lastEnd) {
                System.out.println(act.get(i).start + " -> " + act.get(i).end);
                lastEnd = act.get(i).end;
                count++;
            }
        }

        System.out.println("Total activities selected: " + count);
    }
}