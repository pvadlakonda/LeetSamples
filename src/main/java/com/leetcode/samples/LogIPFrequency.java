package com.leetcode.samples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    There is file containing lots of logs from apache server in specific format such as "ip - log details- date".
    I need to find all those ips whose frequency are same. i.e. find all frequent ips even if they have similar frequencies.
 */
public class LogIPFrequency {
    public record LogEntry(String ip, String details, String date) {}

    public Map<Integer, List<String>> findIPWithLogs(List<String> rawLogs) {

        // 1. Parse lines into LogEntry objects
        List<LogEntry> entries = new ArrayList<>();
        for (String line : rawLogs) {
            String[] parts = line.split(" - ");
            if (parts.length == 3) {
                entries.add(new LogEntry(parts[0].trim(), parts[1].trim(), parts[2].trim()));
            }
        }

        // 2. Count occurrences of each IP (IP -> Frequency)
        Map<String, Integer> ipCounts = new HashMap<>();
        for (LogEntry entry : entries) {
            String ip = entry.ip();
            ipCounts.put(ip, ipCounts.getOrDefault(ip, 0) + 1);
        }

        // 3. Group IPs by their frequency (Frequency -> List of IPs)
        Map<Integer, List<String>> freqGroups = new HashMap<>();
        for (Map.Entry<String, Integer> entry : ipCounts.entrySet()) {
            String ip = entry.getKey();
            int count = entry.getValue();

            // If this frequency isn't in our map yet, add a new list
            if (!freqGroups.containsKey(count)) {
                freqGroups.put(count, new ArrayList<>());
            }
            freqGroups.get(count).add(ip);
        }

        return freqGroups;
    }
}
