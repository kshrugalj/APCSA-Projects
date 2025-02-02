public int countWhitePixels() {
    int whitePixelCount = 0;
    for (int[] row : this.pixelValues) {
        for (int pv : row) {
            if (pv == this.WHITE) {
                whitePixelCount++;
            }
        }
    }
    return whitePixelCount;
}

public void processImage() {
    for (int row = 0; row < this.pixelValues.length - 2; row++) {
        for (int col = 0; col < this.pixelValues[0].length - 2; col++) {
            this.pixelValues[row][col] -= this.pixelValues[row + 2][col + 2];
            if (this.pixelValues[row][col] < BLACK) {
                this.pixelValues[row][col] = BLACK;
            }
        }
    }
}

public int findHorseSpace(String name) {
    for (int i = 0; i < spaces.length; i++) {
        Horse h = spaces[i];
        if (h != null && name.equals(h.getName())) {
            return i;
        }
    }
    return -1;
}

public void consolidate() {
    int nextSpace = 0;
    for (int i = 0; i < spaces.length; i++) {
        if (spaces[i] != null) {
            spaces[nextSpace] = spaces[i];
            nextSpace++;
        }
    }
    for (int i = nextSpace; i < spaces.length; i++) {
        spaces[i] = null;
    }
}
