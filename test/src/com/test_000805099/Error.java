package com.test_000805099;

public class Error {
    private int[] contents;

    public Error(int[] contents) {
        this.contents = contents;
    }

    public int getContentsAt (int i) {
        if ((i >= 0) && (i < this.contents.length)) {
            return contents[i];
        } else {
            return 0;
        }
    }


}
