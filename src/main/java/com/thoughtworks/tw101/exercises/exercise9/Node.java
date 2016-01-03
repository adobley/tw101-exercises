package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void add(String nameOfNewNode) {
        if (nameOfNewNode.compareTo(name) < 0 ) {
            if (this.left == null) {
                left = new Node(nameOfNewNode);
            } else {
                left.add(nameOfNewNode);
            }
        } else {
            if (this.right == null) {
                right = new Node(nameOfNewNode);
            } else {
                right.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        List<String> names = new ArrayList<String>();

        if (left != null) {
            names.addAll(left.names());
        }

        names.add(this.name);

        if (right != null) {
            names.addAll(right.names());
        }

        return names;
    }
}
