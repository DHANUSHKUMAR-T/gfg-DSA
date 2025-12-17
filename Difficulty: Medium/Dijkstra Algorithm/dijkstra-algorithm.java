class Pair {
    int node;
    int distance;
    Pair(int distance, int node) {
        this.distance = distance;
        this.node = node;
    }
}

class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // Build adjacency list
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int wt = e[2];
            adj.get(u).add(new Pair(wt, v));
            adj.get(v).add(new Pair(wt, u)); 
        }

        // Min-heap for finding minimum distance node
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.distance - y.distance);

        int[] dist = new int[V];
        Arrays.fill(dist, (int) 1e9);

        dist[src] = 0;
        pq.add(new Pair(0, src));

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int node = curr.node;
            int dis = curr.distance;

            for (Pair it : adj.get(node)) {
                int adjNode = it.node;
                int wt = it.distance;

                if (dis + wt < dist[adjNode]) {
                    dist[adjNode] = dis + wt;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }

        return dist;
    }
}