import java.io.*;
import java.util.*;

class Main {

    static class Echo {
        int x, y, time;

        Echo(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    static class State {
        int x, y, dist;
        List<Echo> echoes;

        State(int x, int y, int dist, List<Echo> echoes) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.echoes = echoes;
        }
    }

    static int N, M, K;
    static char[][] grid;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static boolean isBlocked(int x, int y, List<Echo> echoes) {
        for (Echo e : echoes) {
            if (Math.abs(e.x - x) + Math.abs(e.y - y) == 1) {
                return true;
            }
        }
        return false;
    }

    static String encodeState(int x, int y, List<Echo> echoes) {
        echoes.sort((a, b) -> {
            if (a.x != b.x) return a.x - b.x;
            if (a.y != b.y) return a.y - b.y;
            return a.time - b.time;
        });

        StringBuilder sb = new StringBuilder();
        sb.append(x).append(",").append(y);
        for (Echo e : echoes) {
            sb.append("|").append(e.x).append(",").append(e.y).append(",").append(e.time);
        }
        return sb.toString();
    }

    static int bfs(int sx, int sy, int tx, int ty) {
        Queue<State> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(new State(sx, sy, 0, new ArrayList<>()));
        visited.add(encodeState(sx, sy, new ArrayList<>()));

        while (!queue.isEmpty()) {
            State cur = queue.poll();

            if (cur.x == tx && cur.y == ty) {
                return cur.dist;
            }
            List<Echo> nextEchoes = new ArrayList<>();
            for (Echo e : cur.echoes) {
                if (e.time > 1) {
                    nextEchoes.add(new Echo(e.x, e.y, e.time - 1));
                }
            }

            for (int d = 0; d < 4; d++) {
                int nx = cur.x + dx[d];
                int ny = cur.y + dy[d];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (grid[nx][ny] == 'T') continue;
                if (isBlocked(nx, ny, nextEchoes)) continue;

                List<Echo> newEchoes = new ArrayList<>(nextEchoes);

                if (grid[nx][ny] == 'E') {
                    newEchoes.add(new Echo(nx, ny, K));
                }

                String key = encodeState(nx, ny, newEchoes);
                if (visited.contains(key)) continue;

                visited.add(key);
                queue.add(new State(nx, ny, cur.dist + 1, newEchoes));
            }
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        grid = new char[N][M];
        for (int i = 0; i < N; i++) {
            grid[i] = br.readLine().toCharArray();
        }

        st = new StringTokenizer(br.readLine());
        int sx = Integer.parseInt(st.nextToken()) - 1;
        int sy = Integer.parseInt(st.nextToken()) - 1;

        st = new StringTokenizer(br.readLine());
        int tx = Integer.parseInt(st.nextToken()) - 1;
        int ty = Integer.parseInt(st.nextToken()) - 1;

        System.out.println(bfs(sx, sy, tx, ty));
    }
}
