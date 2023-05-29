package io.codelex.oop.parcels;

class Parcel implements Validatable{

    private int xLength, yLength, zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public void setzLength(int zLength) {
        this.zLength = zLength;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    public boolean validate() {
        float maxWeight = isExpress ? 15.0f : 30.0f;
        int sumOfDimensions = xLength + yLength + zLength;
        return !(sumOfDimensions > 300 || (xLength < 30 || yLength < 30 || zLength < 30) || weight > maxWeight);
    }

    public boolean validate(int x, int y, int z, float weight, boolean isExpress) {
        float maxWeight = isExpress ? 15.0f : 30.0f;
        int sum = x + y + z;
        return !(sum > 300 || (xLength < 30 || yLength < 30 || zLength < 30) || weight > maxWeight);
    }

}
