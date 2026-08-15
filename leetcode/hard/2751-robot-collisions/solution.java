class Solution {

    class Robot {
        int pos, health, idx;
        char dir;

        Robot(int pos, int health, char dir, int idx) {
            this.pos = pos;
            this.health = health;
            this.dir = dir;
            this.idx = idx;
        }
    }

    public List<Integer> survivedRobotsHealths(int[] positions,
                                                int[] healths,
                                                String directions) {

        List<Robot> robots = new ArrayList<>();

        for (int i = 0; i < positions.length; i++) {
            robots.add(new Robot(
                positions[i],
                healths[i],
                directions.charAt(i),
                i
            ));
        }

        robots.sort((a, b) -> a.pos - b.pos);

        Stack<Robot> st = new Stack<>();

        for (Robot cur : robots) {

            if (cur.dir == 'R') {
                st.push(cur);
            } else {

                boolean alive = true;

                while (!st.isEmpty() &&
                       st.peek().dir == 'R' &&
                       alive) {

                    Robot top = st.peek();

                    if (top.health < cur.health) {
                        st.pop();
                        cur.health--;
                    }
                    else if (top.health == cur.health) {
                        st.pop();
                        alive = false;
                    }
                    else {
                        top.health--;
                        alive = false;
                    }
                }

                if (alive) {
                    st.push(cur);
                }
            }
        }

        List<Robot> survivors = new ArrayList<>(st);

        survivors.sort((a, b) -> a.idx - b.idx);

        List<Integer> ans = new ArrayList<>();

        for (Robot r : survivors) {
            ans.add(r.health);
        }

        return ans;
    }
}