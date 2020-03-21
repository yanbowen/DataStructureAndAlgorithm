package cn.yanbowen.common;

import lombok.Data;

import java.util.LinkedList;

/**
 * Created by <a href=mailto:boweny.yan@qunar.com>boweny.yan</a>
 * DATE : 03/21/2020
 * TIME : 14:39
 * PROJECT : DataStructureAndAlgorithm
 * PACKAGE : cn.yanbowen.common
 *
 * @author boweny.yan
 */
@Data
public class Graph {
    private int v; // 顶点的个数
    private LinkedList<Integer> adj[]; // 邻接表

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int t) { // s先于t，边s->t
        adj[s].add(t);
    }
}
