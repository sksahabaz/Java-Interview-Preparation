class Solution {
    public int calPoints(String[] operations) {

        int[] stack = new int[operations.length];
        int top = 0;
        int sum = 0;

        for (String op : operations) {

            if (op.equals("C")) {
                top--;
                sum -= stack[top];

            } else if (op.equals("D")) {
                int score = stack[top - 1] * 2;
                stack[top++] = score;
                sum += score;

            } else if (op.equals("+")) {
                int score = stack[top - 1] + stack[top - 2];
                stack[top++] = score;
                sum += score;

            } else {
                int score = Integer.parseInt(op);
                stack[top++] = score;
                sum += score;
            }
        }

        return sum;
    }
}