/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class Cube {
    private int edgeLength;
    private int volume;
    public Cube(int edge) {
        edgeLength = edge;
    }
    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }
    public String toString() {
        return "The length of the edge is " + edgeLength + " and the volume " + volume();
    }
}
