package com.mattpenguin.penguinlib.reference;

public final class ConfRef {

    private static boolean isInitialized = false;

    public static final class Category{
        public static final String GENERAL = "General";
        public static final String DEBUG = "Debug";
    }

    public static final class Values{
        public static int dummyInt;
        public static boolean useReflectionForDebugTool;
        public static boolean enableTestBlocks;
        public static boolean enableTestItems;
    }

    public static boolean hasBeenInitialized(){
        return isInitialized;
    }

    public static void setHasBeenInitialized(){
        isInitialized = true;
    }
}
