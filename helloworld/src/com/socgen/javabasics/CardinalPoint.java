package com.socgen.javabasics;

public enum CardinalPoint {

    NORTH(false), SOUTH(true), EAST(false), WEST(true);

    private boolean hot = false;

    private CardinalPoint(boolean hot) {
	this.hot = hot;
    }

    public boolean isHot() {
	return hot;
    }

}
