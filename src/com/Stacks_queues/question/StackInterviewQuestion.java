package com.Stacks_queues.question;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackInterviewQuestion {
    public static void main(String[] args) {
//        Stack<Integer> stack= new Stack<>();
//        stack.push(5);
//        System.out.println(stack.pop());
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int m = s.nextInt();
            int x = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                a[j] = s.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = s.nextInt();
            }
            System.out.println(TwoStakcs.TwoStacks(x, a, b));

        }
        }

    }

    class QueueUsingStack {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public QueueUsingStack() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add(int item) {
            first.push(item);
        }

        public int remove() throws Exception {

            while (!first.empty()) {
                second.push(first.pop());
            }
            int removed = second.pop();

            while (!second.empty()) {
                first.push(second.pop());
            }
            return removed;
        }

        public int peek() throws Exception {
            // just looking into the item not removing it
            while (!first.empty()) {
                second.push(first.pop());
            }
            int peeked = second.peek();

            while (!second.empty()) {
                first.push(second.pop());
            }
            return peeked;
        }

        public boolean isEmpty() {
            return first.isEmpty();
        }
    }

    class QueueUsingStackRemoveEfficient {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public QueueUsingStackRemoveEfficient() {
            first = new Stack<>();
            second = new Stack<>();
        }

        public void add(int item) {

            while (!first.isEmpty()) {
                second.push(first.pop());
            }
            first.push(item);
            while (!second.isEmpty()) {
                first.push(second.pop());
            }
        }

        public int remove() throws Exception {

            return first.pop();
        }

        public int peek() throws Exception {

            return first.peek();
        }

        public boolean isEmpty() {
            return first.isEmpty();
        }
    }


class TwoStakcs {
    public static int TwoStacks(int x, int[] a, int[] b) {
        return helper(x, a, b, 0, 0);
    }

    public static int helper(int x, int[] a, int[] b, int sum, int count) {
        if (sum > x) return count - 1;

        int max = count;

        if (a.length > 0) {
            max = Math.max(max, helper(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1));
        }
        if (b.length > 0) {
            max = Math.max(max, helper(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1));
        }

        return max;
    }
}





















