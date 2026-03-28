package com.leetcode.samples;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class LogFileOrderingTest {

    private final LogFileOrdering solution = new LogFileOrdering();

    @Test
    void letterLogsAreSortedByContentThenIdentifier() {
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] expected = {"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"};
        assertArrayEquals(expected, solution.reorderLogFiles(logs));
    }

    @Test
    void digitLogsRetainRelativeOrder() {
        String[] logs = {"dig1 8 1", "dig2 3 6", "dig3 5 0"};
        String[] expected = {"dig1 8 1", "dig2 3 6", "dig3 5 0"};
        assertArrayEquals(expected, solution.reorderLogFiles(logs));
    }

    @Test
    void letterLogsAlwaysBeforeDigitLogs() {
        String[] logs = {"dig1 1 2", "let1 z a", "let2 a b"};
        String[] expected = {"let2 a b", "let1 z a", "dig1 1 2"};
        assertArrayEquals(expected, solution.reorderLogFiles(logs));
    }

    @Test
    void letterLogsSameContentSortedByIdentifier() {
        String[] logs = {"b-id art can", "a-id art can"};
        String[] expected = {"a-id art can", "b-id art can"};
        assertArrayEquals(expected, solution.reorderLogFiles(logs));
    }

    @Test
    void singleLogReturnsUnchanged() {
        String[] logs = {"id1 hello world"};
        assertArrayEquals(new String[]{"id1 hello world"}, solution.reorderLogFiles(logs));
    }
}
