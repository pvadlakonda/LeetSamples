package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class LogIPFrequencyTest {

    private LogIPFrequency solution = new LogIPFrequency();

    @Test
    void shouldReturnSingleIpWithHighestFrequency() {
        List<String> logs = List.of(
            "192.168.1.1 - login - 2024-01-01",
            "192.168.1.1 - logout - 2024-01-01",
            "10.0.0.1 - login - 2024-01-01"
        );
        Map<Integer, List<String>> result = solution.findIPWithLogs(logs);
        assertTrue(result.containsValue(List.of("192.168.1.1")));
    }

    @Test
    void shouldReturnBothIpsWhenFrequenciesAreEqual() {
        List<String> logs = List.of(
            "192.168.1.1 - login - 2024-01-01",
            "10.0.0.1 - login - 2024-01-01"
        );
        Map<Integer, List<String>> result = solution.findIPWithLogs(logs);
        assertTrue(result.containsValue(List.of("192.168.1.1")));
        assertTrue(result.containsValue(List.of("10.0.0.1")));
    }

    @Test
    void shouldHandleSingleLogEntry() {
        List<String> logs = List.of("172.16.0.1 - access - 2024-01-01");
        Map<Integer, List<String>> result = solution.findIPWithLogs(logs);
        assertTrue(result.containsValue(List.of("172.16.0.1")));
    }

    @Test
    void shouldIgnoreMalformedLogLines() {
        List<String> logs = List.of(
            "bad log line",
            "192.168.1.1 - login - 2024-01-01"
        );
        Map<Integer, List<String>> result = solution.findIPWithLogs(logs);
        assertTrue(result.containsValue(List.of("92.168.1.1")));
    }

    @Test
    void shouldHandleEmptyLogList() {
        Map<Integer, List<String>> result = solution.findIPWithLogs(List.of());
        assertNotNull(result);
    }

    @Test
    void shouldGroupMultipleIpsWithSameFrequency() {
        List<String> logs = List.of(
            "10.0.0.1 - login - 2024-01-01",
            "10.0.0.1 - login - 2024-01-02",
            "10.0.0.2 - login - 2024-01-01",
            "10.0.0.2 - login - 2024-01-02",
            "10.0.0.3 - login - 2024-01-01"
        );
        Map<Integer, List<String>> result = solution.findIPWithLogs(logs);
        assertTrue(result.containsValue(List.of("10.0.0.1")));
        assertTrue(result.containsValue(List.of("10.0.0.2")));
    }
}
