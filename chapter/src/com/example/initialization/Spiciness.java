package com.example.initialization;

import static com.example.util.Print.*;

public enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING;

    public static void main(String[] args) {
        for (Spiciness s : Spiciness.values()) {
            println(s + ", ordinal " + s.ordinal());
        }
    }
} /* Output 1:
NOT, ordinal 0
MILD, ordinal 1
MEDIUM, ordinal 2
HOT, ordinal 3
FLAMING, ordinal 4
*///
